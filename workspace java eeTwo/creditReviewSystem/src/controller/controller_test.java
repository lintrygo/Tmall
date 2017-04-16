package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Student;
import service.StudentService;



@Controller
public class controller_test {
	@Autowired
	private StudentService stuService;
	@RequestMapping("/test")
	public String test(@RequestParam(value="testId", defaultValue="1") int Id,Model model) {
		System.out.println("test1"+Id);
		Student s=stuService.queryAStudentById(Id);
		System.out.println("test2");
		model.addAttribute("test",s);
		return "test";
	}
	@RequestMapping("/index")
	public String interIndexPage(){
		return "index";
	}
}
