package ListStackQueuesImplementation;

/**
 * Created by Gurkan on 18.03.2015.
 */
public abstract class MyAbstractList<E> implements MyList<E>  {
    protected int size = 0;

    protected MyAbstractList(){

    };

    protected MyAbstractList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }
    @Override
    public void add(E e){
        add(size,e);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }


    @Override
    public boolean remove(E e){
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }
        else
            return false;

    }
}
