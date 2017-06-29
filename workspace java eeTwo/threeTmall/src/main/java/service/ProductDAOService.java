package service;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Category;
import bean.Product;

@Service
public class ProductDAOService{
	@Autowired
	private SessionFactory sessionFactory;
	public int getTotal(int cid) {
        int total = 0;
       
        return total;
    }
  
    public void add(Product bean) {
 
          }
  
    public void update(Product bean) {
 
       
  
    }
  
    public void delete(int id) {
  
    }
  
    public Product get(int id) {
        Product bean = new Product();
        bean=(Product)sessionFactory.getCurrentSession().get(Product.class, id);
        return bean;
    }
  
    public List<Product> list(int cid) {
    	List<Product> list=sessionFactory.getCurrentSession().createQuery("from Product where cid="+cid) .list();
        return list;
    }
  
    public List<Product> list(int cid, int start, int count) {
        List<Product> beans = new ArrayList<Product>();
        
        return beans;
    }
    public List<Product> list() {
        return list(0,Short.MAX_VALUE);
    }
    public List<Product> list(int start, int count) {
        List<Product> beans = new ArrayList<Product>();
 
       
        return beans;
    }    
 
    public void fill(List<Category> cs) {
        for (Category c : cs) 
            fill(c);
    }
    public void fill(Category c) {
            List<Product> ps = this.list(c.getId());
            c.setProducts((Set)ps);
    }
 
    public void fillByRow(List<Category> cs) {
       
    }
     
    public void setFirstProductImage(Product p) {
      
    }
     
    public void setSaleAndReviewNumber(Product p) {
       
    }
 
    public void setSaleAndReviewNumber(List<Product> products) {
       
    }
 
    public List<Product> search(String keyword, int start, int count) {
         List<Product> beans = new ArrayList<Product>();
          
         
            return beans;
    }


	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}