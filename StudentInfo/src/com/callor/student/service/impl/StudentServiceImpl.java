package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.entity.StudentVO;
import com.callor.student.service.StudentService;

public class StudentServiceImpl implements StudentService {
	String fileName;
	List<StudentVO> stList;

	public StudentServiceImpl() {
		fileName = "src/com/callor/student/entity/student.txt";
		stList = new ArrayList<>();
	}

	@Override
	public void inputStudent(List<StudentVO> newList) {
		FileWriter fileWriter = null;
		PrintWriter print = null;
		InputStream fi = null;
		Scanner scan = null;

		try {
			fi = new FileInputStream(fileName);
			scan = new Scanner(fi);
			while (scan.hasNext()) {
				StudentVO vo = new StudentVO();
				String line = scan.nextLine();
				vo.setStNum(line.split(":")[0]);
				vo.setStName(line.split(":")[1]);
				vo.setStDept(line.split(":")[2]);
				vo.setStGrade(line.split(":")[3]);
				vo.setStTel(line.split(":")[4]);
				stList.add(vo);
			}
			for (StudentVO stVO : newList) {
				stList.add(stVO);
			}

			fileWriter = new FileWriter(fileName);
			print = new PrintWriter(fileWriter);
			for (StudentVO scVO : stList) {
				print.printf("%s:", scVO.getStNum());
				print.printf("%s:", scVO.getStName());
				print.printf("%s:", scVO.getStDept());
				print.printf("%s:", scVO.getStGrade());
				print.printf("%s\n", scVO.getStTel());
			}
			print.close();
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void printStudent() {
		System.out.println("=".repeat(30));
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		for (StudentVO stVO : stList) {
			System.out.print(stVO.getStNum() + "\t");
			System.out.print(stVO.getStName() + "\t");
			System.out.print(stVO.getStDept() + "\t");
			System.out.print(stVO.getStGrade() + "\t");
			System.out.print(stVO.getStTel() + "\n");
		}
	}

}
