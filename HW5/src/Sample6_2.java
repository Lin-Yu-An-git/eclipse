
public class Sample6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1 = new Car2("一號車");
		car1.start();
		Car2 car2 = new Car2("二號車");
		car2.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}
class Car2 extends Thread{
	private String name;
	public Car2(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}