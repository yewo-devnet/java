public interface List<E> {
    
    public void insert(E item);
    public void append(E item);

    public void next();
    public void prev();

    public E remove();
    public int length();

    public void setPos(int pos);
    public void setFirst();
    public void setValue(E val);
    public E currValue();

    public boolean isEmpty();
    public boolean isInList();

    public void clear();
    public void print();


}