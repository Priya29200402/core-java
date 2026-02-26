class UniversityRunner{

    public static void main(String[] args){
	
        String[] colleges = University.getAllColleges("Dr. B R Ambedkar Medical College, Bengaluru");
		System.out.println("Courses Offered");
		
		if(colleges!=null){

        for(int index = 0; index < colleges.length; index++){
            System.out.println(colleges[index]);
        }
		}
		else{
			System.out.println("colleges list is null");
		}
    }
}
