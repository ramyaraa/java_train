package bro_1;

public class inserting {
    //create a array that have 5 number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //inserting 6 at index 2
        int[] newarr = new int[arr.length + 1];
        int index = 2;
        int value = 6;
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newarr[i] = arr[i];
            } else {
                newarr[i + 1] = arr[i];
            }
        }
        newarr[index] = value;
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
