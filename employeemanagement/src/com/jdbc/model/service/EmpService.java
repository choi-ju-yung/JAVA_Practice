package com.jdbc.model.service;

import static com.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.jdbc.model.dao.EmpDAO;
import com.jdbc.model.dto.EmpDTO;


public class EmpService {
	private EmpDAO dao = new EmpDAO();
	

	public List<EmpDTO> selectEmpAll(){
		Connection conn = getConnection();
		List<EmpDTO> boards = dao.selectEmpAll(conn);
		close(conn);
		return boards;
	}
}
