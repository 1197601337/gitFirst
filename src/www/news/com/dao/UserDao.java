package www.news.com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import www.news.com.model.User;
@Repository
public interface UserDao{
	public User findUser(User user);
//	public User findUser(User user) {
//		String hql = "select u from User u where u.username=? and u.password = ?";
//		List<User> list = this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());	
//		if (list != null && list.size() > 0) {
//			return list.get(0);
//		}
//		return null;
//	}

}
