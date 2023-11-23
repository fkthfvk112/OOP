package DTO_Practice;

public class StudentDTOBuilder {
	public static final String NO_DATA = (String)DtoDefaultEnum.NO_DATA.getValue();
	public static final int NO_DATA_NUMBER = (int)DtoDefaultEnum.NO_DATA_NUMBER.getValue();
	
	private int id = NO_DATA_NUMBER;
	private String name = NO_DATA;
	private int age = NO_DATA_NUMBER;
	private Address address = new Address(NO_DATA, NO_DATA, NO_DATA);
	
	public StudentDTOBuilder() {}

	public StudentDTOBuilder id(int id) {
		this.id = id;
		return this;
	}
	
	public StudentDTOBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentDTOBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public StudentDTOBuilder address(Address address) {
		this.address = address;
		return this;
	}
	
	public StudentDTO build() {
		return new StudentDTO(id, name, age, address);
	}
}
