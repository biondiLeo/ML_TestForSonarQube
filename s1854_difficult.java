public class test2 {
    public void dead(int a, int b) {
        int c = 2;
        if (a < b) {
            if (b < a) {
                c = a + b;
            } else {
                c = a - b;
            }
            System.out.println(c);
        }
    }
}
