public class Main {
    static int count=0;

    Main(){
        count++;

    }

    public static void main(String[] args) {
       Main sc = new Main();
        Main sc1 = new Main();
        Main scj= new Main();
        System.out.println("total number of object are "+count);
    }
}
