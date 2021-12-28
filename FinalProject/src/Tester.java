import java.util.*;
import java.io.*;

public class Tester {
	static Foods foods = new Foods(100);
	static Clothes clothes = new Clothes(500);
	static Entertainment entertainments = new Entertainment(1000);
	static int check;
	static Scanner sc = new Scanner(System.in);
	
	public static void bookKeeping(String name, int price) {
		System.out.println("分類至: 1. foods, 2. clothes, 3. entertainments");
		check = sc.nextInt();
		if(check == 1) {
			foods.addFoods(name, price);
		}else if(check == 2) {
			clothes.addClothes(name, price);
		}else if(check == 3) {
			entertainments.addEntertainments(name, price);
		}
	}
	
	public static void alert() {
		foods.alert();
		clothes.alert();
		entertainments.alert();
	}
	
	public static String summary() {
		String result = null;
		result = String.format("總覽: \nFoods: \n%d元 %.2f %c\nClothes: \n%d元 %.2f %c\nEntertainments: \n%d元 %.2f %c\n\n目前消費金額最高的類別為: ",
				foods.getTotal(), (foods.getTotal()*100.0/(foods.getTotal()+clothes.getTotal()+entertainments.getTotal())), '%',
				clothes.getTotal(), (clothes.getTotal()*100.0/(foods.getTotal()+clothes.getTotal()+entertainments.getTotal())), '%',
				entertainments.getTotal(), (entertainments.getTotal()*100.0/(foods.getTotal()+clothes.getTotal()+entertainments.getTotal())), '%');
		return result;
	}
	
	public static void detail() {
		if(check == 1) {
			System.out.print(foods.detail());
		}else if(check == 2) {
			System.out.print(clothes.detail());
		}else if(check == 3) {
			System.out.print(entertainments.detail());
		}
	}

	public static void main(String[] args) {
		String prompt = "1. 記帳, 2. 查看總覽, 3. 查看單一類別明細: ";
		
		System.out.print(prompt);
		while(sc.hasNextInt()) {
			check = sc.nextInt();
			if(check == 1) {
				System.out.print("名稱: ");
				String name = sc.next();
				System.out.print("金額: ");
				int price = sc.nextInt();
				
				bookKeeping(name, price);
				alert();

			}else if(check == 2){
				System.out.println(summary());
				
			}else if(check == 3) {
				System.out.println("請選擇要查看的類別: 1. foods, 2. clothes, 3. entertainments");
				check = sc.nextInt();
//				try {
//					Scanner in = new Scanner(new File("foods.txt"));
//					System.out.println(in.nextLine());
//					
//				}catch(Exception e) {
//					System.out.println(e);
//				}
				detail();
				
			}
			
			System.out.println("-".repeat(40));
			System.out.print(prompt);
		}
		
		System.out.print("Thank you~");

	}

}
