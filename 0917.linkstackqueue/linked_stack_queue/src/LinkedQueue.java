public class LinkedQueue<E>
{
    private LinkNode<E> mHead;
    private LinkNode<E> mTail;

    public LinkedQueue()
    {
        mHead = mTail = null;
    }

    public void enqueue(E element)
    {
        LinkNode<E> node = new LinkNode<>(element);

        if (isEmpty())
            mHead = mTail = node;
        else
        {
            mTail.next = node;
            mTail = node;
        }
    }

    public E dequeue()
    {
        if (isEmpty())
            throw new OutOfMemoryError();
            //return null;

        E element = mHead.data;

        if (mHead == mTail)
            mHead = mTail = null;
        else
            mHead = mHead.next;

        return element;
    }

    public E poll()
    {
        if (isEmpty())
            throw new OutOfMemoryError();
            //return null;

        return mHead.data;
    }

    public boolean isEmpty()
    {
        return (mHead == null);
    }
}
