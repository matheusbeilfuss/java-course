package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/user/in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr); // BufferedReader é instanciado a partir do FileReader
			// A partir da stream básica, instancia-se a stream com buffer para deixar a leitura mais rápida
			
			String line = br.readLine(); // lê uma linha do arquivo. Se já estiver no final, retorna null
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
