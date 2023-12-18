package org.example;

import java.time.LocalDateTime;

public class ProviderAppointment {
        public LocalDateTime appointmentTime;
        public String patientID;

        public ProviderAppointment(LocalDateTime appointmentTime, String patientID) {
                this.appointmentTime = appointmentTime;
                this.patientID = patientID;
        }
}
