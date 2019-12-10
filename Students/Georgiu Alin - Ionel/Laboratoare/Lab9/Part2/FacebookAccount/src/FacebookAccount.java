import java.util.ArrayList;

public class FacebookAccount {

	private String name;
	private String nickname;
	private int age;
	private String currentLocation;
	private ArrayList<FacebookAccount> friends;
	
	public FacebookAccount(String name,String nickname,int age,String currentLocation) {
		this.name=name;
		this.nickname=nickname;
		this.age=age;
		this.currentLocation=currentLocation;
		this.friends=new ArrayList<FacebookAccount>(10000);
	}
	
	public void addFriend(FacebookAccount newFriend) {
		this.friends.add(newFriend);
	}
	
	public void removeFriend(FacebookAccount friend) {
		for(int i=0;i<this.friends.size();i++) {
			if(this.friends.get(i).equals(friend))
				this.friends.remove(i);
		}
	}
	
	public void friendLocation(String liveLocation) {
		System.out.println("Your friends at the given location are:");
		for(int i=0;i<this.friends.size();i++) {
			if(this.friends.get(i).getLocation().contentEquals(liveLocation)) {
				System.out.println(this.friends.get(i).getName());
			}
		}
	}
	
	public void showFriends() {
		if(this.friends.isEmpty()==true) {
			System.out.println("You have no friends just yet");
		}
		else
		{
			System.out.println("Your list of friends");
			for(int i=0;i<this.friends.size();i++) {
				System.out.println(this.friends.get(i).getName());
			}
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname=nickname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getLocation() {
		return this.currentLocation;
	}
	
	public void setLocation(String currentLocation) {
		this.currentLocation=currentLocation;
	}
	
	public ArrayList<FacebookAccount> getFriendsList() 
	{
		return this.friends;
	}
	
	public void setFriendsList(ArrayList<FacebookAccount> friendsList) 
	{
		this.friends = friendsList;
	}
	
}
