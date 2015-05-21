/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.erikprogramador.services;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author erik
 */
public class ServiceDate {
    
    private Date data;
    private SimpleDateFormat sdf;
    
    public ServiceDate(Date data, SimpleDateFormat sdf) {
        this.data = data;
        this.sdf = sdf;
    }
    
    public String getHora() {
        this.sdf.applyPattern("HH:mm:ss");
        String hr = this.sdf.format(this.data);
        return hr;
    }    
    
    public String getData() {
        this.sdf.applyPattern("dd/MM/yyyy");
        String dt = this.sdf.format(this.data);
        return dt;
    }
    
}
