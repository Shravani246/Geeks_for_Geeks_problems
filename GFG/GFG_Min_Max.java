class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> result=new ArrayList<>();
        int minVal=arr[0];
        int maxVal=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]<minVal)
            {
                minVal=arr[i];
            }
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }
        result.add(minVal);
        result.add(maxVal);
        return result;
        
    }
}s