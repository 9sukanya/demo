//((((10/2)-2)-2)+2)*2)

package pkg2;

public class airthemetic2 
{
    public int div(int a,int b)
    {
    int c;
    c=a/b;
    return c;
    }
    public int sub(int a1,int b1)
    {
    	int c1=a1-b1;
    	return c1;
    }
    public int sub1(int a2,int b2)
    {
    	int c2=a2-b2;
    	return c2;
    }
    public int sum(int a3,int b3)
    {
    	int c3=a3+b3;
    	return c3;
    }
    public void multi(int a4,int b4)
    {
    	int c4=a4*b4;
    	System.out.println("The final result is"+c4);
    }
    public static void main(String[] args) 
    {
		airthemetic2 obj=new airthemetic2();
		int div=obj.div(10,2);
		int sub=obj.sub(div, 2);
		int sub1=obj.sub1(sub, 2);
		int sum=obj.sum(sub1,2);
		obj.multi(sum, 2);
	
	}
}
