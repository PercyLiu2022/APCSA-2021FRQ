package apcsafrq.frq2021.question2;

public class CombinedTableTest {

	public static void main(String[] args) {
		SingleTable t1=new SingleTable(4,74,60.0);
		SingleTable t2=new SingleTable(8,74,70.0);
		
		CombinedTable c1 = new	CombinedTable(t1, t2);
		//true   4+8-2=10 > 9   
		System.out.println(c1.canSeat(9));
		//false  4+8-2=10 < 11 
		System.out.println(c1.canSeat(11));
		//65.0     (60+70)/2=65.0
		System.out.println(c1.getDesirability());
		
		
	}

}
