package service;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.User;

@Service

public class UserDAOService{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {  
	        return this.sessionFactory.getCurrentSession();  
	    }
    public int getTotal() {
        int total = 0;
        total=this.getCurrentSession().createQuery("from User").list().size();
        return total;
    }
 
    public void add(User bean) {
 
        String sql = "insert into user values(null ,? ,?)";
        
    }
 
    public void update(User bean) {
 
        String sql = "update user set name= ? , password = ? where id = ? ";
        
 
    }
 
    public void delete(int id) {
 
      
    }
 
    public User get(int id) {
        User bean = new User();
        bean=(User)sessionFactory.getCurrentSession().get(User.class, id);
       
        return bean;
    }
 
    public List<User> list() {
        return list(0, Short.MAX_VALUE);
    }
 
    public List<User> list(int start, int count) {
        List<User> beans = new ArrayList<User>();
 
        String sql = "from User order by id desc limit ?,? ";
 
      
        return beans;
    }

	public boolean isExist(String name) {
		User user = get(name);
		return user!=null;

	}

	public User get(String name) {
		User bean = new User();
		 
		String sql = "from User where name = ?";
		 bean=(User)this.getCurrentSession().createSQLQuery(sql).setParameter(0, name);
        System.out.println(sql);
        return bean;
	}

	public User get(String name, String password) {
		User bean = null;
		 
		String sql = "select * from user where name = ? and password=?";
        
        return bean;
	}
 
}