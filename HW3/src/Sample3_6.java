
public class Sample3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car6 car1;
		car1 = new Car6();
		car1.carnum(1234);
		car1.cargas(20.5);
	}

}
class Car6{
	void carnum(int a) {
		int num = a;
		System.out.println("車牌號碼是"+num);
	}
	void cargas(double b) {
		double gas = b;
		System.out.println("車油量是"+gas);
	}
}