package week1.day2;

public class calculator {
public void addTwoNumbers(int a,int b) {
	int c=a+b;
	System.out.println(c);
	}
public void subTwoNumbers(int a,int b) {
	int c=a-b;
	System.out.println(c);
}
public void multiplyTwoNumbers(float a,float b) {
float c=a*b;
System.out.println(c);
}
public void divideTwoNumbers(double a,double b) {
    double  c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
	calculator cal=new calculator();
	cal.addTwoNumbers(20, 20);
	cal.subTwoNumbers(20,20);
	cal.multiplyTwoNumbers(200f, 200f);
	cal.divideTwoNumbers(200.5,20.5);
}
}
