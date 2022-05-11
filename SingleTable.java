package apcsafrq.frq2021.question2;

public class SingleTable {
	private int seats=0;
	private int height=0;	
	private double viewQuality=0;
	
	public SingleTable(int seats, int height, double viewQuality) {
		this.seats = seats;
		this.height = height;
		this.viewQuality = viewQuality;
	}

	/**
	 * Returns the number of seats at this table. The value is always greater than
	 * or equal to 4.
	 */
	public int getNumSeats() {
		/* implementation not shown */
		return  seats;
	}

	/** Returns the height of this table in centimeters. */
	public int getHeight() {
		/* implementation not shown */ 
		return  height;
	}

	/** Returns the quality of the view from this table. */
	public double getViewQuality() {
		/* implementation not shown */ 
		return  viewQuality;
	}

	/** Sets the quality of the view from this table to value . */
	public void setViewQuality(double value) {
		/* im plementation not shown */ 
		viewQuality=value;
	}
	// There may be instance variables, constructors, and methods that are not shown.
}
