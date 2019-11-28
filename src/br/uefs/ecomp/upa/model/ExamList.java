package br.uefs.ecomp.upa.model;

import br.uefs.ecomp.upa.util.Link;
import br.uefs.ecomp.upa.util.LinkList;

public class ExamList {
    private Patient patient;
    private LinkList list;
    
    public ExamList(Patient p, String exam)
    	{
    	this.patient = p;
    	this.list.insert(new Link(exam, 0));
    	}
    
    public void addExam(String exam) 
    	{
    	list.insert(new Link(exam, 0));
    	}
    
    public Link searchExam(String exam) 
    	{
    	Link aux = this.list.getFirst();
    	Link previous = aux;
    	
    	while(aux != null) 
    		{
    		if(((String) aux.data).equals(exam))
    			{
    			return previous;
    			}
    		previous = aux;
    		aux = aux.next;
    		}
    	return null;
    	}
    
    public void deleteExam(String exam) 
    	{
    	Link o,p;
    	
    	o = this.searchExam(exam);
    	p = this.list.getFirst();
    	
    	if(o == p) 
    		{
    		this.list.deleteFirst();
    		}
    	else 
    		{
    		o.next = o.next.next;
    		}
    	}
    
    public Link listExams() 
    	{
    	return list.listAll();
    	}
   
    public Patient getPatient() 
    	{
    	return this.patient;
    	}
}
