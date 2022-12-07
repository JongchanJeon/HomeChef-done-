package FinalProject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
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
	
//	 public ArrayList<DTO> getBeerList() {
//		 ArrayList<DTO> list = new ArrayList<DTO>();
//		
//		 String SQL = "select * from user";
//		 try {
//			 pstmt = con.prepareStatement(SQL);
//			 ResultSet rs = pstmt.executeQuery();
//			 
//			 while (rs.next()) {
//				 DTO dto = new DTO();
//				 dto.setUser_id(rs.getString("user_id"));
//				 dto.setUser_pw(rs.getString("user_pw"));
//			 }
//		 }
//	 }
	//상품 READ를 위함
	public boolean showProducts(ArrayList products) {
		boolean success = false;

		String SQL = "select * from user";
		 try {
			 pstmt = con.prepareStatement(SQL);
			 ResultSet rs = pstmt.executeQuery();
			 
			 
			 while (rs.next()) {
				productDTO DTO = new productDTO();
				DTO.setProduct_name(rs.getString("name"));
				DTO.setProduct_filesystemName(rs.getString("filesystemName"));
				DTO.setProduct_originalFileName(rs.getString("originalName"));
				DTO.setProduct_contentType(rs.getString("file_type"));
				DTO.setProduct_length(rs.getLong("file_size"));
				DTO.setProduct_price(rs.getInt("price"));
				DTO.setProduct_description(rs.getString("description"));
				DTO.setProduct_user_id(rs.getString("user_id"));
				products.add(DTO);
			 }
			 
		 }catch (SQLException e) {
			 e.printStackTrace();
		 }finally {
				disConnect();
		}
		 return success;
}
	// 관리자 모드에서 사용자 READ를 위함
	public boolean userManagement(ArrayList user) {
		boolean success = false;

		String SQL = "select * from user";
		 try {
			 pstmt = con.prepareStatement(SQL);
			 ResultSet rs = pstmt.executeQuery();
			 
			 DTO userDTO = new DTO();
			 while (rs.next()) {
				userDTO.setUser_id(rs.getString("user_id"));
				userDTO.setUser_pw(rs.getString("user_pw"));
				userDTO.setUser_number(rs.getString("user_number"));
				userDTO.setUser_name(rs.getString("user_name"));
				userDTO.setUser_address(rs.getString("user_address"));
				userDTO.setType(rs.getString("user_type"));
				userDTO.setPoint(rs.getInt("point"));
				user.add(userDTO);
			 }
			 
		 }catch (SQLException e) {
			 e.printStackTrace();
		 }finally {
				disConnect();
		}
		 return success;
}
	
	//상품 정보를 불러오기 위함 
	public boolean selectProduct(productDTO dto) {
		boolean success = false;

		
		String SQL = "select * from product";
		 try {
			 pstmt = con.prepareStatement(SQL);
			 ResultSet rs = pstmt.executeQuery();
			 while (rs.next()) {
				
			 }
			 
		 }catch (SQLException e) {
			 e.printStackTrace();
		 }finally {
				disConnect();
		}
		 return success;
}
	public boolean insertItem(productDTO info) {
		boolean success = false;


		String sql = "insert into product(name, filesystemName ,originalName, file_type, file_size, price, description, user_id)";
		sql += " values (?, ?, ?, ?, ?, ?, ?, ?)";
		System.out.println("sql 구문 : " + sql);
		System.out.println(info.getProduct_name());
		System.out.println(info.getProduct_filesystemName());
		System.out.println(info.getProduct_originalFileName());
		System.out.println(info.getProduct_contentType());
		System.out.println(info.getProduct_length());
		System.out.println(info.getProduct_price());
		System.out.println(info.getProduct_description());
		System.out.println(info.getProduct_user_id());
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info.getProduct_name());
			pstmt.setString(2, info.getProduct_filesystemName());
			pstmt.setString(3, info.getProduct_originalFileName());
			pstmt.setString(4, info.getProduct_contentType());
			pstmt.setInt(5, (int) info.getProduct_length());
			pstmt.setInt(6, (int) info.getProduct_price());
			pstmt.setString(7, info.getProduct_description());
			pstmt.setString(8, info.getProduct_user_id());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		} finally {
			disConnect();
		}
		return success;
	}
	
	public boolean userJoin(DTO info) {
		boolean success = false;


		String sql = "insert into user(user_id, user_pw, user_number, user_name, user_address)";
		sql += " values (?, ?, ?, ? ,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info.getUser_id());
			pstmt.setString(2, info.getUser_pw());
			pstmt.setString(3, info.getUser_number());
			pstmt.setString(4, info.getUser_name());
			pstmt.setString(5, info.getUser_address());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		} finally {
			disConnect();
		}
		return success;
	}
	
	public boolean tryLogin(DTO dto, String login_id, String login_pw) {
		boolean success = false;

		
		String SQL = "select * from user";
		 try {
			 pstmt = con.prepareStatement(SQL);
			 ResultSet rs = pstmt.executeQuery();

			 while (rs.next()) {
				 //아이디
				 dto.setUser_id(rs.getString("user_id"));
				 dto.setUser_pw(rs.getString("user_pw"));
				 dto.setType(rs.getString("user_type"));
				 
				 if (login_id.equals(dto.getUser_id())) {
					 System.out.println("존재하는 아이디");
					if(login_pw.equals(dto.getUser_pw())) {
						System.out.println("아이디와 비밀번호 일치");
						dto.setCorrect_login(true);
						dto.setLogin_id(login_id);
						dto.setLogin_pw(login_pw);
						dto.setLogin_type(dto.getType());
						System.out.println(dto.getLogin_type());
						System.out.println("로그인 완료");
						break;
					}
				 }
			 }
			 
		 }catch (SQLException e) {
			 e.printStackTrace();
		 }finally {
				disConnect();
		}
		 return success;
}
	public boolean readUserInfo(DTO info) {
		boolean success = false;

		String sql = "select * from user where user_id = '";
		sql += info.getUser_id() + "'";
		
		System.out.println("사용자 조회 sql 문 : " + sql);		
		
		try {
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				info.setUser_pw(rs.getString("user_pw"));
				info.setUser_number(rs.getString("user_number"));
				info.setUser_name(rs.getString("user_name"));
				info.setUser_address(rs.getString("user_address"));
			}
			System.out.println(info.getUser_id());
			System.out.println(info.getUser_number());
			System.out.println(info.getUser_name());
			System.out.println(info.getUser_address());
			
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return success;
	}
	
	public boolean userDelete(DTO info, String loginUser) {
		boolean success = false;

		String sql = "DELETE FROM user WHERE user_id = '";
		sql += loginUser + "'";
		System.out.println("sql 구문 : " + sql);
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		} finally {
			disConnect();
		}
		return success;
	}
	
	public boolean userUpdate(DTO info) {
		boolean success = false;

		String sql = "UPDATE user SET user_pw = ?, user_number = ?, user_name = ?, user_address = ? where user_id = ?";
		
		System.out.println("update 설정");
		System.out.println(info.getUser_id());
		System.out.println(info.getUser_pw());
		System.out.println(info.getUser_number());
		System.out.println(info.getUser_name());
		System.out.println(info.getUser_address());
			
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info.getUser_pw());
			pstmt.setString(2, info.getUser_number());
			pstmt.setString(3, info.getUser_name());
			pstmt.setString(4, info.getUser_address());
			pstmt.setString(5, info.getUser_id());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		} finally {
			disConnect();
		}
		return success;
	}
}
