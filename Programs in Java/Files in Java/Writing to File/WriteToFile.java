import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		File file = new File("MyFile.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fout = new FileOutputStream(file);
		//writing byte
		fout.write(65);
		System.out.println("\n");
		
		//writing String
		String s = "Hello World";
		byte b[] = s.getBytes(); //converting string into byte array    
		fout.write(b);
		
		fout.close();
	}
	

}
