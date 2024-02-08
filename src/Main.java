public class Main {

    void area(int a){
        int area = a*a;
        System.out.println("area of square is "+area );
    }
    void area(int l , int b){
        int area = l*b;
        System.out.println("area of rectangle is "+area);
    }
    void area(float r){
        float area = (float)(Math.PI*r*r);
        System.out.println("area of circle is "+area);
    }

    public static void main(String[] args) {
        Main sc = new Main();
        sc.area(6);
        sc.area(12,10);
        sc.area(5f);
    }
}
