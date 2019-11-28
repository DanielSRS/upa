package br.uefs.ecomp.upa.model;

import br.uefs.ecomp.upa.util.Link;
import br.uefs.ecomp.upa.util.LinkList;

/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
public class Registry {
	private LinkList clinicRegistry;
	private LinkList PatientsRegistry;
	
	public Registry()
		{
		this.clinicRegistry = new LinkList();
		this.PatientsRegistry = new LinkList();
		}
	
	/**
	 * 
	 * @param doc
	 */
	public void addDoctor(Doctor doc) 
		{
		Link n = new Link(doc, 0);
		n.data2 = new LinkList();
		this.clinicRegistry.insertLast(n);
		}
	
	/**
	 * 
	 * @param newName
	 * @param crm
	 * @return
	 */
	public boolean edditDoctor(String newName, String crm) 
		{
		Link aux = this.clinicRegistry.listAll();
		
		while(aux != null)
			{
			if(((Doctor) aux.data).getCRM().equals(crm))
				{
				((Doctor) aux.data).setName(newName);
				return true;
				}
			aux = aux.next;
			}
		return false;
		}
	
	/**
	 * 
	 * @param p
	 * @param crm
	 */
	public void addPatient(Link p, String crm)
		{
		Link aux = clinicRegistry.getFirst();
		
		while(aux != null)
			{
			if(((Doctor) aux.data).getCRM().equals(crm))
				{
				((LinkList) aux.data2).insertLast(p);
				this.PatientsRegistry.insertLast(p);
				}
			aux = aux.next;
			}
		}
	
	/**
	 * 
	 * @param p
	 * @param doc
	 */
	public void addPatient(Link p, Link doc)
		{
		addPatient(p, ((Doctor) doc.data).getCRM());
		}
	
	/**
	 * 
	 * @param matricula
	 * @return
	 */
	public String listSolicitedExams(String matricula) 
		{
		Link patient = this.PatientsRegistry.listAll();
		Link examlist = null;
		String exams = "Exames solicitados:\n\n";
		
		while(patient != null) 
			{
			if(((Patient) patient.data).getRegistration().equals(matricula))
				{
				examlist = ((ExamList) patient.data2).listExams();
				break;
				}
			patient = patient.next;
			}
		
		while(examlist != null) 
			{
			exams.concat((String) examlist.data);
			exams.concat("\n");
			examlist = examlist.next;
			}
		
		return exams;
		}
	
	/**
	 * 
	 * @param crm
	 * @return
	 */
	public String listCareQueueRegistry(String crm) 
		{
		Link reg = this.clinicRegistry.listAll();
		Link aux = null;
		String patients = "Pacientes atendidos: \n\n";
		
		while(reg != null)
			{
			if(((Doctor) reg.data).getCRM().equals(crm))
				{
				aux = ((LinkList) reg.data2).listAll();
				break;
				}
			reg = reg.next;
			}
		
		while(aux != null) 
			{
			patients.concat((String) aux.data);
			patients.concat("\n");
			aux = aux.next;
			}
		return patients;
		}
	}
