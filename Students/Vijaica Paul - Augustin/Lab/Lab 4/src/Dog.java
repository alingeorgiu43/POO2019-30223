class Dog {
int dogCount = 0;  
public Dog() {
    dogCount += 1;
}
public void showData(){
 
    System.out.println("Frog count is now "+dogCount);
 }

public static void main(String[] args) {
   Dog d1=new Dog();
   Dog d2=new Dog();
   Dog d3=new Dog();
    d1.showData();
    d2.showData();
    d3.showData();
}
}