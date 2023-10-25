public class BubbleSortALU {
    public static void BubbleSortALU(int[] array){
        int number;
        for(int i = 0;i < array.length - 1;i++)
        {
            for(int j = 0;j < array.length -1;j++)
            {
                if(array[j] > array[j+1])
                {
                    number = array[j];
                    array[j] = array[j+1];
                    array[j+1] = number;
                }
            }
            System.out.println(array[i]);
        }

    }
    public static void printResult(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\nRuntime: "+System.currentTimeMillis());
    }
}
