import java.util.*;


public class Driver{
   
    //implement method for algorithm 1 

        public int algorithm1(Vector<Integer> n){
                int best = 0;
                for(int i = 0; i<n.size()-1; i++){
                    for(int j = i; j<n.size()-1; j++){
                        int sum = 0;
                        for(int k = i; k<j;k++){
                            sum += n.elementAt(k);                            
                        if(sum > best)
                                best = sum;
                        }
                    }
                }
                return best;
                        
        }
    //algorithm 2, non-static method
	public int algorithm2(Vector<Integer> v){

		int best = 0;
		for (int i= 0; i< v.size(); i++){
			int sum = 0;
			for (int j =i; j< v.size(); j++) {
				sum+=v.elementAt(j);
				if (sum > best)
					best = sum;
			}
		}
		return best; // 0 is possible 
	}

    //implement method for algorithm 3
        /*set best_sum to 0
        set current_sum to 0
        for j = 0 to N-1 {
            add V[j] to current_sum
            if current_sum is less than 0,set the current_sum to 0
            otherwise if current_sum is greater than the best_sum
            save current_sum as the best_sum
        }
* */
        public int algorithm3(Vector<Integer> n){
            int best = 0;
            int sum = 0;
            for(int j = 0; j<n.size()-1;j++){
                sum+=n.elementAt(j);
                if(sum<0)
                    sum = 0;
                else if(sum>best)
                    best = sum;
                    
            }
            return best;
            
        }

	public static void main (String[] args){

		Driver driver = new Driver();
		Random rnd        = new Random(System.currentTimeMillis());
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner in = new Scanner(System.in);
		int N;


		System.out.print("Enter the size of the data set N = ");
		N = in.nextInt();
	
		
		for (int i=0; i<N; i++){ // generate size N vector
			if (rnd.nextDouble() < 0.5) // positive integers
				v.add(1 + rnd.nextInt(100));
			else			 // negative integers
				v.add((1 + rnd.nextInt(100)) * -1);
			System.out.println(v.get(i));
		}
		

		long elapsedTime = 0; // time taken for a single run
		long startT = System.nanoTime(); //start time
		int sum = driver.algorithm3(v); // run one of the algorithms
		long endT = System.nanoTime(); //end time
		elapsedTime = (endT - startT); // time taken for a single trial 	
		System.out.println(elapsedTime + "ns");
		
	}
}




				
