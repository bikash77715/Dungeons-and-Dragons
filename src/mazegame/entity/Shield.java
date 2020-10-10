package mazegame.entity;

import mazegame.control.CommandResponse;

public class Shield extends Item {
	
	public Shield (String label, int value, double weight, String description) {
		super (label, value, weight, description);
	}

	@Override
	public CommandResponse use(Player thePlayer) {
		// TODO Auto-generated method stub
		return null;
	}
}
