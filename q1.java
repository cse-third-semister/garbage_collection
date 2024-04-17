public class q1 {
    private String name;

    public q1(String name) {
        this.name = name;
    }

    public static void show() {
        q1 obj1 = new q1(" Object 1");
        obj1.display();
    }

    public void display() {
         new q1(" Object 2");
    }

    public static void main(String[] args) {
        q1 obj3 = new q1("Main Object");
        obj3.show();

        
        System.out.println("Main Object will be garbage collected: " + obj3.name);
        System.gc();
        
       
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + this.name);
    }
}
