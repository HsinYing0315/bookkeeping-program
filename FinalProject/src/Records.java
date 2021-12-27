 
public class Records {
	private Foods foods;
	private Clothes clothes;
	private Entertainment entertainments;
	
	public void divide(int check) {
		if(check == 1) {
			foods.addFoods(name, price);
		}else if(check == 2) {
			clothes.addClothes(name, price);
		}else if(check == 3) {
			entertainments.addEntertainments(name, price);
		}
	}
	
	public void detail(int check) {
		if(check == 1) {
			System.out.print(foods.detail());
		}else if(check == 2) {
			System.out.print(clothes.detail());
		}else if(check == 3) {
			System.out.print(entertainments.detail());
		}
	}
	
	public void show() {
		String result = "總覽: \n";
	}
	
	public void alert() {
		
	}

}
