package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Category;
import bean.Product;

@Service
public class CategoryDAOService {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired ProductDAOService productS; 
	public List<Category> list(){
	
		List<Category> list=sessionFactory.getCurrentSession().createQuery("from Category").list();
		System.out.println(list.size());
		return list;
	}
	public List<Category> list(int start, int count){
		List<Category> list=new Vector<Category>();
		list=sessionFactory.getCurrentSession().createQuery("from Category").list();
		return list;
	}
	     
	    public int getTotal(){
	    	return 0;
	    }

		public boolean add(Category t){
			return false;
		}
		
		public boolean supdate(Category t){
			return false;
		}
		
		public boolean delete(int num){
			return false;
		}
		
		public Category get(int num){
			return null;
		}
		public Map<Integer, List<Product>> getMapByCategoryId() {
			// TODO Auto-generated method stub
			Map<Integer, List<Product>> map=new HashMap<Integer, List<Product>>();
			List<Category> list=new Vector<Category>();
			list=this.list();
			
			for(int i=0;i<list.size();i++){
				List<Product> PList=productS.list(list.get(i).getId());
				
				map.put(list.get(i).getId(),PList);
			}
			return map;
		}
		
}
