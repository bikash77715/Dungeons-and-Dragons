package mazegame.control;

import mazegame.entity.Player;

public class UnlockCommand implements Command{

	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		return new CommandResponse ("You entered the unlock command"); 	
	}

}
