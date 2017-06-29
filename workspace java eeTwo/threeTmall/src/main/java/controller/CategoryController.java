package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.Category;
import bean.Product;
import service.CategoryDAOService;

@Controller
public class CategoryController {
@Autowired
private CategoryDAOService categoryS;

@RequestMapping("index")
public String intoIndex(Model model){
	List<Category> list=categoryS.list();
	Map<Integer,List<Product>> map=categoryS.getMapByCategoryId();
	System.out.println(list.size()+"-----"+map);
	System.out.println(list);
	model.addAttribute("Cmap", map);
	model.addAttribute("cs", list);
	return "index";
}
}
