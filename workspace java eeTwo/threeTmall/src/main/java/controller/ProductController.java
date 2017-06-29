package controller;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Product;
import bean.Productimage;
import bean.Propertyvalue;
import service.ProductDAOService;
import service.ProductImageDAOService;
import service.PropertyValueDAOService;

@Controller
public class ProductController {
	@Autowired
	ProductDAOService productS;
	@Autowired
	ProductImageDAOService productIS;
	@Autowired
	PropertyValueDAOService propertyVS; 
	@RequestMapping("foresearch")
	public String search(){
		return "";
	}
//	@RequestMapping("");
	@RequestMapping("foreproduct")
	public String productDetal(@RequestParam("pid") int pid,Model model){
		Product P=new Product();
		Productimage pi=new Productimage();
		List<Propertyvalue> pvs=new Vector<Propertyvalue>();
		pvs=propertyVS.list(pid);
		P=productS.get(pid);
		pi=productIS.get(pid);
		model.addAttribute("pvs", pvs);
		System.out.println(P.getReviews());
		model.addAttribute("p", P);
		model.addAttribute("pi",pi);
		return "product";
	}
}
