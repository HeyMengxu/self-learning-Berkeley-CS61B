package hw0;

public class CompareNumArray {
  public static void main(String[] args) {
	  int[] m= new int[] {9,2,15,2,22,10,6};
	  System.out.println(Max(m));
	  
	  System.out.print(Max2(m));
  }
  
  public static int Max(int[] m) {
	  int max=0;
	  int i=0;
	  while(i<= m.length-1) {
		  if(max < m[i]) {
			  max= m[i];
	   }
		  i++;
	  } 
	return max;
	  
  }
  
  
  public static int Max2(int[] m) {
	  int max=0;
	  for(int i=0;i<m.length;i++) {
		  if(max< m[i]) {
			  max= m[i];
		  }
	  }
	  return max;
  }
}
