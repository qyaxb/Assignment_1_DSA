public class SelectionSortALU {
    public static void seletionSort(int[] array){
        int count = array.length;
        for(int i = 0;i < count; i++){
            int minIdx = i;
            for(int j = i+1;j < count;j++)
            {
                if(array[j] < array[minIdx]){
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    public static void printResult(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
