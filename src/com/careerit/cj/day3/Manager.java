package com.careerit.cj.day3;


class Server{
	
	String ip;
	String country;
	boolean status;

	public Server(String ip,String country, boolean status) {
		this.ip = ip;
		this.country = country;
		this.status = status;
	}	
}
class ServerService{
		
		public static Server[] getServers() {
			return new Server[] {
					
					new Server("123.2.3.14", "UK",true),
					new Server("124.2.3.24", "UK",false),
					new Server("151.2.3.34", "UK",true),
					new Server("1.2.3.41", "USA",false),
					new Server("1.2.3.42", "IND",true),
					new Server("1.2.3.43", "IND",true),
					new Server("1.2.3.44", "UK",false),
					new Server("1.2.3.46", "SGA",true),
					new Server("1.2.3.48", "SGA",false),
					new Server("1.2.3.49", "UK",true)
			};
		}
}


public class Manager {

	public static void main(String[] args) {
		
			Server[] servers = ServerService.getServers();
			
			// Get all active server ip address of "UK"
			for(Server s:servers) {
				if(s.status == true && s.country == "UK") {
					System.out.println(s.ip);
				}
			}
	}
}
