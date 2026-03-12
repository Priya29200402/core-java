class Singer{

    String[] names;
    int currentIndex =0;

    Singer(String[] names){
        this.names = names;
    }

    void save(String name){

        System.out.println("Executing save in Singer");
        System.out.println("Singer Name: " + name);

        if (this.names != null) {

            System.out.println("Checking to store Singer Name");

            if (this.currentIndex <= this.names.length - 1) {

                System.out.println("storing singer name in index :" + this.currentIndex);

                this.names[this.currentIndex] = name;

                this.currentIndex++;

                System.out.println("Stored the singer name, next index to store next singer: " + this.currentIndex);
            } 
            else {
                System.out.println("Array is full you cannot store more names");
            }

        } 
        else {
            System.out.println("names is not initialized with array");
        }
    }
}