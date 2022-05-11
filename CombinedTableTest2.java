package apcsafrq.frq2021.question2;

public class CombinedTableTest2 {

	public static void main(String[] args) {
		SingleTable t2=new SingleTable(8,74,70.0);
		SingleTable t3=new SingleTable(12,76,75.0);
		
		CombinedTable c2 = new CombinedTable(t2, t3);
		//true  8+12-2=18 =18 
		System.out.println(c2.canSeat(18));
		//62.5     (70+75)/2-10=62.5
		System.out.println(c2.getDesirability());
		
		//Changing the view quality of one of the tables
		//that makes up c2 changes the desirability of
		//c2, as illustrated in the next line of the chart.
		//Since setViewQuality is a
		//SingleTable method, you do not need to		write it
		t2.setViewQuality(80);
		
		//Because the view quality of t2 changed, the
		//desirability of c2 has also changed.
		System.out.println(c2.getDesirability());
	}

}
