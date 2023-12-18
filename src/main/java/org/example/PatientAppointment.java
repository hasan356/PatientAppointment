package org.example;

import java.time.LocalDateTime;

public class PatientAppointment {
    public LocalDateTime appointmentTime;
    public String providerID;

    public PatientAppointment(LocalDateTime appointmentTime, String providerID) {
        this.appointmentTime = appointmentTime;
        this.providerID = providerID;
    }
}
