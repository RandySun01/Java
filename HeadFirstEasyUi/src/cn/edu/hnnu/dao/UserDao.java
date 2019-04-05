package cn.edu.hnnu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.edu.hnnu.model.PageBean;
import cn.edu.hnnu.model.User;

/**
 * 获取数据
 * @author sunrongzhi
 *
 */
public class UserDao {
	public ResultSet userList(Connection con, PageBean pageBean)throws Exception{
		String sql="select * from t_user limit ?,?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, pageBean.getStart());
		pstmt.setInt(2, pageBean.getRows());
		return pstmt.executeQuery();
	}
	
	/**
	 * 获取行数
	 * @param con
	 * @return
	 */
	public int userCount(Connection con)throws Exception{
		// String sql = "select count(*) as total from t_user";
		String sql="select count(*) as total from t_user";
		PreparedStatement psmt = con.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		if(rs.next()){
			return rs.getInt("total");
		}else{
			return 0;
		}
		
	}
	
	public int userDelete(Connection con, String id)throws Exception{
		
		String sql = "delete from t_user where id = ?";
		//System.out.println("删除");
		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, id);
		int result = psmt.executeUpdate();
		//System.out.println(sql+id);
		return result;
	}
	
	public int userAdd(Connection con, User user)throws Exception{
		String sql = "insert into t_user values(null,?,?,?,?)";// 注意问好的是中文还是英文
		
		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, user.getName());
		psmt.setString(2,user.getPhone());
		psmt.setString(3,user.getEmail());
		psmt.setString(4, user.getQq());
		System.out.println(sql);
		int result = psmt.executeUpdate();
		return result;
	}
	
	public int userModify(Connection con, User user)throws Exception{
		String sql = "update t_user set name = ?, phone = ?, email = ?, qq = ? where id=?";
		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, user.getName());
		psmt.setString(2,user.getPhone());
		psmt.setString(3,user.getEmail());
		psmt.setString(4, user.getQq());
		psmt.setInt(5, user.getId());
		int result = psmt.executeUpdate();
		return result;
	}

}
