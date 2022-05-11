package apcsafrq.frq2021.question3;

public class ClubMembersTest {

	public static void main(String[] args) {
		
		ClubMembers clubMembers=new ClubMembers();
		String[] names={"SMITH, JANE","FOX, STEVE"};
		clubMembers.addMembers(names, 1997);
		clubMembers.displayMembers();
		
		String[] names2={"XIN, MICHAEL","GARCIA, MARIA"};
		clubMembers.addMembers(names2, 2020);
		clubMembers.displayMembers();
		
	}

}
