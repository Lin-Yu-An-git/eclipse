
public class Sample5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] test = new int[5];
			System.out.println("將值指定給test[10]");
			 test[10] = 80;
			 System.out.println("將80指定給test[10]");
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("超過陣列的範圍");
		}
		System.out.println("順利地執行完畢");
	}

}
