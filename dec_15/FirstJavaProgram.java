/**
@Author: Mehedi Hasan Shuvo
@Date: December 15, 2018
*/

public class FirstJavaProgram{

	public static void main(String[] args){
		//Single line comments
		for(int i=1;i<=10;i++){
		System.out.println("Hello Programmer Shuvo !!! "+ "It's "+i);
		}
		try{
			System.out.println(100/0);
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Error");
		}
		/*
		Multiple
		Line
		Comments
		*/
	}
}