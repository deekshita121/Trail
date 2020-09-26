public class file
{
public static final int ladder=1;
public static final int snake=2;
public static void main(String args[])
{
int position=0;
System.out.println("Welcome to Snake and Ladder");
int die=(int)(Math.floor(Math.random()*10 % 6))+1;
System.out.println("Dieroll : "+die);
int option=(int)(Math.floor(Math.random()*10 % 3));
switch(option)
{
case ladder:
System.out.println("Ladder");
position += die;
break;
case snake:
System.out.println("Snake");
position-= die;
break;
default:
System.out.println("No play");
position=position;
}
System.out.println("Position of player is "+position);
}
}
