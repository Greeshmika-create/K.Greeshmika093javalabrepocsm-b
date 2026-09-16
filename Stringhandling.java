import java.util.Scanner;
public class Stringhandling{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = s.nextLine();
		int max = 0;
		for(int i = 0;i < str.length();i++){
			String temp = "";
			for(int j = i;j < str.length();j++){
				char ch = str.charAt(j);
				if(temp.indexOf(ch) != -1)
					break;
				temp = temp+ch;
				if(temp.length() > max)
					max = temp.length();
			}
		}
		System.out.println("Longest substrings: " + max);
	} 
}