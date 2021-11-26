import javax.lang.model.type.NullType;
import java.lang.reflect.Array;

public class MyArrayList<E>
{

    private int count;
    private E[] myArrayList;

    public MyArrayList(Class type, int size)
    {
        count = 0;
        myArrayList = (E[]) Array.newInstance(type, size);
    }

    private void expand(Class type,  int size)
    {
        E[] newMyArrayList = (E[]) Array.newInstance(type, size);
        for(int i = 0; i < size(); i++)
            newMyArrayList[i] = myArrayList[i];
        this.myArrayList = (E[]) Array.newInstance(type, size);
        for(int i = 0; i < size(); i++)
            myArrayList[i] = newMyArrayList[i];
    }

    public void add(E item)
    {
        if(count == myArrayList.length)
        {
            expand(myArrayList.getClass(), myArrayList.length + 1);
        }
            myArrayList[count] = item;
            count = count + 1;

    }

    public void add(E item, int index)
    {
        if(count == myArrayList.length - 1)
        {
            expand(item.getClass(), myArrayList.length + 1);
        }
        for(int i = count + 1; i > index; i--)
        {
            myArrayList[i] = myArrayList[i - 1];
        }
        myArrayList[index] = item;
        count = count + 1;

    }

    public void clear()
    {
        for(int i = 0; i < count; i++)
        {
            myArrayList[i] = null;
        }
        count = 0;
    }

    public boolean isEmpty()
    {
        if(count == 0)
            return true;
        else
            return false;
    }

    public int size()
    {
        return count;
    }
    
    public String toString()
    {
        String answ = "";

            for (int i = 0; i < count; i++) {
                if(answ == "")
                    answ = "В списке есть элементы: " + myArrayList[i];
                else
                answ = answ + ", " + myArrayList[i];
            }
        return answ;
    }
}
