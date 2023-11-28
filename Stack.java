class Stack
{
	private int [] items;
	private int top =0;
	public synchronized void push(int n)
	{
	    if(isFull())
	    {
	        int [] newArray = new int [2*items.length];
	        System.arraycopy(items,0,newArray,0,items.length);
	        items= newArray;
	    }
	    items [top]= n;
	    top++;
	}
	public synchronized int pop()
	{
	    int topItem = items[top-1];
	    top--;
	    return topItem;
	    
	}
	public synchronized boolean isEmpty()
	{
	    return (top==0);
	}
	public synchronized int top()
	{
	    return items[top];
	}
	public synchronized boolean isFull()
	{
	    if(top==items.length) return true;
	    else return false;
	}
}