package service;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Product;
import bean.Productimage;

 @Service
public class ProductImageDAOService{
    @Autowired
    private SessionFactory sessionFactory;
	
	public static final String type_single = "type_single";
	public static final String type_detail = "type_detail";

	
    public int getTotal() {
        int total = 0;
       
        return total;
    }
 
    public void add(Productimage bean) {



      
    }
 
    public void update(Productimage bean) {
 
    }
 
    public void delete(int id) {
 
    }
 
    public Productimage get(int id) {
        Productimage bean = new Productimage();
        bean=(Productimage)sessionFactory.getCurrentSession().get(Productimage.class, id);
        
        return bean;
    }
 
    public List<Productimage> list(Product p, String type) {
        return list(p, type,0, Short.MAX_VALUE);
    }
 
    public List<Productimage> list(Product p, String type, int start, int count) {
        List<Productimage> beans = new ArrayList<Productimage>();
 
        
        return beans;
    }


	public List<Productimage> list() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Productimage> list(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}
 
}