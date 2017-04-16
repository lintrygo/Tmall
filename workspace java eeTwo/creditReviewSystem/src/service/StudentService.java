package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import bean.Student;


@Service
public class StudentService {
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Student> queryAllStudentByClass(int id){
	    	List<Student> list=new Vector<Student>();
	    	String sql="select studentId from student where clazzId=?";
	    	list=jdbc.query(sql,new Object[]{id}, new StudentRowMapper());
	    	return list;
	    }
	public Student queryAStudentById(int id){
        Student s=null;
		String sql="select * from student where studentId=?";
    	s=(Student)jdbc.queryForObject(sql,new Object[]{id}, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				System.out.println(sql);
			     Student t1 = new Student();
				t1.setStudentId(rs.getInt("studentId"));
				t1.setClazzId(rs.getInt("clazzId"));
				t1.setStudentName(rs.getString("studentName"));
				t1.setStudentAge(rs.getInt("studentAge"));
				t1.setStudentBirthday(rs.getString("studentBirthday"));
				t1.setStudentSex(rs.getString("studentSex"));
				return t1;
			}
			
		});
    	System.out.println(sql);
    	return s;
    }

}
class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student t = new Student();
		t.setStudentId(rs.getInt("studentId"));
		t.setClazzId(rs.getInt("clazzId"));
		t.setStudentName(rs.getString("studentName"));
		t.setStudentAge(rs.getInt("studentAge"));
		t.setStudentBirthday(rs.getString("studentBirthday"));
		t.setStudentSex(rs.getString("studentSex"));
		return t;
	}
	
}