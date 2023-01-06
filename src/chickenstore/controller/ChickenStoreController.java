package chickenstore.controller;

import java.util.List;

import chickenstore.model.dao.ChickentStroeDAO;
import chickenstore.model.vo.ChickenStore;

public class ChickenStoreController {

	public List<ChickenStore> orderCallYes() {
		ChickentStroeDAO cDAO = new ChickentStroeDAO();
		List<ChickenStore> cList=cDAO.printAllMenu();
		return cList;
	}

	public void slectMenu(ChickenStore store) {
		ChickentStroeDAO cDAO = new ChickentStroeDAO();
		cDAO.selectMenu(store);
		
		
	}

}
