package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	
	public Individual(String nome, Double rendaAnual, Double healthExpenditures) {
		super(nome, rendaAnual);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double imposto() {
		if(super.getRendaAnual() < 20.000)
			return getRendaAnual() * 0.15 - healthExpenditures * 0.5;
		else 
			return getRendaAnual()* 0.25 - healthExpenditures * 0.5;
	}
	

}
