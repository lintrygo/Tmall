package controller;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Orderitem;
import bean.Product;
import service.OrderItemDAOService;
import service.ProductDAOService;

@Controller
public class OrderItemController {
@Autowired
private OrderItemDAOService orderItemS;
@Autowired
private ProductDAOService productS;
@RequestMapping("forebuyone")
public String buyProduct(@RequestParam("pid") int pid,@RequestParam("num") int num,Model model){
	Orderitem bean=new Orderitem();
	bean.setNumber(num);
	Product product=new Product();
	product=productS.get(pid);
	bean.setProduct(product);
	List<Orderitem> ois=new Vector<Orderitem>();
	ois.add(bean);
	model.addAttribute("ois", ois);
	float total=bean.getProduct().getPromotePrice()*bean.getNumber();
	model.addAttribute("total", total);
	return "buy";
}
}
