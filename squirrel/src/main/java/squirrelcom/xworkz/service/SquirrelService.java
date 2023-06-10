package squirrelcom.xworkz.service;

import java.util.List;

import squirrelcom.xworkz.entity.SquirrelEntity;

public interface SquirrelService {

	boolean validatAndThenSave(SquirrelEntity entity);

	SquirrelEntity find(int id);

	List<SquirrelEntity> findAll();

	SquirrelEntity findById(int id);

	boolean update(String color, int id);

	boolean remove(int id);

	List<SquirrelEntity> findByName(String name);

	boolean deleteByName(String name);

	List<SquirrelEntity> findByColor(String color);
	
	boolean deleteByColor(String color);
}
