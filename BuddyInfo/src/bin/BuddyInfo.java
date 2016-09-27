package bin;
//I Edited this online
public class BuddyInfo {
	private String name, address;
	private int size;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
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
	
	public static void main(String[] args) {
		BuddyInfo friend = new BuddyInfo();
		friend.setName("Daman");
		System.out.println(friend.getName());
	}

}
