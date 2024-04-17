public class q4 {
    private String name;

    public q4(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating an anonymous object
        new q4("Anonymous Object");

        // Explicit invocation of garbage collector
        System.gc();
        System.out.println("Invoked garbage collector");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
    }
}
