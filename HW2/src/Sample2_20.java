//講義寫的方法應該是選擇排序
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_20 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入5個人的分數");
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		int test[] = new int[5];
		for(int i=0;i<5;i++) {
			String str1 = br1.readLine();
			test[i] = Integer.parseInt(str1);
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(test[j]<test[j+1]) {
					int num = test[j];
					test[j] = test[j+1];
					test[j+1] = num;
				}
//				for(int s=0;s<5;s++) {
//					System.out.print(test[s]+" ");
//				}
//				System.out.print("\n");
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}

	}

}
