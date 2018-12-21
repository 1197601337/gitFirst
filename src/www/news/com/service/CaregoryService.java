package www.news.com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import www.news.com.dao.CaregoryDao;
import www.news.com.model.Caregory;


public interface CaregoryService {

	
	public void addCaregory(Caregory caregory);
	public void updateCaregory(Caregory caregory);
	public void deleteCaregory(Caregory caregory);

	public List<Caregory> findAllCaregory();
	public Caregory findCaregoryById(Integer id);
}
