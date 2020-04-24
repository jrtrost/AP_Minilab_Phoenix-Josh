 

public class GrassTypePokemon extends Pokemon {
	public static final String type = "GrassTypePokemon";
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
				new GrassTypePokemon("Kartana ", 30, "Grass"),
			    new GrassTypePokemon("Tangela ", 5, "Grass"),
			    new GrassTypePokemon("Leafeon ", 23, "Grass"),
			    new GrassTypePokemon("Bounsweet", 62, "Grass"),
			    new GrassTypePokemon("Chesnaught ", 33, "Grass"),
			    new GrassTypePokemon("Cherubi ", 97, "Grass"),
			    new GrassTypePokemon("Venusaur ", 41, "Grass"),
			    new GrassTypePokemon("Skiddo ", 15, "Grass"),
			    new GrassTypePokemon("Celebi ", 12, "Grass"),
		};
		return cc;
	}
	
	public static String main(String[] args)
	{
		Pokemon[] cc = GrassTypePokemonData();
		String all = "";
		for(int i = 0; i < cc.length; i++)
		{
			System.out.println(cc[i]);
			all = all + "\n" + cc[i];
		}
		
		return all;
	}
	
}
