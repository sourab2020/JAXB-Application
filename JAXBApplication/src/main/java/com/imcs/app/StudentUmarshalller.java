package com.imcs.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import trng.imcs.jaxb.Student;

public class StudentUmarshalller {
	
	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Student employee = (Student) jaxbUnmarshaller.unmarshal(new File("/Users/sourabhsp/Documents/workspace1/JAXBApplication/src/main/resources/xml/Student.xml"));
			
			System.out.println("Student ID:"+employee.getStudentId());
			System.out.println("First Name:"+employee.getFirstName());
			System.out.println("Last Name:"+employee.getLastName());
			System.out.println("Address:"+employee.getAddress().get(0).getAddressLine());
			System.out.println("City:"+employee.getAddress().get(0).getCity());
			System.out.println("State"+employee.getAddress().get(0).getState());
			System.out.println("Zipcode:"+employee.getAddress().get(0).getZipcode());
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	}
}
