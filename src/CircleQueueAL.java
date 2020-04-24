import java.util.ArrayList;

public class CircleQueueAL 
{
	private ArrayList<Object> array; 
	private int index;
	// turn circle queue into an arraylist
	
	public CircleQueueAL()
	{
		array.clear();
	}
	
	public Object getFirst()
	{
		Object first;
		if(array.size() == 0)
			first = null;
		else
		{
			first = array.get(0);
		}
		
		return first;
	}
	
	public Object getLast()
	{
		Object last;
		int temp;
		temp = array.size() - 1;
		if(array.size() == 0)
			last = null;
		else
		{
			last = array.get(temp);
		}
		
		return last;
	}
	
	public Object getCurrent()
	{
		Object now;
		if(array.size() == 0)
			now = null;
		else
		{
			now = array.get(index);
		}
		
		return now;
	}
	
	public void setNext()
	{
		int max;
		max = array.size() - 1;
		if(index != max)
		{
			index++;
		}
		else
			System.out.println("You are at the end of the circle queue / array, cannot move forward.");
	}
	
	public void setPrev()
	{
		if(index != 0)
		{
			index--;
		}
		else
			System.out.println("You are at the start of the circle queue / array, can't go to previous.");
	}
	
	public void add(Object obj)
	{
		array.add(obj);
	}
	
	public Object delete()
	{
		int last = array.size() - 1;
		Object deleted = null;
		
		if(array.size() != 0)
		{
			deleted = array.get(0);
			array.remove(0);
		}
		
		return deleted;
	}
	
	 public String toString()
	  {
	    String output = "[";
	    int size = array.size();
	    int x;
	    
	    for(x = 0; x < size; x++)
	    {
	    	output +="("+array.get(x)+"), ";
	    }
	    
	    return output;
	  }
	 
	 // i think??
	 public void insertionSort()
	 {
		 ArrayList<Object> unsorted = array;
		 int x = unsorted.size(), ind = 1;
		 String hold = unsorted.get(0).toString();
		 int temp = ind - 1;
		 
		 for(ind = 1; ind < x; ind++)
		 {
			 hold = unsorted.get(ind).toString();
			 temp = ind - 1;
			 
			 while(temp >= 0 && unsorted.get(temp).toString().compareTo(hold) > 0)
			 {
				 unsorted.set(temp + 1, unsorted.get(temp));
				 temp--;
			 }
			 unsorted.set(temp+1, hold);
		 }
	 }
	 
	 public void selectionSort()
	 {
		 ArrayList<Object> unsorted = array;
		 int n = array.size();
		 int x, j;
		 int min;
		 Object temp;
		 
		 for(x = 0; x < n - 1; x++)
		 {
			 min = x;
			 for(j = x + 1; j < n; j++)
			 {
				 if(unsorted.get(j).toString().compareTo(unsorted.get(min).toString()) < 0)
				 {
					 min = j;
				 }
			 }
			 temp = unsorted.get(min);
			 unsorted.set(min,  unsorted.get(x));
			 unsorted.set(x, temp);
		 }
	 }
}