package com.imcs.app;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import trng.imcs.jaxb.Address;
import trng.imcs.jaxb.Student;
public class StudentMarshall {
	

	public static void main(String[] args) throws DatatypeConfigurationException {
		try {

			// File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// StringWriter stringWriter = new StringWriter();
			// jaxbMarshaller.marshal(getEmployee(), stringWriter);
			jaxbMarshaller.marshal(getStudent(), System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	private static Student getStudent() throws DatatypeConfigurationException {


		Student student = new Student();
		student.setStudentId(20);
		student.setFirstName("Sourabh");
		student.setLastName("Srinivasa Prasanna");
		Address address = new Address();
        
		address.setAddressLine("1430 Valley Ranch");
		address.setAddressType("HOME");
		address.setCity("Irving");
		address.setState("Texas");
		address.setZipcode(75063);
	
		student.getAddress().add(address );
		return student;
	}

}
