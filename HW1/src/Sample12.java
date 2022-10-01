
public class Sample12 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 5;
		System.out.println("num1為"+num1+"，num2為"+num2);
		System.out.println("num1+num2為"+(num1+num2));
		System.out.println("num1-num2為"+(num1-num2));
		System.out.println("num1*num2為"+(num1*num2));
		System.out.println("num1/num2為"+(num1/num2));
		System.out.println("num1%num2為"+(num1%num2));
		
		int a, b, c;
		a=b=c=0;
		b=a++;//a加第一次 a=1
		c=++a;//a加第二次 a=2
		System.out.println("b因為是先給值後才加，所以值為"+b);
		System.out.println("c因為是先加後才給值，所以值為"+c);
	}

}
