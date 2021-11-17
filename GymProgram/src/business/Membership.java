package business;

public class Membership {
	
	private int membershipID;
	private int cost;
	private String access;
	private String inclusions;
	
	public Membership() {
		super();
	}

	public Membership(int membershipID, int cost, String access, String inclusions) {
		super();
		this.membershipID = membershipID;
		this.cost = cost;
		this.access = access;
		this.inclusions = inclusions;
	}

	public int getMembershipID() {
		return membershipID;
	}

	public void setMembershipID(int membershipID) {
		this.membershipID = membershipID;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getInclusions() {
		return inclusions;
	}

	public void setInclusions(String inclusions) {
		this.inclusions = inclusions;
	}

	@Override
	public String toString() {
		return "Membership [membershipID=" + membershipID + ", cost=" + cost + ", access=" + access + ", inclusions="
				+ inclusions + "]";
	}
	
	

}
