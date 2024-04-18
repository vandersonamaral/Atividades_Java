package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	
	
	public Company(String nome, Double rendaAnual, int numberOfEmployees) {
		super(nome, rendaAnual);
		this.numberOfEmployees = numberOfEmployees;
	}

	

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public double imposto() {
		if(getNumberOfEmployees()>10)		
			return getRendaAnual()* 0.14;
		else 
			return getRendaAnual()* 0.16;
	}
	
}
