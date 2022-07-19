public class Division_1 {
    public static void main(String[] args) {
        divi vijay = new divi();
        vijay.divi(2,1.5f);
        vijay.divi(30.5f,10);
        vijay.divi(3,1.5f);
    }
}
class divi{
    void divi(int x, float y){
        System.out.println("the division of two numbers = " + (x/y));
    }
    void divi(float x, int y){
        System.out.println("the division of two decimal numbers = " + (x/y));
    }

    }