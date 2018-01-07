package cn.webnews.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.webnews.entity.News;
import cn.webnews.entity.NewsUser;
import cn.webnews.tools.DBUtils;

public class NewsDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	/**
	 * չʾ����������Ϣ
	 * @return
	 */
	public List<News> showAll(){
		List<News> list=new ArrayList<News>();
		conn=DBUtils.getConnection();
		String sql="select * from news";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				News news=new News();
				news.setId(rs.getInt("id"));
				news.setTitle(rs.getString("title"));
				news.setBody(rs.getString("body"));
				news.setAdddate(rs.getString("adddate"));
				list.add(news);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(rs, pstmt, conn);
		}
		return list;
	}
	
	/**
	 * �û�ע��
	 * @return
	 */
	public int addUsers(NewsUser newsUser){
		int i=0;
		conn=DBUtils.getConnection();
		String sql="insert into newsuser values(?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, newsUser.getUser_id());
			pstmt.setString(2, newsUser.getUser_name());
			pstmt.setString(3, newsUser.getPassword());
			i=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(null, pstmt, conn);
		}
		return i;
	}
	
	/**
	 * �ж��û��Ƿ����
	 * @return
	 */
	public boolean isUserExit(String name){
		boolean flag=false;
		String sql="select * from newsuser where user_name=?";
		conn=DBUtils.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(!rs.next()){
				flag=true; //������ͬ�����֣��򷵻�flagΪtrue
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * �û���¼
	 * @param user_id
	 * @param user_name
	 * @param password
	 * @return
	 */
	public NewsUser login(int user_id,String user_name,String password){
		NewsUser newsUser=null;
		String sql="select * from newsuser where user_id=? and user_name=? and password=? ";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			pstmt.setString(2, user_name);
			pstmt.setString(3, password);
			rs=pstmt.executeQuery();
			
			//��¼ΪΨһ���û��������ֻ��һ������ֱ����if����
			if(rs.next()){
				newsUser=new NewsUser();
				//�ӽ���� ȡֵ
				newsUser.setUser_id(rs.getInt("user_id"));
				newsUser.setUser_name(rs.getString("user_name"));
				newsUser.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(rs, pstmt, conn);
		}
		return newsUser;
	}
	
	/**
	 * �޸������б�
	 * @return
	 */
	public int chageNews(News news){
		int i=0;
		conn=DBUtils.getConnection();
		String sql="update news set title=?,body=?,adddate=? where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, news.getTitle());
			pstmt.setString(2, news.getBody());
			pstmt.setString(3, news.getAdddate());
			pstmt.setInt(4, news.getId());
			i=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(null, pstmt, conn);
		}
		return i;
	}
	
	/**
	 * ��������ҵ��
	 * @param title
	 * @param body
	 * @param id
	 * @param adddate
	 * @return
	 */
	public int insertNews(News news){
		int i=0;
		conn=DBUtils.getConnection();
		String sql="insert into news values(?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, news.getId());
			pstmt.setString(2, news.getTitle());
			pstmt.setString(3, news.getBody());
			pstmt.setString(4, news.getAdddate());
			i=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(null, pstmt, conn);
		}
		return i;
	}
	
	/**
	 * ɾ������ҵ��
	 * @param id
	 * @return
	 */
	public int delNews(int id){
		int i=0;
		conn=DBUtils.getConnection();
		String sql="delete from news where=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			i=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(null, pstmt, conn);
		}
		return i;
	}
}

