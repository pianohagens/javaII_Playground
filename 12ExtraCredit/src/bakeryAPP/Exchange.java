package bakeryAPP;

public class Exchange {
private double enterAmount;
private double total;
private double changes;

//get enter amount
public double getEnterAmount() {
	return enterAmount;
}
public void setEnterAmount(double enterAmount) {
	this.enterAmount = enterAmount;
}
//get total
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}

//your changes
public double getChanges() {
	changes = enterAmount - total;
	return changes;
}
public void setChanges(double changes) {
	this.changes = changes;
}



}
