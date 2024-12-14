package com.day6;


public class ExceptionHandling1 {
	

	public static void main(String[] args) {
		
		System.out.println("Befor excution");
		
		try {
			//int a = 10/0;
			//System.out.print(a);
			int b[]= new int[-5];
			System.out.print(b[3]);
			
		}
		
		catch(ArithmeticException a) {
			
			System.out.print("Erro division by 0");
			
		}
		catch(ArrayIndexOutOfBoundsException b) {
			
			System.out.print("Index out of bound");
		}
		
		catch (Exception e){
			
			System.out.print(e.getMessage());
			System.out.println(" -> Some error");
						
		}
		finally{
			System.out.println("hi");
		}

	}

}
