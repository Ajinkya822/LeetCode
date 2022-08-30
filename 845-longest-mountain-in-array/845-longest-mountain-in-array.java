class Solution {
    public int longestMountain(int[] arr) {
    int i=1;
    int max=0;
    while(i<arr.length-1) {
      if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
        //find peak element
        //array[i] is a peak element and now let's check length of this peak ele
        int tempCount=0;
        int leftIndex=i-1;
        int rightIndex=i+1;
        while(leftIndex>0) {
          //traverse left
          //keep track of leftIndex
          if(arr[leftIndex]>arr[leftIndex-1]) {
            leftIndex--;
          }
          else {
            break;
          }
        }
        while(rightIndex<arr.length-1) {
          //traverse right
          if(arr[rightIndex]>arr[rightIndex+1]) {
            rightIndex++;
          }
          else {
            break;
          }
        }
        if(rightIndex-leftIndex+1>max) {
          max=rightIndex-leftIndex+1;
        }
        i=rightIndex;
      }
      else {
        i++;
      } 
    }
    return max;
    }
}