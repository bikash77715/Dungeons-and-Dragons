package mazegame.control;

import mazegame.boundary.IMazeClient;
import mazegame.boundary.IMazeData;
import mazegame.entity.Player;
import mazegame.entity.Potion;

public class DungeonMaster {
	private IMazeClient gameClient;
	private IMazeData gameData;
	private Player thePlayer;
	private CommandHandler playerTurnHandler;
	
	 public DungeonMaster(IMazeData gameData, IMazeClient gameClient) {
         this.gameData = gameData;
         this.gameClient = gameClient;
         playerTurnHandler = new CommandHandler();
     }

     public void printWelcome() {
         gameClient.playerMessage(gameData.getWelcomeMessage());
     }

     public void setupPlayer() {
         String playerName = gameClient.getReply("What name do you choose to be known by?");
         thePlayer = new Player(playerName);
         thePlayer.setCurrentLocation(gameData.getStartingLocation());
         thePlayer.getItems().addMoney(10000);
         thePlayer.getItems().addItem(new Potion("potion", 20, 5, " restores life points"));
         gameClient.playerMessage("Welcome " + playerName + "\n\n");
         gameClient.playerMessage("You find yourself looking at ");
         gameClient.playerMessage(gameData.getStartingLocation().getDescription());

        // gameClient.getReply("<<Hit Enter to exit>>");
     }

     public void runGame() {
         printWelcome();
         setupPlayer();
         while (handlePlayerTurn()) {
        	 // handle npc logic later
         }
         gameClient.getReply("\n\n<<Hit enter to exit>>");
     }
     
     private boolean handlePlayerTurn() {
    	 CommandResponse playerResponse = playerTurnHandler.processTurn(gameClient.getCommand(), thePlayer);
    	 gameClient.playerMessage(playerResponse.getMessage());
    	 return !playerResponse.isFinishedGame();
     }  
}