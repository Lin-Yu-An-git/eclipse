import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample3_18 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入英文字母");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br1.readLine();
		String stu = str.toUpperCase();
		String stl = str.toLowerCase();
		System.out.println("改成大寫"+stu);
		System.out.println("改成小寫"+stl);
	}

}
