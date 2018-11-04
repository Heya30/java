/*
 * Exercise 1-1
 */
public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 4, 3, 2, 4, 2};
        int[] array2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 3, 9};
        int[] array3 = {1, 1, 1, 1};
        showNonDuplicateArray(array1);
        System.out.printf("\n");
        showNonDuplicateArray(array2);
        System.out.printf("\n");
        showNonDuplicateArray(array3);


    }

    /*
     * Remove duplicate elements in an array
     * and print it in the standard output
     * @param a the input array
     */
    public static void showNonDuplicateArray(int[] a) {
        // TODO
        int flag = 0;
        int i ;
        int num = 0;
        int count = 0;
        int[] array_temp;
        array_temp = new int[a.length - 1];
        for (i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] == a[i]) {
                    flag = 1;
                    count++;
                }
            }
            if (flag == 0) {
                array_temp[num] = a[i];
                num++;
            }
            flag = 0;
        }
        for (i  = 0; i <num; i++)
            System.out.printf("%d", array_temp[i]);

    }
}


