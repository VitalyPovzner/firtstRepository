import java.util.Random;

public class GItTest {

	public static void main(String[] args) {
		System.out.println("tst");
		Random r=new Random();
		int[]arr=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(10);
		}
	}

}
