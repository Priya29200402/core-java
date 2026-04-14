class Connection{

    String connection;

    Connection(String connection){
        this.connection = connection;
    }

    void getDetails(){
        System.out.println("Connection: " + this.connection);
    }
}