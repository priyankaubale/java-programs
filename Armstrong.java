class Armstrong
{
 public static void main(String[]args)
 {
  int a=124;
  int last=a%10;
  int mid=a/10%10;
  int first=a/100;
  double sum=Math.pow(last,3)+Math.pow(mid,3)+Math.pow(first,3);
  if(sum==0)
  { 
   System.out.print("Armstrong Number");
  }
  else
  {
   System.out.print("Not Armstrong Nmuber");
  }
 }
}