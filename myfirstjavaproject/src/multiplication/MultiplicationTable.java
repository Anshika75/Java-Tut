package multiplication;

public class MultiplicationTable { 
    // 5 * 1
    // Default function
    void print(){   
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d ", 5, i, 5 * i).println();;
        }
    }

    // generic function
    void print(int table){   
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d ", table, i, table * i).println();
        }
    }

    // customised function
    void print(int table, int from, int to){   
        for(int i = from; i <= to; i++){
            System.out.printf("%d * %d = %d ", table, i, table * i).println();
        }
    }
}
