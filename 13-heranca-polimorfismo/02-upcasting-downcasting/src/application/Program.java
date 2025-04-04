package application;

import java.text.ParseException;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		// Pegar um objeto do tipo BusinessAccount e atribuí-lo a uma variável do tipo Account
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// Não ocasiona erro porque BusinessAccount é uma Account
		// Vamos utilizar isso com Polimorfismo
		
		// DOWNCASTING
		// Converter um objeto da superclasse para a subclasse
		
		// BusinessAccount acc4 = acc2; // Ocasiona erro porque o compilador não se sabe se essa é uma conversão segura
		// Nesse caso a conversão não é natural. Para forçar essa conversão, é preciso um casting manual:
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// Assim, para usar "loan" a partir de uma variável que é originalmente "Account", é preciso fazer o downcasting dela para o tipo BusinessAccount 
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		// acc3, ainda que do tipo Account, foi instanciada como SavingsAccount. Ela não é uma BusinessAccount.
		// Por isso, essa operação não é permitida. Mas, como o compilador não sabe que acc3 na verdade é uma SavingsAccount, 
		// essa tentativa de conversão só vai dar erro ao executar a aplicação.
		
		// Exception in thread "main" java.lang.ClassCastException: class entities.SavingsAccount cannot be cast to class entities.BusinessAccount (entities.SavingsAccount and entities.BusinessAccount are in module java_course of loader 'app')
		// at java_course/application.Program.main(Program.java:37)
		
		// Na hora de fazer o downcasting, nem sempre vai dar certo, e o compilador não sabe disso. O programador é quem deve evitar isso.
		
		// Para fazer isso de uma forma segura, pode-se usar "instanceof":
		
		if (acc3 instanceof BusinessAccount) { // falha, porque acc3 não é instância de BusinessAccount
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) { // dá certo, porque acc3 é instância de SavingsAccount
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}
}
