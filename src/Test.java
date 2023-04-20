import java.io.File;

public class Test {

	public static void main(String[] args) {
		
		File file = new File("abc"+args[0]); // Changed by MCC | Tech Refresh - Coverity Fix - 25161 | 17 Apr 2023

	}
}
