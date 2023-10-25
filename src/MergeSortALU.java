public class MergeSortALU {
    public static void mergeSort(int[] arr, int l, int m, int r){
        //can tim kich thuoc cua 2 mang ban dau duoc tach
        //l: left - m : middle - r : right
        int n1 = m - l + 1;
        int n2 = r - m;
        //mang con thu nhat : arr[l...m]
        //mang con thu 2: arr[m+1...r]
        //tao cac mang con ben trai va ben phai
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        //copy du lieu vao 2 mang con trai - phai vua tao
        for(int i = 0; i < n1; i++)
        {
            Left[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++)
        {
            Right[j] = arr[m + j + 1];
        }
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;
            }else {
                arr[k] = Right[i];
                j++;
            }
            k++;

        }
        while (i < n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
    }

    public static void sort(int[] arr,int l, int r){
        if(l < r){
            int m = l + (r - l)/2;
            //de quy lai
            sort(arr, l, m);
            sort(arr,m + 1, r);
            //goi ham merge da viet

            mergeSort(arr,l, m, r);

        }
    }
    public static void printResult(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
