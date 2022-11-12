
public class Sample3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15.showSum();
		Car15 car1;
		car1 = new Car15();
		car1.setCar(1234,20.5);
		Car15.showSum();
		Car15 car2;
		car2 = new Car15();
		car2.setCar(234,33.3);
		Car15.showSum();
	}

}
class Car15{
	public static int sum = 0;
	private int num;
	private double gas;
	public Car15() {
		num = 0;
		gas = 0;
		sum++;
		System.out.println("生產了車子");
	}
	public static void showSum() {
		System.out.println("車子一共有"+sum+"台");
	}
	public void setCar(int a, double b) {
		num = a;
		gas = b;
		System.out.println("將車號設定為"+num+",汽油量設為"+gas);
	}
}