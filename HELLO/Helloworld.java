package HELLO;

public class Helloworld {

	public static void main(String[] args) {
		
		int a = 12321,b,c=0,d;
		b= a;
		while (a>0)
			{
			d= a%10;
			c= c*10+d;
			a = a/10;
			}
			if(c==b)
		System.out.println("pal");
			else
				System.out.println("not palin");
	}}
	/*	// TODO Auto-generated method stub
	 * 
int i,n=13;
boolean temp = false;
for (i= 2 ;i<n/2;i++)
	if (n%i==2) {
		temp = true;
		break;
	}
if (!temp)

	System.out.println("prime");
	else
		System.out.println("Not prime");
	}

}
*//*int a = 1213321,b,c=0,d;
		b= a;
		while (a>0)
		{	d = a%10;
			c = c * 10+d; 
			a = a/10;
			}if (c==b)
			System.out.println(b+ " is a palindrome");
			else
				System.out.println(b + " is not a palindrome");
	}}*/