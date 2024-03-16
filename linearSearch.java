class linearSearch{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,3453,5,345,3543,5,43,5,34};
        int target=7;
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                System.out.println("Target found at "+i+" position");
            }
        }
    }
}