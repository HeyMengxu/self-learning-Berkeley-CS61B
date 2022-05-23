public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList B = new IntList(L.first+x, null);
        B.rest = new IntList(L.rest.first+x, null);
        B.rest.rest = new IntList(L.rest.rest.first+x, null);
        return B;

    }

    public static IntList incrList2(IntList L, int x) {
        /* Your code here. */
        IntList B = new IntList(L.rest.rest.first+x, null);
        B = new IntList(L.rest.first+x, B);
        B = new IntList(L.first+x, B);
        return B;

    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */

        L.first = L.first + x;
        if(L.rest == null)  return L;

        dincrList(L.rest, x);

//        if(L.rest == null){
//            L.first = L.first + x;
//        }else{
//            L.first = L.first +x;
//            L = L.rest;
//        }
        return L;
    }

    public static IntList dincriList2(IntList L, int x){

        if(L.rest == null){
            L.first = L.first +x;
            return L;
        }else{
            L.first = L.first +x;
            dincriList2(L.rest, x);
            return L;
        }
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
         System.out.println(L.get(1));
         System.out.println(L);
         System.out.println(incrList(L, 3).get(2));
         System.out.println(dincrList(L, 3).get(2));
         System.out.println(dincriList2(L, 3).get(2));
    }
}