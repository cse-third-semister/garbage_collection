public class q3 {
    private String name;

    public q3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        q3 obj = new q3("Object 1");
       

      
        obj = null;
      

       

        // Explicit invocation of garbage collector
        System.gc();
        
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + this.name);
    }
}
