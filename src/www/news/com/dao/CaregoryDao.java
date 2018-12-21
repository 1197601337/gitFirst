 package www.news.com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import www.news.com.model.Caregory;
@Repository
public interface CaregoryDao {
	public void addCaregory(Caregory caregory);
	public void updateCaregory(Caregory caregory);
	public void deleteCaregory(Caregory caregory);
	public List<Caregory> findAllCaregory();
	public Caregory findCaregoryById(Integer id);
	
//	public void addCaregory(Caregory caregory){
//		this.getHibernateTemplate().save(caregory);
//	}
//	public void updateCaregory(Caregory caregory){
//		this.getHibernateTemplate().update(caregory);
//	}
//	public void deleteCaregory(Caregory caregory){
//		this.getHibernateTemplate().delete(caregory);
//	}
//	public List<Caregory> findAllCaregory() {
//		String hpl = "from Caregory";
//		List<Caregory> list=this.getHibernateTemplate().find(hpl);
//		return list;		
//	}
//	public Caregory findCaregoryById(Caregory caregory){
//		String hpl = "select n from Caregory n where n.id = ?";
//		List<Caregory> list = this.getHibernateTemplate().find(hpl, caregory.getId());
//		if (list != null && list.size() > 0) {
//			return list.get(0);
//		}
//		return null;	
//	}
}
