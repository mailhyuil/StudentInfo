package com.callor.student.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class StudentVO {
	private String stNum;
	private String stName;
	private String stDept;
	private String stGrade;
	private String stTel;
}
