 class Sum {

    void SumOfArray() {

        int[] arr = { 2, 4, 6, 9, 9 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.println(sum);
        System.out.println("done");
        System.out.println();
    }

    void ArrayOfMax() {
        int[] arr2 = { 2, 4, 7, 3, 12, 5 };

        int ans = 0;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] > ans) {
                ans = arr2[i];
                System.out.println(ans = arr2[i]);
            }

        }

        System.out.println("max value is:" + ans);

    }

    void SearchOfArray() {

        int[] arr3 = { 2, 4, 7, 3, 12, 5 };
        int x = 7;

        int ans = -1;

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == x) {
                ans = i;
                System.out.println(+ans);
            }
        }

        System.out.println(" found " + x + " index is " + ans);

    }

}

public class ArraySum {
    public static void main(String[] args) {

        Sum obj1 = new Sum();
        obj1.SumOfArray();
        obj1.ArrayOfMax();
        obj1.SearchOfArray();

    }
}

