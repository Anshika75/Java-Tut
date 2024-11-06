package multiplication;

public class MultiplicationTableRunner {
    public static void main(String[] args){
        MultiplicationTable table = new MultiplicationTable();
        table.print();
        System.out.println();
        table.print(6);
        System.out.println();
        table.print(7, 10, 20);
    }
}
