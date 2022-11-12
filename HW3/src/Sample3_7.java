
public class Sample3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7 car1;
		car1 = new Car7();
		car1.car(1234, 20.5);
	}

}
class Car7{
	
	int num;
	double gas;
	
	void car(int a,double b) {
		num = a;
		gas = b;
		System.out.println("車牌號碼是"+num+"，油量是"+gas);
	}
}