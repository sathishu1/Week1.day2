package assignment.day2;

public class CharOccurance {
public static void main(String[] args) {
	String str = "welcome to chennai";

	System.out.println("String to find the character occurence:"+str);
	int count=0;
	char[] a1 = str.toCharArray();
	int n=a1.length;
	for(int i=0;i<n;i++)
	{
		if(a1[i]=='e')
		{
			count++;
		}
	}
	System.out.println("Number of Occurentce of 'e':"+count);
}
}
