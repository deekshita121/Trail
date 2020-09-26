public class file
{
public static final int ladder=1;
public static final int snake=2;
public static void main(String args[])
{
int position_p1=0;
int position_p2=0;
int count_p1=0;
int count_p2=0;
int chance=0;
System.out.println("Welcome to Snake and Ladder");
while(position_p1<100 && position_p2<100)
{
if(chance%2==0)
{
System.out.println("Player 1 ");
int die=(int)(Math.floor(Math.random()*10 % 6))+1;
System.out.println("Dieroll : "+die);
int option=(int)(Math.floor(Math.random()*10 % 3));
switch(option)
{
case ladder:
System.out.println("Ladder");
position_p1 += die;
break;
case snake:
System.out.println("Snake");
position_p1 -= die;
break;
default:
System.out.println("No play");
position_p1=position_p1;
}
if(position_p1<0)
position_p1=0;
if(position_p1>100)
position_p1-=die;
System.out.println("Position of player 1 is "+position_p1);
count_p1++;
}
else
{
System.out.println("Player 2");
int die=(int)(Math.floor(Math.random()*10 % 6))+1;
System.out.println("Dieroll : "+die);
int option=(int)(Math.floor(Math.random()*10 % 3));
switch(option)
{
case ladder:
System.out.println("Ladder");
position_p2 +=die;
break;
case snake:
System.out.println("Snake");
position_p2 -=die;
break;
default:
System.out.println("No play");
position_p2=position_p2;
}
if(position_p2<0)
position_p2=0;
if(position_p2>100)
position_p2 -=die;
System.out.println("Position of player 2 is "+position_p2);
count_p2++;
}

chance++;
}
if(position_p1==100)
System.out.println("Winner is Player 1. No of die rolls for player 1 are "+count_p1);
else
System.out.println("Winner is Player 2. No of die rolls for player 2 are "+count_p2);
}
}
