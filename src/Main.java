import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\usuarios\\1006171667\\Documents\\alfa.txt";
		File file= new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(isr);
		
		String data = "";
		String line = null;
		while((line = reader.readLine()) != null) {
			data += line+"\n";
		}
		
		//Edicion del archivo
		data += "leido por Eclipse JAVA";
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes());
		fos.close();
		
		//File puede ser una carpeta o un archivo
		File folder = new File("D:\\usuarios\\1006171667\\Documents");
		System.out.println(folder.exists());
		
		String [] filenames = folder.list();//Guarda los archivos de una carpeta en el arreglo
		
		for(String name: filenames) {
			System.out.println(name);
		}
		
		File newFolder = new File("D:\\usuarios\\1006171667\\Documents\\newFolder");
	}
}
