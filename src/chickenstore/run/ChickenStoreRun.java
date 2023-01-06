package chickenstore.run;

import java.util.List;

import chickenstore.controller.ChickenStoreController;
import chickenstore.model.vo.ChickenStore;
import chickenstore.view.ChickenStoreView;

public class ChickenStoreRun {
	
	public static void main(String [] args) {
		ChickenStoreView cView = new ChickenStoreView();
		ChickenStoreController cCon = new ChickenStoreController();
		List<ChickenStore> cList = null;
		ChickenStore store = null;
		goodbye :
		while(true) {
			char choice = cView.orderCall();
			switch(choice) {
			case 'Y' : 
				cList=cCon.orderCallYes();
				store=cView.printMenu(cList);
				cCon.slectMenu(store);
				break goodbye;
			case 'N' : break goodbye;
			}
		}
		
	}

}
