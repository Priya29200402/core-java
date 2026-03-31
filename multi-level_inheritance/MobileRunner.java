class MobileRunner{
    public static void main(String[] args){

        AppleMobile mobile=new AppleMobile();

        mobile.brand="Apple";
        System.out.println("Brand:"+ mobile.brand);

        mobile.call();            
        mobile.androidFeature();  
        mobile.iosFeature();      
    }
}	