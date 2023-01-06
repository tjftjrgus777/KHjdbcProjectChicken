package chickenstore.view;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

import chickenstore.model.vo.ChickenStore;

public class ChickenStoreView {
	int number = 1;
	public char orderCall() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 양념 참 잘하는 집 ===");
		System.out.println("주문 하실건가요?? ex) Y , N 으로만 입력해주세요");
		char choice = sc.next().charAt(0);
		return choice;
	}

	public ChickenStore printMenu(List<ChickenStore> cList) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		ChickenStore store = null;
		System.out.println("=== === === 메뉴판 === === ===");
		for(ChickenStore menu : cList) {
			System.out.println(number + "." + menu.toString());
			number +=1; 
		}
		System.out.println("주문하실 메뉴를 선택해주세요");
		String chickenName = sc.next();
		System.out.println("주소를 입력해주세요");
		String clientAddress = sc.nextLine();
		System.out.println("요청사항을 입력해주세요");
		String clientRequest = sc.nextLine();
		
		int orderTime = rand.nextInt(60)+1;
		System.out.println("소요시간이" + orderTime + "분 걸리는데 주문하시겠어요 ex) Y , N 으로만 입력해주세요");
		char choice = sc.next().charAt(0); 
		if(choice == 'Y') {
			store = new ChickenStore();
			store.setChickenName(chickenName);
			store.setClientAddress(clientAddress);
			store.setClientRequest(clientRequest);
		}
		return store;
	}
	

}
