package java8;


/**
 * Reference:https://www.bilibili.com/video/BV1sE411P7C1?p=1
 *
 */

public class LambdaDemo1 {

    interface Printer {
        void print(String content);
    }

    public void printAction(String toBePrinted, Printer printer) {
        printer.print(toBePrinted);
    }

    public static void main(String[] args) {
        LambdaDemo1 lambdaDemo1 = new LambdaDemo1();
        String content = "hello world!";

//        Printer printer = new Printer() {
//            @Override
//            public void print(String content) {
//                System.out.println("Printed=> " + content);
//            }
//        };


//        Printer printer = (String val) -> {
//            System.out.println("Printed=>" + val);
//        };

//        Printer printer = (val) -> {
//            System.out.println("Printed=>" + val);
//        };

        Printer printer = val -> System.out.println("Printed=>" + val);

        lambdaDemo1.printAction(content, printer);

    }

}
