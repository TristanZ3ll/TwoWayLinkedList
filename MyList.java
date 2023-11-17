import java.util.Collection;

public interface MyList<E> extends Collection<E>{
    //adds a new element at the specified index in this list
    public void add(int index, E e);

    //return the elements from this list at the specified index
    public E get(int index);

    //return the index of the first matching element in this list, return -1 if no match
    public int indexOf(Object e);

    //return the index of the last matching element in the list, -1 if no match
    public int lastIndexOf(E e);

    //Remove the element at the specified position from the list, shift any subsequent element to the left, return the element that was removed
    public E remove(int index);
    
    //replace the element at the specified position in the list with the specified element and return the new set

    public E set(int index,E e);

    @Override /** Add a new element at the end of this list */
   public  default boolean add(E e) {
        add(size(), e);
        return true;
    }

    @Override /** Return true if this list contains no elements */
    public default boolean isEmpty(){
        return size() == 0;
    }

    @Override // Remove the first occurrence of the element e from the list, shift any subsequent elements to the left, return true if the element is removed
    public default boolean remove(Object e){
        if (indexOf(e) >= 0){
            remove (indexOf(e));
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        //left as an exercise
        return true;
    }
    @Override 
    public default boolean removeAll(Collection<?> c) {
        //left as an exercise
        return true;
    }
    
    @Override
    public default Object[] toArray() {
        //left as exercise
        return null;
    } 

    @Override
    public default <T> T[] toArray(T[] array){
        //left as an exercise 
        return null;
    }
}