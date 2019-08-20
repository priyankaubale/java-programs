class Swap
{
 public static void main(String[]args)
 {
  int a=4,b=8;
  System.out.println("before swap a="+a);
  System.out.println("before swap b="+b);
  int temp=a;
  a=b;
  b=temp;
  System.out.println("after swap a="+a);
  System.out.println("after swap b="+b);
 }
}