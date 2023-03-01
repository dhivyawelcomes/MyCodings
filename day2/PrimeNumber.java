package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=13;
boolean flag=true;
for(int i=2;i<num;i++) {
	if(num%2==0) {
		flag=false;
		break;
	}
		}
System.out.println("Is the given number prime - "   + flag);
}

	}
