class Server{
	String[] serverNames;
	ServerType[] types;
	
	Server(String[] serverNames,ServerType[] types){
		this.serverNames=serverNames;
		this.types=types;
	}
	void printInfo(){
		System.out.println("\n======server Details======");
		
		if(this.serverNames!=null){
			System.out.println("server name length:"+this.serverNames.length);
			for(String serverName:this.serverNames){
				System.out.println("Server Name:"+serverName);
			}
			if(this.types!=null){
			System.out.println("server type length:"+this.types.length);
			
			for(ServerType type:this.types){
				type.getInfo();
			}
			}
		}
	}
	
}