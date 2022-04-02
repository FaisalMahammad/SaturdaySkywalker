package com.tt.java;

public class Java_classs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			int[] ageGroup = new int[] { 25, 22, 29, 35, 40};
			System.out.println("Student Age : " + ageGroup[8]);
			
		} catch(Exception e){
			
			System.out.println("Please check array index");
			
			e.printStackTrace();
		}
		
	}
	}

