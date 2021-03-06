package lv.danamark.employee;

import lv.danamark.paysystem.Payee;

public abstract class Employee implements Payee{
	
	private String name;
	private Integer bankAcc;
	protected Double currentBonus;
	protected Double grossWage;

	public Employee(String name, Integer bankAcc, Double grossWage) {
		super();
		this.name = name;
		this.bankAcc = bankAcc;
		this.grossWage = grossWage;
		currentBonus = 0.0;
		
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Integer bankAcc() {
		return bankAcc;
	}
	
	public abstract void giveBonus(Double percentage);
	
	
	protected Double doCurrentBonus(){
		Double bonus = currentBonus;
		currentBonus = 0.0;
		return bonus;
		
	}
	

}
