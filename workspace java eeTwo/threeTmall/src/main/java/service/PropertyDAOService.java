package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bean.Product;
import bean.Property;

 @Service
public class PropertyDAOService{

 
    public Property get(String name, int cid) {
    	Property bean =null;
		 
		
        return bean;
	}
 
 
    public List<Property> list(int cid) {
        return list(cid, 0, Short.MAX_VALUE);
    }
 
    public List<Property> list(int cid, int start, int count) {
        List<Property> beans = new ArrayList<Property>();
 
       
        return beans;
    }


	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Product> list(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}


	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void add(Product t) {
		// TODO Auto-generated method stub
		
	}


	public void update(Product t) {
		// TODO Auto-generated method stub
		
	}


	public Product get(int num) {
		// TODO Auto-generated method stub
		return null;
	}



	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}
 
}