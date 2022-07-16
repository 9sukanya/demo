//(10+2)(10-2)

package pkg2;

public class airthemetics 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum result is "+c);
		return c;
	}
    public int sub(int a1,int b1)
    {
    	int c1=a1-b1;
    	System.out.println("The sub result is "+c1);
    	return c1;
    }
    public void multi(int x,int y)
    {
    	int z=x*y;
    	System.out.println("The final result is "+z);
    }
    public static void main(String[] args)
    {
    	airthemetics obj=new airthemetics();
    	int sumresult=obj.sum(10, 2);
    	int subresult=obj.sub(10, 2);
    	obj.multi(sumresult, subresult);
		
	}
}
