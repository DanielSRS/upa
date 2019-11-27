package br.uefs.ecomp.upa.model;

import br.uefs.ecomp.upa.util.Link;
import br.uefs.ecomp.upa.util.LinkList;
import br.uefs.ecomp.upa.util.Queue;

/**
 * 
 * @author dsrs
 *
 */
public class CareQueue {
	private LinkList doctorList;
	
	public CareQueue() 
		{
		doctorList = new LinkList();
		}
	/**
	 * 
	 * @param newLink é um objeto do tipo Link que armazena um objeto
	 * do tipo Patient no atriuto data.
	 */
	public void addDoctor(Link newLink)
		{
		newLink.data2 = new Queue();
		this.doctorList.insert(newLink);
		}
	/**
	 * 
	 * @param patient
	 * @param crm
	 * @return
	 */
	public boolean addPatience(Link patient)
		{
		Link aux = (Link) doctorList.getFirst();
		Link smaller = (Link) doctorList.getFirst();
		
		while(aux != null)
			{
			int a = (((Queue) aux.data2).size()); // Tamanho da fila sendo avaliada
			int b = (((Queue) smaller.data2).size()); // Tamanho da menor fila encontrada
			if(a < b)
				{
				smaller = aux;
				}
			aux = aux.next;
			}
		if(smaller != null) 
			{
			((Queue) smaller.data2).insert(patient);
			}
		return false;
		
	/*	if(doctorList.size == 0) 
			{
			return false;
			}
		while(aux != null)
			{
			if(((Doctor) aux.data).getCRM().equals(crm)) // Se o crm do medico e o inserido
				{
				((Queue) aux.data2).insert(patient);
				}
			aux = aux.next;
			}
		
		return false; */
		}
	/**
	 * 
	 * @param crm
	 * @return
	 */
	public Link attendPatient(String crm)
		{
		Link aux = doctorList.getFirst();
		
		while(aux != null)
			{
			if(((Doctor) aux.data).getCRM().equals(crm)) // Se o crm do medico e o inserido
				{
				return ((Queue) aux.data2).delete();
				}
			aux = aux.next;
			}
		
		return null;
		}
	/**
	 * 
	 * @param crm
	 * @return
	 */
	public String listQueue(String crm) 
		{
		Link a = null;
		Link aux = doctorList.getFirst();
		
		while(aux != null)
			{
			if(((Doctor) aux.data).getCRM().equals(crm)) // Se o crm do medico e o inserido
				{
				a = ((Queue) aux.data2).listAll();
				break;
				}
			aux = aux.next;
			}
		
		String listing = "Matriculas de pacientes na espera \n\n";
		
		if(a == null) 
			{
			return "Não há pacientes na espera";
			}
		
		while(a != null) 
			{
			String m = ((Patient) a.data).getRegistration();
			listing = listing.concat(m);
			listing = listing.concat("\n");
			a = a.next;
			}
		return listing;
		}
}
