package com.examples;


import org.springframework.jdbc.core.JdbcTemplate;

//Dao class contains all the Curd operations to be performed.

public class EmployeeDao {
   private JdbcTemplate jdbcTemplate;
   
   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	   this.jdbcTemplate=jdbcTemplate;
   }
   //insert the row/s into the table.
   public int saveEmployee(Employee e) {
	   String query= "insert into employeee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
	   return jdbcTemplate.update(query);
   }
   //update the row/s into the table
   public int updateEmployee(Employee e) {
	   String query="update employeee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
	   return jdbcTemplate.update(query);
   }
  //deletion of row/s into the table.
   public int deleteEmployee(Employee e) {
	   String query = "delete from employeee where id='"+e.getId()+"' ";
	   return jdbcTemplate.update(query);
   }
  
}
