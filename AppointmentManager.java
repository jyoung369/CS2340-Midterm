import java.util.ArrayList;
import java.util.List;

class User {
    
}

class Doctor extends User {

}

class Appointment {

}

public class AppointmentManager {
    private static AppointmentManager instance; 
    private List<User> users;
    private List<Appointment> appointments; 
    
    private AppointmentManager() {
        users = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public static synchronized AppointmentManager getInstance() {
        if (instance == null) {
            instance = new AppointmentManager();
        }
        return instance;
    }

    /**
     * schedules an appointment for the user with a doctor
     * @param user The user scheduling the appointment
     * @param doctor The doctor with whom the appointment is to be scheduled
     * @param details The details of the appointment
     * @return The scheduled appointment
     */
    public Appointment scheduleAppointment(User user, Doctor doctor, String details) {
        return null; 
    }

    /**
     * This recommends doctors based on their availability and skillset.
     * @param symptoms The symptoms described by the user
     * @param discomfortLevel The level of discomfort
     * @param insuranceCoverage Indicates if the user has insurance coverage
     * @return A list of recommended doctors
     */
    public List<Doctor> recommendDoctors(String symptoms, int discomfortLevel, boolean insuranceCoverage) {
        return null;
    }
    /**
     * This recommends alternative doctors if the scheduled doctor is not available
     * @param user The user scheduling the appointment
     * @param currentDoctors the list of doctors that the user can currently book from
     * @return A list of recommended doctors
     */
    public List<Doctor> scheduleAlternativeDoctors(User user, List<Doctor> currentDoctors) {
        // remove Dr.Young (or any doctor that is not available) 
        // from currentDoctors and return the list for the user to select from
        return null;
    }
    /**
     * This recommends alternative doctors if the user wants to change their time
     * @param user The user scheduling the appointment
     * @return A list of recommended doctors that the user can schedule with depending on the time
     */
    public List<Doctor> scheduleAlternativeTime(User user, String time) {
        // If the user wants to schedule with a new doctor at a different date then the user can update the date/time with a calendar 
        // this date will be parsed into a string and fed into this method and this method will query the doctors that are available 
        // and see which one fits the user's requirements while also being available at the same time/day. This will get all the list of doctors
        // based on this and return this list. 
        return null;
    }
}
