
public class Sample3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8 car1;
		car1 = new Car8();
		car1.setnumgas(1234, 20.5);
		int num = car1.getnum();
		double gas = car1.getgas();
		System.out.println("調查結果顯示車牌號碼為"+num+",油量為"+gas);
	}

}
class Car8{
	int num;
	double gas;
	double getgas() {
		System.out.println("調查油量");
		return gas;
	}
	int getnum() {
		System.out.println("調查車牌號");
		return num;
	}
	void setnumgas(int a, double b) {
		num = a;
		gas = b;
		System.out.println("車牌號碼為"+num+"油量為"+gas);
	}
}