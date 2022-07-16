//((((10+2)+2)-2)*2)/2)

package pkg2;

public class airthemetic1 
{
	public int sum(int a, int b,int c)
	{
    int x;
    x=a+b+c;
	return x;
	}
    public int sub(int a1,int b1)
    {
    	int x1=a1-b1;
    	return x1;
    }
    public int multi(int a2, int b2)
    {
    	int x2=a2*b2;
    	return x2;
    }
    public void div(int a3, int b3)
    {
    	int x3=a3/b3;
    	System.out.println("The final result is " +x3);
    }
    public static void main(String[] args) {
		airthemetic1 obj=new airthemetic1();
		int sumresult1=obj.sum(10,2,2);
		int subresult1=obj.sub(sumresult1, 2);
		int multiresult1=obj.multi(subresult1, 2);
		obj.div(multiresult1,2);
	}
}
