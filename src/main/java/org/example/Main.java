package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        VaccineScheduler vaccineScheduler = new VaccineScheduler();
        vaccineScheduler.addAppointment("1", LocalDateTime.of(2023, 10, 10, 5, 30));
        vaccineScheduler.addAppointment("2", LocalDateTime.of(2023, 10, 10, 6, 30));
        vaccineScheduler.addAppointment("1", LocalDateTime.of(2023, 10, 10, 6, 00));
        vaccineScheduler.addAppointment("1", LocalDateTime.of(2023, 10, 11, 6, 00));

        System.out.println(vaccineScheduler.getAvailableAppointments(LocalDate.of(2023, 10, 10)));

        vaccineScheduler.scheduleAppointment("1", "1", LocalDateTime.of(2023, 10, 10, 5, 30));
        System.out.println(vaccineScheduler.getAvailableAppointments(LocalDate.of(2023, 10, 10)));

        vaccineScheduler.removeAppointment("1", LocalDateTime.of(2023, 10, 10, 5, 30));
        System.out.println(vaccineScheduler.getAvailableAppointments(LocalDate.of(2023, 10, 10)));

        vaccineScheduler.scheduleAppointment("2", "2", LocalDateTime.of(2023, 10, 10, 6, 30));
        System.out.println(vaccineScheduler.getAvailableAppointments(LocalDate.of(2023, 10, 10)));

        System.out.println(vaccineScheduler.getPatientAppointment("2"));

        vaccineScheduler.cancelAppointment("2");
        System.out.println(vaccineScheduler.getAvailableAppointments(LocalDate.of(2023, 10, 10)));

    }
}