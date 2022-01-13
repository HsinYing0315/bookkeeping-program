
public class Credit extends Purchase{
	private double rate;
	private int installment;
	
	public Credit(String name, int price) {
		super(name, price);
		this.rate = 0.06;
		this.installment = 6;
	}
	
	public double getPayment(int amount) {
		double rateOfMonth = rate / 12;
		double payment;
		int period = installment * 12;
		
		payment = amount * (Math.pow((1+rateOfMonth),  period) * rateOfMonth)/(Math.pow(1+rateOfMonth, period)-1);
		return payment;
	}

}
