class SwitchShortMethod {

    static void checkMarks(short marks) {

        switch (marks) {
            case 50:
                System.out.println("Pass");
                break;
            case 60:
                System.out.println("Second Class");
                break;
            case 70:
                System.out.println("First Class");
                break;
            case 80:
                System.out.println("Distinction");
                break;
            case 90:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid Marks");
				break;
        }
    }

    public static void main(String[] args) {
        checkMarks((short)80);
    }
}
