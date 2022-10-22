/*if判斷沒有加括號的話會只有if下方的第一句有效其餘會失效*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_2 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入一個整數");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br1.readLine());
		
		if(num==1)
			System.out.println("輸入的是"+num);
			System.out.println("選擇的是"+num);
			System.out.println("結束處理");
	}

}
