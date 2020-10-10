package mazegame.entity;

import mazegame.control.CommandResponse;

public class Weapon extends Item {
	
	public Dice m_Dice;

    public Weapon(String label, int value, double weight, String description) {
         super (label, value, weight, description);
    }

	@Override
	public CommandResponse use(Player thePlayer) {
		// TODO Auto-generated method stub
		return null;
	}
}
