package week1.day2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int series[]= {0,1,1,2,3,5,8,13};
int sum =0;
System.out.println(series[0]);
for(int i=0;i<series.length-1;i++) {
	sum=series[i]+series[i+1];
	
	System.out.println(sum);
	
}


	}

}
