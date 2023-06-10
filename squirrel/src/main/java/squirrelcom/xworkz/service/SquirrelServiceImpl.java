package squirrelcom.xworkz.service;

import java.util.List;

import squirrelcom.xworkz.entity.SquirrelEntity;
import squirrelcom.xworkz.repository.SquirrelRepository;

public class SquirrelServiceImpl implements SquirrelService {

	private SquirrelRepository repository;

	public SquirrelServiceImpl(SquirrelRepository repository) {
		System.out.println("Creating SquirrelService using no-arg const");
		this.repository = repository;
	}

	@Override
	public boolean validatAndThenSave(SquirrelEntity entity) {
		return this.repository.save(entity);
	}

	@Override
	public SquirrelEntity find(int id) {
		System.out.println("Running find method in Service");
		SquirrelEntity entity = this.repository.find(id);
		return entity;
	}

	@Override
	public boolean update(String color, int id) {
		System.out.println("Running update method in ServiceImpl");
		return this.repository.update(color, id);
	}

	@Override
	public boolean remove(int id) {
		System.out.println("Running remove method in ServiceImpl");
		return this.repository.remove(id);
	}

	@Override
	public List<SquirrelEntity> findAll() {
		System.out.println("Running findAll method in SquirrelService");
		return this.repository.findAll();
	}

	@Override
	public SquirrelEntity findById(int id) {
		System.out.println("Running findById method in SquirrelService");
		return this.repository.findById(id);
	}

	@Override
	public List<SquirrelEntity> findByName(String name) {
		System.out.println("Running findByName in SquirrelService");
		return this.repository.findByName(name);
	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("Running deleteByName method in SquirrelService");
		return this.repository.deleteName(name);
	}

	@Override
	public List<SquirrelEntity> findByColor(String color) {
		System.out.println("Running findByColor in SquirrelService");
		return this.repository.findByColor(color);
	}

	@Override
	public boolean deleteByColor(String color) {
		System.out.println("Running deleteByColor in SquirrelService");
		return this.repository.deleteByColor(color);
	}

}
