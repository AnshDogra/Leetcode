class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<=arr[hi]){ // i am in right sorted array
              if(target>arr[mid] && target<=arr[hi]) lo=mid+1;
              else hi=mid-1;
             }
            else{//i am im left sorted array
            if(target>=arr[lo] && target<arr[mid]) hi=mid-1;
            else lo=mid+1;
            }
        }
        return -1;
    }
}