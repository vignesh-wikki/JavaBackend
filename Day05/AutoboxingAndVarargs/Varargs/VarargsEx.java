package Day05.AutoboxingAndVarargs.Varargs;

public class VarargsEx {
    public void sum(int... array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("The sum of is: " + sum);
    }

    public static void main(String[] args) {
        VarargsEx var = new VarargsEx();
        var.sum();
        var.sum(1, 2, 3);
        var.sum(10, 20, 40, 6, 890, 70);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var.sum(arr);

    }

}
