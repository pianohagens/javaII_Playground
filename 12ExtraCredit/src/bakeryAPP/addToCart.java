package bakeryAPP;
import bakeryAPP.BakeryAPP;


public class addToCart {
	
	private String itemNamePie;
	private String itemNameCake;
	private String itemNameCookies;

	private int pieQuantity;
	private int cakeQuantity;
	private int cookieQuantity;

	private double cookiePrice = 1.00;
	private double piePrice = 2.00;
	private double cakePrice = 3.00;
	

	private double pieSubtotal;
	private double cakeSubtotal;
	private double cookieSubtotal;
	private double total;
	
	// Cookie

		public int getCookieQuantity() {
			return cookieQuantity;
		}
		public void setCookieQuantity(int cookieQuantity) {
			this.cookieQuantity = cookieQuantity;
		}

		public double getCookieSubtotal(int cookieQuantity, double cookiePrice) {
			cookieSubtotal = cookieQuantity + cookiePrice;
			return cookieSubtotal;
		}
		public void setCookieSubtotal(double cookieSubtotal) {
			this.cookieSubtotal = cookieSubtotal;
		}

	// pie
	public void setPieSubtotal(double pieSubtotal) {
		this.pieSubtotal = pieSubtotal;
	}

	public int getPieQuantity() {

		return pieQuantity;
	}
	public void setPieQuantity(int pieQuantity) {
		this.pieQuantity = pieQuantity;
	}
	public double getPieSubtotal(int pieQuantity, double piePrice) {
		pieSubtotal = pieQuantity * piePrice;
		return pieSubtotal;
	}

	// Cake
	public void setCakeSubtotal(double cakeSubtotal) {
		this.cakeSubtotal = cakeSubtotal;
	}

	public int getCakeQuantity() {
		return cakeQuantity;
	}
	public void setCakeQuantity(int cakeQuantity) {
		this.cakeQuantity = cakeQuantity;
	}
	public double getCakeSubtotal(int cakeQuantity, double cakePrice) {
		cakeSubtotal = cakeQuantity * cakePrice;
		return cakeSubtotal;
	}
	
	//Total
	public double getTotal(double pieSubtotal, double cakeSubtotal, double cookieSubtotal) {
		total = cookieSubtotal + pieSubtotal + cakeSubtotal;
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}


}
