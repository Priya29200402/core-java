class Coach{

    String name;
    int experience;
    double salary;
    boolean national;
    int age;

    CoachTeam team;
    CoachExperience experience;
    CoachCountry country;
    CoachSpecialization specialization;
    CoachLevel level;

    Coach(String name,int experience,double salary,boolean national,int age,
          CoachTeam team,CoachExperience experience,CoachCountry country,
          CoachSpecialization specialization,CoachLevel level){

        this.name=name;
        this.experience=experience;
        this.salary=salary;
        this.national=national;
        this.age=age;

        this.team=team;
        this.experience=experience;
        this.country=country;
        this.specialization=specialization;
        this.level=level;
    }

    void getCoachDetails(){

        System.out.println("name:"+this.name);
        System.out.println("experience:"+this.experience);
        System.out.println("salary:"+this.salary);
        System.out.println("national:"+this.national);
        System.out.println("age:"+this.age);

        System.out.println("team:"+this.team);
        System.out.println("Experience:"+this.experience);
        System.out.println("country:"+this.country);
        System.out.println("Specialization:"+this.specialization);
        System.out.println("Level:"+this.level);
    }
}