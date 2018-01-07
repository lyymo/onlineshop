package cn.webnews.service;

import java.util.List;

import cn.webnews.dao.NewsDao;
import cn.webnews.entity.News;
import cn.webnews.entity.NewsUser;

public class NewsService {
	NewsDao newsDao=new NewsDao();
	
	/**
	 * 用户注册业务层
	 * @param newsUser
	 * @return 
	 */
	public int userRegist(NewsUser newsUser){
		int i=0;
		
		//判断用户是否存在
		boolean flag=newsDao.isUserExit(newsUser.getUser_name());
		if(flag){
			//如果不存在，完成注册
			i=newsDao.addUsers(newsUser);
		}
		return i;
	}
	
	/**
	 * 新闻展示业务层
	 * @return
	 */
	public List<News> showAllService(){
		return newsDao.showAll();
	}
	
	/**
	 * 用户登录业务
	 * @param user_id
	 * @param user_name
	 * @param password
	 * @return
	 */
	public  NewsUser userLoginService(int user_id,String user_name,String password){
		return newsDao.login(user_id, user_name, password);
	}
	
	/**
	 * 修改新闻列表业务
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
	 * 增加新闻业务
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
	 * 删除新闻业务
	 * @param id
	 * @return
	 */
	public int delNewsService(int id){
		return newsDao.delNews(id);
	}
}
