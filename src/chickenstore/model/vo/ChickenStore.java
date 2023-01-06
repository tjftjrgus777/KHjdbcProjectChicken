package chickenstore.model.vo;

public class ChickenStore {
	private String chickenName;
	private int chickenPrice;
	private String clientAddress;
	private String clientRequest;
	private String chickenCountryOrigin;
	int number = 0 ;
	public ChickenStore() {}
	
	public ChickenStore(String chickenName, int chickenPrice, String clientAddress, String clientRequest, String chickenCountryOrigin) {
		super();
		this.chickenName = chickenName;
		this.chickenPrice = chickenPrice;
		this.clientAddress = clientAddress;
		this.clientRequest = clientRequest;
		this.chickenCountryOrigin = chickenCountryOrigin;
	}

	public String getChickenName() {
		return chickenName;
	}

	public void setChickenName(String chickenName) {
		this.chickenName = chickenName;
	}

	public int getChickenPrice() {
		return chickenPrice;
	}

	public void setChickenPrice(int chickenPrice) {
		this.chickenPrice = chickenPrice;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	
	public String getClientRequest() {
		return clientRequest;
	}

	public void setClientRequest(String clientRequest) {
		this.clientRequest = clientRequest;
	}

	public String getChickenCountryOrigin() {
		return chickenCountryOrigin;
	}

	public void setChickenCountryOrigin(String chickenCountryOrigin) {
		this.chickenCountryOrigin = chickenCountryOrigin;
	}
	
	
	

	@Override
	public String toString() {
		return "치킨 이름=" + chickenName + ", 가격=" + chickenPrice + 
				", 원산지=" + chickenCountryOrigin;
	}
	
	
	
}
