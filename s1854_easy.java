public class test {    
      public void dead()
      {
            int x=5;
            int y=10;
            int z;
            int w; 
            y=x*x*y;
            System.out.println(y);
            x=5;  // dead store
            y=10; // dead store
            z=20; // dead store
       }
}
