package service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.Category;
import bean.Order;
import bean.Orderitem;
import bean.Product;
import bean.User;

@Service
@Transactional
public class OrderItemDAOService{
	@Autowired
	private SessionFactory sessionFactory;
    public int getTotal() {
        int total = 0;
       total=sessionFactory.getCurrentSession().createQuery("from Orderitem").list().size();
        return total;
    }
 
    public void add(Orderitem bean) {



       
    }
 
    public void update(Orderitem bean) {

       
 
    }
 
    public void delete(int id) {
 
       
    }
 
    public Orderitem get(int id) {
        Orderitem bean = new Orderitem();
 
       
        return bean;
    }
 
    public List<Orderitem> listByUser(int uid) {
        return listByUser(uid, 0, Short.MAX_VALUE);
    }
 
    public List<Orderitem> listByUser(int uid, int start, int count) {
        List<Orderitem> beans = new ArrayList<Orderitem>();
 
      
        return beans;
    }
    public List<Orderitem> listByOrder(int oid) {
    	return listByOrder(oid, 0, Short.MAX_VALUE);
    }
    
    public List<Orderitem> listByOrder(int oid, int start, int count) {
    	List<Orderitem> beans = new ArrayList<Orderitem>();
    	
    	
    	return beans;
    }

	public void fill(List<Order> os) {
		
		
		
		
	}

	public void fill(Order o) {
		
	}

    public List<Orderitem> listByProduct(int pid) {
        return listByProduct(pid, 0, Short.MAX_VALUE);
    }
 
    public List<Orderitem> listByProduct(int pid, int start, int count) {
        List<Orderitem> beans = new ArrayList<Orderitem>();
 
       
        return beans;
    }

	public int getSaleCount(int pid) {
		 int total = 0;
	       
	        return total;
	}

	public List<Orderitem> list() {
		// TODO Auto-generated method stub
		List<Orderitem> list=sessionFactory.getCurrentSession().createQuery("from Orderitem").list();
		return list;
	}

	public List<Orderitem> list(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}
	
}