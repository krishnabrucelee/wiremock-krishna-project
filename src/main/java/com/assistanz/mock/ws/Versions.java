package com.assistanz.mock.ws;

import java.util.Date;

/**
 * The version of the REST API.
 * 
 * @author Sujai SD <sujai@assistanz.com> edited by Krish-Mona.
 */
public class Versions {
    
    /**
     * Identifier for the version.
     */
    private String id;
    
    /**
     * Status of the version. Is the version supported or not.
     */
    private String status;
    
    /**
     * Last updated date
     */
    private Date updated;
    
    /**
     * 
     * @return 
     */
   private String media_types;
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    } 
    
    public String media_types() {
        return media_types;
    }

    public void media_types(String media_types) {
        this.media_types =media_types;
    }
    
  

    Object size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Versions get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
