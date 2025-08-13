package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	
	public void printTeamDetails() {
		
	Team team = TeamRepository.getMITeamdetails();
	System.out.println(team.getId());
	System.out.println(team.getTeamname());
	System.out.println(team.getCaptainName());
	System.out.println(team.getCoachName());
	System.out.println(team.getnRR());
	System.out.println(team.isQualified());
	}
	public void printRCBTeamDetalis() {
		Team team = TeamRepository.getRCBTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
		
	}
	public void printCSKTeamdetails() {
		Team team = TeamRepository.getCSKTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
		
	}
	public void printDCTeamdetails() {
		Team team = TeamRepository.getDCTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}	
	public void printPBKSTeamdetails() {
		Team team = TeamRepository.getPBKSTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}
	public void printLSGTeamdetails() {
		Team team = TeamRepository.getLSGTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}	
	public void printGTTeamdetails() {
		Team team = TeamRepository.getGTTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}	
	public void printKKRTeamdetails() {
		Team team = TeamRepository.getKKRTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}	
	public void printSRHTeamdetails() {
		Team team = TeamRepository.getSRHTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}
	public void printRRTeamdetails() {
		Team team = TeamRepository.getRRTeamdetails();
		System.out.println(team.getId());
		System.out.println(team.getTeamname());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}




}
