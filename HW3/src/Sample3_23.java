
public class Sample3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car23 car1;
		car1 = new Car23();
		car1.show();
		car1.setCar(1234, 2.50);
		car1.setName("馬車");
		car1.show();
	}

}
class Car23{
	private int num;
	private double gas;
	private String name;
	public Car23() {
		num = 0;
		gas = 0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	public void setCar(int a , double b) {
		num = a;
		gas = b;
		System.out.println("將車車號設為"+num+",汽油量設為"+gas);
	}
	public void setName(String str) {
		name = str;
		System.out.println("將車名設為"+name);
	}
	public void show() {
		System.out.println("車牌號碼為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("車名是"+name);
	}
}