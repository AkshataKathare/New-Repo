package squirrelcom.xworkz.repository;

import java.util.List;

import squirrelcom.xworkz.entity.SquirrelEntity;

public interface SquirrelRepository {

	boolean save(SquirrelEntity entity);

	boolean update(String color, int id);

	SquirrelEntity find(int id);

	List<SquirrelEntity> findAll();

	SquirrelEntity findById(int id);

	boolean remove(int id);

	List<SquirrelEntity> findByName(String name);

	boolean deleteName(String name);

	List<SquirrelEntity> findByColor(String color);

	boolean deleteByColor(String color);
}
