package www.news.com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import www.news.com.model.Caregory;
import www.news.com.service.CaregoryService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@RequestMapping("/caregoryAction")
public class CaregoryController implements ModelDriven<Caregory>{
	@Autowired
	private CaregoryService caregoryService;
	@Resource
	ServletContext application;
	private Caregory caregory = new Caregory();
	public Caregory getModel(){
		return this.caregory;
	}
	private List<Caregory> caregorys;
	private int cid;
	public List<Caregory> getCaregorys() {
		return caregorys;
	}
	public void setCaregorys(List<Caregory> caregorys) {
		this.caregorys = caregorys;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@RequestMapping("/addCaregory")
	public String addCategory(Caregory caregory){
		//System.out.println(caregory.getCaregoryName());
		System.out.println(caregory.getCategoryName());
		caregoryService.addCaregory(caregory);
		
		return "forward:/caregoryAction/listCategory.do";
	}
	
	@RequestMapping("/updateCategory")
	public String updateCategory(String cid){
		System.out.println(cid);
		Caregory caregory = caregoryService.findCaregoryById(Integer.parseInt(cid));
		application.setAttribute("caregory", caregory);		
		return "forward:/category/categoryUpdate.jsp";
	}
	
	@RequestMapping("/updatedCategory")
	public String updatedCategory(Caregory caregory){
		caregoryService.updateCaregory(caregory);
		//System.out.println(category.getCategoryName());
		return "forward:/caregoryAction/listCategory.do";
	}
	
	@RequestMapping("/deleteCategory")
	public String deleteCategory(String cid){
		Caregory caregory_queried = caregoryService.findCaregoryById(Integer.parseInt(cid));
		caregoryService.deleteCaregory(caregory_queried);
		return "forward:/caregoryAction/listCategory.do";
	}
	
	@RequestMapping("/listCategory")
	public String listCategory(){
	 caregorys = caregoryService.findAllCaregory();
		application.setAttribute("caregorys", caregorys);
		//ServletActionContext.getRequest().getSession().setAttribute("categorys", categorys);
		return "forward:/category/categoryList.jsp";
	}
	
	@RequestMapping("/addInput1")
	public String addInput1(){
		return "forward:/category/categoryAdd.jsp";
	}
}
