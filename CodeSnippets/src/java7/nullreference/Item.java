package java7.nullreference;

import java.util.Objects;

/*
 * Trying out the java.util.Objects class static  methods that address situations where null values need to be handled.  
 */
public class Item {
	 private String name;
	 private int partNumber;
	   
	 public Item() {
	       this("Widget", 0);
	 }
	 
	 public Item(String name, int partNumber) {
	       this.name = Objects.requireNonNull(name);
	       this.partNumber = partNumber;
	 }
	 
	 public String getName() {
	        return name;
	 }
	 
	 public void setName(String name) {
		 this.name = Objects.requireNonNull(name, "The name field requires a non-null value");
	 }
	 
	 public int getPartNumber() {
	        return partNumber;
	 }
	 
	 public void setPartNumber(int partNumber) {
	        this.partNumber = partNumber;
	 }
	 
	 @Override
	    public boolean equals(Object obj){
	        if (obj == null) {
	            return false;
	}
	        if (getClass() != obj.getClass()) {
	            return false;
	}
	        final Item other = (Item) obj;
	        if (!Objects.equals(this.name, other.name)) {
	            return false;
	}
	        if (this.partNumber != other.partNumber) {
	            return false;
	}
	        return true;
	}
	 
	 @Override
	    public int hashCode() {
		    return Objects.hash(name,partNumber);
	}
	 
	  @Override
	    public String toString() {
	        return Objects.toString(this, "Item is null");
	}
	  
	  
	  public static void main(String[] args) {
		  Item item1 = new Item("Eraser", 2200);
	      Item item2 = new Item("Eraser", 2200);
	      Item item3 = new Item("Pencil", 1100);
	      Item item4 = null;
	      
	       System.out.println("item1 equals item1: " +  
	          item1.equals(item1));
	       
	        System.out.println("item1 equals item2: " +  
	          item1.equals(item2));
	        
	        System.out.println("item1 equals item3: " +  
	          item1.equals(item3));
	        
	        System.out.println("item1 equals item4: " +  
	          item1.equals(item4));
	        
	        item2.setName(null);
	        
	        System.out.println("item1 equals item2: " +  
	          item1.equals(item2));
	        

	  }  
	  
	  

}
