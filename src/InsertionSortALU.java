public class InsertionSortALU {
    public static void insertionSort(int[] array){
        for(int i = 1;i < array.length;i++)
        {
            int key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key )
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    public static void printResult(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
