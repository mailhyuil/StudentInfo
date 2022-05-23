package com.callor.student.service;

import java.util.List;

import com.callor.student.entity.StudentVO;

public interface StudentService {
	public void inputStudent(List<StudentVO> list);

	public void printStudent();
}
