package br.uefs.ecomp.upa.util;
/**
 * 
 * @author dsrs
 *
 */
public class Queue {
    public LinkList list;
    
    public Queue() {
    	list = new LinkList();
    }
    /**
     * 
     * @param element
     * @return
     */
    public boolean insert(Link element) {
    	return list.insert(element);
    }
    /**
     * 
     * @return
     */
    public Link delete() {
    	return list.deleteFirst();
    }
    /**
     * 
     * @return
     */
    public int size() {
    	return list.size;
    }
    /**
     * 
     * @return
     */
    public Link listAll() 
    	{
    	return list.listAll();
    	}
}
