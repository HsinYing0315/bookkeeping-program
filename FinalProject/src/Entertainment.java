import java.util.*;

public class Entertainment {
	private ArrayList<Purchase>entertainments;
	private int limit;
	
	public Entertainment(int limit) {
		this.limit = limit;
		this.entertainments = new ArrayList<Purchase>();
	}
	
	public ArrayList<Purchase> getList(){
		return entertainments;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void addEntertainments(String name, int price, Scanner sc) {
		System.out.println("1. cash, 2. on credit");
		int check = sc.nextInt();
		if(check == 1) {
			Purchase pur = new Purchase(name, price);
			entertainments.add(pur);
		}else {
			Purchase credit = new Credit(name, price);
			entertainments.add(credit);
		}
		System.out.println("記錄成功！");
	}
	
	public int getTotal() {
		int total = 0;
		for(Purchase p: entertainments) {
			total = total + p.getPrice();
		}
		return total;
	}
	
	public String detail() {
		String detail = "";
		for(Purchase p: entertainments) {
			detail = detail + p.getName() + " " + p.getPrice() + "\n";
		}
		detail = "娛樂: \n" + detail + "\nTotal: " + this.getTotal() + "\n";
		return detail;
	}
	
}
