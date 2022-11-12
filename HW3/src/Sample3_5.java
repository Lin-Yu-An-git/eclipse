
public class Sample3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car1;
		car1 = new Car5();
		car1.num = 1234;
		car1.gas = 20.5;
		car1.showcar();
	}

}
class Car5{
	int num;
	double gas;
	void show() {
		System.out.println("車牌號碼是"+num);
		System.out.println("油量是"+gas);
	}
	void showcar() {
		System.out.println("車子的資訊是:");
		show();
	}
}