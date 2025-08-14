package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	
	
	
	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team detailss by short name");
		System.out.println("3. Get team details by id : ");
		
		int input = sc.nextInt();
		System.err.println("You have selected option : "+input);
		
		switch(input) {
		case 1:{
			
			System.out.println(TeamRepository.getMITeamdetails());
			System.out.println(TeamRepository.getRCBTeamdetails());
			System.out.println(TeamRepository.getCSKTeamdetails());
			System.out.println(TeamRepository.getRRTeamdetails());
			System.out.println(TeamRepository.getKKRTeamdetails());
			System.out.println(TeamRepository.getLSGTeamdetails());
			System.out.println(TeamRepository.getGTTeamdetails());
			System.out.println(TeamRepository.getDCTeamdetails());
			System.out.println(TeamRepository.getPBKSTeamdetails());
			System.out.println(TeamRepository.getSRHTeamdetails());
			break;
		}
		case 2:{
			
			System.out.println("Plz enter your fav team shrt name : ");
			String teamShortName = sc.next();
			System.err.println("Entered team short name is : "+teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		case 3:{
			
			System.out.println("Plz enter your fav team id : ");
			int teamID = sc.nextInt();
			System.err.println("Entered team short ID is : "+teamID);
			getTeamByID(teamID);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value:" +input);
		}
	}
	
	private void getTeamByShortName(String shortName) {
		
		switch(shortName){
		case "MI":{
			System.err.println("MI team case executed");
		    System.out.println(TeamRepository.getMITeamdetails());
			break;
		}
		case "RCB":{
			System.err.println("RCB team case executed");
		    System.out.println(TeamRepository.getRCBTeamdetails());
			break;
			
		}
		case"CSK":{
			System.out.println(TeamRepository.getCSKTeamdetails());
			break;
		}
		case"RR":{
			System.out.println(TeamRepository.getRRTeamdetails());
			break;
			
		}
		case"SRH":{
			System.out.println(TeamRepository.getSRHTeamdetails());
			break;
		
		}
		case"GT":{
			 System.out.println(TeamRepository.getGTTeamdetails());
				break;
			
		}
		case"LSG":{
			 System.out.println(TeamRepository.getLSGTeamdetails());
				break;
		}
		case"KKR":{
			 System.out.println(TeamRepository.getKKRTeamdetails());
				break;
		}
		case"DC":{
			 System.out.println(TeamRepository.getDCTeamdetails());
				break;
		}
		case"PBKS":
			 System.out.println(TeamRepository.getPBKSTeamdetails());
				break;
		default:
			throw new IllegalArgumentException("Unexpected value:" +shortName);
			
		}
		
		
	}
	

private void getTeamByID(int id) {
if (id == 101) {
		System.out.println(TeamRepository.getMITeamdetails());
	}
else if (id == 102) {
	System.out.println(TeamRepository.getRCBTeamdetails());
}
else if (id == 103) {
	System.out.println(TeamRepository.getCSKTeamdetails());
}
else if (id == 104) {
	System.out.println(TeamRepository.getDCTeamdetails());
}
else if (id == 105) {
	System.out.println(TeamRepository.getPBKSTeamdetails());
}
else if (id == 106) {
	System.out.println(TeamRepository.getLSGTeamdetails());
}
else if (id == 107) {
	System.out.println(TeamRepository.getGTTeamdetails());
}
else if (id == 108) {
	System.out.println(TeamRepository.getKKRTeamdetails());
}
else if (id == 109) {
	System.out.println(TeamRepository.getSRHTeamdetails());
}
else if (id == 110) {
	System.out.println(TeamRepository.getRRTeamdetails());
}
}

	
}


