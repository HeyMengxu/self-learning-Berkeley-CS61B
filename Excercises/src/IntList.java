public class IntList {
	public int first;
	public IntList rest;

	public IntList(int first, IntList rest) {
		this.first = first;
		this.rest = rest;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if(rest == null){
			return 1;
		}else{
			return 1+rest.size();
		}

	}

	/** Return the size of the list using no recursion! */
	// so the part that i am not familiar with is creating the Pointer variable
	//notice that you should count from 0
	public int iterativeSize() {
		IntList p = this;

		int i=0;
		while(p != null){
			i++;
			p= p.rest;

		}

		return i;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		int value=0;
		int j=0;
		IntList p= this;
		if(i==0){
			value= first;
		}while(j<i){
			p=p.rest;
			value=p.first;
			j++;
		}
		return value;
	}

	//recursive
	public int get2(int i) {

		if(i==0){
			return first;
		}else{
			return rest.get2(i-1);
		}

	}


	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);



		System.out.println(L.size());
		System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
		System.out.println(L.get2(0));

	}
} 