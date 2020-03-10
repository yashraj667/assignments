package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCrudDemo {
	public void addEmployee(Employee1 e) throws Exception{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@localhost:1521:XE";  //driver/ipaddress/port/database instance
		String user="system";
		String password="orcl11g";
		Connection connection =DriverManager.getConnection(url, user, password);
		
		/*Statement stm=connection.createStatement();
		String query="insert into employee1 values("+e.getEmpId()+",'"+e.getEmpName()+"',"+e.getSalary()+",'"+e.getCity()+"')";
		int row=stm.executeUpdate(query);
		System.out.println(row+"row inserted");
		*/
		
		PreparedStatement smt=connection.prepareStatement("insert into employee1 values(?,?,?,?)");
		smt.setInt(1, e.getEmpId());
		smt.setString(2, e.getEmpName());
		smt.setFloat(3, e.getSalary());
		smt.setString(4, e.getCity());
		smt.executeUpdate();
		System.out.println("recored inserted");
		connection.close();
	}
	
	public void fetchEmployee() throws Exception{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@localhost:1521:XE";  //driver/ipaddress/port/database instance
		String user="system";
		String password="orcl11g";
		Connection connection =DriverManager.getConnection(url, user, password);
		Statement stm=connection.createStatement();
		ResultSet rs=stm.executeQuery("select * from employee1");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
			System.out.println("*******");
		}
		connection.close();
	}
	
	public void deleteEmployee(int id) throws Exception{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@localhost:1521:XE";  //driver/ipaddress/port/database instance
		String user="system";
		String password="orcl11g";
		Connection connection =DriverManager.getConnection(url, user, password);
		Statement stm=connection.createStatement();
		String query="delete from employee1 where empid="+id;
		System.out.println(query);
		int row=stm.executeUpdate(query);
		System.out.println(row+"row deleted");
	}
	
	public void updateEmployee(int id,String name,int sal,String city) throws Exception{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@localhost:1521:XE";  //driver/ipaddress/port/database instance
		String user="system";
		String password="orcl11g";
		Connection connection =DriverManager.getConnection(url, user, password);
		Statement stm=connection.createStatement();
		String query="update employee1 set empname='"+name+"',salary="+sal+",city='"+city+"' where empid="+id;
		System.out.println(query);
		int row=stm.executeUpdate(query);
		System.out.println(row+"row updated");
	}
	

}
