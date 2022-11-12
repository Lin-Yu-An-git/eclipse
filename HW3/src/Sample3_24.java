
public class Sample3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car24[] car1;
		car1 = new Car24[3];
		for(int i =0;i<car1.length;i++) {
			car1[i] = new Car24();
		}
		car1[0].setCar(1234, 11.1);
		car1[1].setCar(3345, 20.1);
		car1[2].setCar(5678, 30.5);
		for(int i=0;i<car1.length;i++) {
			car1[i].show();
		}
	}

}
class Car24{
	private int num;
	private double gas;
	public Car24() {
		num = 0;
		gas = 0;
	}
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