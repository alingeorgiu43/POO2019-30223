
class Dog {
	//static int dogCount = 0;
	static int dogCount = 0;

	public Dog() {
		dogCount += 1;
	}

	public static void main(String[] args) {
		
		Dog b = new Dog();
		Dog d = new Dog();
		System.out.println("Frog count is now " + dogCount);
	}
}
