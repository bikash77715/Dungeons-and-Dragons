package mazegame.control;

import mazegame.entity.Player;

public class ListCommand implements Command{

	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		
		response = new CommandResponse(thePlayer.getItems().toString());
		
		return response;
			
	}

}
