
public class Sample3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11 car1;
		car1 = new Car11();
		car1.setCar(123,11.1);
		car1.show();
		System.out.println("只變更車牌");
		car1.setCar(234);
		car1.show();
		System.out.println("指變更汽油量");
		car1.setCar(30.5);
		car1.show();
	}
}
class Car11{
	private int num;
	private double gas;
	public void setCar(int a) {
		num = a;
		System.out.println("將車牌設為"+num);
	}
	public void setCar(double b) {
		gas = b;
		System.out.println("將汽油量設為"+gas);
	}
	public void setCar(int a , double b) {
		num = a;
		gas = b;
		System.out.println("將車牌設為"+num+",將汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車牌號為"+num);
		System.out.println("汽油量為"+gas);
	}
}