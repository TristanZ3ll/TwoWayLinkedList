public class MyLinkedList<E> implements MyList<E> {

    private Node<E> head, tail;
    private int size = 0; //number of elements in the list

//create an empty list
public MyLinkedList(){

}
    
//create a list from an array of objects
public MyLinkedList(E[] objects){
    for (int i = 0; i < objects.length; i++){
        add(objects[i]);
    }
}

//return the head element in the list
    public E getFirst(){
        if (size == 0){
            return null;
        }
        else{
            return head.element;
        }
    }

    //return the last element in the list
    public E getLast(){
        if (size == 0){
            return null;
        }else{
            return tail.element;
        }
    }

    //Add an element to the beginning of the list
    public void addFirst(E e){
        //implemented in section 24.4.3.1
    }

    //add an element to the end of the list
    public void addLast(E e){
        //implemented near above
    }

    @Override // add a new element at the speccified ined in this list. the index of the head element is zero
    public void add(int index, E e){
        //24.4.3.3 sigh
    }

    //remove the head node and teturn the boject that is contained in the removed list
    public E removeFirst(){
        //24.4.3.4
    }

    //remove the last node and return object contained

    public E removeLast(){
        //24.4.3.5
    }

    @Override //remove the element at the specified position in this list return element that was removed
    public E remove(int index){
        //24.4.3.6
    }

    @Override //override toString() to return elements in the list
    public String toString(){
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i<size; i++){
            result.append(current.element);
            current = current.next;
            if (current!= null){
                result.append(", "); //seperate 2 elements with a comma
            } else{
                result.append("]"); // insert the closing ] in the string

            }
            }
            return result.toString();
        }
    @Override //clear the list
    public void clear(){
        size = 0;
        head = tail = null;
    }

    @Override //return true if this list contains the element e
    public boolean contains(Object e){
        //left as an exercise
        return true;
    }
    
    @Override //return the index of the first matching element in this list. Return -1 if no match
    public int indexOf(Object e){
        //left as an exercise
        return 0;
    }

    @Override //Return the index of the last matching element in this list return -1 if no match
    public int lastIndexOf(E e){
        //left as an exercise
        return 0;
    }

    @Override // Replace the element at the specified position in this list with the specified element
    public E set(int index, E e){
        //left as an exercise 
        return null;
    }

    @Override // overrride iterator() definined in Iterable
    public java.util.Iterator<E> iterator(){
        return new LinkedListIterator();
    }

        private class LinkedListIterator implements java.util.Iterator<E>{
            private Node<E> current = head; //curent index

            @Override
            public boolean hasNext(){
                return (current != null);
            }

            @Override
            public E next(){
                E e = current.element;
                current = current.next;
                return e;
            }

            @Override
            public void remove(){
                //left as an exercise
            }
            }

            private static class Node<E>{
                E element;
                Node <E> next;
                public Node(E element){
                    this.element = element;
                }
            }
            @Override //returns the number of eleements in this list
            public int size(){
                return size;
            }
    }
    
    



