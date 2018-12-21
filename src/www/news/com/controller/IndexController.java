package www.news.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;









import com.opensymphony.xwork2.ActionContext;

import www.news.com.model.Caregory;
import www.news.com.model.News;
import www.news.com.service.CaregoryService;
import www.news.com.service.NewsService;

@Controller
@RequestMapping("/indexAction")
public class IndexController {
	@Autowired
	private CaregoryService caregoryService;
	@Autowired
	private NewsService newsService;
	
	private List<News> newses;
	private int cid;
	private int nid;
	private String title;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@RequestMapping("/findCategory")
	public String findCategory(){
		List<Caregory> caregorys = caregoryService.findAllCaregory();
		for(Caregory c:caregorys) {
			System.out.println(c.getCategoryName());
		}		
		ActionContext.getContext().put("caregorys", caregorys);
		return "forward:/client/clientCategory.jsp";
	}
	
	@RequestMapping("/findNews")
	public String findNews(){
		newses = newsService.findAllNews();
		
       List<Caregory>	categorys=caregoryService.findAllCaregory();
		ActionContext.getContext().put("newses", newses);
		return "forward:/client/clientNews.jsp";
	}
	
	@RequestMapping("/byCategoryFindNews")
	public String byCategoryFindNews(){
		newses=newsService.findNews(cid);
		ActionContext.getContext().put("newses", newses);
		return "forward:/client/categoryNews.jsp";
	}
	
	@RequestMapping("/showClientNews")
	public String showClientNews(){
		System.out.println(nid);
		News news=newsService.findNewsById(nid);
		ActionContext context=ActionContext.getContext();
		context.put("news", news);
		System.out.println(news.getTitle());
		return "forward:/client/showClientNews.jsp";
}
	
	@RequestMapping("/findTitle")
	public String findTitle(){		
		/*System.out.println(this.getTitle()+"============");*/
		System.out.println(title);
		newses = newsService.findTitle(title);
		for(News n:newses) {
			System.out.println(n.getTitle());
		}
		return "forward:/client/categoryNews.jsp";
	}
}
