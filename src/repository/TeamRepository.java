package repository;

import entity.Team;

public class TeamRepository {
	
	public static Team getMITeamdetails() {
		
		Team team = new Team();
		team.setId(101);
		team.setTeamname("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jayvardhane");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;
		
		
	}
	//add similar methods for remaining 9 teams
	
	public static Team getRCBTeamdetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamname("Royal Challenger Bangalore");
		team.setCaptainName("Rajit patidar");
		team.setCoachName("Dinesh Karthik");
		team.setQualified(true);
		team.setnRR(5.5f);
		team.setShortName("RCB");
		return team;
		
	}
	public static Team getCSKTeamdetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamname("Chennai Super Kings");
		team.setCaptainName("Mahendra Sing Dhoni");
		team.setCoachName("Stephan Fleming");
		team.setQualified(false);
		team.setnRR(5.2f);
		team.setShortName("CSK");
		return team;
	}
	public static Team getDCTeamdetails() {
		Team team = new Team();
		team.setId(104);
		team.setTeamname("Delhi Capitals");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(5.1f);
		team.setShortName("DC");
		return team;
	}
	public static Team getPBKSTeamdetails() {
		Team team = new Team();
		team.setId(105);
		team.setTeamname("Kings XI Pnjab");
		team.setCaptainName("Shreyash Iyer");
		team.setCoachName("Ricky Pointing");
		team.setQualified(false);
		team.setnRR(5.1f);
		team.setShortName("PBKS");
		return team;
	}	
	public static Team getLSGTeamdetails() {
		Team team = new Team();
		team.setId(106);
		team.setTeamname("Lucknow Super Giants");
		team.setCaptainName("Rishab Pant");
		team.setCoachName("Justin Langer");
		team.setQualified(false);
		team.setnRR(5.7f);
		team.setShortName("LSG");
		return team;
	}	
	public static Team getGTTeamdetails() {
		Team team = new Team();
		team.setId(107);
		team.setTeamname("Gujrat Titans");
		team.setCaptainName("Shubhman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(false);
		team.setnRR(5.4f);
		team.setShortName("GT");
		return team;
	}	
	public static Team getKKRTeamdetails() {
		Team team = new Team();
		team.setId(108);
		team.setTeamname("Kolkata Knight Riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(false);
		team.setnRR(6.0f);
		team.setShortName("KKR");
		return team;
	}	
	public static Team getSRHTeamdetails() {
		Team team = new Team();
		team.setId(109);
		team.setTeamname("Sunrises Hydrabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setQualified(false);
		team.setnRR(8.5f);
		team.setShortName("SRH");
		return team;
	}	
	public static Team getRRTeamdetails() {
		Team team = new Team();
		team.setId(110);
		team.setTeamname("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(false);
		team.setnRR(8.0f);
		team.setShortName("RR");
		return team;
	}	


}
