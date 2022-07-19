public class Division_0 {
    public static void main(String[] args) {
        div vijay = new div();
        vijay.div(2,1);
        vijay.div(30,10);
        vijay.div(3.5f,1.5f);
}
}
class div{
    void div(int x, int y){
        System.out.println("the division of two numbers = " + (x/y));
    }
    void div(float x, float y){
        System.out.println("the division of two decimal numbers = " + (x/y));
    }
}