package apcsafrq.frq2021.question3;

import java.util.ArrayList;

public class ClubMembers {
	private ArrayList<MemberInfo> memberList;
	
	
	public ClubMembers() {		
		this.memberList = new ArrayList<MemberInfo>();
	}
	/** Adds new club members to memberList, 
	 * as described in part (a).
	* Precondition: names is a non-empty array.
	*/
	public void addMembers(String[] names, int gradYear){ 
		/* to be implemented in part (a) */ 
		for(String stuName : names) {
			MemberInfo newMember = new MemberInfo(stuName, gradYear, true);
			this.memberList.add(newMember);
		}
	}
	
	public void addMembers(String name, int gradYear, boolean hasGoodStanding){ 
		MemberInfo member = new MemberInfo(name, gradYear, hasGoodStanding);
		this.memberList.add(member);
	}
	
	//Ϊ�˷�����ԣ� ��ʾ���г�Ա��Ϣ
	public void displayMembers(){  
		for(MemberInfo member : this.memberList) {
			System.out.println(member.toString());
		}
		
	}
	/** @Remove members who have graduated and 
	 * @Return a list of members who have graduated
	* and are in good standing, as described in part (b).
	*/
	public ArrayList<MemberInfo> removeMembers(int year){
		ArrayList<MemberInfo> results = new ArrayList<MemberInfo>();
		for(MemberInfo member: this.memberList) {
			if(member.getGradYear() <= year && member.inGoodStanding()) {
				results.add(member);
			}
		}
		
		//remove �����ڶ���
		//�߽�ֵ ��getGradYear() <= year��
		//i indexOutOfBou
		for(int i = this.memberList.size() - 1; i >= 0; i--) {
			MemberInfo member = this.memberList.get(i);
			if(member.getGradYear() <= year) {
				this.memberList.remove(i);
			}
		}
		return results;
	}
	// There may be instance variables, constructors, 
	//and methods that are not shown.
}
