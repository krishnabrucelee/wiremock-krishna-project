/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.assistanz.mock.ws;

import java.util.Date;

/**
 *
 * @author Gayu
 */
public class VersionNew extends Version{
    
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
     * Provides base type of the File.
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
    
    public String getMedia_types() {
        return media_types;
    }

    public void setMedia_types(String media_types) {
        this.media_types = media_types;
    }

    
}
