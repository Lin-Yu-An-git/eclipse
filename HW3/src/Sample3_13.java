
public class Sample3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car13 car1;
		car1 = new Car13();
		car1.show();
		Car13 car2;
		car2 = new Car13(1234,11.1);
		car2.show();
	}

}
class Car13{
	private int num;
	private double gas;
	public Car13() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public Car13(int a , double b) {
		num = a;
		gas = b;
		System.out.println("生產的車號為"+num+",汽油量為"+gas);
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
	}
}