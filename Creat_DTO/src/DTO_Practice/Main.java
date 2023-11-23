package DTO_Practice;
import java.util.*;
import java.io.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//not exception
		try {
			StudentDTO student1 = StudentDTOFactory.createStudentDto(new StudentDTOBuilder()
					.id(1)
					.name("홍길동")
					.age(23)
					.address(new Address("here", "Pusan", "123"))
					.build()); 
			
			System.out.println(student1.getAge());
		} catch (Exception e) {
			System.out.println("exception : " + e);
		}
		
		//has exception
		try {
			StudentDTO student1 = StudentDTOFactory.createStudentDto(new StudentDTOBuilder()
					.id(1)
					.age(21)
					.address(new Address("here", "Pusan", "123"))
					.build()); 
			
			System.out.println(student1.getAge());
		} catch (Exception e) {
			System.out.println("exception : " + e);
		}
	}

}
