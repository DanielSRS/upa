package br.uefs.ecomp.upa.model;

import br.uefs.ecomp.upa.util.Link;
import br.uefs.ecomp.upa.util.Queue;

/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
public class ExamQueue {
    private Queue queue;
    
    /**
     * 
     */
    public ExamQueue() 
    	{
    	queue = new Queue();
    	}
    
    /**
     * 
     */
    public boolean doExam(String exam) 
    	{
    	Link aux = this.queue.listAll();
    	Link f = aux;
    	while(aux != null)
    		{
	    	Link a = ((ExamList) aux.data ).searchExam(exam);
	    	if(a != null) 
	    		{
	    		if(a != f) 
	    			{
	    			a.next = a.next.next;
	    			}
	    		else 
	    			{
	    			this.queue.list.deleteFirst();
	    			}
	    		return true;
	    		}
	    	aux = aux.next;
    		}
    	return false;
    	}
    
    /**
     * 
     * @param exam
     * @return
     */
    public Link listExamQueue(String exam) 
    	{
    	int quantidade = 0;
    	String listt = "Pacientes aguardadndo para fazer este exame:\n\n";
    	String name;
    	Link aux = this.queue.listAll();
    	while(aux != null)
    		{
	    	Link a = ((ExamList) aux.data ).searchExam(exam);
	    	if(a != null) 
	    		{
	    		name = ((ExamList) aux.data).getPatient().getName();
	    		listt.concat(name);
	    		listt.concat("\n");
	    		quantidade++;
	    		}
	    	aux = aux.next;
    		}
    	return new Link(listt, quantidade);
    	}
}
