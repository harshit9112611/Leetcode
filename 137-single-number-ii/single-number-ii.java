class Solution {
    public int singleNumber(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        int i=1;
        while(i<nums.length) {
            if(nums[i]!=nums[i-1]) {
                return nums[i-1];
            }
            i+=3;
        }
        return nums[nums.length-1];
    }

     public void mergeSort(int[] nums, int start,int end) {
        if(start>=end) return;
        int mid=(start+end)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int[] arr=new int[end-start+1];
        int left=start;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=end) {
            if(nums[left]<=nums[right]) {
                arr[i]=nums[left];
                left++;
                i++;
            }
            else {
                arr[i]=nums[right];
                right++;
                i++;
            }
        }
        while(left<=mid) {
            arr[i]=nums[left];
            left++;
            i++;
        }
        while(right<=end) {
            arr[i]=nums[right];
            right++;
            i++;
        }
        for (int k = 0; k < arr.length; k++) {
            nums[start + k] = arr[k];
        }
    }
}