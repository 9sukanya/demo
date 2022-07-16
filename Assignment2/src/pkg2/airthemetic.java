package pkg2;

public class airthemetic 
{
	public int sum(int a,int b)
	{
		int sum=a+b;
        System.out.println("sum result is"+sum);
        return sum;
	}
	public int sum1(int sum,int x)
	{
		int sum1=sum+x;
		System.out.println("sum result is"+sum1);
		return sum1;
	}
	public int sub(int sum1,int y)
	{
		int sub=sum1-y;
		System.out.println("sub result is"+sub);
		return sub;
	}
	public int multi(int sub,int z)
	{
 		int multi=sub*z;
		System.out.println("multi result is"+multi);
		return multi;
	}
    public static void div(int multi,int r)
    {
    	int div=multi/r;
    	System.out.println("the final result is"+div);
    
    }
    public static void main(String[] args) 
    {
		airthemetic obj=new airthemetic();
		int sum=obj.sum(10,2);
		int sum1=obj.sum(sum, 2);
		int sub=obj.sub(sum1, 2);
		int multi=obj.multi(sub, 2);
		div(multi,2);
		
    }
}
