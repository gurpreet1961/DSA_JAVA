public class insertionSort {
    public static void main(String[] args) {
        
        int[] a ={1,4,3,2,8,2};
        for (int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && temp<a[j]){
              
                    a[j+1] = a[j];
                    j--;

            }
            a[j+1] = temp;
        }
        for(int ele:a){
            System.out.println(ele);
        }
    }
    
}
