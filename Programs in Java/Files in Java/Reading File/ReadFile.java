import java.io.FileInputStream;

public class ReadFile {
	public static void main(String args[]) {
		try {
			//FileInputStream fin = new FileInputStream("MyFile.txt");
			FileInputStream fin = new FileInputStream("D:\\Learning Java Programs\\Programs in Java\\Files in Java\\Writing to File\\MyFile.txt");
			//int i = fin.read();
			//System.out.print((char) i);
			
			int j = 0;
			while((j=fin.read()) != -1) {
				System.out.print((char)j);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
