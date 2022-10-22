import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_3 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入一個整數");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br1.readLine());
		
		if(num==1) {
			System.out.println("輸入結果是"+num);
		}
		else {
			System.out.println("選擇的是1以外的數("+num+")");
		}
	}

}
