import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int n = inp.nextInt();
					  int k = inp.nextInt();
					  int [] arr = new int[n];
					  HashMap<Integer,Integer> hm1 = new HashMap<>(); 
					  int sum=0, count=0, j=0, x;
					  for (int i=0;i<n;i++){
						  int num = inp.nextInt();
						  arr[i] = num;
						  x = arr[j];
						  if (hm1.containsKey(num)){
							  if (hm1.get(num)==0){
								  sum++;
							  }
							  hm1.put(num,hm1.get(num)+1);
							  count++;
						  }else{
							  hm1.put(num,1);
							  sum++;
							  count++;
						  }
						  if (count==k){
							  System.out.print(sum+" ");
							  count--;
							  if (hm1.get(x)==1){
								  sum--;
								  hm1.put(x,0);
							  }else{
								  hm1.put(x,hm1.get(x)-1);
							  }
							  j++;
						  }
					  }
	}
}
