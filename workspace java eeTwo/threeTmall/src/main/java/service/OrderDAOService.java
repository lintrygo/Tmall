package service;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Order;
import bean.User;

@Service
public class OrderDAOService{
	public static final String waitPay = "waitPay";
	public static final String waitDelivery = "waitDelivery";
	public static final String waitConfirm = "waitConfirm";
	public static final String waitReview = "waitReview";
	public static final String finish = "finish";
	public static final String delete = "delete";
	@Autowired
	private SessionFactory sessionFactory;
	
	
    public int getTotal() {
        int total = 0;
        String sql="";
        total=sessionFactory.getCurrentSession().createQuery(sql).list().size();
        return total;
    }
 
    public void add(Order bean) {
     sessionFactory.getCurrentSession().save(bean);

    }
 
    public void update(Order bean) {

    	
       
 
    }
 
    public void delete(int id) {
 
      
    }
 
    public Order get(int id) {
        Order bean = new Order();
        bean=(Order) sessionFactory.getCurrentSession().get(Order.class, id);

        
      
        return bean;
    }
    public Order get(String orderCode){
    	Order bean=new Order();
    	//bean=(Order) 
    	bean=(Order)sessionFactory.getCurrentSession().createQuery("from Order o where orderCode=?").setParameter(0, orderCode).list().get(0);
    	System.out.println(bean.getId());
    	return bean;
    }
    public List<Order> list() {
        return list(0, Short.MAX_VALUE);
    }
 
    public List<Order> list(int start, int count) {
        List<Order> beans = new ArrayList<Order>();
 
        
        return beans;
    }
    
    public List<Order> list(int uid,String excludedStatus) {
        return list(uid,excludedStatus,0, Short.MAX_VALUE);
    }
     
    public List<Order> list(int uid, String excludedStatus, int start, int count) {
    	List<Order> beans = new ArrayList<Order>();
    	
    	
    	return beans;
    }
 
}