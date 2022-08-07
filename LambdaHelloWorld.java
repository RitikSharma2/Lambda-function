package firstPackage;

interface Interf
{
	public void m();
}

interface Sum
{
	public int sum(int n);
}

interface EvenOdd
{
	public String findEvenOdd(int a);
}

interface Min
{
	public int findMin(int a,int b);
}

interface Max
{
	public int findMax(int a,int b);
}

interface Print
{
	public void print(int a);
	
}



public class LambdaHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interf i=()->System.out.println("HelloWorld");
		i.m();
		
		Sum sumInterface=n->(n*(n+1))/2;
		System.out.println(sumInterface.sum(100));
		
		EvenOdd eo=(a)->{
			if(a%2==0)
				return "even";
			else 
				return "odd";
		};
		
		System.out.println(eo.findEvenOdd(100));
		
		Min mi=(a,b)-> Math.min(a, b);
		System.out.println(mi.findMin(10,5));
		
		
		Max ma=(a,b)-> Math.max(a, b);
		System.out.println(ma.findMax(10,35));
		
		Print pv=a->{
			            for(int x=1;x<=a;x++)
			            	System.out.print("i="+x+" ");
		            };
		            
		pv.print(10);
		
		
		

	}

}

