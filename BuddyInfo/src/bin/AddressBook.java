package bin;

import java.util.*;

public class AddressBook {
	private ArrayList<BuddyInfo> users;
	
	public AddressBook(){
		this.users = new ArrayList<BuddyInfo>(); 
	}
	
	public void addBuddy(BuddyInfo Buddy){
		this.users.add(Buddy);
	}
	
	public void removeBuddy(BuddyInfo Buddy){
		users.remove(Buddy);
	}
	
	public static void main (String args[]){
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Daman");
		buddy.setSize(1234);
		AddressBook addressbook = new AddressBook();
		addressbook.addBuddy(buddy);
		addressbook.removeBuddy(buddy);
		System.out.println("TEST UPDATE!!");
	}
}
