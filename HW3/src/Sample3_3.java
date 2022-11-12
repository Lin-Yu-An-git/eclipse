
public class Sample3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car1;
		car1 = new Car3();
		Car3 car2;
		car2 = new Car3();
		car1.num = 1234;
		car1.gas = 20.5;
		car2.num = 4567;
		car2.gas = 30.5;
		System.out.println("一號車的車牌是"+car1.num);
		System.out.println("一號車的汽油是"+car1.gas);
		System.out.println("二號車的車牌是"+car2.num);
		System.out.println("二號車的車牌是"+car2.gas);
	}

}
class Car3{
	int num;
	double gas;
}