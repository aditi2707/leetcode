class SparseVector {

    int[] nums;
    
    SparseVector(int[] nums) {
        this.nums = nums;
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        
        int[] nums1 = nums;
        int[] nums2 = vec.nums;

        int ans = 0;

        for(int i = 0; i < nums1.length; i++){
            ans += nums1[i] * nums2[i];
        }

        return ans;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
