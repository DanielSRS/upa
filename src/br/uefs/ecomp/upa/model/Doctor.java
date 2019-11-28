package br.uefs.ecomp.upa.model;
/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
public class Doctor {
    private String name;
    private String crm;
    
    /**
     * 
     * @param name
     * @param crm
     */
    public Doctor(String name, String crm) 
    	{
    	this.name = name;
    	this.crm = crm;
    	}
    
    /**
     * 
     * @param newName
     */
    public void setName(String newName) 
    	{
    	this.name = newName;
    	}
    
    /**
     * 
     * @return
     */
    public String getName() 
    	{
    	return this.name;
    	}
    
    /**
     * 
     * @return
     */
    public String getCRM() 
    	{
    	return this.crm;
    	}
}
