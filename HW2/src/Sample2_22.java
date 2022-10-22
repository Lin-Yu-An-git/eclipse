
public class Sample2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]test = {{80,90},{60,55},{22,68},{50,72},{75,0}};
		
		for(int i=0;i<5;i++) {
			System.out.println("第"+(i+1)+"個人的國文是"+test[i][0]+"分");
			System.out.println("第"+(i+1)+"個人的數學是"+test[i][1]+"分");
		}
	}
}