package se.hiq.kodarskolan;

public class Optimized {


    public static void main(String[] args) {

        /*
         * XOR-swap. Technically more memory-efficient than regular swap, since
         * it doesn't require an intermediate variable. Totally unreadable,
         * though! Also, slower.
         */
        int a = 5;
        int b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        /*
         * Regular swap. Readable, especially by the coder that has to maintain
         * the codebase!
         */
        a = 5;
        b = 10;
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}