class TrackRunner{
    public static void main(String[] args) {

        Track track1 = new Track();
        System.out.println("------ Track 1 ------");
        System.out.println("Type:"+track1.type);
        System.out.println("Length:"+track1.length);
        System.out.println("Location:"+track1.location);
        System.out.println("Indoor:"+track1.indoor);
        System.out.println("Material:"+track1.material);
		System.out.println("===========================");


        Track track2 = new Track("Railway");
        System.out.println("------ Track 2 ------");
        System.out.println("Type:"+track2.type);
        System.out.println("Length:"+track2.length);
        System.out.println("Location:"+track2.location);
        System.out.println("Indoor:"+track2.indoor);
        System.out.println("Material:"+track2.material);
		System.out.println("===========================");


        Track track3 = new Track("Running", 400.0);
        System.out.println("------ Track 3 ------");
        System.out.println("Type:"+track3.type);
        System.out.println("Length:"+track3.length);
        System.out.println("Location:"+track3.location);
        System.out.println("Indoor:"+track3.indoor);
        System.out.println("Material:"+track3.material);
		System.out.println("===========================");


        Track track4 = new Track("Metro", 2000.0, "City");
        System.out.println("------ Track 4 ------");
        System.out.println("Type:"+track4.type);
        System.out.println("Length:"+track4.length);
        System.out.println("Location:"+track4.location);
        System.out.println("Indoor:"+track4.indoor);
        System.out.println("Material:"+track4.material);
		System.out.println("===========================");


        Track track5 = new Track("Race", 5000.0, "Stadium", true);
        System.out.println("------ Track 5 ------");
        System.out.println("Type:"+track5.type);
        System.out.println("Length:"+track5.length);
        System.out.println("Location:"+track5.location);
        System.out.println("Indoor:"+track5.indoor);
        System.out.println("Material:"+track5.material);
		System.out.println("===========================");


        Track track6 = new Track("Train", 10000.0, "National", false, "Steel");
        System.out.println("------ Track 6 ------");
        System.out.println("Type:"+track6.type);
        System.out.println("Length:"+track6.length);
        System.out.println("Location:"+track6.location);
        System.out.println("Indoor:"+track6.indoor);
        System.out.println("Material:"+track6.material);
		System.out.println("===========================");

    }
}