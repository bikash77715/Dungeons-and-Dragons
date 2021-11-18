# Dungeons-and-Dragons
  A text-based game on console complying the classic D&D game using Java. The code follows design patterns: Command pattern, State pattern, and Singleton pattern.
  
# Code Construct
  The code consists of two interfaces: IMazeClient and IMazeData which represents the boundry classes for the system. 
  The IMazeClient represents the user-interface class and the IMazeData represents the data source.
  The HardCodedData class implements the IMazeData interface and the SimpleConsoleClient class implements the IMazeClient interface.
  
  The MazeGame class is the main class for the system and DungeonMaster class is the main controller. 
  The MazeGame class instantiates The DungeonMaster class and calls its run() function.
  The DungeonMaster class represents the Dungeon-master of the D&D game which is responsible for handling player turns and narrate the events.
  The sets up the player by taking user input and instantiating the Player class and then employs CommandHandler class to handle the player's turn.
  The CommandHandler updates the command-state and employs Parser class to parse the commands of player and separate command leteral and arguments.
  If the command of player is valid, the corresponding execute() method of the command is called.
  All the valid command are provided by a CommandState object. The CommandState class consists property for available commands and a method to update command-state.
  The Command interface sets the blue-print for all commands. All the command classes implements the Command interface which has execute() method.
  There is a DiceRoller class which imitates the dice rolling activity to determine whether some of the commands are to be executed or not.
  The DiceRoller class is instantiated using singleton pattern.
  After the turn of player is handled, the DungeonMaster class handles the turn of any non player character.
  The NonPlayerCharacter class represents the non player characters.
  The Player and NonPlayerCharacter classes extends Character class.
  The NonPlayerCharacter can either be hostile or non-hostile which is differentiated by a boolean property in the class.
  
  
  
  
  
