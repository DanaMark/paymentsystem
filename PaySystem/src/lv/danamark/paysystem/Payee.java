package lv.danamark.paysystem;

import java.util.function.Consumer;

public interface Payee {

	String name();
	Double grossPayment();
	Integer bankAcc();
	
}
