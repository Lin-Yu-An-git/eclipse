import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample10
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入一個變數");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		System.out.println("您輸入的數字為"+num+"\n");
		System.out.println("請輸入字串");
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		System.out.println("剛剛輸入的字串為"+str2);
	}

}
