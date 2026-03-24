class CloudSoftwareStore{
    CloudSoftware[] cloudInfos;
    int currentIndex;

    CloudSoftwareStore(CloudSoftware[] cloudInfos){
        this.cloudInfos=cloudInfos;
    }

    void save(CloudSoftware cloudSoftware){
        if (this.cloudInfos!=null && cloudSoftware!= null){
            System.out.println("Checking to store CloudSoftware Info");

            if (this.currentIndex < this.cloudInfos.length) {
                this.cloudInfos[this.currentIndex]=cloudSoftware;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more CloudSoftware Info");
            }
        } else{
            System.out.println("CloudSoftware array is null");
        }
    }
}