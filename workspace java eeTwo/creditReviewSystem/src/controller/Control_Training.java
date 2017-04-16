package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TrainingService;

/**
 * �@��һ�����B������Ŀ������
 * @author guocheng472165998
 *
 */
@Controller
public class Control_Training {

	@Autowired
	private TrainingService trainingservice;
	@RequestMapping("/training_plan")
	public String interTrainingPage(){
		return "training_plan";
	}
	@RequestMapping("/update_plan")
	public String interUpdateTrainingPage(){
		return "update_plan";
	}
	@RequestMapping("/add_plan")
	public String interAddTrainingPage(){
		return "add_plan";
	}
}
