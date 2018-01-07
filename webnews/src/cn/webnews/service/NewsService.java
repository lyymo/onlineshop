package cn.webnews.service;

import java.util.List;

import cn.webnews.dao.NewsDao;
import cn.webnews.entity.News;
import cn.webnews.entity.NewsUser;

public class NewsService {
	NewsDao newsDao=new NewsDao();
	
	/**
	 * �û�ע��ҵ���
	 * @param newsUser
	 * @return 
	 */
	public int userRegist(NewsUser newsUser){
		int i=0;
		
		//�ж��û��Ƿ����
		boolean flag=newsDao.isUserExit(newsUser.getUser_name());
		if(flag){
			//��������ڣ����ע��
			i=newsDao.addUsers(newsUser);
		}
		return i;
	}
	
	/**
	 * ����չʾҵ���
	 * @return
	 */
	public List<News> showAllService(){
		return newsDao.showAll();
	}
	
	/**
	 * �û���¼ҵ��
	 * @param user_id
	 * @param user_name
	 * @param password
	 * @return
	 */
	public  NewsUser userLoginService(int user_id,String user_name,String password){
		return newsDao.login(user_id, user_name, password);
	}
	
	/**
	 * �޸������б�ҵ��
	 * @param title
	 * @param body
	 * @param id
	 * @param adddate
	 * @return
	 */
	public int chageNewsService(News news){
		return newsDao.chageNews(news);
	}
	
	/**
	 * ��������ҵ��
	 * @param title
	 * @param body
	 * @param id
	 * @param adddate
	 * @return
	 */
	public int insertNewsService(News news){
		return newsDao.insertNews(news);
	}
	
	/**
	 * ɾ������ҵ��
	 * @param id
	 * @return
	 */
	public int delNewsService(int id){
		return newsDao.delNews(id);
	}
}
