public class Search {
    public static int search(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<nums[start]){
                if(target>nums[mid]&&target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>=nums[start]&&target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={5,1,2,3,4};
        System.out.println(search(arr,4));
    }
}
