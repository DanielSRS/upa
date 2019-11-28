package br.uefs.ecomp.upa.model;

/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
public class Patient {
    private String name;
    private String registration;
    
    /**
     * 
     * @param name
     * @param registration
     */
    public Patient(String name, String registration) {
    	this.name =  name;
    	this.registration = registration;
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
    public String getRegistration() 
    	{
    	return this.registration;
    	}
}
