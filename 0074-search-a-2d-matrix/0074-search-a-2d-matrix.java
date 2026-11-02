class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;
        int m=arr[0].length;

        int low=0;
        int high=n*m-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int midelement=arr[mid/m][mid%m];
            if(midelement==target)
            {
                return true;
            }
            if(target>midelement)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

            
        }
        return false;
    }
}