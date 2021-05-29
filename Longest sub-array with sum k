import java.io.*; // for handling input/output 
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int t = inp.nextInt();
					  for (int a=0;a<t;a++){
						  int n = inp.nextInt();
						  int k = inp.nextInt();
						  int [] arr = new int[n];
						  for (int i=0;i<n;i++){
							  arr[i] = inp.nextInt();
						  }
						  HashMap<Integer,Integer> hm1 = new HashMap<>();
						  hm1.put(0,0);
						  int sum = 0;
						  int diff;
						  int max = 0;
						  for (int i=0;i<n;i++){
							  sum+=arr[i];
							  diff = sum-k;
							  if (!hm1.containsKey(sum)){
								  hm1.put(sum,i+1);
							  }
							  if (hm1.containsKey(diff)){
								  max = Math.max(max,i+1-hm1.get(diff));
							  }
						  }
						  System.out.println(max);
					  }
	}
}
