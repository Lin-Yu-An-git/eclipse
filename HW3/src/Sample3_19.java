import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample3_19 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入字串");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		System.out.println("請輸入要檢索的文字");
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		char ch = str2.charAt(0);
		int num = str1.indexOf(ch);
		if(num!=-1) {
			System.out.println(str1+"的第"+(num+1)+"個字是"+ch);
		}
		else {
			System.out.println(str1+"中沒有"+ch+"這個字");
		}
	}

}
