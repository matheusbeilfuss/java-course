package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); // variável "File" pode ser tanto caminho de arquivo quanto de pasta
		
		File[] folders = path.listFiles(File::isDirectory); // reference methods para listar somente diretórios/pastas
		
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); // agora, pega só a lista de arquivos
		
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}
}
