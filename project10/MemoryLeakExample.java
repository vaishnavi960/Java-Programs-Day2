package project10;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MemoryLeakExample {
	
	private String name;
	public MemoryLeakExample(String name)
    {
           this.name=name;
    }
	
	       public static void main(String[] args) { 
	    	      System.out.println("Memory leak examples:");      
	              System.out.println(" 1.the map has a reference to it, but application can’t access it.so its a memory leak.");
	              Map<MemoryLeakExample,String> map = new HashMap<MemoryLeakExample,String>();
	              String put = map.put(new MemoryLeakExample("amitha"), "amitha patkar");
	              String val = map.get(new MemoryLeakExample("Amitha"));
	              System.out.println("Missing equals and hascode so value is not accessible from Map :     " + val);
	              System.out.println("2.error because it does not occupy space in the memory."); 
	              Vector v1 = new Vector(314567);  
	    	      Vector v2 = new Vector(876543987); 
	    	      System.out.println("There is no memory leak in this program.");  
	             
	       }
	}
