// public class BestTimeToBuyAndSellStock{
//     public static void main(String[] args){
//         int[] arr = {7,1,5,3,6,4};
//         int n = arr.length;
//         int maxprofit = Integer.MIN_VALUE;
//         for(int i = 0; i<n; i++){
//             for(int j= i+1; j<n; j++){
//                 int profit = arr[j] - arr[i];
//                 if(profit > maxprofit){
//                     maxprofit = profit;
//                 }
//             }
//         }
//         System.out.println(maxprofit);
//     }
// }

// agar tum soch re ho ki max nikalo and then min nikalo and then minus krdo to answer aajayega to wo galat h bcoz manlo max element first pr h and min kahi last me to first rules break hojaenge 
// ex = 7 1 5 6 4
// Selling before buying is not allowed.

// the rules are that ki the buying price must be present first and the selling price must be in future means pehle kharidna h baad me bechna h and is trah bechna h ki max profit aajaye 



// for the optimal approch - 

// ex = 7 1 5 3 6 4 
// here assume that everyday is th selling day and basically yaha kya krna h har din meassume krna h ki aaaj mene ise kitne me bechna h jisse max profit aaajaye 

// for ex  - 6
// to is din me aake tume ye sochna h ki beeete hue pechle dino me konsa aise din h jis din tume ise kharidna chaiye tha taki agar tum 6 wale day par bechoge to profit will be the maximum 

// so that day   = 1 so profit = 6 -1 = 5 which is the maxprofit


public class BestTimeToBuyAndSellStock{
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        int minbuy = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for(int i = 1; i<n; i++){
            if(arr[i] > minbuy){
                int profit = arr[i] - minbuy;
                maxprofit = Math.max(maxprofit,profit);
            }
            // agar arr[i] bada nahi h minbuy se to
            minbuy = Math.min(minbuy,arr[i]);
        }
        System.out.println(maxprofit);
    }
    
}
