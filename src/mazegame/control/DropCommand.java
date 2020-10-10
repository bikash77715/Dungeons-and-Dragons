package mazegame.control;

import mazegame.entity.Item;
import mazegame.entity.Player;

public class DropCommand implements Command{

	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		if (userInput.getArguments().size() == 0) {
			return new CommandResponse ("Select an item to drop.");
		}

		String itemLabel = (String) userInput.getArguments().get(0);
		Item chosenItem = thePlayer.getItems().findItem(itemLabel); 
   	 	if (chosenItem == null) {
   	 		return new CommandResponse("There is no item in the list");
   	 	}
   	    thePlayer.getItems().removeItem(itemLabel);
   	 	return new CommandResponse("You successfully removed " + itemLabel + " from the inventory");	
	}

}
