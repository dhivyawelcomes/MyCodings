package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=34343;
int reverse=0;
int temp=num;
for(;num!=0;num=num/10) {
	int reminder=num%10;
	reverse=(reverse*10)+reminder;
}
System.out.println("The reverse of the given number is " + reverse);

if (reverse == temp) {
	System.out.println("The given number is palindrome");	
}
else {
	System.out.println("The given number is not palindrome");

}
	}

}

