import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class q6 {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();
        
        long startTime = System.currentTimeMillis();
        long interval = 1000; // Print every 1 second
        
        while (true) {
            objects.add(new Object());
            
            if (System.currentTimeMillis() - startTime > interval) {
                long heapSize = runtime.totalMemory();
                long freeMemory = runtime.freeMemory();
                long usedMemory = heapSize - freeMemory;
                Date timestamp = new Date();
                
                System.out.println("Timestamp: " + timestamp + " | Heap Size: " + heapSize + " bytes | Free Space: " + freeMemory + " bytes | Used Memory: " + usedMemory + " bytes");
                
                startTime = System.currentTimeMillis();
            }
        }
    }
}
