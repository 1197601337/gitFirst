package www.news.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import www.news.com.dao.NewsDao;
import www.news.com.model.News;
import www.news.com.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService{
	@Autowired
	private NewsDao newsDao;
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void addNews(News news) {
		// TODO Auto-generated method stub
		newsDao.addNews(news);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void updateNews(News news) {
		// TODO Auto-generated method stub
		newsDao.updateNews(news);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void deleteNews(News news) {
		// TODO Auto-generated method stub
		newsDao.deleteNews(news);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public News findNewsById(Integer id) {
		// TODO Auto-generated method stub
		return newsDao.findNewsById(id);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public List<News> findAllNews() {
		// TODO Auto-generated method stub
		return newsDao.findAllNews();
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public List<News> findNews(Integer cid) {
		// TODO Auto-generated method stub
		return newsDao.findNews(cid);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public List<News> findTitle(String title) {
		// TODO Auto-generated method stub
		return newsDao.findTitle(title);
	}

}
