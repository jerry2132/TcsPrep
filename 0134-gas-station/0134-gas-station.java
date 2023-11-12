class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //int [] arr = new int[gas.lenght];

        int totalgas = 0;
        int currentgas = 0;
        int startstation = 0;

        for(int i=0;i<gas.length;i++)
        {
           int gasgain = gas[i]-cost[i];
            totalgas+=gasgain;
            currentgas+=gasgain;

            if(currentgas<0)
            {
                currentgas = 0;
                startstation = i+1;
            }

           
        }
         return totalgas < 0 ? -1 : startstation;
    }
}