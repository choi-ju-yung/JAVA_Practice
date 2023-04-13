package com.myjdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myjdbc.model.vo.Department;

public class InsertJdbcTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"BS",
					"BS");
			
			conn.setAutoCommit(false);
			System.out.println("DB 접속 확인 완료");

			
			stmt = conn.createStatement();
			String sql = "INSERT INTO DEPARTMENT VALUES('D0','강사부','L2')";
			
			int result = stmt.executeUpdate(sql);
			
			
			List<Department> Departments = new ArrayList(); 
			
			if(result>0) conn.commit();
			else conn.rollback();
			
			System.out.println(result);
			
			
			Departments.forEach((o)-> System.out.println(o));
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
