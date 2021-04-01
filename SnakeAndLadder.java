import java.util.Random;
public class SnakesAndLadder {

	public static void main(String[] args)
	{
		System.out.println("--------------------------------------");
		System.out.println("Welcome to Snakes and Ladder game");
		System.out.println("--------------------------------------\n");
		int Player1_Position=0;
		int newPositionPlayer1;
		int diceroll1=0;
		int exceed;
		int dicerollcounter1=0;
		do
		{
			  Random random=new Random();
			  diceroll1=(random.nextInt(6)+1);
		     System.out.println("Player rolled diceroll and got = " +diceroll1 );
		     Player1_Position+=diceroll1;
			  dicerollcounter1++;
				//UC5 functionality
		      if(Player1_Position >100)
		      {
		    	  exceed = (Player1_Position-100);
		    	  Player1_Position = (100 - exceed);
		      }
		      System.out.println("\nPlayer is on position = " +Player1_Position);

			  switch(Player1_Position)
			  {
			  			  case 3:
			                   newPositionPlayer1 = 21;
			                   break;

			              case 8:
			                   newPositionPlayer1 = 55;
			                   break;

			              case 16:
			                   newPositionPlayer1 =26;
			                   break;

			              case 23:
			                   newPositionPlayer1 =5;
			                   break;

			              case 32:
			                   newPositionPlayer1 =48;
			                   break;

			              case 43:
			                   newPositionPlayer1 =38;
			                   break;

			              case 50:
			                   newPositionPlayer1 =70;
			                   break;

			              case 56:
			                   newPositionPlayer1 =25;
			                   break;
			              case 61:
			                   newPositionPlayer1 =59;
			                   break;

			              case 64:
			                   newPositionPlayer1 =83;
			                   break;

			              case 69:
			                   newPositionPlayer1 =12;
			                   break;

			              case 80:
			                   newPositionPlayer1 =99;
			                   break;

			              case 89:
			                   newPositionPlayer1 =91;
			                   break;

			              case 94:
			                   newPositionPlayer1 =73;
			                   break;

			              case 96:
			                   newPositionPlayer1 =84;
			                   break;

			              case 99:
			                   newPositionPlayer1 =78;
			                   break;

			              default:
			                   newPositionPlayer1 = Player1_Position;
			           }
							if (Player1_Position<newPositionPlayer1)
		      {
		    	  System.out.println("\nWow!, you have landed on a ladder. Player postion = " +newPositionPlayer1);
		      }

		      if (Player1_Position>newPositionPlayer1)
		      {
		    	  System.out.println("\nUnlucky, you have landed on a snake. Player position = " +newPositionPlayer1);
		      }

		      Player1_Position = newPositionPlayer1;
		      if(Player1_Position==100)
			     {
		    	  	 System.out.println("--------------------------------------");
			    	 System.out.println("Congratulations,Player 1 won!");
					 System.out.println("Player 1 rolled the dice = " +dicerollcounter1+ " times");
				  	 System.out.println("--------------------------------------");
			    	 break;
			     }
		} while(Player1_Position<100);
	}
}

