package solve;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 5, 5, 6};
        int res = 0;
        for(int x : arr){
            res = res ^ x;
        }

        int comp = res & -(res);
        System.out.println(comp);
        System.out.println(Integer.toBinaryString(comp));

    }
}