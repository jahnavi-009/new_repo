public class Sample
{

int sum(int a, int b)
{

return a+b;
}

int sum(int a, int b, int c )
{
return a+b+c;
}

int mul(int a, int b)
{
	return a*b;
}
int mul(int a, int b, int c)
{
	return a*b*c;
}
   public static void main(String args[])
   {
       int two_value_sum;
       int three_value_sum;
	   int two_val_mil, three_val_mul;
       Sample a = new Sample();
       two_value_sum = a.sum(2,3);
       System.out.println(two_value_sum);
       three_value_sum = a.sum(1,10,15);
       System.out.println(three_value_sum);
	   System.out.println("test");
	   two_val_mul = a.mul(4,5);
	   System.out.println(two_val_mul);
	   three_val_mul = a.mul(4,5,10);
	   System.out.println(three_val_mul);
	   
   }
}
