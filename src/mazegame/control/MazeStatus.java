package mazegame.control;

import mazegame.HardCodedData;
import mazegame.entity.Player;

public class MazeStatus implements Command {

	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		return new CommandResponse("There are "+HardCodedData.getLocationCount() +" location and "+ HardCodedData.getShopCount()+ " shops.");	
	}

}
