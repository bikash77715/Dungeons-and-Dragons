package mazegame.entity;

import mazegame.control.CommandResponse;

public class Armor extends Item {
	private int bonus;	

	public Armor (String label, int value, double weight, String description) {
		super (label, value, weight, description);
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public CommandResponse use(Player thePlayer) {
		// TODO Auto-generated method stub
		if(true) {
			return new CommandResponse(" you wear the " +this.getLabel() );
		}
		return new CommandResponse(" Cannot wear "+ this.getLabel());
	}
}
