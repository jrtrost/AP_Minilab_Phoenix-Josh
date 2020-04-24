 
/**
 * Circle Queue Driver takes a list of Objects and puts them into a Queue
 * @author     John Mortensen
 *
 */
public class CircleQueueDriver {
	
	private static CircleQueue cqueue;	// circle queue object
	private static int count; // number of objects in circle queue

	/* 
	 * Circle queue constructor
	 */
	public CircleQueueDriver()
	{
		count = 0;		
		cqueue = new CircleQueue();
	}

	/*
	 * Add any array of objects to the queue
	 */
	public void addCQueue(Object[] objects)
	{
		ConsoleMethods.println("Add " + objects.length);
		for (Object o : objects)
		{
			cqueue.add(o);
			ConsoleMethods.println("Add: " + cqueue.getObject() + " " + cqueue);
			this.count++;
		}
		ConsoleMethods.println();			
	}
	
	/* 
	 * Show key objects/properties of circle queue
	 */
	public void showCQueue()
	{
		ConsoleMethods.println("Size: " + count);
		ConsoleMethods.println("First Element: " + cqueue.getFirstObject());
		ConsoleMethods.println("Last Element: " + cqueue.getLastObject());
		ConsoleMethods.println("Full cqueue: " + cqueue);
		ConsoleMethods.println();
	}
	
	/* 
	 * Delete/Clear all object in circle queue
	 */
	public void deleteCQueue()
	{
		int length = this.count;
		ConsoleMethods.println("Delete " + length);
		
		for (int i = 0; i<length; i++)
		{
			ConsoleMethods.println("Delete: " + cqueue.delete() + " " + cqueue);
			this.count--;
		}
	}
	
	
	/* 
	 * Illustrate different Objects that can be placed on same Queue
	 */
	public static String main(String[] args)
	
	{			
		//queue
		CircleQueueDriver pokemonqueue = new CircleQueueDriver();
		
		//add different types of objects to the same opaque queue
		pokemonqueue.addCQueue(FireTypePokemon.FireTypePokemonData());
		pokemonqueue.addCQueue(WaterTypePokemon.WaterTypePokemonData());
		pokemonqueue.addCQueue(GrassTypePokemon.GrassTypePokemonData());
		pokemonqueue.addCQueue(Alphabet.alphabetData());		
		//display queue objects in queue order
		pokemonqueue.showCQueue();
		
		//sort queue objects by specific element within the object and display in sort order
		System.out.println("Selection sort:");
		FireTypePokemon.key = FireTypePokemon.KeyType.name;
		WaterTypePokemon.key = WaterTypePokemon.KeyType.name;
		GrassTypePokemon.key = GrassTypePokemon.KeyType.name;
		Alphabet.key = Alphabet.KeyType.letter;
		pokemonqueue.cqueue.insertionSort();
		pokemonqueue.showCQueue();
		//
		//display queue objects
		FireTypePokemon.key = FireTypePokemon.KeyType.combo;
		WaterTypePokemon.key = WaterTypePokemon.KeyType.combo;
		GrassTypePokemon.key = GrassTypePokemon.KeyType.combo;
		Alphabet.key = Alphabet.KeyType.combo;
		pokemonqueue.showCQueue();
		
		//delete queue objects
		//pokemonqueue.deleteCQueue();
		return ("Size: " + count + "\n" + "First Element: " + cqueue.getFirstObject() + "\n" 
		+ "Last Element: " + cqueue.getLastObject() + "Full cqueue: " + cqueue);
		
	}
	
}
