package apcsafrq.frq2021.question3;

import java.util.ArrayList;

public class ClubMembersTest2 {

	public static void main(String[] args) {
		
		ClubMembers clubMembers=new ClubMembers();
		
		clubMembers.addMembers("SMITH, JANE", 2019, false);
		clubMembers.addMembers("FOX, STEVE", 2018, true);
		clubMembers.addMembers("XIN, MICHAEL", 2017, false);
		clubMembers.addMembers("GARCIA, MARIA", 2020, true);
		
		clubMembers.displayMembers();
		
		ArrayList<MemberInfo> members=clubMembers.removeMembers(2018);
		System.out.println();
		System.out.println("Returned Members");
		System.out.println(members);
		System.out.println();
		System.out.println("After Delete");
		clubMembers.displayMembers();
	}

}
