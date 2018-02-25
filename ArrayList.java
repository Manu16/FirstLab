import java.util.Arrays;

public class ArrayList 
{
	private static final int GROW_CAPACITY = 10;
	private int[] elementData = new int[10];
	private int size;
	
	public void putAtEnd(int element)
	{
		if(size>=GROW_CAPACITY)
		{
			growCapacity(GROW_CAPACITY );
		}
		elementData[size]= element;
		size++;
	}
	
	public void removeAllY(int element)
    {        
        int counter = 0; //Counts how many times the element is in the array
        for(int i=0;i<elementData.length;i++)
        {
            if(elementData[i]==element) //if element in the array matches the element we want to remove
            {            	
            	elementData[i]=0; 
                int i1=0;
                for(i1=i;i1<elementData.length - 1;i1++)
                {           
                    elementData[i1]=elementData[i1+1];
                }
                elementData[i1]=0;
                i--; //Decrements element by one in array
                counter++;
            }
        }
        this.setSize(size-counter); //New size in the array
         
    }
	
	public void growCapacity(int capacityToGrow)
	{
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + capacityToGrow;
		elementData = Arrays.copyOf(elementData, newCapacity);
	}
	
	public int getSize()
	{
		return size;
	}
	public void print(int index)
	{
		System.out.println(elementData[index]);
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
}
