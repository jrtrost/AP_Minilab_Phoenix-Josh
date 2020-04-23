 

public class GrassTypePokemon extends Pokemon {
	public static final String type = "Cupcakes";
	public enum KeyType {combo, pokemontype, name, lvl};
	public static KeyType key = KeyType.combo;
	private String name;
	private int lvl;
	private String pokemontype;
	
	GrassTypePokemon(String name, int lvl, String pokemontype)
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
	
	public static Pokemon[] GrassTypePokemonData() {
		Pokemon[] cc = { 
				new GrassTypePokemon("Red", 4, "Red Velvet"),
			    new GrassTypePokemon("Orange", 5, "Orange"),
			    new GrassTypePokemon("Yellow", 6, "Lemon"),
			    new GrassTypePokemon("Green", 7, "Apple"),
			    new GrassTypePokemon("Blue", 8, "Blueberry"),
			    new GrassTypePokemon("Purple", 9, "Blackberry"),
			    new GrassTypePokemon("Pink", 10, "Strawberry"),
			    new GrassTypePokemon("Tan", 11, "Vanilla"),
			    new GrassTypePokemon("Brown", 12, "Chocolate"),
		};
		return cc;
	}
	
	public static void main(String[] args)
	{
		Pokemon[] cc = GrassTypePokemonData();
		for(int i = 0; i < cc.length; i++)
			System.out.println(cc[i]);
	}
	
}
