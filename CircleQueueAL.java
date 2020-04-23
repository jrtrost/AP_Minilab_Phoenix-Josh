import java.util.ArrayList;

public class CircleQueueAL 
{
	private Object head;
	private Object tail;
	private Object current;
	private ArrayList array; 
	private int index;
	// turn circle queue into an arraylist
	
	public CircleQueueAL()
	{
		array.clear();
		head = null;
		tail = null;
		current = null;
	}
	
	public Object getFirst()
	{
		Object first;
		if(array.size() == 0)
			first = null;
		else
		{
			first = array.get(0);
			head = first;
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
			tail = last;
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
			current = now;
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
			current = array.get(index);
		}
		else
			System.out.println("You are at the end of the circle queue / array, cannot move forward.");
	}
	
	public void setPrev()
	{
		if(index != 0)
		{
			index--;
			current = array.get(index);
		}
		else
			System.out.println("You are at the start of the circle queue / array, can't go to previous.");
	}
	
	public void add(Object obj)
	{
		array.add(obj);
		tail = obj;
	}
	
	public Object delete()
	{
		int last = array.size() - 1;
		Object deleted = null;
		
		if(array.size() != 0)
		{
			deleted = array.get(0);
			array.remove(0);
			
			head = array.get(0);
			tail = array.get(last);
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
}




public class CircleQueue
{
   private LinkedList headNode;			// 1st element in Queue
   private LinkedList tailNode;			// Last element in Queue
   private LinkedList currentNode;		

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public CircleQueue()
  {
    headNode = null;
    tailNode = null;
    currentNode = null;
  }
  
  /**
   *  Returns the head opaqueObject.
   *
   * @return  the head opaqueObject in Stack.
   */
  public Object getFirstObject()
  {
  	currentNode = headNode;

    if (headNode == null)
    	return null;
    else
    	return headNode.getObject();
  }

  /**
   *  Returns the tail opaqueObjects.
   *
   * @return  the current opaqueObject in Stack.
   */
  public Object getLastObject()
  {
	currentNode = tailNode;

    if (tailNode == null)
    	return null;
    else
    	return tailNode.getObject();
  }
  
  /**
   *  Returns the current Object
   *
   * @return  the current Object in Stack.
   */
  public Object getObject()
  {
    if (currentNode == null)
  	  return null;
    else
      return currentNode.getObject();
  }
  
  /**
   *  Advances the current node.
   *
   */
  public void setNext()
  {
	currentNode = currentNode.getNext();
	
	// never let currentNode be null, wrap to head
	if (currentNode == null)
		currentNode = headNode;
  }
  
  /**
   *  Reverses the current node.
   *
   */
  public void setPrevious()
  {
	currentNode = currentNode.getPrevious();
	
	// never let currentNode be null, wrap to head
	if (currentNode == null)
		currentNode = tailNode;
  }
  
  
  /**
   *  Add a new object at the end of the Queue,
   *
   * @param  opaqueObject  is the data to be inserted in the Queue object.
   */
  public void add(Object opaqueObject)
  {
	  // add new object to end of Queue
	  // set opaqueObject
	  // build previous link of tail (as current)
	  tailNode = new LinkedList(opaqueObject, currentNode);
	  
	  // build next link of current (as tail)
	  if (currentNode != null)
		  currentNode.setNextNode(tailNode);
	  
	  // after links are established current eq tail
	  currentNode = tailNode;

	  // head eq tail on 1st element only
	  if (headNode == null) {
		  headNode = tailNode;
	  }
  }
  
  /**
   *  Delete an object from the front of the Queue,
   *
   */
  public Object delete()
  {
	  Object opaqueObject = null;
	  	  
	  if (headNode != null) {
		  opaqueObject = headNode.getObject();
		  headNode = headNode.getNext();
		  if (headNode == null)
			  tailNode = headNode;
		  else
			  headNode.setPrevNode(null);
	  }
	  		
	  return opaqueObject;
  }
  
  
  /**
   *  Returns a string representation of this Queue,
   *  polymorphic nature of toString overrides of standard System.out.print behavior
   *
   * @return    string representation of this Queue
   */
  public String toString()
  {
    String queueToString = "[";

    LinkedList node = headNode;  			// start from the head
    while (node != null)
    {
    	queueToString += "("+node.getObject()+")"; 	// append the data to output string
    	node = node.getNext();				// go to next node
    	if (node != null)
    		queueToString += ", ";
    }										// loop 'till queue ends
    queueToString += "]";
    return queueToString;
  }
  
  /**
   * Performs insertion sort based off of the contents of object
   */
  public void insertionSort() {	
	
	//two nodes needed for insertion sort indexes
    LinkedList node1 = headNode;
    LinkedList node2 = (node1 == null) ? null : node1.getNext();
    
    //continue while nodes remain in bounds
    while (node2 != null) {	
    	
    	//inner loop pointers for compares and shifts
    	LinkedList slot1 = node1;
    	LinkedList slot2 = node2;
    		
		//key to be inserted into sorted slot
		LinkedList key = new LinkedList(node2);		//note: make key a different object, persistent/static in value (node2 moves)
		String keyText = node2.getObject().toString();

		//walks slots backwards until key position in found
		while ( slot1.getObject().toString().compareTo(keyText) > 0 ) {
	    	//shifts object greater than key value to the right in list
    		slot2.setObject(slot1.getObject());

			//moves inner loop pointers
			slot1 = slot1.getPrevious();
			slot2 = slot2.getPrevious();
			
			//stop at the front of list
			if (slot1 == null)
				break;
			
    	}
		//place key in insertion position
    	slot2.setObject(key.getObject());

    	//advance insertion sort indexes
    	node1 = node1.getNext();
    	node2 = node2.getNext();
    } 
    
  } 
  
  public void selectionSort() {
	  LinkedList node1 = headNode;
	  LinkedList node2 = (node1 == null) ? null : node1.getNext();
	  
	  while (node2 != null) {
		  LinkedList slot1 = node1;
		  LinkedList slot2 = node2;
		  
		  LinkedList key = node2;
		  String keyText = node2.getObject().toString();
		  
		  LinkedList minKey = node1;
		  String minKeyText = minKey.getObject().toString();
		  
		  while (slot2 != null) {
			  if(minKeyText.compareTo(slot2.getObject().toString()) > 0) {
				  minKey = slot2;
				  minKeyText = slot2.getObject().toString();
			  }
			  slot2 = slot2.getNext();
		  }
		  
		  slot2 = minKey;
		  slot2.setObject(keyText);
		  
		  slot1.setObject(minKeyText);
		  
		  node1 = node1.getNext();
		  node2 = node2.getNext();
	  }
  }  
}
