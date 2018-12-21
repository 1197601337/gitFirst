package www.news.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import www.news.com.dao.CaregoryDao;
import www.news.com.model.Caregory;
import www.news.com.service.CaregoryService;
@Service
public class CaregoryServiceImpl implements CaregoryService{
	@Autowired
	private CaregoryDao caregoryDao;
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void addCaregory(Caregory caregory) {
		// TODO Auto-generated method stub
		caregoryDao.addCaregory(caregory);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void updateCaregory(Caregory caregory) {
		// TODO Auto-generated method stub
		caregoryDao.updateCaregory(caregory);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void deleteCaregory(Caregory caregory) {
		// TODO Auto-generated method stub
		caregoryDao.deleteCaregory(caregory);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public List<Caregory> findAllCaregory() {
		// TODO Auto-generated method stub
		return caregoryDao.findAllCaregory();
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public Caregory findCaregoryById(Integer id) {
		// TODO Auto-generated method stub
		return caregoryDao.findCaregoryById(id);
	}

}
