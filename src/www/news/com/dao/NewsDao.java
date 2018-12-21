package www.news.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import www.news.com.model.News;

@Repository
public interface NewsDao {
	public void addNews(News news);
	public void updateNews(News news);
	public void deleteNews(News news);
	public News findNewsById(Integer id);
	public int findNewsCount();
	public List<News> findAllNews();
	public List<News> findNews(Integer cid);
	public List<News> findTitle(String title);
	//public List<News> findByPage(int begin, int limit);
	//public int findNewsCountByCaregory(int cid);
	//public List<News> findNewsByCaregoryPage(int cid,int begin, int limit);
//	public int findNewsCount() {
//		String hql = "select count(*) from News";
//		List<Long> list = this.getHibernateTemplate().find(hql);
//		if(list != null && list.size() > 0){
//			return list.get(0).intValue();
//		}
//		return 0;
//	}
//	public List<News> findByPage(int begin, int limit) {
//		String hql = "select n from News n order by n.date desc";
//		List<News> list = this.getHibernateTemplate().execute(
//				new PageHibernateCallback<News>(hql, null, begin, limit));
//		if(list != null && list.size() > 0){
//			return list;
//		}
//		return null;
//		
//	}
//	public int findNewsCountByCaregory(int cid) {
//		String hql = "select count(*) from News n where n.caregory.id = ?";
//		List<Long> list = this.getHibernateTemplate().find(hql,cid);
//		if(list != null && list.size() > 0){
//			return list.get(0).intValue();
//		}
//		return 0;
//	}
//	public List<News> findNewsByCaregoryPage(int cid,int begin, int limit) {		
//		String hql = "select n from News n where n.caregory.id = ? order by n.date desc";
//		List<News> list = this.getHibernateTemplate().execute(
//				new PageHibernateCallback<News>(hql, new Object[]{cid}, begin, limit));
//		if(list != null && list.size() > 0){			
//			return list;
//		}		
//		return null;
//		
//	}
//	public void addNews(News news){
//	   this.getHibernateTemplate().save(news);	
//	}
//	public void updateNews(News news){
//	   this.getHibernateTemplate().update(news);
//	}
//	public void deleteNews(News news){
//	   this.getHibernateTemplate().delete(news);
//	}
//	public News findNewsByname(){
//		return null;
//		
//	}
//	public int newsCount(){
//		return 0;		
//	}
//	public News findNewsById(News news) {
//		String hql = "select n from News n where n.id=?";
//		List<News> list = this.getHibernateTemplate().find(hql,news.getId());
//		if(list != null && list.size() > 0){
//			return list.get(0);
//		}
//		return null;	
//	}
	
}
