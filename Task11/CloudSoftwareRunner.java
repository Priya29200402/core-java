class CloudSoftwareRunner{
    public static void main(String[] args){

        CloudSoftware[] cloudInfos=new CloudSoftware[10];
        CloudSoftwareStore cloudSoftwareStore=new CloudSoftwareStore(cloudInfos);

        CloudSoftware cloudSoftware1=new CloudSoftware("AWS", "Amazon", 5000, 100, true, "v1");
        CloudSoftware cloudSoftware2=new CloudSoftware("Azure", "Microsoft", 4500, 80, true, "v2");
        CloudSoftware cloudSoftware3=new CloudSoftware("GCP", "Google", 4800, 90, true, "v3");
        CloudSoftware cloudSoftware4=new CloudSoftware("IBM Cloud", "IBM", 4000, 70, true, "v1");
        CloudSoftware cloudSoftware5=new CloudSoftware("Oracle Cloud", "Oracle", 4200, 60, true, "v2");
        CloudSoftware cloudSoftware6=new CloudSoftware("Salesforce", "Salesforce", 5500, 120, true, "v5");
        CloudSoftware cloudSoftware7=new CloudSoftware("Dropbox", "Dropbox", 2000, 50, true, "v3");
        CloudSoftware cloudSoftware8=new CloudSoftware("Slack", "Slack", 1500, 40, true, "v4");
        CloudSoftware cloudSoftware9=new CloudSoftware("Zoom", "Zoom", 3000, 75, true, "v6");
        CloudSoftware cloudSoftware10=new CloudSoftware("GitHub", "Microsoft", 2500, 85, true, "v7");

        cloudSoftwareStore.save(cloudSoftware1);
        cloudSoftwareStore.save(cloudSoftware2);
        cloudSoftwareStore.save(cloudSoftware3);
        cloudSoftwareStore.save(cloudSoftware4);
        cloudSoftwareStore.save(cloudSoftware5);
        cloudSoftwareStore.save(cloudSoftware6);
        cloudSoftwareStore.save(cloudSoftware7);
        cloudSoftwareStore.save(cloudSoftware8);
        cloudSoftwareStore.save(cloudSoftware9);
        cloudSoftwareStore.save(cloudSoftware10);

        cloudSoftware1.printInfo();
        System.out.println("\n");

        cloudSoftware2.printInfo();
        System.out.println("\n");

        cloudSoftware3.printInfo();
        System.out.println("\n");

        cloudSoftware4.printInfo();
        System.out.println("\n");

        cloudSoftware5.printInfo();
        System.out.println("\n");
		
        cloudSoftware6.printInfo();
        System.out.println("\n");
		
        cloudSoftware7.printInfo();
        System.out.println("\n");

        cloudSoftware8.printInfo();
        System.out.println("\n");

        cloudSoftware9.printInfo();
        System.out.println("\n");

        cloudSoftware10.printInfo();
    }
}