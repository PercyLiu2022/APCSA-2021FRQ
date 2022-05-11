package apcsafrq.frq2021.question2;

public class CombinedTable {
	SingleTable t1;
	SingleTable t2;
	
	public CombinedTable(SingleTable t1, SingleTable t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public boolean canSeat(int num) {
		
		if (t1.getNumSeats() + t2.getNumSeats() - 2 >= num) {
			return true;
		}

		return false;
	}
	
	public double getDesirability() {
		if(t1.getHeight() == t2.getHeight()) {
			return (t1.getViewQuality() + t2.getViewQuality()) / 2;
		}
		
		return (t1.getViewQuality() + t2.getViewQuality()) / 2 - 10;
	}
}
