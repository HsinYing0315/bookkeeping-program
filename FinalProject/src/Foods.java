import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Foods {
	private ArrayList<Purchase>foods;
	private Total total;
	protected int limit;
	
	public Foods(int limit) {
		this.limit = limit;
		this.foods = new ArrayList<Purchase>();
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void addFoods(String name, int price) {
		Purchase pur = new Purchase(name, price);
		foods.add(pur);
		try {
			FileWriter writer = new FileWriter("foods.txt");
			writer.write(name + " " + price);
			writer.close();
			System.out.println("記錄成功！");
		}catch(IOException e) {
			System.out.println(e);
		}
//		total.expense(pur);
		
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
	
	public void alert() {
		if(this.getTotal() == limit * 0.8) {
			System.out.println("此類別消費已達80%，請謹慎消費！");
		}
	}

}
