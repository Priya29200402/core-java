class StairCaseDetails extends StairCase{

    StairCaseDetails(int steps, String material, String type){
        super(steps,material,type);
    }

    StairCaseDetails(){
        super(20,"Wood","Spiral");
    }

    StairCaseDetails(int steps){
        super(steps,"Steel","Straight");
    }
}