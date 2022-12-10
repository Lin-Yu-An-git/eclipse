
public class Sample6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car1 = new Car5("一號車");
		car1.start();
		try {
			car1.join();
			System.out.println("中斷結束");
		
			} catch(InterruptedException e) {
				
			}
		System.out.println("結束main()的處理");
	}

}
class Car5 extends Thread{
	private String name;
	public Car5(String nm) {
		name = nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}