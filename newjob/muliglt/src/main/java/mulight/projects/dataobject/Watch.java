package mulight.projects.dataobject;

public class Watch {
	private String ID;
	private String name;
	private double unitPrice = 0;
	private double DiscountSub = 0;
	private double DiscountMain = 0;
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountSub() {
		return DiscountSub;
	}

	public void setDiscountSub(double discountSub) {
		DiscountSub = discountSub;
	}

	public double getDiscountMain() {
		return DiscountMain;
	}

	public void setDiscountMain(double discountMain) {
		DiscountMain = discountMain;
	}

	public void Incr() {
		count++;
	}

	public double getDiscount() {
		if (DiscountMain == 0) {
			return 0;
		} else {
			return Math.floor(unitPrice * count / DiscountMain) * DiscountSub;
		}
	}

	public double getSubTotalPrice() {
		return unitPrice * count - getDiscount();
	}

}
