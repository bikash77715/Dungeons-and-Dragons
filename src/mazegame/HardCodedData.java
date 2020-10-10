package mazegame;

import mazegame.boundary.IMazeData;
import mazegame.entity.*;
import mazegame.entity.utility.*;

public class HardCodedData implements IMazeData {
//	private Location lab2, lab3, library, ring;
	private Location mall, zoo, park, beach, school, playGround, shop1, shop2, shop3;
	
	private static final int locationCount = 6;
	private static final int shopCount = 3;

	public HardCodedData() {
		createLocations();
		createItems();
		createNPC();
		populateWeightLimitTable();
		populateStrengthTable();
		populateAgilityTable();
	}

	public Location getStartingLocation() {
		return mall;
	}

	public String getWelcomeMessage() {
		return "Welcome to the Mount Helanous !!";
	}
	
	public static int getLocationCount() {
		return locationCount;
	}
	
	public static int getShopCount() {
		return shopCount;
	}

	private void createItems() {

		Item m16 = new Weapon("m16", 25, 5, "m16 gun fire");
		Item ak47 = new Weapon("ak47", 10, 200.5, "russian gun fire");
		Item hemlet = new Shield("hemlet", 10, 10, "military cap");
		Item sword = new Weapon("sword", 5, 20.5, "long sword");
		Item rbj = new Weapon("rbj", 50, 20, "rbj machine");

		mall.getInventory().addItem(m16);
		mall.getInventory().addItem(rbj);
		zoo.getInventory().addItem(ak47);
		playGround.getInventory().addItem(sword);
		beach.getInventory().addItem(hemlet);

	}

	private void createLocations() {

		mall = new Location("Shopping mall for everyone.", "mall");
		zoo = new Location("See all the animals in wild.", "zoo");
		park = new Location("Have fun with friends and families in the park", "park");
		school = new Location("Learn new things with friends and teachers.", "school");
		playGround = new Location("Everyday playing games with friends.", "playground");
		beach = new Location("Enjoy beach with friends.","beach");
		shop1 = new Shop("Buy damage items.", "shop1");
		shop2 = new Shop("Buy clothings.", "shop2");
		shop3 = new Shop("Buy guns and ammunition.", "shop3");

		mall.getExitCollection().addExit("north", new Exit("Park exit", park));
		mall.getExitCollection().addExit("south", new Exit("School exit", school));
		mall.getExitCollection().addExit("east", new Exit("Shop1 exit", shop1));
		mall.getExitCollection().addExit("west", new Exit("Beach exit", beach));

		zoo.getExitCollection().addExit("north", new Exit("Shop1 Exit", shop1));
		zoo.getExitCollection().addExit("west", new Exit("School Exit", school));

		shop1.getExitCollection().addExit("west", new Exit("Mall Exit", mall));
		shop1.getExitCollection().addExit("south", new Exit("Zoo Exit", zoo));

		school.getExitCollection().addExit("north", new Exit("Mall Exit", mall));
		school.getExitCollection().addExit("south", new Exit("Playground exit", playGround));
		school.getExitCollection().addExit("southwest", new Exit("Shop2 exit", shop2));
		school.getExitCollection().addExit("east", new Exit("Zoo exit", zoo));
		
		playGround.getExitCollection().addExit("north", new Exit("School exit", school));
		playGround.getExitCollection().addExit("west", new Exit("Shop2 exit", shop2));
		
		shop2.getExitCollection().addExit("northeast", new Exit("School exit", school));
		shop2.getExitCollection().addExit("east", new Exit("Play ground Exit", playGround));
		
		
		park.getExitCollection().addExit("north", new Exit("Shop3 exit", shop3));
		park.getExitCollection().addExit("south", new Exit("Mall Exit", mall));
		
		shop3.getExitCollection().addExit("south", new Exit("Park exit", park));

		beach.getExitCollection().addExit("east", new Exit("Mall Exit", mall));
		// zoo, park, beach, school, playGround, shop1, shop2, shop3
//		lab2 = new Location ("itech7201 lab2", "lab2");
//		lab3 = new Location("itech 1400 lab3","lab3");
//		library = new Shop("library with many books","lib");		
//		ring = new Location("Fighting ring","ring");	
//		//connect locations
//		lab2.getExitCollection().addExit("south", new Exit("library exit ",library));
//		lab2.getExitCollection().addExit("east", new Exit("lab3 exit",lab3));
//		
//		lab3.getExitCollection().addExit("west", new Exit("lab2 exit ",lab2));
//		lab3.getExitCollection().addExit("south", new Exit("ring  exit",ring));
//		
//		library.getExitCollection().addExit("north", new Exit("lab2 exit ",lab2));
//		library.getExitCollection().addExit("east", new Exit("ring exit ",ring));
//		
//		ring.getExitCollection().addExit("north", new Exit("lab3 exit",lab3));
//		ring.getExitCollection().addExit("west", new Exit("library exit",library));			
	}

