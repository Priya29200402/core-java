class Task4Runner{
    public static void main(String[] args) {
		
        System.out.println("------MUSEUM-----");
        MuseumCreator.getMuseum();
        MuseumCreator.getMuseum("Folklore Museum");
        MuseumCreator.getMuseum("Nimhans Brain Museum", "Hosur Road, Bengaluru");
		
		System.out.println("------ZOO------");
		ZooCreator.getZoo();
        ZooCreator.getZoo("Mysore Zoo");
        ZooCreator.getZoo("Bannerghatta Zoo", 250);
		
		System.out.println("-----STADIUM-----");
		StadiumCreator.getStadium();
        StadiumCreator.getStadium("Chinnaswamy Stadium");
        StadiumCreator.getStadium("Wankhede Stadium", 33000);

    }
}