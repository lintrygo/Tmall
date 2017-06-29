package controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import bean.User;
import service.OrderItemDAOService;
import service.UserDAOService;

@Controller
public class UserController {
	private HttpSession session;
	@Autowired
	private UserDAOService userS;
	@Autowired
	private OrderItemDAOService orderItemS;
/**
 * 进入购物车页面
 *参数：从session获得userId 
 * @return
 */
@RequestMapping("forecat")
public String getCat(){
		return "";
	} 
/*
 *点击立即购买，进入生成订单页面
 *参数：
 * @return
 */
@RequestMapping("forebought")
public String getOrder(){
	return "";
}
@RequestMapping("forelogin")
public String userLogin(@RequestParam("name") int name,
		@RequestParam("password") String psw,
		HttpSession session,Model model){
	User user=userS.get(name);
	if(user.getPassword().equals(psw)){
		this.session=session;
		this.session.setMaxInactiveInterval(3600);
		session.setAttribute("user", user);
	    System.out.println(user.getName());
		session.setAttribute("cartTotalItemNumber", orderItemS.getTotal());
		return "redirect:index";
	}
	else{
	return "login";
	}
}
@RequestMapping("foreloginAjax")
public ModelAndView loginAjax(@RequestParam("name") int name,
		@RequestParam("password") String psw,
		HttpSession session,
		HttpServletResponse response,Model model)throws IOException{
	User user=userS.get(name);
	String f;
	if(user.getPassword().equals(psw)){
		this.session=session;
		this.session.setMaxInactiveInterval(3600);
		session.setAttribute("user", user);
	    System.out.println(user.getName());
		session.setAttribute("cartTotalItemNumber", orderItemS.getTotal());
		f="{\"result\":\""+"success"+"\"}";
		response.getWriter().println(f);
	}
	else{
		f="{\"result\":\""+"false"+"\"}";
		response.getWriter().println(f);
	}
	return null;
}
@RequestMapping("forecheckLogin")
public  ModelAndView checkLogin(HttpSession session,HttpServletResponse response) throws IOException{
	List<String> list=new Vector();
	if(session.getAttribute("user")!=null){
		response.getWriter().println("{\"result\":\""+"success"+"\"}");
	}
	else
		response.getWriter().println("{\"result\":\'success\'}");
		return null;
}
@RequestMapping("forelogout")
public String loginOut(HttpSession session){
	if(session.getAttribute("user")!=null)
	session.removeAttribute("user");
		
	return "redirect:index";
}
@RequestMapping("admin_user_list")
public Set<User> getUserList(Model model){
	Set<User> list=null;
	model.addAttribute("us", list);
	return list;
}
}