	public void createNPC() {
	
	}
	private void populateStrengthTable() {
		StrengthTable strengthModifiers = StrengthTable.getInstance();
		strengthModifiers.setModifier(1, -5);
		strengthModifiers.setModifier(2, -4);
		strengthModifiers.setModifier(3, -4);
		strengthModifiers.setModifier(4, -3);
		strengthModifiers.setModifier(5, -3);
		strengthModifiers.setModifier(6, -2);
		strengthModifiers.setModifier(7, -2);
		strengthModifiers.setModifier(8, -1);
		strengthModifiers.setModifier(9, -1);
		strengthModifiers.setModifier(10, 0);
		strengthModifiers.setModifier(11, 0);
		strengthModifiers.setModifier(12, 1);
		strengthModifiers.setModifier(13, 1);
		strengthModifiers.setModifier(14, 2);
		strengthModifiers.setModifier(15, 2);
		strengthModifiers.setModifier(16, 3);
		strengthModifiers.setModifier(17, 3);
		strengthModifiers.setModifier(18, 4);
		strengthModifiers.setModifier(19, 4);
		strengthModifiers.setModifier(20, 5);
		strengthModifiers.setModifier(21, 5);
		strengthModifiers.setModifier(22, 5);
		strengthModifiers.setModifier(23, 5);
		strengthModifiers.setModifier(24, 5);
		strengthModifiers.setModifier(25, 5);
		strengthModifiers.setModifier(26, 8);
		strengthModifiers.setModifier(27, 8);
		strengthModifiers.setModifier(28, 8);
		strengthModifiers.setModifier(29, 8);
		strengthModifiers.setModifier(30, 10);
		strengthModifiers.setModifier(31, 10);
		strengthModifiers.setModifier(32, 10);
		strengthModifiers.setModifier(33, 10);
		strengthModifiers.setModifier(34, 10);
		strengthModifiers.setModifier(35, 10);
		strengthModifiers.setModifier(36, 12);
		strengthModifiers.setModifier(37, 12);
		strengthModifiers.setModifier(38, 12);
		strengthModifiers.setModifier(39, 12);
		strengthModifiers.setModifier(40, 12);
		strengthModifiers.setModifier(41, 15);
		strengthModifiers.setModifier(42, 15);
		strengthModifiers.setModifier(43, 15);
		strengthModifiers.setModifier(44, 17);
		strengthModifiers.setModifier(45, 17);
		strengthModifiers.setModifier(46, 18);
	}

