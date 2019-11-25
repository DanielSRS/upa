package br.uefs.ecomp.upa.util;

public class Link {
	public Object data;
	public Object data2;
	public int priority;
	public Link next;
	
	public Link(Object information, int urgency){
		this.data = information;
		this.priority = urgency;
	}
}
