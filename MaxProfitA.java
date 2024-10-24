

public class MaxProfitA
{
        
    // Main method to test the  algorithm
    public static void main(String[] args) 
    {
        if(args.length < 3)
        {
            System.out.println("Provide the price array and k as command line argument, and the arry must contain at least two elements");
            return;
        }
        
        int pL = args.length - 1;
        int dL = (pL * pL - pL) / 2;
        int totalProfits = 0;
        int k = Integer.parseInt(args[args.length - 1]);
        int trades = 0;
        System.out.println(k);;
        int[] price = new int[pL];
        int[] priceDelta  = new int[dL];
        boolean[] dayVisited = new boolean[pL];
        for (int i = 0; i < pL; i++)
        {
            price[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < dL; i++)
        {
            for (int x = 0; x < pL - 1; x++)
            {
                for (int y = x + 1; y < pL; y++ )
                {
                    priceDelta[i] = price[y] - price[x];
                }
            }
        }

        mergeSortDescending(priceDelta);

        for (int i = 0; i < k; i++)
        {
            for (int x = 0; x < pL - 1; x++)
            {
                for (int y = x + 1; y < pL; y++)
                {
                    if (priceDelta[i] == price[y] - price[x] && !dayVisited[x] && !dayVisited[y])
                    {
                        totalProfits += priceDelta[i];
                        System.out.println("Day " + (x + 1) + " and day " + (y + 1));
                        trades++;
                        dayVisited[x] = true;
                        dayVisited[y] = true;
                        break;
                    }
                }
                if (trades == k)
                {
                    break;
                }
            }
        }
        System.out.println("Max Profit : " +totalProfits);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Static method to sort an array in decreasing order using merge sort
        public static void mergeSortDescending(int[] arr) 
        {
            if (arr == null || arr.length < 2) return;  // Edge case: Array is empty or has 1 element
            mergeSort(arr, 0, arr.length - 1);  // Call helper method with full array range
        }
    
        // Helper method to perform merge sort recursively
        private static void mergeSort(int[] arr, int left, int right) 
        {
            if (left < right) {
                int mid = left + (right - left) / 2;  // Find the middle index
                
                // Recursively sort both halves
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
    
                // Merge the sorted halves in decreasing order
                merge(arr, left, mid, right);
            }
        }
    
        // Method to merge two sorted halves in decreasing order
        private static void merge(int[] arr, int left, int mid, int right) 
        {
            // Calculate sizes of two subarrays to be merged
            int n1 = mid - left + 1;
            int n2 = right - mid;
    
            // Create temporary arrays
            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];
    
            // Copy data into the temporary arrays
            for (int i = 0; i < n1; i++) 
            {
                leftArr[i] = arr[left + i];
            }
            for (int j = 0; j < n2; j++) 
            {
                rightArr[j] = arr[mid + 1 + j];
            }
    
            // Merge the two subarrays back into the original array in decreasing order
            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) 
            {
                if (leftArr[i] >= rightArr[j]) 
                {
                    arr[k] = leftArr[i];
                    i++;
                } 
                else 
                {
                    arr[k] = rightArr[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of leftArr, if any
            while (i < n1) 
            {
                arr[k] = leftArr[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of rightArr, if any
            while (j < n2) 
            {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
}