
public class Sample3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10 car1;
		car1 = new Car10();
		car1.getNumGas(1234, 20.5);
		car1.show();
		System.out.println("指定不正確的汽油量");
		car1.getNumGas(1234, -10);
		car1.show();
	}

}
class Car10{
	private int num;
	private double gas;
	public void getNumGas(int a , double b) {
		if(b>0 && b<100) {
			num = a;
			gas = b;
			System.out.println("將車號設為"+num+"汽油量設為"+gas);
		}
		else {
			System.out.println(b+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}