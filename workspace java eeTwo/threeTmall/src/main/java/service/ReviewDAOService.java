package service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.Product;
import bean.Review;
import bean.User;

 
public class ReviewDAOService{
 
    public int getTotal() {
        int total = 0;
        
        return total;
    }
    public int getTotal(int pid) {
    	int total = 0;
    	
    	return total;
    }
 
    public void add(Review bean) {



       
    }
 
    public void update(Review bean) {

 
    }
 
    public void delete(int id) {
 
       
    }
 
    public Review get(int id) {
        Review bean = new Review();
 
       
        return bean;
    }
 
    public List<Review> list(int pid) {
        return list(pid, 0, Short.MAX_VALUE);
    }
 
    public int getCount(int pid) {
      
        return 0;    	
    }
    public List<Review> list(int pid, int start, int count) {
        List<Review> beans = new ArrayList<Review>();
 
       
        return beans;
    }
	public boolean isExist(String content, int pid) {
		
		 
		
		
		return false;
	}

	public List<Review> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Review> list(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}
 
}