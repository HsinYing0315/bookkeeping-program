import java.util.*;
import java.io.*;

public class Tester {

	public static void main(String[] args) {
//		Records records = new Records();
		Foods foods = new Foods(100);
		Clothes clothes = new Clothes(500);
		Entertainment entertainments = new Entertainment(1000);
		
		int check;
		String prompt = "1. 記帳, 2. 查看總覽, 3. 查看單一類別明細: ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(prompt);
		while(sc.hasNextInt()) {
			check = sc.nextInt();
			if(check == 1) {
				System.out.print("名稱: ");
				String name = sc.next();
				System.out.print("金額: ");
				int price = sc.nextInt();
				
				System.out.println("分類至: 1. foods, 2. clothes, 3. entertainments");
				check = sc.nextInt();
				if(check == 1) {
					foods.addFoods(name, price);
				}else if(check == 2) {
					clothes.addClothes(name, price);
				}else if(check == 3) {
					entertainments.addEntertainments(name, price);
				}
				
				if(foods.getTotal() == foods.getLimit() * 0.8) {
					System.out.println("此類別消費已達80%，請謹慎消費！");
				}else if(clothes.getTotal() == clothes.getLimit() * 0.8) {
					System.out.println("此類別消費已達80%，請謹慎消費！");
				}

			}else if(check == 2){
				System.out.println("總覽: \n"
						+ "Foods: \n" + foods.getTotal() + "元(" + (double)(foods.getTotal()*100/(foods.getTotal()+clothes.getTotal()+entertainments.getTotal()))
						+"%)\n"
						+ "Clothes: \n" + clothes.getTotal() + "元(" + (double)(clothes.getTotal()*100/(foods.getTotal()+clothes.getTotal()+entertainments.getTotal())) +"%)\n"
						+ "Entertainments: \n" + entertainments.getTotal() + "元(" + (double)(entertainments.getTotal()*100/(foods.getTotal()+clothes.getTotal()+entertainments.getTotal())) + "%)\n"
						+ "\n目前消費金額最高的類別為: ");
				
			}else if(check == 3) {
				System.out.println("請選擇要查看的類別: 1. foods, 2. clothes, 3. entertainments");
				check = sc.nextInt();
				try {
					Scanner in = new Scanner(new File("foods.txt"));
					
				}catch(Exception e) {
					System.out.println(e);
				}
				if(check == 1) {
					System.out.print(foods.detail());
				}else if(check == 2) {
					System.out.print(clothes.detail());
				}else if(check == 3) {
					System.out.print(entertainments.detail());
				}
				
			}else {
				System.out.println("還沒寫好");
			}
			
			System.out.println();
			System.out.print(prompt);
		}
		
		System.out.print("Thank you~");

	}

}
