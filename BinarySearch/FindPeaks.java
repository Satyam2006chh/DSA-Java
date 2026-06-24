// finding the peaks inside the arr leetocd no - 2951


class FindPeaks {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer>result = new ArrayList<>();
        int n = mountain.length;
        for(int i = 1; i<n-1; i++){
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]){
                // means peak
                
                result.add(i);
            }
        }
        return result;
    }
}
