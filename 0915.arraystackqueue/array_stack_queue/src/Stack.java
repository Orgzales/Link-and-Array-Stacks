import java.nio.BufferUnderflowException;

public class Stack<E>
{
    private Object[] mCollection;
    private int mTopIdx;

    public Stack(int capacity)
    {
        mCollection = new Object[capacity];
        mTopIdx = -1;
    }

    public void push(E element)
    {
        if (mTopIdx >= mCollection.length-1)
            throw new StackOverflowError();

        mTopIdx++;

        mCollection[mTopIdx] = element;
    }

    public E pop()
    {
        if (isEmpty())
            throw new BufferUnderflowException();

        E element = (E)mCollection[mTopIdx];
        mTopIdx--;

        return element;
    }

    public E top()
    {
        if (isEmpty())
            throw new BufferUnderflowException();

        return (E)mCollection[mTopIdx];
    }

    public void clear()
    {
        while (!isEmpty())
            pop();
    }

    public boolean isEmpty()
    {
        return (mTopIdx < 0);
    }

    public boolean isFull()
    {
        return (mTopIdx == mCollection.length-1);
    }

    public int size()
    {
        return mTopIdx + 1;
    }

    public String toString()
    {
        StringBuffer description = new StringBuffer();
        description.append(this.getClass().getName() + "@" + this.hashCode() + ": ");
        for (int i=0; i<=mTopIdx; i++)
        {
            description.append((E) mCollection[i]);
            description.append(", ");
        }
        return description.toString();
    }
}
