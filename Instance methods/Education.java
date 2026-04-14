class Education{

    String institutionName;
    String courseName;
    String degreeType;
    int duration;
    double fees;
    String medium;
    String location;
    boolean onlineAvailable;
    boolean scholarshipAvailable;
    String accreditation;
    String universityAffiliation;
    int intakeCapacity;
    String eligibility;
    String entranceExam;
    String category;
    String syllabus;
    String facultyHead;
    String website;
    String contactEmail;
    String code;

    Education(String institutionName, String courseName, String degreeType,
              int duration, double fees, String medium,
              String location, boolean onlineAvailable,
              boolean scholarshipAvailable, String accreditation,
              String universityAffiliation, int intakeCapacity,
              String eligibility, String entranceExam,
              String category, String syllabus,
              String facultyHead, String website,
              String contactEmail, String code) {

        this.institutionName = institutionName;
        this.courseName = courseName;
        this.degreeType = degreeType;
        this.duration = duration;
        this.fees = fees;
        this.medium = medium;
        this.location = location;
        this.onlineAvailable = onlineAvailable;
        this.scholarshipAvailable = scholarshipAvailable;
        this.accreditation = accreditation;
        this.universityAffiliation = universityAffiliation;
        this.intakeCapacity = intakeCapacity;
        this.eligibility = eligibility;
        this.entranceExam = entranceExam;
        this.category = category;
        this.syllabus = syllabus;
        this.facultyHead = facultyHead;
        this.website = website;
        this.contactEmail = contactEmail;
        this.code = code;
    }

    void getEducationInfo(){
        System.out.println("Institution: " + institutionName);
        System.out.println("Course: " + courseName);
        System.out.println("Degree Type: " + degreeType);
        System.out.println("Duration: " + duration);
        System.out.println("Fees: " + fees);
        System.out.println("Medium: " + medium);
        System.out.println("Location: " + location);
        System.out.println("Online Available: " + onlineAvailable);
        System.out.println("Scholarship Available: " + scholarshipAvailable);
        System.out.println("Accreditation: " + accreditation);
        System.out.println("University Affiliation: " + universityAffiliation);
        System.out.println("Intake Capacity: " + intakeCapacity);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Entrance Exam: " + entranceExam);
        System.out.println("Category: " + category);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Faculty Head: " + facultyHead);
        System.out.println("Website: " + website);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Code: " + code);
    }
}