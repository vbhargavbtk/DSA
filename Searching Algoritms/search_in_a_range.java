public class search_in_a_range {
    
    static void search(int start,int end,int target,int[] arr){
        for(int i = start;i <= end ;i = i+1){
            if(arr[i] == target){
                System.out.println("Element Found at index "+ i);
                return;
            }
            
        }
        System.out.println("Element not Found ");
    }
    
    
    public static void main(String[] args) {
        int[] arr = {87,578,6789,3456,962};
        int start = 2 ,end = 4 ,target = 789;
        
        if(arr.length == 0){
            System.out.println("Array is empty");
        }
        else{
            search(start,end,target,arr);
        }
        
    }
}