	private void populateAgilityTable() {
		AgilityTable agilityModifiers = AgilityTable.getInstance();
		agilityModifiers.setModifier(1, -5);
		agilityModifiers.setModifier(2, -5);
		agilityModifiers.setModifier(3, -5);
		agilityModifiers.setModifier(4, -3);
		agilityModifiers.setModifier(5, -3);
		agilityModifiers.setModifier(6, -2);
		agilityModifiers.setModifier(7, -2);
		agilityModifiers.setModifier(8, -1);
		agilityModifiers.setModifier(9, -1);
		agilityModifiers.setModifier(10, 0);
		agilityModifiers.setModifier(11, 0);
		agilityModifiers.setModifier(12, 1);
		agilityModifiers.setModifier(13, 1);
		agilityModifiers.setModifier(14, 2);
		agilityModifiers.setModifier(15, 2);
		agilityModifiers.setModifier(16, 3);
		agilityModifiers.setModifier(17, 3);
		agilityModifiers.setModifier(18, 4);
		agilityModifiers.setModifier(19, 4);
		agilityModifiers.setModifier(20, 6);
		agilityModifiers.setModifier(21, 6);
		agilityModifiers.setModifier(22, 6);
		agilityModifiers.setModifier(23, 6);
		agilityModifiers.setModifier(24, 6);
		agilityModifiers.setModifier(25, 6);
		agilityModifiers.setModifier(26, 8);
		agilityModifiers.setModifier(27, 8);
		agilityModifiers.setModifier(28, 8);
		agilityModifiers.setModifier(29, 8);
		agilityModifiers.setModifier(30, 8);
		agilityModifiers.setModifier(31, 8);
		agilityModifiers.setModifier(32, 11);
		agilityModifiers.setModifier(33, 11);
		agilityModifiers.setModifier(34, 11);
		agilityModifiers.setModifier(35, 11);
		agilityModifiers.setModifier(36, 11);
		agilityModifiers.setModifier(37, 11);
		agilityModifiers.setModifier(38, 13);
		agilityModifiers.setModifier(39, 13);
		agilityModifiers.setModifier(40, 13);
		agilityModifiers.setModifier(41, 13);
		agilityModifiers.setModifier(42, 13);
		agilityModifiers.setModifier(43, 13);
		agilityModifiers.setModifier(44, 15);
		agilityModifiers.setModifier(45, 15);
		agilityModifiers.setModifier(46, 15);
	}

	private void populateWeightLimitTable() {
		WeightLimit weightModifier = WeightLimit.getInstance();
		weightModifier.setModifier(1, 6);
		weightModifier.setModifier(2, 13);
		weightModifier.setModifier(3, 20);
		weightModifier.setModifier(4, 26);
		weightModifier.setModifier(5, 33);
		weightModifier.setModifier(6, 40);
		weightModifier.setModifier(7, 46);
		weightModifier.setModifier(8, 53);
		weightModifier.setModifier(9, 60);
		weightModifier.setModifier(10, 66);
		weightModifier.setModifier(11, 76);
		weightModifier.setModifier(12, 86);
		weightModifier.setModifier(13, 100);
		weightModifier.setModifier(14, 116);
		weightModifier.setModifier(15, 133);
		weightModifier.setModifier(16, 153);
		weightModifier.setModifier(17, 173);
		weightModifier.setModifier(18, 200);
		weightModifier.setModifier(19, 233);
		weightModifier.setModifier(20, 266);
		weightModifier.setModifier(21, 306);
		weightModifier.setModifier(22, 346);
		weightModifier.setModifier(23, 400);
		weightModifier.setModifier(24, 466);
		weightModifier.setModifier(25, 533);
		weightModifier.setModifier(26, 613);
		weightModifier.setModifier(27, 693);
		weightModifier.setModifier(28, 800);
		weightModifier.setModifier(29, 933);
		weightModifier.setModifier(30, 1013);
		weightModifier.setModifier(31, 1093);
		weightModifier.setModifier(32, 1300);
		weightModifier.setModifier(33, 1433);
		weightModifier.setModifier(34, 1513);
		weightModifier.setModifier(35, 1593);
		weightModifier.setModifier(36, 1700);
		weightModifier.setModifier(37, 1833);
		weightModifier.setModifier(38, 1913);
		weightModifier.setModifier(39, 1993);
		weightModifier.setModifier(40, 2100);
		weightModifier.setModifier(41, 2233);
		weightModifier.setModifier(42, 2313);
		weightModifier.setModifier(43, 2393);
		weightModifier.setModifier(44, 2500);
		weightModifier.setModifier(45, 2633);
		weightModifier.setModifier(46, 2713);
	}
}
