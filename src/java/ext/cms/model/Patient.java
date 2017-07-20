/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author ATKARS
 */
@Entity
@Table(name="PatientData")
public class Patient
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    private String username;
    
    private String firstname;
    
    private String lastname;
    
    private String emailaddress;
    
    private String tempaddress;
    
    private String contactno;
    
    private String altcontactno;
    
    private String permaddress;
    
    private String country;
    
    private String state;
    
    private String zipcode;
    
    private String aadharid;
    
    private String gender;
    
    private String bloodgroup;
    
    
    
    private String dateofbirth;
    
    
    
    
    
    
    
    
    
}
