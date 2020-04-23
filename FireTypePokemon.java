 

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
	
	public static Pokemon[] FireTypePokemonData() {// fire type pokemon
		Pokemon[] cc = { 
				new FireTypePokemon("Blaziken", 7, "Fire"),
			    new FireTypePokemon("Charizard", 47, "Fire"),
			    new FireTypePokemon("Infernape", 72, "Fire"),
			    new FireTypePokemon("Arcanine", 75, "Fire"),
			    new FireTypePokemon("Talonflame", 92, "Fire"),
			    new FireTypePokemon("Flareon", 27, "Fire"),
			    new FireTypePokemon("Typhlosion", 77, "Fire"),
			    new FireTypePokemon("Cinderace", 85, "Fire"),
			    new FireTypePokemon("Volcarona", 97, "Fire"),
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
