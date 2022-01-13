import java.util.*;

public class Foods {
	private ArrayList<Purchase>foods;
	private int limit;
	
	public Foods(int limit) {
		this.limit = limit;
		this.foods = new ArrayList<Purchase>();
	}
	
	public ArrayList<Purchase> getList() {
		return foods;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void addFoods(String name, int price, Scanner sc) {
		System.out.println("1. cash, 2. on credit");
		int check = sc.nextInt();
		if(check == 1) {
			Purchase pur = new Purchase(name, price);
			foods.add(pur);
		}else {
			Purchase credit = new Credit(name, price);
			foods.add(credit);
		}
		System.out.println("記錄成功！");
		
	}
	
	public int getTotal() {
		int total = 0;
		for(Purchase p: foods) {
			total = total + p.getPrice();
		}
		return total;
	}
	
	public String detail() {
		String detail = "";
		for(Purchase p: foods) {
			detail = detail + p.getName() + " " + p.getPrice() + "\n";
		}
		detail = "食物: \n" + detail + "\nTotal: " + this.getTotal() + "\n";
		return detail;
	}

}
