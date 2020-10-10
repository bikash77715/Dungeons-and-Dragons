package mazegame.control;

import mazegame.entity.Item;
import mazegame.entity.Player;

public class GetCommand implements Command {

	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		if (userInput.getArguments().size() == 0) {
			return new CommandResponse ("Which item to pick.");
		}

		String itemLabel = (String) userInput.getArguments().get(0);
		Item chosenItem = thePlayer.getCurrentLocation().getInventory().findItem(itemLabel); 
   	 	if (chosenItem == null) {
   	 		return new CommandResponse("There is no item in the map");
   	 	}
   	 	 	 	
   	 	
   	    if(!thePlayer.getItems().addItem(chosenItem)) {
   	    	return new CommandResponse("Over weight of item");
   	    }
   	 	return new CommandResponse("You successfully added " + itemLabel + " to the inventory");	
	}

}
