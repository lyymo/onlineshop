package cn.webnews.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.webnews.dao.NewsDao;
import cn.webnews.entity.News;

public class NewsTest {
	NewsDao newsDao=new NewsDao();

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testShowAll(){ //����δͨ������Ҫ�޸������ļ���������
		List<News> list=newsDao.showAll();
		System.out.println(list);
	}
}
