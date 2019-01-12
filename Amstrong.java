/*.....
Find Amstrong Numbers in Given Range

@Author: Manivannan S

.....

*/

import java.util.*;
class Amstrong
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		int i,j,temp,rem,sum=0;
		System.out.print("Enter the End range:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=0;
			temp=i;
			while(temp!=0)
			{
                rem=temp%10;
                sum+=(rem*rem*rem);
                temp=temp/10;
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}
	}
}