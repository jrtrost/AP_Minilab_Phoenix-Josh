 

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
				new WaterTypePokemon("Gyarados", 62, "Water"),
			    new WaterTypePokemon("Blastoise", 65, "Water"),
			    new WaterTypePokemon("Swampert", 80, "Water"),
			    new WaterTypePokemon("Vaporeon", 98, "Water"),
			    new WaterTypePokemon("Greninja", 53, "Water"),
			    new WaterTypePokemon("Suicune", 86, "Water"),
			    new WaterTypePokemon("Kyogre", 42, "Water"),
			    new WaterTypePokemon("Feraligatr", 49, "Water"),
			    new WaterTypePokemon("Lapras", 53, "Water"),
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
