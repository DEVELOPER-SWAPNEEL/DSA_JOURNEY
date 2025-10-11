public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,44,55,66,77,88};
        int target=66;
        int s,e;
        System.out.println(BS(arr,target,s=0,e=arr.length-1));

    }
    static int BS(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return BS(arr,target,s,e=m-1);
        }
        return BS(arr,target,s=m+1,e);
    }
}
