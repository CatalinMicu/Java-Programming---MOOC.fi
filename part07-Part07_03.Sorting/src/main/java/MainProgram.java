
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
        System.out.println(array);
    }
    
    public static int smallest(int[] array) {
        int pivot = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                pivot = array[i];
            }
        }
        return pivot;
    }
    
    public static int indexOfSmallest(int[] array) {
        int numar = MainProgram.smallest(array);
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numar) {
                index = i;
            }   
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int pivot = array[startIndex];
        int index = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < pivot) {
                pivot = array[i];
            }
        }
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == pivot) {
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int pivot = array[index1];
        array[index1] = array[index2];
        array[index2] = pivot;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pivot = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, pivot, i);
        }
    }
    
   
    
    
    

}