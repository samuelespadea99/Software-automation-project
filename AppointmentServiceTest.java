package Mod5_Appointment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class AppointmentServiceTest {

    @Test
    public void testAppointmentService(){

        AppointmentService service = new AppointmentService() ;
        Date testDate = new Date(System.currentTimeMillis()+ 86400000);

        Appointment app1 = new Appointment( "22233", testDate,"Appointment" );

        service.addAppointment(app1);
        assertEquals(app1, service.getAppointment( "22233"));
        
        service.deleteAppointment("22233");
        assertNull(service.getAppointment("22233"));
    }

    @Test
    public void testDuplicateAppointmentId(){

        AppointmentService service= new AppointmentService();
        Date testDate = new Date(System.currentTimeMillis() + 86400000 );

        Appointment app1 = new Appointment( "22233", testDate,"Appointment");
        Appointment app2 = new Appointment("22233", testDate, "Second appointment" );

        service.addAppointment(app1);

        assertThrows(IllegalArgumentException.class, () -> service.addAppointment (app2));
        }}