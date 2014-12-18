
public class Cell {

	// carry is the cells likelihood to give 'health' to others. 
	/*
	 * greed is the cells likelihood to take food when there is competition. 
	 * I.e. we have a contention for the same resource. 
	 * Also greed affects how often the cells offers a carry to another.
	 */
	int gen, delta, size, health, carry, greed;
	int posX, posY;
	int pfp; // Path finding proficiency;
	String DNA = null; // this is the cell's history, it contains info from ancestors. 
	public Cell(int gen, int delta, int size, int health, int carry, int greed, int posX,  int posY){
		
	}
	
	public int[] getPosition()
	{
		return new int[]{posX,posY};
	}
	
	
	
	
}
