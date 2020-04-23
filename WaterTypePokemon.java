 

public class WaterTypePokemon extends Pokemon {
	public static final String type = "WaterTypePokemon";
	public enum KeyType {combo, pokemontype, name, lvl};
	public static KeyType key = KeyType.combo;
	private String name;
	private int lvl;
	private String pokemontype;
	
	WaterTypePokemon(String name, int lvl, String pokemontype)
	{
		this.setType(type);
		this.name = name;
		this.lvl = lvl;
		this.pokemontype = pokemontype;
	}
	
	/* 
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString() {		
		String output="";
		switch(key) {
		case pokemontype:
			output += this.pokemontype;
			break;
		case name:
			output += this.name;
			break;
		case lvl:
			output += this.lvl;
			break;
		case combo:
		default:
			output = type + ": " + this.pokemontype + ", " + this.name + ", " + this.lvl;
		}
		return output;
	}
	
	public static Pokemon[] WaterTypePokemonData() {
		Pokemon[] cc = { 
				new WaterTypePokemon("Red", 4, "Red Velvet"),
			    new WaterTypePokemon("Orange", 5, "Orange"),
			    new WaterTypePokemon("Yellow", 6, "Lemon"),
			    new WaterTypePokemon("Green", 7, "Apple"),
			    new WaterTypePokemon("Blue", 8, "Blueberry"),
			    new WaterTypePokemon("Purple", 9, "Blackberry"),
			    new WaterTypePokemon("Pink", 10, "Strawberry"),
			    new WaterTypePokemon("Tan", 11, "Vanilla"),
			    new WaterTypePokemon("Brown", 12, "Chocolate"),
		};
		return cc;
	}
	
	public static void main(String[] args)
	{
		Pokemon[] cc = WaterTypePokemonData();
		for(int i = 0; i < cc.length; i++)
			System.out.println(cc[i]);
	}
	
}
