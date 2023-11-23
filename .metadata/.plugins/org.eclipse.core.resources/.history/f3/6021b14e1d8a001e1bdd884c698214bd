package DTO_Practice;

public class StudentDTOFactory {
	public static StudentDTO createStudentDto(StudentDTO student) {
		checkError(student);
		
		return student;
	}
	
	public static StudentDTO createStudentDto(int id, String name, int age, Address address) {
		StudentDTO student = new StudentDTOBuilder()
				.id(id)
				.age(age)
				.address(address)
				.build();
		checkError(student);

		return student;
	}
	
	private static void checkError(StudentDTO student) {
		boolean errorCondition = (student.getId() <= 0)||
				(student.getName().equals("noData") )||
				(student.getAge() <= -1)||
				(student.getAddress().hasError());
		//유효성 검증
		if(errorCondition) {
            throw new IllegalArgumentException("Invalid StudentDTO properties");
		}
	}
}