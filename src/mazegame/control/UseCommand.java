package mazegame.control;

import mazegame.entity.Item;
import mazegame.entity.Player;

public class UseCommand implements Command {

	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		// TODO Auto-generated method stub
		if (userInput.getArguments().size() == 0) {
			return new CommandResponse ("If you want to use an item, you have to give me the name of the item.");
		}
		String itemLable = userInput.getArguments().get(0);
		Item item = thePlayer.getItems().getItemList().get(itemLable);
		if(item == null) {
			return new CommandResponse (" You do not have "+ itemLable);
		}
		
		return thePlayer.getItems().getItemList().get(itemLable).use(thePlayer);
//		return new CommandResponse(" You have used "+ itemLable);
	}

}
