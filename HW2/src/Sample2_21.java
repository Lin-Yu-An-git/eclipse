import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
public class Sample2_21 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入5個人的分數");
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		Integer test[] = new Integer[5];
		for(int i=0;i<5;i++) {
			String str1 = br1.readLine();
			test[i] = Integer.parseInt(str1);
		}
		Arrays.sort(test,Collections.reverseOrder());
		for(int i=0;i<5;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}

	}

}
