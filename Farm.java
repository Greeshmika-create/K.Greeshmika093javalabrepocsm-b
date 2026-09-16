import java.util.Scanner;
class FarmAnimals{
	String name;
	String location;
	String food;
	String sound;
	Scanner s = new Scanner(System.in);
	
	void name(){
		System.out.println("Enter animal's name: ");
		name = s.next();
	}
	
	void location(){
		System.out.println("Enter location of the animal: ");
		location = s.next();
	}
	
	void food(){
		System.out.println("Enter food the animal eats: ");
		food = s.next();
	}
	
	void sound(){
		System.out.println("Enter animal sound: ");
		sound = s.next();
	}
	
	void details(){
		System.out.println("Animal details: ");
		System.out.println("Name of animal: " + name);
		System.out.println("Location of animal: " + location);
		System.out.println("Food animal eats: " + food);
		System.out.println("Sound of the animal: " + sound);
	}
	
}

public class Farm{
	public static void main(String[] args){
		FarmAnimals f = new FarmAnimals();
	
		f.name();
		f.location();
		f.food();
		f.sound();
		f.details();
	}
}