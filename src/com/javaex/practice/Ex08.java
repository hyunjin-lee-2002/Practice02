package com.javaex.practice;

import java.util.Scanner;
//﻿사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후에 저체중, 표준, 과체중을 구분하여 출력하 프로그램을 작성하세요.
//표준체중 = (키 - 100) * 0.9

public class Ex08 {
	
    public static void main(String[] args) {
    	
    	
    	int height;
    	int weight;
    	double standweight;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("키를 입력하세요");
    	height = sc.nextInt();
    	
    	System.out.println("몸무게를 입력하세요");
    	weight = sc.nextInt();
    	
    	System.out.println();
    	standweight = (height - 100) * 0.9;
    	
    	
    	if (weight < standweight ) {
    		System.out.println("저체중 입니다. ");
    	} else if (weight == standweight) {
    		System.out.println("표준체중 입니다. ");
    	} else {
    		System.out.println("과체중 입니다. ");
    	}

        sc.close();
    }
    
}