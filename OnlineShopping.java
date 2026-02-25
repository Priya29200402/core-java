class OnlineShopping
{
    public static void main(String[] args)
    {
        int totalAmount = 3500;
        String deliveryType = "EXPRESS";
        int products = 4;

        if(totalAmount >= 5000)
        {
            System.out.println("Free Gift Added");
        }
        else if(totalAmount > 3000)
        {
            System.out.println("15% Discount Applied");
        }
        else if(totalAmount > 1000)
        {
            System.out.println("5% Discount Applied");
        }
        else
        {
            System.out.println("No Offers Available");
        }

        switch(deliveryType)
        {
            case "STANDARD":
                System.out.println("Standard Delivery Selected");
                break;

            case "EXPRESS":
                System.out.println("Express Delivery Selected");
                break;

            case "SAME DAY":
                System.out.println("Same Day Delivery Selected");
                break;

            default:
                System.out.println("Invalid Delivery Type");
        }

        System.out.println("======================");

        for(int i = 1; i <= products; i++)
        {
            System.out.println("Product Packed: " + i);
        }

        int copy = 1;
        while(copy <= 2)
        {
            System.out.println("Sending Confirmation Email: " + copy);
            copy++;
        }

        int order = 1;
        do
        {
            System.out.println("Order Successfully Placed");
            order++;
        }
        while(order <= 1);
    }
}