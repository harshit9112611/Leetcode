class Solution {
    public int findContentChildren(int[] g, int[] s) {
        mergeSort(g,0,g.length-1);
        mergeSort(s,0,s.length-1);
        int l=0;
        int r=0;
        while(l<g.length && r<s.length) {
            if(g[l] <= s[r]) {
                l++;
            }
            r++;
        }
        return l;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if(low>=high) {
            return;
        }
        int mid=(low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1,high);
        merge(nums,low,mid,high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] arr= new int[high-low+1];
        int left=low;
        int i=0;
        int right=mid+1;
        while(left<=mid && right<=high) {
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

        while(right<=high) {
            arr[i]=nums[right];
            right++;
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            nums[low + k] = arr[k];
        }
    }
}