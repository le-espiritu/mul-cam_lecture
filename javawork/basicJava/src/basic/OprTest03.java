package basic;
//����������
// - and : &
// - or  : |
public class OprTest03{
	public static void main(String[] args){
		int age = 15;
		int gender = 1;
		
		int num1 = 100;
		int num2 = 200;
		//&������(and)
		System.out.println("===========&����============");
		//true & true
		System.out.println((num1<num2) & (num1>=100)); 
		//true & false
		System.out.println((num1<num2) & (num1>100)); 
		//false & true
		System.out.println((num1>num2) & (num1>=100)); 
		//false & false
		System.out.println((num1>num2) & (num1>100)); 


		//|������(or)
		System.out.println("===========|����============");
		//true | true
		System.out.println((num1<num2) | (num1>=100)); 
		//true | false
		System.out.println((num1<num2) | (num1>100)); 
		//false | true
		System.out.println((num1>num2) | (num1>=100)); 
		//false | false
		System.out.println((num1>num2) | (num1>100)); 

		System.out.println(); //EnterŰ�� ���� �Ͱ� ���� ���
		//! (not)
		System.out.println(!true);
		System.out.println(!false);
	}
}