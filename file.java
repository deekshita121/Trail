public class file
{
public static final int position=0;
public static void main(String args[])
{
System.out.println("Welcome to Snake and Ladder");
int die=(int)(Math.floor(Math.random()*10 % 6))+1;
System.out.println("Dieroll : "+die);
int current_position = position;
current_position +=die;
System.out.println("Current position : "+current_position);
}
}
