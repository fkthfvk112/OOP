package DTO_Practice;

public class StudentDTO {
	public static final String NO_DATA = (String)DtoDefaultEnum.NO_DATA.getValue();
	public static final int NO_DATA_NUMBER = (int)DtoDefaultEnum.NO_DATA_NUMBER.getValue();

	private int id = NO_DATA_NUMBER;
	private String name = NO_DATA;
	private int age = NO_DATA_NUMBER;
	private Address address = new Address();
	
	public StudentDTO(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
}

