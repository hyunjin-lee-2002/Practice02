package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	//﻿아래와 같이 작성된 코드가 있다.
	//﻿보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요

	
	//(1) 15일 때 결과 --> group 2
	//(2) 19일 때 결과 --> group 2
	//(3) 20일 때 결과 --> group 2
	//(4) 21일 때 결과 --> group 1
	//(5) 100일 때 결과 -> group 1
	
	
	
	public static void main(String[] args) {

		int age; //나이
		
		Scanner sc = new Scanner (System.in);
		
		//나이를 입력받는다. 
		System.out.println("나이를 입력해 주세요. ");
		System.out.println("나이: ");
		age = sc.nextInt();
		
		//그룹 분류
		if (age>20) { //over 20
			System.out.println("\"grout 1\"");
		}else {//under 20
			System.out.println("\"group 2\"");
		}
		System.out.println("입니다. ");
		
		sc.close();
		
	}

}




