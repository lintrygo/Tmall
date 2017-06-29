package service;
 
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Product;
import bean.Property;
import bean.Propertyvalue;

  @Service
public class PropertyValueDAOService{
  @Autowired
	  private SessionFactory sessionFactory; 
    public int getTotal() {
        int total = 0;
       
        return total;
    }
  
    public void add(Propertyvalue bean) {
 
        
    }
  
    public void update(Propertyvalue bean) {
 
  
    }
  
    public void delete(int id) {
  
    }
  
    public Propertyvalue get(int id) {
        Propertyvalue bean = new Propertyvalue();
  
      
        return bean;
    }
    public Propertyvalue get(int ptid, int pid ) {
        Propertyvalue bean = null;
       
        return bean;
    }
  
    public List<Propertyvalue> list() {
        return list(0, Short.MAX_VALUE);
    }
  
    public List<Propertyvalue> list(int start, int count) {
        List<Propertyvalue> beans = new ArrayList<Propertyvalue>();
  
       
        return beans;
    }
 
    public void init(Product p) {
        List<Property> pts= new PropertyDAOService().list(p.getCategory().getId());
       
    }
 
    public List<Propertyvalue> list(int pid) {
        List<Propertyvalue> beans = new ArrayList<Propertyvalue>();
        beans=(List<Propertyvalue>)sessionFactory.getCurrentSession().createQuery("from Propertyvalue where pid=?").setParameter(0, pid).list();
       
        return beans;
    }
  
}