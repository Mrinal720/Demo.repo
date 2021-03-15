package practice.org;

import java.io.IOException;

public class TestUtil {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("C:\\Users\\Mrinal Bhardwaj\\Downloads\\mrinal.bat\\mrr.bat");
		process.waitFor();
	}
	
	
}
