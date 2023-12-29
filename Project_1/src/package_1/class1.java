	package package_1;

public class class1   //{}-- boundary of the class
{
int a;                // it will store int value
public void abc()     // ()--- indicates this is a method
{                     //{}--- boundary of a class
System.out.println("welcome to all of you");		


}
public static void main(String[] args) {

	System.out.println("i am the main method i am the boss");
	class1 obj = new class1(); 
	obj.abc();
	obj.abc();
	obj.a = 223;
	System.out.println("value of a " +obj.a);
	obj.a = 445;
	System.out.println("value of a "+ obj.a);
}

}
