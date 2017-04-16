package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.GradeService;

/**
 * �@��һ���ɿ���Ŀ������
 * @author guocheng472165998
 *
 */
@Controller
public class control_course {
	@Autowired
	private GradeService gradeservice;
	@RequestMapping("/course")
	public String interCoursePage(){
		return "course";
	}

}
