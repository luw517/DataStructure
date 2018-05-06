package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		size=0;
		head=new LLNode<E>(null);
		tail=new LLNode<E>(null);
		head.next=tail;
		tail.prev=head;
		
		// TODO: Implement this method
	}
	

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		
		// TODO: Implement this method
		if (element == null) {
            throw new NullPointerException("Element can not be null");
        }
		
			
			LLNode<E> n=new LLNode<E> (element); 
			n.prev=tail.prev;
			tail.prev.next=n;
			n.next=tail;
			tail.prev=n;
			size++;
			return true;
		
		
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	// TODO: Implement this method.
	{   
		 LLNode<E> n = head;
		 if(index >= size || index < 0){
	            throw new IndexOutOfBoundsException("Invalid index");
	        }
	   
	       while (index>=0) {
	            n = n.next;
	            index--;
	       }
	        
			return n.data;
		}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		if (index<0||index>size) {
			throw new IndexOutOfBoundsException("Invalid index,index = " + index);
			
		}
		if (element == null) {
            throw new NullPointerException("Element can not be null");
        }
		LLNode<E> a=head;
		for (int i = 0; i <= index; i++) {
			a=a.next;
			
		}
		LLNode<E> n=new LLNode<E>(element); 
		a.prev.next=n;
		n.prev=a.prev;
		a.prev=n;
		n.next=a;

		size++;
	}


	/** Return the size of the list */
	public int size() 
	{
		
		// TODO: Implement this method
		return size;
		
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index)  
	{   
		if (index<0||index>size) {
			throw new IndexOutOfBoundsException("Invalid index,index = " + index);
			
		}
		
		LLNode<E> p=head;
		for (int i=0;i<=index;i++) {
			p=p.next;
		}
		p.prev.next=p.next;
		p.next.prev=p.prev;
		p.prev=null;
		p.next=null;
		size-=1;
		return p.data;
		
		
		// TODO: Implement this method
		
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if (index<0||index>size) {
			throw new IndexOutOfBoundsException("Invalid index,index = " + index);
			
		}
		LLNode<E> p=head;
		for (int i=0; i<index; i++) {
			p=p.next;
		}
		
		p.data=element;
		return p.data;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
