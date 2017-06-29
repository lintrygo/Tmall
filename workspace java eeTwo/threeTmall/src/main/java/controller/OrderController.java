package controller;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Order;
import bean.Orderitem;
import bean.User;
import service.OrderDAOService;
import service.OrderItemDAOService;

@Controller
public class OrderController {
@Autowired
private OrderDAOService orderS;
@Autowired
private OrderItemDAOService orderIS;

@RequestMapping("forecreateOrder")
public String buy(@RequestParam("address") String address,
		@RequestParam("post") String post,
		@RequestParam("receiver") String receiver,
		@RequestParam("mobile") String mobile,
		@RequestParam("total") float total,
		HttpSession session,Model model){
	Order order=new Order();
	//if(session.getAttribute("user")!=null){
		User user=(User)session.getAttribute("user");
	order.setAddress(address);
	order.setPost(post);
	order.setReceiver(receiver);
	order.setUser(user);
	Date date=new Date();
	String regEx="[^0-9]"; 
	Pattern p = Pattern.compile(regEx); 
	Matcher m = p.matcher(date.toString()); 
	String num=m.replaceAll("").trim().toString()+user.getId();
	
	order.setOrderCode(num);
	
	order.setCreateDate(date);
	order.setDeliveryDate(date);
    order.setStatus("unpayed");
    order.setTotal(total);
    order.setMobile(mobile);
    orderS.add(order);
    order.setId(orderS.get(num).getId());
    System.out.println(order.getId()+"test1");
	
	
	model.addAttribute("param", orderS.get(num));
	return "alipay";
}
@RequestMapping("forepayed")
public String payed(@RequestParam("oid") int oid,
		@RequestParam("total")float total,
		Model model){
	Order bean=orderS.get(oid);
	bean.setStatus("payed");
	bean.setPayDate(new Date());
	orderS.add(bean);
	model.addAttribute("o", bean);
	return "payedPage";
}
}
