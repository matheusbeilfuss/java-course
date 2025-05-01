package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("/home/user/in.txt");
		Scanner sc = null;
		try { // ao instanciar o scanner a partir do arquivo, o programa tenta abrir o arquivo, e nesse momento uma IOException pode ser lançada
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			// boa prática, porque o recurso vai ser fechado o try dando certo ou não
			if (sc != null) {
				sc.close();
			}
		}
	}
}
