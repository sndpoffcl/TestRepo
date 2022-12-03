package inheritance;

public class Main {
    public static void main(String[] args) {
        Object obj = 1;
        Integer i = (Integer) obj;
        System.out.println(i);

        Object obj1 = new Object();
        A a = (A)obj1;
        a.doSomething();
        // new changes
        // new changes f3
    }
}

