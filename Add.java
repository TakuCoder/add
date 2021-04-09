public class Add{

public static void main(String args[])
{

Add add = new Add();
int c = add.DoAddition(1,2);

System.out.println(c);


}




public int DoAddition(int a,int b)
{


int c = a + b;
return c;

}


}