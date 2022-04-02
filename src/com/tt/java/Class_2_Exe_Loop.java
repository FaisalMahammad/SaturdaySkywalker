package com.tt.java;

public class Class_2_Exe_Loop {

	public static void main(String[] args) {
		
		practiceNestedForLoop();
	}

	public static void practiceForLoop(){
		int i;
		for (i=1; i<10; i++){
			System.out.println(" For Loops Number = " + i);
		}
		
	}
	
		//While Loop
		public static void practiceWhileLoop(){
			int i=5;
			while(i<10){
				System.out.println(" While Loops Number = " + i);
				i++;
				
			}
		}
		
		public static void practiceDoWhileLoop(){
			int i=1;
			do {
				System.out.println("Do While Loops Number = " + i);
				
				i++;
			} while (i<10);
		}
			//Infinite loop
			public static void practiceInfiniteLoop(){
				int i;
				for (i=1; ;i--){
					System.out.println("Infinite Loops Number = " + i);
				
			}
		}
		
		
		public static void practiceNestedForLoop(){
			int i;
			int j;
			for (i=1; i<5; i++){
				for (j=1; j<5; j++)
				System.out.println("For Loops Number = " + i + " : " +j);
			}
			System.out.println("Increse value of i -> " + i);
		}
		}

