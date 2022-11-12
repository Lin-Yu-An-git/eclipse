
public class Sample3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car14 car1;
		car1 = new Car14();
		car1.show();
		Car14 car2;
		car2 = new Car14(1234,11.1);
		car2.show();
	}

}
class Car14{
	private int num;
	private double gas;
	public Car14() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public Car14(int a , double b) {
		this();    //可用作呼叫沒有參數的建構式
		num = a;
		gas = b;
		System.out.println("生產的車號為"+num+",汽油量為"+gas);
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
	}
}