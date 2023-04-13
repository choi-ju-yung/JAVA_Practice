package com.myjdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myjdbc.model.vo.Department;

public class MyJdbcTest {

	public static void main(String[] args) {
		
		Connection conn = null; // Conncetion 객체 생성
		Statement stmt = null; // Statement 객체 생성
		ResultSet rs = null; // select문이라서 ResultSet 객체 생성
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(  // 데이터베이스 계정에 접속과정
					"jdbc:oracle:thin:@localhost:1521:xe",
					"BS",
					"BS");
			
			conn.setAutoCommit(false);
			System.out.println("DB 접속 확인 완료");

			
			String sql = "SELECT * FROM DEPARTMENT"; // sql문 만들어서
			stmt = conn.createStatement();   // Statement 객체 생성
			
			rs = stmt.executeQuery(sql); // 객체로 쿼리 조회  rs는 ResultSet 자료형임
			
			
			List<Department> Departments = new ArrayList(); 
			
			while(rs.next()) {
				Department dm = new Department();
				dm.setDeptId(rs.getString("DEPT_ID"));
				dm.setDeptTitle(rs.getString("DEPT_TITLE"));
				dm.setLocationId(rs.getString("LOCATION_ID"));
				
				// 이렇게도 가능하지만 가독성이 떨어짐
				//dm.setDeptId(rs.getString(1));
				//dm.setDeptTitle(rs.getString(2));
				//dm.setLocationId(rs.getString(3));
				
				Departments.add(dm);
			}
			
			Departments.forEach(dm-> System.out.println(dm));
			
			
			
		}catch(ClassNotFoundException e) { // 
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
