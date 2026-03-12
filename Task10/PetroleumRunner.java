class PetroleumRunner{
	public static void main(String[] args){
		
		String[] companies=new String[5];
		Petroleum petroleum=new Petroleum(companies);
		petroleum.save("Bharat petroleum");
		System.out.println("\n");
		petroleum.save("Hindustan petroleum");
		System.out.println("\n");
		petroleum.save("Indain Oil");
		System.out.println("\n");
		petroleum.save("Reliance Industries Limited");
		System.out.println("\n");
		petroleum.save("Nayara Energy");
		
	}
}