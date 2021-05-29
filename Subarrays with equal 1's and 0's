import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int n = inp.nextInt();
					  int [] arr = new int[n];
					  for (int i=0;i<n;i++){
						  arr[i] = inp.nextInt();
					  }
					  System.out.println(count(arr));
	}
	public static long count(int arr[]){
		HashMap<Integer,Integer> hm1 = new HashMap<>();
		hm1.put(0,1);
		long sum = 0;
		int result = 0;
		for (int i : arr){
			if (i==0){
				result+=-1;
			}else{
				result+=1;
			}
			if (hm1.containsKey(result)){
				sum+=hm1.get(result);
				hm1.put(result,hm1.get(result)+1);
			}else{
				hm1.put(result,1);
			}
		}
		return sum;
	}
}
