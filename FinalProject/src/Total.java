
public class Total {
	private int income;
	private int total;
	
	public Total() {
		total = 0;
	}
	
	public void income(int income) {
		total += income;
	}
	public void expense(Purchase pur) {
		total -= pur.getPrice(); 
	}

}
