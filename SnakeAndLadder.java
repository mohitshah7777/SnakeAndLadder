import java.util.Random;
public class SnakeAndLadder {

	public static void main(String[] args)
	{
		System.out.println("--------------------------------------");
		System.out.println("Welcome to Snakes and Ladder game");
		System.out.println("--------------------------------------\n");
		int Player1_Position=0;
		int Player2_Position=0;
		int newPositionPlayer1;
		int newPositionPlayer2;
		int diceroll1=0;
		int diceroll2=0;
		int exceed;
		int dicerollcounter1=0;
		int dicerollcounter2=0;
		
		System.out.println("Player 1 position = "+Player1_Position);
		System.out.println("Player 2 position = "+Player2_Position+"\n");
		  
		do
		{	  
			  Random random=new Random();
			  diceroll1=(random.nextInt(6)+1);
		      System.out.println("Player 1 rolled the dice and got = " +diceroll1 );
		      Player1_Position+=diceroll1;
		      dicerollcounter1++;

		      if(Player1_Position >100)
		      {
		    	  exceed = (Player1_Position-100);
		    	  Player1_Position = (100 - exceed);
		      }        
		      System.out.println("Player 1 is on position = " +Player1_Position);

		      Random random2=new Random();
			  diceroll2=(random2.nextInt(6)+1);
		      System.out.println("Player 2 rolled the dice and got = " +diceroll2 );
		      Player2_Position+=diceroll2;
		      dicerollcounter2++;
		      
 		
		      if(Player2_Position >100)
		      {
		    	  exceed = (Player2_Position-100);
		    	  Player2_Position = (100 - exceed);
		      }        
		      System.out.println("Player 2 is on position = " +Player2_Position +"\n");
			
		      //player1
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
		    	  System.out.println("Wow!, Player 1 landed on a ladder. Player postion = " +newPositionPlayer1+"\n");
		      }
		       
		      if (Player1_Position>newPositionPlayer1)
		      {
		    	  System.out.println("\nUnlucky, Player 1 landed on a snake. Player position = " +newPositionPlayer1+"\n");
		      }
		     
		      Player1_Position = newPositionPlayer1;
		      
		      //player2
		      switch(Player2_Position)
			  {
			  			  case 3:
			                   newPositionPlayer2 = 21;
			                   break;
			                                   
			              case 8:
			                   newPositionPlayer2 = 55;
			                   break;
			               
			              case 16:
			                   newPositionPlayer2 =26;
			                   break;
			                    
			              case 23:
			                   newPositionPlayer2 =5;
			                   break;
			                    
			              case 32:
			                   newPositionPlayer2 =48;
			                   break;
			                    
			              case 43:
			                   newPositionPlayer2 =38;
			                   break;
			                    
			              case 50:
			                   newPositionPlayer2 =70;
			                   break;
			                    
			              case 56:
			                   newPositionPlayer2 =25;
			                   break;
			                    
			              case 61:
			                   newPositionPlayer2 =59;
			                   break;
			                    
			              case 64:
			                   newPositionPlayer2 =83;
			                   break;
			                    
			              case 69:
			                   newPositionPlayer2 =12;
			                   break;
			                    
			              case 80:
			                   newPositionPlayer2 =99;
			                   break;
			              
							  case 89:
			                   newPositionPlayer2 =91;
			                   break;
			              
			              case 94:
			                   newPositionPlayer2 =73;
			                   break;
			              
			              case 96:
			                   newPositionPlayer2 =84;
			                   break;
			                   
			              case 99:
			                   newPositionPlayer2 =78;
			                   break;
			                    
			              default:
			                   newPositionPlayer2 = Player2_Position;
			           }
			      
		      if (Player2_Position<newPositionPlayer2)
		      {
		    	  System.out.println("Wow!, Player 2 have landed on a ladder. Player postion = " +newPositionPlayer2+"\n");
		      }
		       
		      if (Player2_Position>newPositionPlayer2)
		      {
		    	  System.out.println("Unlucky, player 2 have landed on a snake. Player position = " +newPositionPlayer2+"\n");
		      }
		     
		      Player2_Position = newPositionPlayer2; 
		      
		      if(Player1_Position==100)
			     {
		    	  	 System.out.println("--------------------------------------");
			    	 System.out.println("Congratulations,Player 1 won!");
			    	 System.out.println("Player 1 rolled the dice = " +dicerollcounter1+ " times");
			    	 System.out.println("--------------------------------------");
			    	 break;
			     }
		      else if(Player2_Position==100)
			     {
			    	 System.out.println("--------------------------------------");
			    	 System.out.println("Congratulations,Player 2 won!"); 
				     System.out.println("Player 2 rolled the dice = " +dicerollcounter2+ " times");
				     System.out.println("--------------------------------------");
				     break;
			     }
		      
		} while(Player1_Position<100 && Player2_Position<100);
		     	     
	}
}

