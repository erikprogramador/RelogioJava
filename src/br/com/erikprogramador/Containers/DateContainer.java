/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.erikprogramador.Containers;

import br.com.erikprogramador.services.ServiceDate;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author erik
 */
public class DateContainer {
    
    public static ServiceDate getServiceDate() {
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        return new ServiceDate(data, sdf);
    }
    
}
