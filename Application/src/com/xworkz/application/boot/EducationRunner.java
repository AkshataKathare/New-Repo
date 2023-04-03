package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidEducationException;
import com.xworkz.application.repository.EducationRepository;
import com.xworkz.application.repository.EducationRepositoryImpl;
import com.xworkz.application.service.EducationService;
import com.xworkz.application.service.EducationServiceImpl;

public class EducationRunner {

	public static void main(String[] args) {

		EducationDTO educationDTO = new EducationDTO(34, "Bachelor of Science", 89.37, "Karnataka University",
				LocalDate.of(2019, 6, 20), LocalDate.of(2022, 10, 4), false, "P-C-M", "Akshata");
		EducationRepository educationRepository = new EducationRepositoryImpl();
		EducationService educationService = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO2 = new EducationDTO(233, "BEngi", 89, "Mysore University", LocalDate.of(2019, 7, 20),
				LocalDate.of(2022, 11, 4), true, "PMCS", "Anitha");
		EducationService educationService2 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO3 = new EducationDTO(45, "Bachelor of Commerce", 89.99, "Tumkur University",
				LocalDate.of(2017, 4, 20), LocalDate.of(2021, 9, 4), false, "ESAIC", "Abhishek");
		EducationService educationService3 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO4 = new EducationDTO(455, "Bachelor of Eng", 89, "VTUniversity",
				LocalDate.of(2018, 6, 20), LocalDate.of(2021, 10, 4), true, "Computer Science", "Shubhangi");
		EducationService educationService4 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO5 = new EducationDTO(999, "BSC-CS", 67.37, "Delhi University",
				LocalDate.of(2019, 10, 20), LocalDate.of(2023, 10, 4), false, "CSIS", "Ashok");
		EducationService educationService5 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO6 = new EducationDTO(1000, "Bachelor of Arts", 60, "Mangalore University",
				LocalDate.of(2013, 1, 20), LocalDate.of(2016, 10, 4), true, "ESSTBS", "Afreen");
		EducationService educationService6 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO7 = new EducationDTO(2788, "Bach of Sc", 80, "Manipal University",
				LocalDate.of(2018, 1, 20), LocalDate.of(2021, 10, 4), true, "PCMBS", "Kiran");
		EducationService educationService7 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO8 = new EducationDTO(3000, "Bach of com", 85, "Manipal University",
				LocalDate.of(2018, 1, 20), LocalDate.of(2021, 10, 4), false, "ECSK", "Arpita");
		EducationService educationService8 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO9 = new EducationDTO(4000, "Bach of Sc", 48, "Karnatak University",
				LocalDate.of(2019, 1, 2), LocalDate.of(2023, 10, 10), true, "PCMCS", "Nita");
		EducationService educationService9 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO10 = new EducationDTO(555, "Bachl of Eng", 77, "Kerala University",
				LocalDate.of(2017, 1, 2), LocalDate.of(2020, 10, 10), false, "Civil", "Vimal");
		EducationService educationService10 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO11 = new EducationDTO(676, "Bachl of Eng", 83, "Maharashtra University",
				LocalDate.of(2019, 9, 2), LocalDate.of(2020, 4, 10), true, "Mechanical", "Darshan");
		EducationService educationService11 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO12 = new EducationDTO(898, "Bachl of Science", 99, "Kerala University",
				LocalDate.of(2020, 1, 2), LocalDate.of(2023, 10, 10), false, "PMSt", "Sudha");
		EducationService educationService12 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO13 = new EducationDTO(900, "Bachl of Science", 73, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), false, "PMSt", "Suraksha");
		EducationService educationService13 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO14 = new EducationDTO(1200, "Bachl of Commerce", 78, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), true, "ECSB", "Bindu");
		EducationService educationService14 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO15 = new EducationDTO(1798, "Bachl of Science", 61, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), true, "PWRTF", "Shobha");
		EducationService educationService15 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO16 = new EducationDTO(29761, "Bachl of Science", 86, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), true, "PWRTF", "Swathi");
		EducationService educationService16 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO17 = new EducationDTO(1257, "Bachl of Science", 86, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), true, "PWRTF", "Jamuna");
		EducationService educationService17 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO18 = new EducationDTO(29761, "Bachl of Science", 86, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), true, "PWRTF", "Kavitha");
		EducationService educationService18 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO19 = new EducationDTO(27178981, "Bachl of Science", 86, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), false, "PWRTF", "Vinoda");
		EducationService educationService19 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO20 = new EducationDTO(29761, "Bachl of Science", 86, "Karnataka University",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10), true, "PWRTF", "Suchitra");
		EducationService educationService20 = new EducationServiceImpl(educationRepository);

		try {
			boolean saved = educationService.validateAndThenSave(educationDTO);
			System.out.println(saved);

			boolean saved2 = educationService2.validateAndThenSave(educationDTO2);
			System.out.println(saved2);

			boolean saved3 = educationService3.validateAndThenSave(educationDTO3);
			System.out.println(saved3);

			boolean saved4 = educationService4.validateAndThenSave(educationDTO4);
			System.out.println(saved4);

			boolean saved5 = educationService5.validateAndThenSave(educationDTO5);
			System.out.println(saved5);

			boolean saved6 = educationService6.validateAndThenSave(educationDTO6);
			System.out.println(saved6);

			boolean saved7 = educationService7.validateAndThenSave(educationDTO7);
			System.out.println(saved7);

			boolean saved8 = educationService8.validateAndThenSave(educationDTO8);
			System.out.println(saved8);

			boolean saved9 = educationService9.validateAndThenSave(educationDTO9);
			System.out.println(saved9);

			boolean saved10 = educationService10.validateAndThenSave(educationDTO10);
			System.out.println(saved10);

			boolean saved11 = educationService11.validateAndThenSave(educationDTO11);
			System.out.println(saved11);

			boolean saved12 = educationService12.validateAndThenSave(educationDTO12);
			System.out.println(saved12);

			boolean saved13 = educationService13.validateAndThenSave(educationDTO13);
			System.out.println(saved13);

			boolean saved14 = educationService14.validateAndThenSave(educationDTO14);
			System.out.println(saved14);

			boolean saved15 = educationService15.validateAndThenSave(educationDTO15);
			System.out.println(saved15);

			boolean saved16 = educationService16.validateAndThenSave(educationDTO16);
			System.out.println(saved16);

			boolean saved17 = educationService17.validateAndThenSave(educationDTO17);
			System.out.println(saved17);

			boolean saved18 = educationService18.validateAndThenSave(educationDTO18);
			System.out.println(saved18);

			boolean saved19 = educationService19.validateAndThenSave(educationDTO19);
			System.out.println(saved19);

			boolean saved20 = educationService20.validateAndThenSave(educationDTO20);
			System.out.println(saved20);

			System.out.println("************");

		} catch (InvalidEducationException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(educationService.find(educationDTO));
		System.out.println(educationService.findBacklogByCandidateNameAndDegreeNameAndUniversity("Akshata",
				"Bachelor of Science", "Karnataka University"));
		System.out.println(educationService.findIdByCandidateNameAndDegreeNameAndUniversity("Akshata",
				"Bachelor of Science", "Karnataka University"));
		System.out.println(educationService.findStreamByCandidateNameAndDegreeNameAndUniversity("Akshata",
				"Bachelor of Science", "Karnataka University"));
		System.out.println(educationService.findUniversityByCandidateName("Akshata"));
		System.out.println(educationService.findPercentageByCandidateName("Akshata"));
		System.out.println(educationService.findByCandidateName("Akshata"));
		System.out.println(educationService.findByCandidateNameAndStartDateAndEndDate("Akshata",
				LocalDate.of(2019, 6, 20), LocalDate.of(2022, 10, 4)));
		System.out.println(educationService.findByCandidateNameAndUniversity("Karnataka University", "Akshata"));
		System.out.println(educationService.total());

		System.out.println("*****");

		System.out.println(educationService2.find(educationDTO2));
		System.out.println(educationService2.findBacklogByCandidateNameAndDegreeNameAndUniversity("Anitha", "BEngi",
				"Mysore University"));
		System.out.println(educationService2.findIdByCandidateNameAndDegreeNameAndUniversity("Anitha", "BEngi",
				"Mysore University"));
		System.out.println(educationService2.findStreamByCandidateNameAndDegreeNameAndUniversity("Anitha", "BEngi",
				"Mysore University"));
		System.out.println(educationService2.findUniversityByCandidateName("Anitha"));
		System.out.println(educationService2.findPercentageByCandidateName("Anitha"));
		System.out.println(educationService2.findByCandidateName("Anitha"));
		System.out.println(educationService2.findByCandidateNameAndStartDateAndEndDate("Anitha",
				LocalDate.of(2019, 7, 20), LocalDate.of(2022, 11, 4)));
		System.out.println(educationService2.findByCandidateNameAndUniversity("Mysore University", "Anitha"));
		System.out.println(educationService2.total());

		System.out.println("*****");

		System.out.println(educationService3.find(educationDTO3));
		System.out.println(educationService3.findBacklogByCandidateNameAndDegreeNameAndUniversity("Abhishek",
				"Abhishek", "Tumkur University"));
		System.out.println(educationService3.findIdByCandidateNameAndDegreeNameAndUniversity("Abhishek",
				"Bachelor of Commerce", "Tumkur University"));
		System.out.println(educationService3.findStreamByCandidateNameAndDegreeNameAndUniversity("Abhishek",
				"Bachelor of Commerce", "Tumkur University"));
		System.out.println(educationService3.findUniversityByCandidateName("Abhishek"));
		System.out.println(educationService3.findPercentageByCandidateName("Abhishek"));
		System.out.println(educationService3.findByCandidateName("Abhishek"));
		System.out.println(educationService3.findByCandidateNameAndStartDateAndEndDate("Abhishek",
				LocalDate.of(2017, 4, 20), LocalDate.of(2021, 9, 4)));
		System.out.println(educationService3.findByCandidateNameAndUniversity("Tumkur University", "Abhishek"));
		System.out.println(educationService3.total());

		System.out.println("*****");

		System.out.println(educationService5.find(educationDTO5));
		System.out.println(educationService5.findBacklogByCandidateNameAndDegreeNameAndUniversity("Ashok", "BSC-CS",
				"Delhi University"));
		System.out.println(educationService5.findIdByCandidateNameAndDegreeNameAndUniversity("Ashok", "BSC-CS",
				"Delhi University"));
		System.out.println(educationService5.findStreamByCandidateNameAndDegreeNameAndUniversity("Ashok", "BSC-CS",
				"Delhi University"));
		System.out.println(educationService5.findUniversityByCandidateName("Ashok"));
		System.out.println(educationService5.findPercentageByCandidateName("Ashok"));
		System.out.println(educationService5.findByCandidateName("Ashok"));
		System.out.println(educationService5.findByCandidateNameAndStartDateAndEndDate("Ashok",
				LocalDate.of(2019, 6, 20), LocalDate.of(2022, 10, 4)));
		System.out.println(educationService5.findByCandidateNameAndUniversity("Delhi University", "Ashok"));
		System.out.println(educationService5.total());
		System.out.println(educationService4.find(educationDTO4));
		System.out.println(educationService4.findBacklogByCandidateNameAndDegreeNameAndUniversity("Shubhangi",
				"Bachelor of Eng", "VTUniversity"));
		System.out.println(educationService4.findIdByCandidateNameAndDegreeNameAndUniversity("Shubhangi",
				"Bachelor of Eng", "VTUniversity"));
		System.out.println(educationService4.findStreamByCandidateNameAndDegreeNameAndUniversity("Shubhangi",
				"Bachelor of Eng", "VTUniversity"));
		System.out.println(educationService4.findUniversityByCandidateName("Shubhangi"));
		System.out.println(educationService4.findPercentageByCandidateName("Shubhangi"));
		System.out.println(educationService4.findByCandidateName("Shubhangi"));
		System.out.println(educationService4.findByCandidateNameAndStartDateAndEndDate("Shubhangi",
				LocalDate.of(2018, 6, 20), LocalDate.of(2021, 10, 4)));
		System.out.println(educationService4.findByCandidateNameAndUniversity("VTUniversity", "Shubhangi"));
		System.out.println(educationService4.total());

		System.out.println("*****");

		System.out.println(educationService5.find(educationDTO5));
		System.out.println(educationService5.findBacklogByCandidateNameAndDegreeNameAndUniversity("Ashok", "BSC-CS",
				"Delhi University"));
		System.out.println(educationService5.findIdByCandidateNameAndDegreeNameAndUniversity("Ashok", "BSC-CS",
				"Delhi University"));
		System.out.println(educationService5.findStreamByCandidateNameAndDegreeNameAndUniversity("Ashok", "BSC-CS",
				"Delhi University"));
		System.out.println(educationService5.findUniversityByCandidateName("Ashok"));
		System.out.println(educationService5.findPercentageByCandidateName("Ashok"));
		System.out.println(educationService5.findByCandidateName("Ashok"));
		System.out.println(educationService5.findByCandidateNameAndStartDateAndEndDate("Ashok",
				LocalDate.of(2019, 10, 20), LocalDate.of(2023, 10, 4)));
		System.out.println(educationService5.findByCandidateNameAndUniversity("Delhi University", "Ashok"));
		System.out.println(educationService5.total());

		System.out.println("*****");

		System.out.println(educationService6.find(educationDTO6));
		System.out.println(educationService6.findBacklogByCandidateNameAndDegreeNameAndUniversity("Afreen",
				"Bachelor of Arts", "Mangalore University"));
		System.out.println(educationService6.findIdByCandidateNameAndDegreeNameAndUniversity("Afreen",
				"Bachelor of Arts", "Mangalore University"));
		System.out.println(educationService6.findStreamByCandidateNameAndDegreeNameAndUniversity("Afreen",
				"Bachelor of Arts", "Mangalore University"));
		System.out.println(educationService6.findUniversityByCandidateName("Afreen"));
		System.out.println(educationService6.findPercentageByCandidateName("Afreen"));
		System.out.println(educationService6.findByCandidateName("Afreen"));
		System.out.println(educationService6.findByCandidateNameAndStartDateAndEndDate("Afreen",
				LocalDate.of(2013, 1, 20), LocalDate.of(2016, 10, 4)));
		System.out.println(educationService6.findByCandidateNameAndUniversity("Mangalore University", "Afreen"));
		System.out.println(educationService6.total());

		System.out.println("*****");

		System.out.println(educationService7.find(educationDTO7));
		System.out.println(educationService7.findBacklogByCandidateNameAndDegreeNameAndUniversity("Kiran", "Bach of Sc",
				"Manipal University"));
		System.out.println(educationService7.findIdByCandidateNameAndDegreeNameAndUniversity("Kiran", "Bach of Sc",
				"Manipal University"));
		System.out.println(educationService7.findStreamByCandidateNameAndDegreeNameAndUniversity("Kiran", "Bach of Sc",
				"Manipal University"));
		System.out.println(educationService7.findUniversityByCandidateName("Kiran"));
		System.out.println(educationService7.findPercentageByCandidateName("Kiran"));
		System.out.println(educationService7.findByCandidateName("Kiran"));
		System.out.println(educationService7.findByCandidateNameAndStartDateAndEndDate("Kiran",
				LocalDate.of(2013, 1, 20), LocalDate.of(2016, 10, 4)));
		System.out.println(educationService7.findByCandidateNameAndUniversity("Manipal University", "Kiran"));
		System.out.println(educationService7.total());

		System.out.println("*****");

		System.out.println(educationService9.find(educationDTO9));
		System.out.println(educationService9.findBacklogByCandidateNameAndDegreeNameAndUniversity("Arpita",
				"Bach of com", "Karnatak University"));
		System.out.println(educationService9.findIdByCandidateNameAndDegreeNameAndUniversity("Arpita", "Bach of com",
				"Manipal University"));
		System.out.println(educationService9.findStreamByCandidateNameAndDegreeNameAndUniversity("Arpita",
				"Bach of com", "Manipal University"));
		System.out.println(educationService9.findUniversityByCandidateName("Arpita"));
		System.out.println(educationService9.findPercentageByCandidateName("Arpita"));
		System.out.println(educationService9.findByCandidateName("Arpita"));
		System.out.println(educationService9.findByCandidateNameAndStartDateAndEndDate("Arpita",
				LocalDate.of(2018, 1, 20), LocalDate.of(2021, 10, 4)));
		System.out.println(educationService9.findByCandidateNameAndUniversity("Manipal University", "Arpita"));
		System.out.println(educationService9.total());

		System.out.println("*****");

		System.out.println(educationService10.find(educationDTO10));
		System.out.println(educationService10.findBacklogByCandidateNameAndDegreeNameAndUniversity("Vimal",
				"Bachl of Eng", "Kerala University"));
		System.out.println(educationService10.findIdByCandidateNameAndDegreeNameAndUniversity("Vimal", "Bachl of Eng",
				"Kerala University"));
		System.out.println(educationService10.findStreamByCandidateNameAndDegreeNameAndUniversity("Vimal",
				"Bachl of Eng", "Kerala University"));
		System.out.println(educationService10.findUniversityByCandidateName("Vimal"));
		System.out.println(educationService10.findPercentageByCandidateName("Vimal"));
		System.out.println(educationService10.findByCandidateName("Vimal"));
		System.out.println(educationService10.findByCandidateNameAndStartDateAndEndDate("Vimal",
				LocalDate.of(2017, 1, 2), LocalDate.of(2020, 10, 10)));
		System.out.println(educationService10.findByCandidateNameAndUniversity("Kerala University", "Vimal"));
		System.out.println(educationService10.total());

		System.out.println("*****");

		System.out.println(educationService11.find(educationDTO11));
		System.out.println(educationService11.findBacklogByCandidateNameAndDegreeNameAndUniversity("Darshan",
				"Bachl of Eng", "Maharashtra University"));
		System.out.println(educationService11.findIdByCandidateNameAndDegreeNameAndUniversity("Darshan", "Bachl of Eng",
				"Maharashtra University"));
		System.out.println(educationService11.findStreamByCandidateNameAndDegreeNameAndUniversity("Darshan",
				"Bachl of Eng", "Maharashtra University"));
		System.out.println(educationService11.findUniversityByCandidateName("Darshan"));
		System.out.println(educationService11.findPercentageByCandidateName("Darshan"));
		System.out.println(educationService11.findByCandidateName("Darshan"));
		System.out.println(educationService11.findByCandidateNameAndStartDateAndEndDate("Darshan",
				LocalDate.of(2019, 9, 2), LocalDate.of(2020, 4, 10)));
		System.out.println(educationService11.findByCandidateNameAndUniversity("Maharashtra University", "Darshan"));
		System.out.println(educationService11.total());

		System.out.println("*****");

		System.out.println(educationService12.find(educationDTO12));
		System.out.println(educationService12.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sudha",
				"Bachl of Science", "Kerala University"));
		System.out.println(educationService12.findIdByCandidateNameAndDegreeNameAndUniversity("Sudha",
				"Bachl of Science", "Kerala University"));
		System.out.println(educationService12.findStreamByCandidateNameAndDegreeNameAndUniversity("Sudha",
				"Bachl of Science", "Kerala University"));
		System.out.println(educationService12.findUniversityByCandidateName("Sudha"));
		System.out.println(educationService12.findPercentageByCandidateName("Sudha"));
		System.out.println(educationService12.findByCandidateName("Sudha"));
		System.out.println(educationService12.findByCandidateNameAndStartDateAndEndDate("Sudha",
				LocalDate.of(2020, 1, 2), LocalDate.of(2023, 10, 10)));
		System.out.println(educationService12.findByCandidateNameAndUniversity("Kerala University", "Sudha"));
		System.out.println(educationService12.total());

		System.out.println("*****");

		System.out.println(educationService13.find(educationDTO13));
		System.out.println(educationService13.findBacklogByCandidateNameAndDegreeNameAndUniversity("Suraksha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService13.findIdByCandidateNameAndDegreeNameAndUniversity("Suraksha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService13.findStreamByCandidateNameAndDegreeNameAndUniversity("Suraksha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService13.findUniversityByCandidateName("Suraksha"));
		System.out.println(educationService13.findPercentageByCandidateName("Suraksha"));
		System.out.println(educationService13.findByCandidateName("Suraksha"));
		System.out.println(educationService13.findByCandidateNameAndStartDateAndEndDate("Suraksha",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService13.findByCandidateNameAndUniversity("Karnataka University", "Suraksha"));
		System.out.println(educationService13.total());

		System.out.println(educationService14.find(educationDTO14));
		System.out.println(educationService14.findBacklogByCandidateNameAndDegreeNameAndUniversity("Bindu",
				"Bachl of Commerce", "Karnataka University"));
		System.out.println(educationService14.findIdByCandidateNameAndDegreeNameAndUniversity("Bindu",
				"Bachl of Commerce", "Karnataka University"));
		System.out.println(educationService14.findStreamByCandidateNameAndDegreeNameAndUniversity("Bindu",
				"Bachl of Commerce", "Karnataka University"));
		System.out.println(educationService14.findUniversityByCandidateName("Bindu"));
		System.out.println(educationService14.findPercentageByCandidateName("Bindu"));
		System.out.println(educationService14.findByCandidateName("Bindu"));
		System.out.println(educationService14.findByCandidateNameAndStartDateAndEndDate("Bindu",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService14.findByCandidateNameAndUniversity("Karnataka University", "Bindu"));
		System.out.println(educationService14.total());

		System.out.println("*****");

		System.out.println(educationService15.find(educationDTO15));
		System.out.println(educationService15.findBacklogByCandidateNameAndDegreeNameAndUniversity("Shobha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService15.findIdByCandidateNameAndDegreeNameAndUniversity("Shobha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService15.findStreamByCandidateNameAndDegreeNameAndUniversity("Shobha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService15.findUniversityByCandidateName("Shobha"));
		System.out.println(educationService15.findPercentageByCandidateName("Shobha"));
		System.out.println(educationService15.findByCandidateName("Shobha"));
		System.out.println(educationService15.findByCandidateNameAndStartDateAndEndDate("Shobha",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService15.findByCandidateNameAndUniversity("Karnataka University", "Shobha"));
		System.out.println(educationService15.total());

		System.out.println("*****");

		System.out.println(educationService16.find(educationDTO16));
		System.out.println(educationService16.findBacklogByCandidateNameAndDegreeNameAndUniversity("Swathi",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService16.findIdByCandidateNameAndDegreeNameAndUniversity("Swathi",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService16.findStreamByCandidateNameAndDegreeNameAndUniversity("Swathi",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService16.findUniversityByCandidateName("Swathi"));
		System.out.println(educationService16.findPercentageByCandidateName("Swathi"));
		System.out.println(educationService16.findByCandidateName("Swathi"));
		System.out.println(educationService16.findByCandidateNameAndStartDateAndEndDate("Swathi",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService16.findByCandidateNameAndUniversity("Karnataka University", "Swathi"));
		System.out.println(educationService16.total());

		System.out.println("*****");

		System.out.println(educationService17.find(educationDTO17));
		System.out.println(educationService17.findBacklogByCandidateNameAndDegreeNameAndUniversity("Jamuna",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService17.findIdByCandidateNameAndDegreeNameAndUniversity("Jamuna",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService17.findStreamByCandidateNameAndDegreeNameAndUniversity("Jamuna",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService17.findUniversityByCandidateName("Jamuna"));
		System.out.println(educationService17.findPercentageByCandidateName("Jamuna"));
		System.out.println(educationService17.findByCandidateName("Jamuna"));
		System.out.println(educationService17.findByCandidateNameAndStartDateAndEndDate("Jamuna",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService17.findByCandidateNameAndUniversity("Karnataka University", "Jamuna"));
		System.out.println(educationService17.total());

		System.out.println("*****");

		System.out.println(educationService18.find(educationDTO18));
		System.out.println(educationService18.findBacklogByCandidateNameAndDegreeNameAndUniversity("Kavitha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService18.findIdByCandidateNameAndDegreeNameAndUniversity("Kavitha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService18.findStreamByCandidateNameAndDegreeNameAndUniversity("Kavitha",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService18.findUniversityByCandidateName("Kavitha"));
		System.out.println(educationService18.findPercentageByCandidateName("Kavitha"));
		System.out.println(educationService18.findByCandidateName("Kavitha"));
		System.out.println(educationService18.findByCandidateNameAndStartDateAndEndDate("Kavitha",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService18.findByCandidateNameAndUniversity("Karnataka University", "Kavitha"));
		System.out.println(educationService18.total());

		System.out.println("*****");

		System.out.println(educationService19.find(educationDTO19));
		System.out.println(educationService19.findBacklogByCandidateNameAndDegreeNameAndUniversity("Vinoda",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService19.findIdByCandidateNameAndDegreeNameAndUniversity("Vinoda",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService19.findStreamByCandidateNameAndDegreeNameAndUniversity("Vinoda",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService19.findUniversityByCandidateName("Vinoda"));
		System.out.println(educationService19.findPercentageByCandidateName("Vinoda"));
		System.out.println(educationService19.findByCandidateName("Vinoda"));
		System.out.println(educationService19.findByCandidateNameAndStartDateAndEndDate("Vinoda",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService19.findByCandidateNameAndUniversity("Karnataka University", "Vinoda"));
		System.out.println(educationService19.total());

		System.out.println("*****");

		System.out.println(educationService20.find(educationDTO16));
		System.out.println(educationService18.findBacklogByCandidateNameAndDegreeNameAndUniversity("Suchitra",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService18.findIdByCandidateNameAndDegreeNameAndUniversity("Suchitra",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService18.findStreamByCandidateNameAndDegreeNameAndUniversity("Suchitra",
				"Bachl of Science", "Karnataka University"));
		System.out.println(educationService18.findUniversityByCandidateName("Suchitra"));
		System.out.println(educationService18.findPercentageByCandidateName("Suchitra"));
		System.out.println(educationService18.findByCandidateName("Suchitra"));
		System.out.println(educationService18.findByCandidateNameAndStartDateAndEndDate("Suchitra",
				LocalDate.of(2016, 1, 2), LocalDate.of(2019, 10, 10)));
		System.out.println(educationService18.findByCandidateNameAndUniversity("Karnataka University", "Suchitra"));
		System.out.println(educationService18.total());

	}

}
