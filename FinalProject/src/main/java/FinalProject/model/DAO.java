package FinalProject.model;

import java.util.ArrayList;
import java.sql.*;
import javax.sql. *;

import FinalProject.model.*;

import javax.naming.*;
public class DAO {
	private PreparedStatement pstmt = null;
	private Connection con = null;
	
	Context init = null;
	DataSource ds = null;
	
	ResultSet rs = null;
	public DAO() {
		super();
		dbConnect();
	}
	
	public void dbConnect() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc_mariadb");
			con = ds.getConnection();
			
			System.out.println("DB연결 성공!!!");
		}catch(Exception e) {
			System.out.println("DB연결 실패!!!");
			e.printStackTrace();
		}
	}
	public void disConnect() {
		if (pstmt != null) {
			try {
				pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// public ArrayList<DTO> getBeerList() {
	//
	// }
	
	public boolean userJoin(BAO )
}
