import java.util.Arrays;

class MergeArraySolution {

    public static void main(String[] args) {
        int[] nums1={};
        int[] nums2={2,3};
        System.out.println(Arrays.toString(merge(nums1, 0, nums2, 2)));
        
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            return nums2;
        }else if(n==0){
            return nums1;
        }
        
        for(int i=m; i < m+n;i++){
            nums1[i]=nums2[i-m];
        }

        Arrays.sort(nums1);
        return nums1;
        // for(int i=0,j=0 ; i<m && j<n; i++, j++){
        //     if (nums1[i] > nums2[j]){
        //         return nums1;
        //     }
            
        // }
        // return null;
        
    }
}