package com.callor.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.entity.StudentVO;
import com.callor.student.service.impl.StudentServiceImpl;

public class Controller {
	public static void main(String[] args) {
		List<StudentVO> stList = new ArrayList<>();
		StudentVO vo = new StudentVO();
		Scanner scan = new Scanner(System.in);
		StudentServiceImpl service = new StudentServiceImpl();

		while (true) {
			vo = new StudentVO();
			System.out.print("번호 입력 (QUIT:종료) > ");
			String num = scan.nextLine();
			if (num.equals("QUIT")) {
				break;
			}
			System.out.print("이름 입력 (QUIT:종료) > ");
			String name = scan.nextLine();
			if (name.equals("QUIT")) {
				break;
			}
			System.out.print("학과 입력 (QUIT:종료) > ");
			String dept = scan.nextLine();
			if (dept.equals("QUIT")) {
				break;
			}
			System.out.print("학년 입력 (QUIT:종료) > ");
			String grade = scan.nextLine();
			if (grade.equals("QUIT")) {
				break;
			}
			System.out.print("전화번호 입력 (QUIT:종료) > ");
			String tel = scan.nextLine();
			if (tel.equals("QUIT")) {
				break;
			}

			vo.setStNum(num);
			vo.setStName(name);
			vo.setStDept(dept);
			vo.setStGrade(grade);
			vo.setStTel(tel);
			stList.add(vo);
		}

		System.out.println("입력이 중단되었습니다");

		System.out.println();
		service.inputStudent(stList);
		service.printStudent();
	}
}
