package Mod5_Appointment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;


class AppointmentTest {

    @Test
    public void TestAppCreation(){
    	Date TestDate = new Date(System.currentTimeMillis() + 86400000);

        Appointment app = new Appointment( "22233", TestDate, "Appointment" );

        assertEquals("22233", app.getAppointmentId());
        assertEquals(TestDate, app.getAppointmentDate());
        assertEquals("Appointment", app.getDescription());
    }

    @Test
    public void InvalidApp(){

    Date TestDate = new Date (System.currentTimeMillis() + 86400000 );
    Date PrevDate = new Date (System.currentTimeMillis() - 86400000 );

        assertThrows(IllegalArgumentException.class, ()-> new Appointment("22222333333",TestDate,"Appointment"));

        assertThrows(IllegalArgumentException.class, ()-> new Appointment(null,TestDate,"Appointment"));

        assertThrows(IllegalArgumentException.class, ()->new Appointment("22233",PrevDate,"Appointment"));

        assertThrows(IllegalArgumentException.class, ()-> new Appointment("22233",null,"Appointment"));

        assertThrows(IllegalArgumentException.class, ()-> new Appointment("22233",TestDate,"Long description testtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt")) ;

        assertThrows(IllegalArgumentException.class, ()-> new Appointment("22233",TestDate,null ));
    }}