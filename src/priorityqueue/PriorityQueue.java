package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueue  {
    private ArrayList<Integer> heap;

    public PriorityQueue() {
        heap=new ArrayList<>();
    }

    public void offer(int item)
    {
        heap.add(item);
        int child=heap.size()-1;
        int parent=(child-1)/2;
        shiftUp(child,parent);
    }
    public Integer poll()
    {
        if(isEmpty())return null;
        int result=heap.get(0);
        if(heap.size()==1)
        {
            heap.remove(0);
            return result ;
        }
        shiftDown();
        return result;
    }
    public Integer peak()
    {
        if(!isEmpty())return heap.get(0);
        return null;
    }
    public boolean isEmpty()
    {
        return heap.isEmpty();
    }
    private void shiftUp(int child , int parent) {
        //parent bigger than child then swap between them
        while (parent >= 0 && heap.get(parent) > heap.get(child)) {
            Collections.swap(heap,parent,child);
            child=parent;
            parent=(child-1)/2;
        }
    }
    private void shiftDown()
    {
        //remove the last item and put it in the first position
        heap.set(0,heap.remove(heap.size()-1));
        int parent=0;
        while(true)
        {
            int leftChild=2*parent+1;
            int rightChild=leftChild+1;

            if(leftChild>=heap.size())break;

            int minChild=rightChild<heap.size()? heap.indexOf(Math.min(heap.get(leftChild),heap.get(rightChild))) : leftChild;

            if(heap.get(parent) > heap.get(minChild))
            {
                Collections.swap(heap,parent,minChild);
                parent=minChild;
            }
            else break;
        }
    }
}
