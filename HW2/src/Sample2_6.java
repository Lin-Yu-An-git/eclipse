/*switch case 如果沒有break會出錯(每個都執行)*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_6 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入a或b");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		char letter = str1.charAt(0);
		switch(letter){
			case 'a':{
				System.out.println("輸入的是"+letter);
				break;
			}    
			case 'b':{
				System.out.println("輸入的是"+letter);
				break;
			}
			default:{
				System.out.println("請輸入a或b");
				break;
			}
				
		}
	}

}
