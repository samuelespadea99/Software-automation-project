package Mod5_Appointment;

import java.util.Date;

public class Appointment {

    private final String appointmentId;
    private String description;
    private Date appointmentDate;
  

    public Appointment(String appCode, Date appDate, String appDetails){

        if (appCode == null ||appCode.length() > 10){
            throw new IllegalArgumentException();
        }

        if (appDate == null ||appDate.before(new Date())){
            throw new IllegalArgumentException();
        }

        if (appDetails == null || appDetails.length()> 50){
            throw new IllegalArgumentException();
       }
        
        appointmentDate = appDate;
        appointmentId = appCode;
        description = appDetails;
      }

    public String getAppointmentId(){
        return appointmentId;
    	}

    public Date getAppointmentDate(){
        return appointmentDate;
    	}

    public String getDescription(){
        return description;
    	}}