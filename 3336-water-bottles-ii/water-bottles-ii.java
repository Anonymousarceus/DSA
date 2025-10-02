class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totB=numBottles;
        while(numBottles>=numExchange){
            numBottles-=numExchange-1;
            ++numExchange;
            ++totB;
        }

        return totB;
    }
}