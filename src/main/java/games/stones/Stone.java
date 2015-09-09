package games.stones;

public class Stone extends Tile {
	private int value;
	
	public Stone(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
    @Override
    public String toString() {
		return ""+value;
    	
    }
}
