import java.util.*; 
import java.util.stream.IntStream; 
  
class AverageOfNumbers{ 
  
    public static void main(String[] args) 
    { 
  
        IntStream stream = IntStream.of(1,2, 3, 4, 5, 6, 7, 8); 
  
     
        OptionalDouble obj = stream.average(); 
  
        
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    } 
} 