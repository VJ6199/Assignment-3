public class Division_2 {
    public static void main(String[] args) {
        divisor vijay = new divisor();
        vijay.divisor(2,1);
        vijay.divisor(20,10,8,4);
        vijay.divisor(3,1, 3);
    }
}
class divisor{
    void divisor(int x, int y){
        System.out.println("the division of two numbers = " + (x/y));
    }
    void divisor(int x, int y, int z){
        System.out.println("the division of three decimal numbers = " + ((x/y)/z));
    }
    void divisor(int x, int y, int z, int w) {
        System.out.println("the division of four decimal numbers = " + ((x / y) / (z / w)));
    }
}