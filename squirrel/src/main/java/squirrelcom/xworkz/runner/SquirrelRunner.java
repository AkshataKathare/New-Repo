package squirrelcom.xworkz.runner;

import java.util.List;

import squirrelcom.xworkz.entity.SquirrelEntity;
import squirrelcom.xworkz.repository.SquirrelRepoImpl;
import squirrelcom.xworkz.repository.SquirrelRepository;
import squirrelcom.xworkz.service.SquirrelService;
import squirrelcom.xworkz.service.SquirrelServiceImpl;

public class SquirrelRunner {

	public static void main(String[] args) {

		SquirrelEntity entity = new SquirrelEntity();
		entity.setId(2);
		entity.setName("Gillu");
		entity.setColor("Brown");

		SquirrelRepository repository = new SquirrelRepoImpl();
		SquirrelService service = new SquirrelServiceImpl(repository);

//		boolean saved = service.validatAndThenSave(entity);
//		System.out.println(saved);

//		SquirrelEntity entity2 = service.find(5);
//		System.out.println(entity2);

//		List<SquirrelEntity> list = service.findAll();
//		list.forEach(sq -> System.out.println(sq));

//		SquirrelEntity entity2 = service.findById(5);
//		System.out.println(entity2);

//		service.update("Pillu", 6);

//		boolean removed = service.remove(5);
//		System.out.println(removed);

//		List<SquirrelEntity> entity2 = service.findByName("Gillu");
//		for (SquirrelEntity squirrelEntity : entity2) {
//			System.out.println(squirrelEntity);

//		boolean deleted = service.deleteByName("Gill");
//		System.out.println(deleted);

		boolean deleted = service.deleteByColor("White");
		System.out.println(deleted);
	}

}
