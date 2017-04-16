package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Student;
import service.ClassService;
import service.StudentService;

/**
 * �@��һ���༉��Ŀ������
 * @author luoxiang
 *
 */
@Controller
public class course_link {
	@Autowired
	private StudentService studenService;
	/*
	 * 处理跳转到课程关联页面
	 */
	@RequestMapping("/course_link")
	public String interCourseLinkPage(){
		return "course_link";
	}
	/*
	 * 处理班级下拉列表
	 */
	@RequestMapping("/classSelect")
	public String listAllStudent(@RequestParam("selectId") int selectId,Model model){
		List<Student> list=studenService.queryAllStudentByClass(selectId);
		model.addAttribute("studentList",list);
		return "course_link";
	}
	@RequestMapping("/studentSelect")
	public String listTheStudentPlan(){
		
		return "course_link";
	}

}
