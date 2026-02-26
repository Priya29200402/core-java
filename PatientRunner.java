class PatientRunner{
    public static void main(String[] args){
        Patient.sick();

        Mobile.register("Sagar", "Skin itching", "sagar@gmail.com", 9876543210L);
        Reception.book("Sagar", "Skin itching", "sagar@gmail.com", 9876543210L);
        Hospital.bookAppointment("Sagar", "Skin itching");
        Nurse.basicCheck("Sagar", "Skin itching", 120, false);
        Doctor.treat("Sagar", "Skin itching");
    }
}
