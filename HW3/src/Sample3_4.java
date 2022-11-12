
public class Sample3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car1;
		car1 = new Car4();
		car1.num = 1234;
		car1.gas = 20.5;
		car1.show();
	}

}
class Car4{
	int num;
	double gas;
	
	void show() {
		System.out.println("車牌號是" + num);
		System.out.println("汽油量是" + gas);
	}
}