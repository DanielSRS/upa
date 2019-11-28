package br.uefs.ecomp.upa.model;

import br.uefs.ecomp.upa.util.Link;
import br.uefs.ecomp.upa.util.LinkList;
import br.uefs.ecomp.upa.util.Queue;

public class registry {
	private LinkList clinicRegistry;
	private LinkList PatientsRegistry;
	
	public void addDoctor(Doctor doc) 
		{
		Link n = new Link(doc, 0);
		n.data2 = new LinkList();
		this.clinicRegistry.insertLast(n);
		}
	
	public void addPatient(Link p, String crm) 
		{
		Link aux = clinicRegistry.getFirst();
		
		while(aux != null)
			{
			if(((Doctor) aux.data).getCRM().equals(crm)) // Se o crm do medico e o inserido
				{
				((LinkList) aux.data2).insertLast(p);
				}
			aux = aux.next;
			}
		}
}
