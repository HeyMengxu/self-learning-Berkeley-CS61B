public class SLList {
    private static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    public IntNode sentinel;
    public int size;

//    to create a sentinel node so that whenever it exists, the first node is always at sentinel.next
    public SLList(){
        size = 0;
        sentinel = new IntNode(17,null);
    }

    public SLList(int x){
        size= 1;
        sentinel = new IntNode(17,null);
        sentinel.next = new IntNode(x, null);
    }

    public void addFirst(int x){
        size= size+1;
        sentinel.next = new IntNode(x, sentinel.next);
    }

    public int getFirst(){
        return sentinel.next.item;
    }



    public IntNode getNode(int i){
        if(i==0){
            return sentinel.next;
        }else{
            return getNode(i-1);
        }
    }

    public void addLast(int x){
        size = size +1;
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }

    // ** important note: the private static method here is an often used helper method
    // it returns the size of the list that starts with P
    // Basically it strips off the SLList to the original naked linked list structure

    private static int size(IntNode p){
        if(p.next == null){
            return 1;
        }
        return 1+size(p.next);
    }
    public int size(){
        return size(sentinel.next);
    }


// 注意，这里犯了一个经典错误， first = first.next, 会在遍历的时候以此把node删除；虽然这样会得出正确的答案，但是list的内容被删除了
// 这里的解决方法，还是要新建一个pointer


//    public int size(){
//        IntNode p = first;
//        if(p.next == null){
//            return 1;
//        }else{
//            p = p.next;
//            return size()+1;
//        }
//    }
    public int size2(){
        IntNode p = sentinel;
        int i=0;
        while(p.next != null){
            i++;
            p= p.next;
        }
        return i;
    }

    public static void main(String[] args){
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        //System.out.println(L.first.next.next.next.item);
        //System.out.println(L.size());
        System.out.println(L.size2());
        System.out.println(L.size());
    }



}
