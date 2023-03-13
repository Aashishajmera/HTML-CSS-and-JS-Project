public class FindValue {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 5, 3, 5, 6, 7, 8 };

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] < arr.length && arr[i + 1] < arr.length) {
                System.out.println(arr[i]);
                break;
            }

        }

        System.out.println(arr.length);     // array ka size dekhne ke lie 
       
    }
}
