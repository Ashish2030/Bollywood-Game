import java.io.*;
import java.util.Scanner;
class bollywoodGame {
	 static   int score=9,flag=0;
	public static void main (String[] args)
	{
    int count_1=0;
	Scanner s=new Scanner(System.in);
	String player1=s.nextLine();
    StringBuffer sc= new StringBuffer (player1);
    StringBuffer sc1= new StringBuffer ();
    sc1.setLength(sc.length());
    //-------------------------------------------------check vowel-------------------------------------------------------------
    for(int i=0;i<player1.length();i++)
    {
        if(sc.charAt(i)=='A'||sc.charAt(i)=='a'||sc.charAt(i)=='e'||sc.charAt(i)=='E'||sc.charAt(i)=='I'||sc.charAt(i)=='i'||sc.charAt(i)=='o'||sc.charAt(i)=='O'||sc.charAt(i)=='u'||sc.charAt(i)=='U')
        {
            char a=sc.charAt(i);
             sc1.setCharAt(i,a);
        }
        else
        {
//------------------------------------------------------------------------set blankets to next strong----------------------------------
             sc1.setCharAt(i,'_');
             count_1++;
        }
    }
    score=count_1;// u have only count1 chances for winning this game and count1 is equals to number of consonante in string
System.out.println(sc1);
//----------------------------------------------loop end to 0-------------------------------------------------------------------------------------
    while(score>0)
    {

		int 	flag2=1;
//--------------------------------------------if it complete all the blanks-------------------------------------------------------------
        if(flag==1)
        {
            break;
        }
//------------------------------------------------------------scan a characters------------------------------------------------
      char  x=s.next().charAt(0);
      char temp=x;
//---------------------------------------------chech character is in the name--------------------------------------------------
				for(int i=0;i<sc.length();i++)
        {

					if(Character.toLowerCase(sc.charAt(i)) ==Character.toLowerCase(x))
					{
//----------------------------------------if uou get break----------------------------------------------------------
					flag2=0;
					break;
					}
				}
//---------------------------------------if not score decrement ---------------------------------------------------------------------
				if(flag2==1)
				{
					score--;
					System.out.println("Wrong Answer"+" "+" You have only "+score+" Choices ");
				}
//--------------------------------------put the character in the sytring 2-----------------------------------------------------
				if(flag2==0)
				{
        for(int i=0;i<sc.length();i++)
        {
        if(Character.toLowerCase(sc.charAt(i)) ==Character.toLowerCase(x)&&sc1.charAt(i)=='_')
        {
					     sc1.setCharAt(i,sc.charAt(i));
                String k=sc1.toString();
                String l=sc.toString();
								flag=0;
           if(l.equals(k))
           {
//-----------------------------------------------------------------flag=1 hame over------------------------------------------
               flag=1;
               break;
           }
        }
			}
				System.out.println(sc1);
    }
    }
		System.out.println(score);
	}
}
