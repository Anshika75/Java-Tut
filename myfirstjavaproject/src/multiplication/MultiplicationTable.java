package multiplication;

public class MultiplicationTable { 
    // 5 * 1
    // Default function
    void print(){   
        print(5);
    }

    // generic function
    void print(int table){   
        print(table, 1, 10);
    }

    // customised function
    void print(int table, int from, int to){   
        for(int i = from; i <= to; i++){
            System.out.printf("%d * %d = %d ", table, i, table * i).println();
        }
    }
}
