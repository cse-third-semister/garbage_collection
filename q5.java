public class q5 {
    private int integerData;
    private double doubleData;

    public void initialize(int integerData, double doubleData) {
        this.integerData = integerData;
        this.doubleData = doubleData;
    }

    public void setData(int integerData, double doubleData) {
        this.integerData = integerData;
        this.doubleData = doubleData;
    }

    public void updateData(int deltaInteger, double deltaDouble) {
        this.integerData += deltaInteger;
        this.doubleData += deltaDouble;
    }

    public static void main(String[] args) {
        q5 obj1 = new q5();
        q5 obj2 = new q5();

        obj1.initialize(10, 20.5);
        obj2.initialize(30, 40.8);

        // Calculate total memory allocated before object creation
        long totalMemoryBefore = Runtime.getRuntime().totalMemory();
        System.out.println("Total memory allocated before object creation: " + totalMemoryBefore);

        // Calculate memory occupied by the objects before making them unreachable
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory occupied by the objects before making them unreachable: " + memoryBefore);

        // Making objects unreachable to trigger garbage collection
        obj1 = null;
        obj2 = null;

        // Explicit invocation of garbage collector
        System.gc();

        // Calculate memory occupied by the objects after garbage collection
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory occupied by the objects after garbage collection: " + memoryAfter);

        // Calculate total memory allocated after garbage collection
        long totalMemoryAfter = Runtime.getRuntime().totalMemory();
        System.out.println("Total memory allocated after garbage collection: " + totalMemoryAfter);
    }
}
