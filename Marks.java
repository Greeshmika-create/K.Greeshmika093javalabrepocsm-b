import java.util.Scanner;
class Marks{
	public static void main(String[] args){
		String subject[] = new String[5];
		int nos = 5,i;
		int marks[] = new int[5];
		
		System.out.println("Enter 5 subjects: ");
		Scanner s = new Scanner (System.in);
		for(i=0;i<subject.length;i++)
			subject[i] = s.next();
		
		System.out.println("Enter marks of the five subjects: ");
		for(i=0;i<marks.length;i++)
			marks[i] = s.nextInt();
	
		for(i=0;i<5;i++)
			System.out.println(subject + "=" + marks);
		
		int total=0;
		for(i=0;i<5;i++)
			total = total + marks[i];
		System.out.println("Total marks of all subjects is: " + total);
		int avg=0;
		avg = total/nos;
		System.out.println("Average of marks is: " + avg);
	}
}