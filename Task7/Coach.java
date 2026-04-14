class Coach{

    String name;
    double salary;
    boolean national;
    int age;
    CoachTeam team;
    CoachExperience experience;
    CoachCountry country;
    CoachSpecialization specialization;
    CoachLevel level;

    Coach(String name,double salary,boolean national,int age,
          CoachTeam team,CoachExperience experience,CoachCountry country,
          CoachSpecialization specialization,CoachLevel level){

        this.name = name;
        this.salary = salary;
        this.national = national;
        this.age = age;
        this.team = team;
        this.experience = experience;
        this.country = country;
        this.specialization = specialization;
        this.level = level;
    }

    void getCoachDetails(){

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("National: " + this.national);
        System.out.println("Age: " + this.age);

        if(this.team != null){
            this.team.getData();
        }
        else{
            System.out.println("Team is Null");
        }

        if(this.experience != null){
            this.experience.getData();
        }
        else{
            System.out.println("Coach experience is Null");
        }

        if(this.country != null){
            this.country.getData();
        }
        else{
            System.out.println("Country is null");
        }

        if(this.specialization != null){
            this.specialization.getData();
        }
        else{
            System.out.println("Specialization is null");
        }

        if(this.level != null){
            this.level.getData();
        }
        else{
            System.out.println("Level is null");
        }
    }
}