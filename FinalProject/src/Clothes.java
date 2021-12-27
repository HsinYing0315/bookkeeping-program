import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Clothes extends Foods{
	private ArrayList<Purchase>clothes;
	
	public Clothes(int limit) {
		super(limit);
		this.clothes = new ArrayList<Purchase>();
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void addClothes(String name, int price) {
		Purchase pur = new Purchase(name, price);
		clothes.add(pur);
		try {
			FileWriter writer = new FileWriter("clothes.txt");
			writer.write(name + " " + price);
			writer.close();
			System.out.println("記錄成功！");
		}catch(IOException e) {
			System.out.println(e);
		}
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
		detail = "衣著:" + detail + "\nTotal: " + this.getTotal() + "\n";
		return detail;
	}
	
	public void alert() {
		super.alert();
	}
}




