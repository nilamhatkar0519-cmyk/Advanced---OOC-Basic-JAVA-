public class SortNum {
    public static void main(String[] args) {

        int[] arr = {2, 45, 8, 28, 56, 93, 10, 33, 19, 5};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending sorted list:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
