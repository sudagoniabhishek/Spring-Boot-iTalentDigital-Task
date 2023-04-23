//Java objects to JSON format
package com.abhi.model.javaobjecttojson;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) {
		try {
		ObjectMapper objectMapper=new ObjectMapper();
		Employee employee=new Employee("abhi","Hyderabad","Software","Developer");
		
		objectMapper.writeValue(new File("target/emp.json"), employee);
		}
//		try {
//			ObjectMapper objectMapper =new ObjectMapper();
//			String employeeJson="{\"name\":\"abhi\",\"city\":\"Hyderabad\",\"department\":\"Software\",\"designation\":\"Developer\"}";
//			JsonNode jsonNode=objectMapper.readTree(employeeJson);
//			
//			String empName=jsonNode.get("name").asText();
//			String empCity=jsonNode.get("city").asText();
//			String empDept=jsonNode.get("department").asText();
//			String empDesig=jsonNode.get("designation").asText();
//			
//			objectMapper.writeValue(new File("target/employeeNode.txt"), empName +","+ empCity +","+ empDept +","+ empDesig);
//			
//			
//		}
		catch(final Exception e) {
			e.printStackTrace();
		}
	}

}