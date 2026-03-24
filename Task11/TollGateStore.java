class TollGateStore{
	TollGate[] tollgateInfos;
	int currentIndex;
	
	TollGateStore(TollGate[] tollgateInfos){
		this.tollgateInfos=tollgateInfos;
	}
	void save(TollGate tollGate){
		if(this.tollgateInfos != null && tollGate != null){
            System.out.println("Checking to store TollGate Info");

            if(this.currentIndex < this.tollgateInfos.length){
               
                this.tollgateInfos[this.currentIndex] = tollGate;
                this.currentIndex++;
            }else{
                System.out.println("Array is full, cannot store more tollGate Info");
            }
        }else {
            System.out.println("tollGate array is null");
        }
	}
}