public class SnakesAndLadder {

	public static void main(String[] args)
	{
		System.out.println("--------------------------------------");
		System.out.println("Welcome to Snakes and Ladder game");
		System.out.println("--------------------------------------\n");
		int Player1_Position=0;
		int diceroll1=0;
		Random random=new Random();
		diceroll1=(random.nextInt(6)+1);
		System.out.println("Player rolled diceroll and got = " +diceroll1 );
	}
}
