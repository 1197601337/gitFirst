package www.news.com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import www.news.com.dao.NewsDao;
import www.news.com.model.News;

public interface NewsService {
	
	public void addNews(News news);
	public void updateNews(News news);
	public void deleteNews(News news);
	public News findNewsById(Integer id);
	public List<News> findAllNews();
	public List<News> findNews(Integer cid);
	public List<News> findTitle(String title);
//	public PageBean<News> findByPage(int page){
//		
//		PageBean<News> pageBean = new PageBean<News>();
//
//		pageBean.setPage(page);
//		// 璁剧疆姣忛〉鏄剧ず璁板綍鏁�
//		// 鏄剧ず5涓�
//		int limit = 5;
//		pageBean.setLimit(limit);
//		// 璁剧疆鎬昏褰曟暟:
//		int totalCount = 0;
//		totalCount = newsDao.findNewsCount();
//		pageBean.setTotalCount(totalCount);
//		// 璁剧疆鎬婚〉鏁�
//		int totalPage = 0;
//		if(totalCount % limit == 0){			
//			totalPage = totalCount / limit;
//		}else{
//			totalPage = totalCount / limit + 1;
//		}
//		pageBean.setTotalPage(totalPage);
//		// 璁剧疆姣忛〉鏄剧ず鏁版嵁闆嗗悎:
//		int begin = (page - 1)*limit;		
//		List<News> list = newsDao.findByPage(begin,limit);
//		pageBean.setList(list);		
//		return pageBean;
//	}
	
	
//	public PageBean<News> findNewsByCaregory(int cid,int page) {
//		PageBean<News> pageBean = new PageBean<News>();
//		int limit = 5;
//		pageBean.setLimit(limit);
//		pageBean.setPage(page);
//		int totalCount = 2;
//		totalCount = newsDao.findNewsCountByCaregory(cid);
//		pageBean.setTotalCount(totalCount);
//		int totalPage = 0;
//		if(totalCount % limit == 0){			
//			totalPage = totalCount / limit;
//		}else{
//			totalPage = totalCount / limit + 1;
//		}
//		pageBean.setTotalPage(totalPage);
//		int begin = (page - 1)*limit;	
//		List<News> list = newsDao.findNewsByCaregoryPage(cid,begin,limit);
//		pageBean.setList(list);	
//		return pageBean;
//	}
	

}
