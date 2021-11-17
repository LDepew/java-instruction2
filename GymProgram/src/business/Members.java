package business;

public class Members {
	private int membersID;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	private String isAdmin;
	private String isReviewer;
	
	public Members() {
		super();
	}

	public Members(int membersID, String name, String address, String city, String state, String zip, String phone,
			String email, String isAdmin, String isReviewer) {
		super();
		this.membersID = membersID;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.isAdmin = isAdmin;
		this.isReviewer = isReviewer;
	}

	public int getMembersID() {
		return membersID;
	}

	public void setMembersID(int membersID) {
		this.membersID = membersID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getIsReviewer() {
		return isReviewer;
	}

	public void setIsReviewer(String isReviewer) {
		this.isReviewer = isReviewer;
	}

	@Override
	public String toString() {
		return "Members [membersID=" + membersID + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + ", isAdmin=" + isAdmin
				+ ", isReviewer=" + isReviewer + "]";
	}
	
	
	

}
