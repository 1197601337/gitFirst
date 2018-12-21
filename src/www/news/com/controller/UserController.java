package www.news.com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import www.news.com.model.User;
import www.news.com.service.UserService;

@Controller
@RequestMapping("/userAction")
public class UserController {
	@Autowired
	private UserService userService = null;
	
	@RequestMapping("/checkLogin")
	public String login(User user,ModelMap model,HttpSession session){
		if(userService.findUser(user) == null){
			model.put("error", "用户名或密码错误！");
			return "forward:/login.jsp";
		}else{
			session.setAttribute("user", userService.findUser(user));
			return "forward:/admin.jsp";
		}
	}
	@RequestMapping("/quit")
	public String quit(HttpSession session){
	    session.invalidate();
		return "forward:/login.jsp";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "forward:/login.jsp";
	}
}
