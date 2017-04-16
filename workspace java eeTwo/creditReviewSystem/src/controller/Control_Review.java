package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.ReviewService;

/**
 * �@��һ�����˱�Ŀ������
 * @author guocheng472165998
 *
 */
@Controller
public class Control_Review {
	@Autowired
	private ReviewService reviewservice;
    @RequestMapping("/credit_review")
    public String interCreditReviewPage(){
    	return "credit_review";
    }
}
