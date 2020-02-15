package lv.danamark.employee;

//import lv.danamark.paysystem.Payee;

public class CommissionEmployee extends Employee {

//	private String name;
//	private Integer bankAcc;
//	protected Double grossWage;
	
	private Double grossComission = 0.0;
	private static final Double BONUS_MULTIPLIER = 1.5;
	
	
	public CommissionEmployee(String name, Integer bankAcc, Double grossWage) {
		super(name, bankAcc, grossWage);
//		this.name = name;
//		this.bankAcc = bankAcc;
//		this.grossWage = grossWage;
	}
		@Override
	public Double grossPayment() {
		return grossWage + doCurCom() + doCurrentBonus();
	}
	
	private Double doCurCom(){
		Double commision = grossComission;
		grossComission = 0.0;
		return commision;
	}
	
	public void giveCommission (Double amount){
		grossComission += amount;
		
	}
	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage/100) * BONUS_MULTIPLIER;
		
				
	}
//	@Override
//	protected Double doCurrentBonus() {
//		return super.doCurrentBonus();
//	}

}
