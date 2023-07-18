import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionChecks {
    private Collection<String> myCollection;

    public CollectionChecks() {
        myCollection = new ArrayList<>();
    }

    public void addItem(String item) {
        myCollection.add(item);
    }

    public static void main(String[] args) {
        CollectionChecks collectionChecks = new CollectionChecks();
        
        collectionChecks.addItem("Elemento 1");
        collectionChecks.addItem("Elemento 2");
        
        //== 0
        if (collectionChecks.myCollection.size() == 0) 
        {
            System.out.println("La collezione è vuota");
        }

        //0 ==
        if (0 == collectionChecks.myCollection.size()) 
        {
            System.out.println("La collezione è vuota");
        }
        
        //0 !=
        if (0 != collectionChecks.myCollection.size()) 
        {
            System.out.println("La collezione non è vuota");
        }

        //!= 0
        if (collectionChecks.myCollection.size() != 0) 
        {
            System.out.println("La collezione non è vuota");
        }

        //< 1
        if (collectionChecks.myCollection.size() < 1) {
            System.out.println("La dimensione della collezione è inferiore a 1");
        }

        // 1 >
        if (1 > myCollection.size()) 
        {
            System.out.println("La dimensione della collezione è inferiore a 1");
        }
        
        //0 >=
        if (0 >= collectionChecks.myCollection.size()) 
        {
            System.out.println("La dimensione della collezione è maggiore o uguale a 0");
        }

        // <= 0 
        if (myCollection.size() <= 0) 
        {
            System.out.println("La dimensione della collezione è maggiore o uguale a 0");
        }
    }
}
