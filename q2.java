public class q2 {
    private String name;

    public q2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        q2 obj1 = new q2("Object 1");
        q2 obj2 = new q2("Object 2");
        q2 obj3 = new q2("hello");

        // System.out.println("Objects created: " + obj1.name + ", " + obj2.name);
        System.out.println("Objects created: " + obj3.name );
      

      
        obj1 = obj2;

       

        
        System.gc();
       
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
    }
}
