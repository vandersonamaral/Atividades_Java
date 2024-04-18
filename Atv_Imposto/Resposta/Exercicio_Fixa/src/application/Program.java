package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		List<TaxPayer> list =new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int q = sc.nextInt();
		
		for(int i =1 ; i<=q;i++) {
			System.out.print("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch= sc.next().charAt(0);
			if(ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name= sc.nextLine();
				System.out.print("Anual income: ");
				double renda=sc.nextDouble();
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name,renda, employees));
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name= sc.nextLine();
				System.out.print("Anual income: ");
				double renda=sc.nextDouble();
				System.out.print("Health expenditures: ");
				double saude=sc.nextDouble();
				list.add(new Individual(name, renda, saude));
				
			}
		}
		System.out.println("TAXES PAID: ");
		double soma=0;
		for(TaxPayer tp : list) {
			double tax = tp.imposto();
			System.out.println(tp.getNome()+ String.format(" $ %.2f ", tax) );
			soma+=tax;
		}
		System.out.println();
		System.out.println("TOTAL TAXES: "+String.format(" $ %.2f ", soma));
		
		
		sc.close();
	}
}
