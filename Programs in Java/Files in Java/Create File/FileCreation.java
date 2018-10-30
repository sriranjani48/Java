import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File file = new File("MyFile.txt");
		boolean fvar = file.createNewFile();
		if(fvar) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
