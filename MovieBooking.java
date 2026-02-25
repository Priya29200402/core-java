class MovieBooking
{
    public static void main(String[] args)
    {
        int price = 750;
        String seatType = "VIP";
        int shows = 3;

        if(price >= 1000)
        {
            System.out.println("Luxury Show");
        }
        else if(price >= 500)
        {
            System.out.println("Regular Show");
        }
        else
        {
            System.out.println("Budget Show");
        }

        switch(seatType)
        {
            case "VIP":
                System.out.println("VIP Seat Selected");
                break;
            case "PREMIUM":
                System.out.println("Premium Seat Selected");
                break;
            default:
                System.out.println("Normal Seat Selected");
        }

        for(int i = 1; i <= 2; i++)
        {
            System.out.println("Booking Step " + i);
        }

        int count = 1;
        while(count <= shows)
        {
            System.out.println("Show Number " + count);
            count++;
        }

        int confirm = 1;
        do
        {
            System.out.println("Booking Successful");
            confirm++;
        }
        while(confirm <= 1);
    }
}