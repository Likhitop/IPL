package main;

import service.TeamService;

public class Test {
	public static void main(String[] args) {
		TeamService service = new TeamService();
		service.printTeamDetails();	
		
		TeamService service1 = new TeamService();
		service1.printRCBTeamDetalis();	
		
		TeamService service2 = new TeamService();
		service2.printCSKTeamdetails();
			
		
		TeamService service3 = new TeamService();
		service3.printDCTeamdetails();
		
		TeamService service4 = new TeamService();
		service4.printPBKSTeamdetails();
		
		TeamService service5 = new TeamService();
		service5.printLSGTeamdetails();
		
		TeamService service6 = new TeamService();
		service6.printGTTeamdetails();
		
		TeamService service7 = new TeamService();
		service7.printKKRTeamdetails();
		
		TeamService service8 = new TeamService();
		service8.printSRHTeamdetails();
		
		TeamService service9 = new TeamService();
		service9.printRRTeamdetails();
		
		
		
		
	

}
}
