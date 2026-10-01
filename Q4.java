public class Q4{
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial visitors = " + visitors);

        System.out.println("Prefix increment = " + (++visitors));
        System.out.println("After prefix = " + visitors);

        System.out.println("Postfix increment = " + (visitors++));
        System.out.println("After postfix = " + visitors);

        System.out.println("Prefix decrement = " + (--visitors));
        System.out.println("Postfix decrement = " + (visitors--));
        
    }
}