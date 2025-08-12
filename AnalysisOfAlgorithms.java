package AnalysisOfAlgorithms;
public class AnalysisofAlgorithmsBackground{
    public static void main(String[] args) {
    	int a=Function1(4);
    	int b=Function2(4);
    	int c=Function3(4);
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
       
    }
    
   //Function 1
    
    public static int Function1(int n) {
    	
    	return n*(n+1)/2;
    }
    
    //Function 2
    
   public static int Function2(int n) {
	   int sum=0;
	   for(int i=1;i<=n;i++) {
		   sum=sum+i;
		   }
	   return sum;
    }
   
   //Function 3
   
   public static int Function3(int n) {
	   int sum=0;
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=i;j++)
		   sum++;
	   }
	   return sum;
   }
   
}
