package chickenstore.view;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

import chickenstore.model.vo.ChickenStore;

public class ChickenStoreView {
	int number = 1;
	public char orderCall() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ��� �� ���ϴ� �� ===");
		System.out.println("�ֹ� �Ͻǰǰ���?? ex) Y , N ���θ� �Է����ּ���");
		char choice = sc.next().charAt(0);
		return choice;
	}

	public ChickenStore printMenu(List<ChickenStore> cList) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		ChickenStore store = null;
		System.out.println("=== === === �޴��� === === ===");
		for(ChickenStore menu : cList) {
			System.out.println(number + "." + menu.toString());
			number +=1; 
		}
		System.out.println("�ֹ��Ͻ� �޴��� �������ּ���");
		String chickenName = sc.next();
		System.out.println("�ּҸ� �Է����ּ���");
		String clientAddress = sc.nextLine();
		System.out.println("��û������ �Է����ּ���");
		String clientRequest = sc.nextLine();
		
		int orderTime = rand.nextInt(60)+1;
		System.out.println("�ҿ�ð���" + orderTime + "�� �ɸ��µ� �ֹ��Ͻðھ�� ex) Y , N ���θ� �Է����ּ���");
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
