class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> seen  = new HashSet<>();
        
        while (n!=1 && !seen.contains(n)){

            seen.add(n);

            n = sum(n);
        }

        return n==1;
    }

    public int sum(int number){

         int sum = 0;
        while(number>0){
            int digit  = number%10;
            sum += digit *digit;
            number = number/10;
        }
        
        return sum;

    }
}