package generics;

import java.util.ArrayList;

public class Action<T> implements IAction<T> {

    private ArrayList<T> ls = new ArrayList();

    @Override
    public boolean add(T t) {
        return ls.add(t);
    }

    @Override
    public T remove(int index) {
        return ls.remove(index);
    }

    @Override
    public ArrayList<T> getAll() {
        return ls;
    }

}
