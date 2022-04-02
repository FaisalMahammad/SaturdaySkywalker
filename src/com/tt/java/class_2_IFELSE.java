package com.tt.java;

public class class_2_IFELSE {

	public static void main(String[] args) {
		
		//IF ELSE Statement
		
		int age = 86;
		
		ifelseStatement(age);
		
	}
	
		
	
	public static void ifelseStatement(int age){
		
		
		if ( age < 13){
			System.out.println("You are childeren");
		
		}
		
		else if (age>13 && age < 18){
			System.out.println("You are Teenager");
			
		}
		
		else if (age > 60){
			//Nested If Else Statement
			if(age >100){
				System.out.println("You are Hero");
			}
			else{
				System.out.println("You are Senior");
			}
			
		} 
		


	}

}
