import java.nio.BufferUnderflowException;

public class LinkedStack<E>
{
    private LinkNode<E> mTop;
    private int         mSize;

    public LinkedStack()
    {
        mTop = null;
        mSize = 0;
    }

    public void push(E element)
    {
        LinkNode<E> node = new LinkNode<>(element);
        node.next = mTop;
        mTop = node;
        mSize++;
    }

    public E pop()
    {
        if (isEmpty())
            throw new BufferUnderflowException();
            //return null;

        E element = mTop.data;
        mTop = mTop.next;
        mSize--;

        return element;
    }

    public E peek()
    {
        if (isEmpty())
            throw new BufferUnderflowException();

        return mTop.data;
    }

    public boolean isEmpty()
    {
        return (mTop == null);
    }

    public int size()
    {
        return mSize;
    }

    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        LinkNode<E> current = mTop;
        while (current != null)
        {
            buffer.append(current.data);
            buffer.append(", ");
            current = current.next;
        }
        return buffer.toString();
    }
}
