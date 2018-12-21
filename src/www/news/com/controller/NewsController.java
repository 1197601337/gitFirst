package www.news.com.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


















import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import www.news.com.model.Caregory;
import www.news.com.model.News;
import www.news.com.service.CaregoryService;
import www.news.com.service.NewsService;

@Controller
@RequestMapping("/newsAction")
public class NewsController implements ModelDriven<News>{
	@Autowired
	private NewsService newsService;
	@Autowired
	private CaregoryService caregoryService;
	@Resource
	ServletContext application;
	private News news = new News();
	public News getModel() {
		return this.news;
	}
	private List<Caregory> caregorys;
	private List<News> newses;
	private int cid;
	private int nid;
	private Caregory caregory;
	private List<News> newes;
	public NewsService getNewsService() {
		return newsService;
	}
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	public CaregoryService getCaregoryService() {
		return caregoryService;
	}
	public void setCaregoryService(CaregoryService caregoryService) {
		this.caregoryService = caregoryService;
	}
	
	public List<Caregory> getCaregorys() {
		return caregorys;
	}
	public void setCaregorys(List<Caregory> caregorys) {
		this.caregorys = caregorys;
	}
	public Caregory getCaregory() {
		return caregory;
	}
	public void setCaregory(Caregory caregory) {
		this.caregory = caregory;
	}
	public List<News> getNewses() {
		return newses;
	}
	public void setNewses(List<News> newses) {
		this.newses = newses;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	
	public List<News> getNewes() {
		return newes;
	}
	public void setNewes(List<News> newes) {
		this.newes = newes;
	}
	
	
	@RequestMapping("/addNews")
	public String addNews(String cid,News news) {
		
		System.out.println(cid);
		Date time=new Date();
		news.setDate(time);
		Caregory category = caregoryService.findCaregoryById(Integer.parseInt(cid));
		news.setCaregory(category);
		category.getNews().add(news);
		newsService.addNews(news);
		return "forward:/newsAction/listNews.do";
	}
	@RequestMapping("/listNews")
	public String listNews(ModelMap map) {
		newses = newsService.findAllNews();
		caregorys = caregoryService.findAllCaregory();
		map.addAttribute("newses", newses);
		map.addAttribute("caregorys",caregorys);
		return "forward:/newsList.jsp";
	}
	@RequestMapping("/updateNews")
	public String updateNews(ModelMap map,String nid) {
		News news = newsService.findNewsById(Integer.parseInt(nid));
		caregorys = caregoryService.findAllCaregory();
		//System.out.println(news.getTitle());
		map.addAttribute("news", news);
		map.addAttribute("caregorys",caregorys);
		return "forward:/newsUpdate.jsp";
	}
	public String findAllCategory() {
		System.out.println("666");
		caregorys = caregoryService.findAllCaregory();
//		for(Category cate:categorys) {
//			System.out.println(cate.getCategoryName());
//		}		
		ActionContext context=ActionContext.getContext();
		context.put("categorys", caregorys);
		return "forward:/login.jsp";
	}
	
	@RequestMapping("/updatedNews")
	public String updatedNews(News news,String cid) {
		Caregory caregory=caregoryService.findCaregoryById(Integer.parseInt(cid));

	
		news.setCaregory(caregory);
		newsService.updateNews(news);
		return "forward:/newsAction/listNews.do";
	}
	@RequestMapping("/deleteNews")
	public String deleteNews(String nid) {
		news = newsService.findNewsById(Integer.parseInt(nid));
		newsService.deleteNews(news);
		return "forward:/newsAction/listNews.do";
	}
	
	@RequestMapping("/addInput")
	public String addInput(){
		caregorys=caregoryService.findAllCaregory();
		application.setAttribute("caregorys", caregorys);
		return "forward:/newsAdd.jsp";
		}
	
	@RequestMapping("/showNews")
	public String showNews(String nid){
		News news=newsService.findNewsById(Integer.parseInt(nid));
		application.setAttribute("news", news);
		//System.out.println(news.getTitle());
		return "forward:/showNews.jsp";
	}
	
	@RequestMapping("/lookNews")
	public String lookNews(String cid){
		//System.out.println(cid);
		//category=categoryService.getCategoryById(cid);
		newses=newsService.findNews(Integer.parseInt(cid));
		application.setAttribute("newes", newses);
		return "forward:/newsLooks.jsp";
	}
}
