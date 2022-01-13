import java.util.*;

public class Clothes {
	private ArrayList<Purchase>clothes;
	private int limit;
	
	public Clothes(int limit) {
		this.limit = limit;
		this.clothes = new ArrayList<Purchase>();
	}
	
	public ArrayList<Purchase> getList(){
		return clothes;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void addClothes(String name, int price, Scanner sc) {
		System.out.println("1. cash, 2. on credit");
		int check = sc.nextInt();
		if(check == 1) {
			Purchase pur = new Purchase(name, price);
			clothes.add(pur);
		}else {
			Purchase credit = new Credit(name, price);
			clothes.add(credit);
		}
		System.out.println("記錄成功！");
	}
	
	public int getTotal() {
		int total = 0;
		for(Purchase p: clothes) {
			total = total + p.getPrice();
		}
		return total;
	}
	
	public String detail() {
		String detail = "";
		for(Purchase p: clothes) {
			detail = detail + p.getName() + " " + p.getPrice() + "\n";
		}
		detail = "衣著: \n" + detail + "\nTotal: " + this.getTotal() + "\n";
		return detail;
	}
	
}




