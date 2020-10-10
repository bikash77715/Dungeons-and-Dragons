package mazegame.entity;

import mazegame.control.CommandResponse;

public class Potion extends Item{

	public Potion(String label, int value, double weight, String description) {
		super(label, value, weight, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CommandResponse use(Player thePlayer) {
		// TODO Auto-generated method stub
		if(true){
			thePlayer.setLifePoints(thePlayer.getLifePoints() + this.getValue());
			thePlayer.getItems().removeItem(this.getLabel());
			return new CommandResponse(" You have used " + this.getLabel() +" Your life points: "+thePlayer.getLifePoints());
		}
		
		return new CommandResponse(" No danger. You do not need to use "+ this.getLabel());
		
	}

	

}
