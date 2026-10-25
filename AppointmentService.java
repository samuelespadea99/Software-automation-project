package Mod5_Appointment;

import java.util.HashMap;

public class AppointmentService {
  private HashMap<String, Appointment> appList =new HashMap<>();

    public void addAppointment(Appointment appointment){

        if (appList.containsKey (appointment.getAppointmentId())){
          throw new IllegalArgumentException();
        }

        appList.put(appointment.getAppointmentId(),appointment);
    	}

    public void deleteAppointment(String appID){
    	
        appList.remove(appID);
    	}

    public Appointment getAppointment(String appID){
        Appointment app =appList.get(appID);
        return app;
    }}