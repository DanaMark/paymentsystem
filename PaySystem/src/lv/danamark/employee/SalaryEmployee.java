package lv.danamark.employee;

//import lv.danamark.paysystem.Payee;

public class SalaryEmployee extends Employee {
	
//	private String name;
//	private Integer bankAcc;
//protected Double grossWage;
	
	public SalaryEmployee(String name, Integer bankAcc, Double grossWage) {
		super(name,bankAcc, grossWage);
		//this.name = name;
		//this.bankAcc = bankAcc;
		//this.grossWage = grossWage;
	}

//	@Override
//	public String name() {
//		return name;
//	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentBonus();
	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage/100.00);
		}
	
	@Override
	protected Double doCurrentBonus() {
		return super.doCurrentBonus();
	}
	
	
//
//	@Override
//	public Integer bankAcc() {
//		return bankAcc;
//	}


}
