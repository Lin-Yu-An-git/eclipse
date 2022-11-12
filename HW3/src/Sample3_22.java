
public class Sample3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("宣告car1");
		Car22 car1;
		car1 = new Car22();
		car1.setCar(1234, 20.5);
		System.out.println("宣告car2");
		Car22 car2;
		System.out.println("將car1指定給car2");
		car2 = car1;
		System.out.println("car1的");
		car1.show();
		System.out.println("car2的");
		car2.show();
		System.out.println("改變car1的相關資料");
		car1.setCar(5678, 30.9);
		System.out.println("car1的");
		car1.show();
		System.out.println("car2的");
		car2.show();
	}

}
class Car22{
	private int num;
	private double gas;
	public void setCar(int a , double b) {
		num = a;
		gas = b;
		System.out.println("生產的車號為"+num+",汽油量為"+gas);
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
	}
}