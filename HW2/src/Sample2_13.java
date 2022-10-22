import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_13 {

	public static void main(String[] args)throws IOException {
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 =br1.readLine(); 
		int num = Integer.parseInt(str1);
//		for(int i=0;i<num;i++) {
//			System.out.println("第"+(i+1)+"次處理");
		for(int i=0;i<10;i++) {
			System.out.println("第"+(i+1)+"次處理");
			if(i==(num-1)){
				break;
			}
		}
		
	}

}
