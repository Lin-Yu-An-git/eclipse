import java.lang.reflect.Array;

public class Sample2_16 {

	public static void main(String[] args) {
		int[] intArray = (int[])Array.newInstance(int.class, 3);
		
		Array.set(intArray, 0,123);
		Array.set(intArray, 1,456);
		Array.set(intArray, 2,789);
		
		System.out.println("intArrat[0]="+Array.get(intArray,0));
		System.out.println("intArrat[1]="+Array.get(intArray,1));
		System.out.println("intArrat[2]="+Array.get(intArray,2));
	}

}
