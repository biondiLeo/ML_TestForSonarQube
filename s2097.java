public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        MyClass mc = (MyClass) obj;  
        return this.value == mc.value;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        String obj2 = "Hello";

        System.out.println(obj1.equals(obj2));
    }
}
