import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class Queue<E>
{
    private Object[] mCollection;
    private int mHead;
    private int mTail;

    public Queue(int capacity)
    {
        mCollection = new Object[capacity];
        clear();
    }

    public void enqueue(E element)
    {
        if (mTail == mCollection.length-1)
        {
            if (size() < mCollection.length)
                shift();
            else
                throw new BufferOverflowException();
        }

        mTail++;

        if (mHead < 0)
            mHead = mTail;

        mCollection[mTail] = element;
    }

    public E dequeue()
    {
        if (isEmpty())
            throw new BufferUnderflowException();

        E element = (E)mCollection[mHead];
        mHead++;

        if (mHead > mTail)
            clear();

        return element;
    }

    public E front()
    {
        if (isEmpty())
            throw new BufferUnderflowException();

        return (E)mCollection[mHead];
    }

    public boolean isEmpty()
    {
        return (mHead == -1);
    }

    public boolean isFull()
    {
        return (size() == mCollection.length);
    }

    public void clear()
    {
        mHead = mTail = -1;
    }

    public int size()
    {
        return (mTail - mHead) + 1;
    }

    public String toString()
    {
        StringBuffer description = new StringBuffer();
        description.append(this.getClass().getName() + "@" + this.hashCode() + ": ");
        if (!isEmpty())
        {
            for (int i=mHead; i<=mTail; i++)
            {
                description.append((E) mCollection[i]);
                description.append(", ");
            }
        }
        return description.toString();
    }

    private void shift()
    {
        int size = size();

        for (int i=mHead; i<=mTail; i++)
            mCollection[i-mHead] = mCollection[i];

        mHead = 0;
        mTail = size-1;
    }
}
