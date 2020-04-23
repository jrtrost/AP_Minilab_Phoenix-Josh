 

public class FireTypePokemon extends Pokemon {
	public static final String type = "Cupcakes";
	public enum KeyType {combo, pokemontype, name, lvl};
	public static KeyType key = KeyType.combo;
	private String name;
	private int lvl;
	private String pokemontype;
	
	FireTypePokemon(String name, int lvl, String pokemontype)
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
	
	public static Pokemon[] FireTypePokemonData() {
		Pokemon[] cc = { 
				new FireTypePokemon("Red", 4, "Red Velvet"),
			    new FireTypePokemon("Orange", 5, "Orange"),
			    new FireTypePokemon("Yellow", 6, "Lemon"),
			    new FireTypePokemon("Green", 7, "Apple"),
			    new FireTypePokemon("Blue", 8, "Blueberry"),
			    new FireTypePokemon("Purple", 9, "Blackberry"),
			    new FireTypePokemon("Pink", 10, "Strawberry"),
			    new FireTypePokemon("Tan", 11, "Vanilla"),
			    new FireTypePokemon("Brown", 12, "Chocolate"),
		};
		return cc;
	}
	
	public static void main(String[] args)
	{
		Pokemon[] cc = FireTypePokemonData();
		for(int i = 0; i < cc.length; i++)
			System.out.println(cc[i]);
	}
	
}
