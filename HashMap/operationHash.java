package LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String> number= new HashMap<Integer,String>();
     
     number.put(101, "sandip");
     number.put(102, "aditi");
     number.put(103, "rakesh");
     number.put(104, "anirban");
     
     Set<Map.Entry<Integer,String>> set=number.entrySet();
     
     for(Map.Entry<Integer,String> me:set)
     {
    	 System.out.println(me.getKey()+": "+me.getValue());
     }
     
     String c=number.get(101);
     System.out.println("The value for 101="+c);
    
     
     
     
	}

}
