class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        
        List<List<Integer>> listof = new ArrayList<>();

        if(n<=2){

            return listof;
        }

        boolean[] boo = new boolean[n];
        //int [] arr = new int[n/2];

        for(int i=2;i<n;i++){

            boo[i] = true;
        }
        //  for(int i=0;i<n;i++){
        //     System.out.print(boo[i]);
        // }


        for(int i=2;i*i<n;i++){

            if(boo[i]){

                for(int j=i*i; j<n ; j+=i){

                    boo[j] = false;
                }
            }
            
        }

        // System.out.println();
        // for(int i=0;i<n;i++){
        //     System.out.print(boo[i]);
        // }

        // for(int i=0; i<n ;i++){

        //     if(boo){
        //         arr[]
        //     }
        // }
        int y=0;

        for(int x= 2; x <= n/2; x++){
            y=n-x;

            if(boo[x] && boo[y]){

                listof.add(List.of(x,y));
            }
        }

        return listof;
    }
}


    // int y = 0;

    //     for(int x=2 ; x <=n/2 ; x++){
            
    //         y = n-x;

    //         if(isPrime(x) && isPrime(y)){
    //                 List<Integer> pair = new ArrayList<>();
    //                 pair.add(x);
    //                 pair.add(y);


    //                 listof.add(pair);
    //         }

    //     }
    //     return listof;
    // }


    //     public boolean isPrime(int num){

    //         if(num <= 1)
    //             return false;

    //             for(int i =2 ; i<= Math.sqrt(num); i++){

    //                 if(num % i == 0)
    //                     return false;
    //             }

    //             return true;
