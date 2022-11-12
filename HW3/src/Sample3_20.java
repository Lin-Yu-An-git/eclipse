import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
public class Sample3_20 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入字串");
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		System.out.println("請輸入需要新增的字串");
		String str2 = br1.readLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		System.out.println("在"+str1+"後面新增"+str2+"變成"+sb);
	}

}
