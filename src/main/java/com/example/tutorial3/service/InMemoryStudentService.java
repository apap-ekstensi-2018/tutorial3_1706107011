package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
private static List<StudentModel> studentList = new ArrayList<StudentModel>();

@Override
public StudentModel selectStudent(String npm) {
	StudentModel student=null;
	for (StudentModel st:studentList ) {
		if (st.getNpm().equals(npm)) {
			return student=st;
		}
	}
	return null;
}

@Override
public List<StudentModel> selectAllStudents(){
	return studentList;
}
@Override
public void addStudent(StudentModel student) {
	studentList.add(student);
}
@Override
public void deleteStudent(StudentModel student) {
	// TODO Auto-generated method stub
	studentList.remove(student);
	
}
	
	
	
	
	
	
	
}
