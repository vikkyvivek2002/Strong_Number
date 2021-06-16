import java.util.Scanner;
class Strong_Number 
{
public static void main(Strings[] args )
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
 int n = s.nextInt();
 int fac,a,sum=0,temp = n;
 while(n!=0)
{
fac =1;
a = n%10;
int i =1;
while(i<=a)
{
fac = fac*i;
i++;
}
sum = sum + fac;
n = n/10;
}
if(temp == sum)
System.out.println(temp+ " is strong number.");
else
System.out.println(temp+ " is not a strong number.");
}
}

