package br.uefs.ecomp.upa.util;

public class LinkList {
    private Link first;
    private Link last;
    public int size;
    
    public LinkList() {
    	size = 0;
    }
    
    public void insertFirst(Link element) {
    	if(first == null) {
    		first = element;
    		last =  element;
    	}
    	else {
    		element.next = first;
    		first = element;
    	}
    	size++;
    }
    
    public void insertLast(Link element) {
    	if(first == null) {
    		first = element;
    		last =  element;
    	}
    	else {
    		last.next = element;
    		last = element;
    	}
    	size++;
    }
    
    public Link deleleFirst() {
    	Link temp = first;
    	if(temp == null) {
    		return temp;
    	}
    	first = first.next;
    	size--;
    	return temp;
    }
    
    public Link delete(Link search) {
    	Link current = first;
    	Link previous = null;
    	if(current == search) {
    		first = first.next;
    		if(first == null) {
    			last = null;
    		}
    		return current;
    	}
    	while(current != null) {
    		if(current == search) {
    			previous.next = current.next;
    			return current;
    		}
    		previous = current;
    		current = current.next;
    	}
    	
    	return current;
    }
    
    public Link getFirst() {
    	return first;
    }
    
    public Link getLast() {
    	return last;
    }
}
