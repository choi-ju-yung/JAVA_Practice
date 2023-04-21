package com.jdbc.model.dao;

import static com.jdbc.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.jdbc.common.JDBCTemplate;
import com.jdbc.model.dto.EmpDTO;

public class EmpDAO {
	
	private Properties sql = new Properties();
	
	{
	
	try{
		String path = EmpDAO.class.getResource("/sql/emp/emp_sql.properties").getPath();
		sql.load(new FileReader(path));
	}catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	
	
	public List<EmpDTO> selectEmpAll(Connection conn){
		Statement stmt = null;
		ResultSet rs = null;
		// String sql = "SELECT * FROM MEMBER";
		String sql = this.sql.getProperty("selectEmpAll");
		List<EmpDTO> members = new ArrayList();
		
		
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				members.add(getEmp(rs));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
		}
		return members;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EmpDTO getEmp(ResultSet rs) throws SQLException{
		EmpDTO e = new EmpDTO();
		
		e.setEmpId(rs.getInt("emp_id"));
		e.setEmpName(rs.getString("emp_name"));
		e.setEmpNo(rs.getString("emp_No"));
		e.setEmail(rs.getString("email"));
		e.setPhone(rs.getString("phone"));
		e.setDeptCode(rs.getString("dept_code"));
		e.setJobCode(rs.getString("job_code"));
		e.setSalLevel(rs.getString("sal_Level"));
		e.setSalary(rs.getInt("salary"));
		e.setBonus(rs.getDouble("bonus"));
		e.setManagerId(rs.getInt("manager_id"));
		e.setHireDate(rs.getDate("hire_date"));
		e.setEntDate(rs.getDate("ent_date"));
		e.setEntYn(rs.getString("ent_Yn").charAt(0));
		
		return e;
	}
	
}
