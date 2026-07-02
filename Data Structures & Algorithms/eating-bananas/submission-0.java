class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;

        int end = 0;

        int result = end;
        for(int pile : piles){
            end = Math.max(end, pile);
        }

        

        while(start <= end){
            int mid = start + (end - start)/2;

            if(canEatPiles(mid, piles, h)){
                result = mid;
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }

        return result;
    }

    public static boolean canEatPiles(int speed, int[] piles, int h){
        long hours = 0;

        for(int pile : piles){
            hours += (pile + speed - 1)/speed;
        }

        return hours <= h;
    }
}
