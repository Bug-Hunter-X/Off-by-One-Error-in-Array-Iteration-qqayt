public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        // To print the last valid index (index 4)
        System.out.println(arr[arr.length -1]);
    }
}