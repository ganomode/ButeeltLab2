package ButltLab2;
import java.util.Arrays;
class Array<T> {
	 
    private Object[] arr;
    public int length;
    private int counter=0;
    // constructor
    public Array(int length)
    {
        // Creates a new Object array of specified length
        arr = new Object[length];
        this.length = length;
    }
 
    // Function to get Object present at index i in the array
    T get(int i) {
        @SuppressWarnings("unchecked")
        final T e = (T)arr[i];
        return e;
    }
 
    // Function to set a value e at index i in the array
    String nemeh(T e) {
    	String urdun=null;
    	if(duurenEseh()) 
    	{
    		arr[counter] = e;
    		urdun = "Amjilttai nemegdlee: "+(counter + 1)+" dah element "+ e;
    		counter++;
    	}
    	else
    		urdun = "Daraalal duursen";
    	return urdun;
    }
    
    String bugdHarah() 
    {
    	String urdun = "";
    	if(!hoosonEseh())
    		for(int i=0; i<counter; i++)
    			urdun = urdun + (i+1) + "r element "+ arr[i]+"\n";
    	else
    		urdun = "Daraalal hooson baina";
    	return urdun;
    }
    
    String haih(T haihUtga) {
    	String urdun="";
    	if(!hoosonEseh()) 
    		for(int i=0; i<=counter; i++) 
    		{
    			if(haihUtga == (T)arr[i])
    				urdun = (i+1) + "r element " + haihUtga + "\n"; 
    		}
    	else
    		urdun = "Daraalal hooson baina";
    	return urdun;
    }
    String hasah() 
    {
    	String urdun = null;
    	if(!hoosonEseh())
    	{
    		urdun = "Amjilttai ustgalaa: " + arr[0];
    		counter--;
    		for(int i=0;i<counter;i++) 
    		{
    			arr[i] = arr[i+1];
    		}
    	}
    	else
    		urdun = "Daraalal hooson baina";
    	return urdun;
    }
    
    private Boolean hoosonEseh() 
    {
    	Boolean urdun = false;
    	if(counter == 0)
    		urdun = true;
    	return urdun;
    }
    private Boolean duurenEseh()
    {
    	Boolean duuren = false;
    	if(counter < length)
    		duuren = true;
    	return duuren;
    }
}