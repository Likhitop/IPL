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
		return team;
		
		
	}
	//add similar methods for remaining 9 teams
	
	public static Team getRCBTeamdetails() {
		Team team = new Team();
		team.setId(111);
		team.setTeamname("Royal Challenger Bangalore");
		team.setCaptainName("Rajit patidar");
		team.setCoachName("Dinesh Karthik");
		team.setQualified(true);
		team.setnRR(5.5f);
		return team;
		
	}
	public static Team getCSKTeamdetails() {
		Team team = new Team();
		team.setId(222);
		team.setTeamname("Chennai Super Kings");
		team.setCaptainName("Mahendra Sing Dhoni");
		team.setCoachName("Stephan Fleming");
		team.setQualified(false);
		team.setnRR(5.2f);
		return team;
	}
	public static Team getDCTeamdetails() {
		Team team = new Team();
		team.setId(333);
		team.setTeamname("Delhi Capitals");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(5.1f);
		return team;
	}
	public static Team getPBKSTeamdetails() {
		Team team = new Team();
		team.setId(451);
		team.setTeamname("Kings XI Pnjab");
		team.setCaptainName("Shreyash Iyer");
		team.setCoachName("Ricky Pointing");
		team.setQualified(false);
		team.setnRR(5.1f);
		return team;
	}	
	public static Team getLSGTeamdetails() {
		Team team = new Team();
		team.setId(555);
		team.setTeamname("Lucknow Super Giants");
		team.setCaptainName("Rishab Pant");
		team.setCoachName("Justin Langer");
		team.setQualified(false);
		team.setnRR(5.7f);
		return team;
	}	
	public static Team getGTTeamdetails() {
		Team team = new Team();
		team.setId(123);
		team.setTeamname("Gujrat Titans");
		team.setCaptainName("Shubhman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(false);
		team.setnRR(5.4f);
		return team;
	}	
	public static Team getKKRTeamdetails() {
		Team team = new Team();
		team.setId(321);
		team.setTeamname("Kolkata Knight Riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(false);
		team.setnRR(6.0f);
		return team;
	}	
	public static Team getSRHTeamdetails() {
		Team team = new Team();
		team.setId(220);
		team.setTeamname("Sunrises Hydrabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setQualified(false);
		team.setnRR(8.5f);
		return team;
	}	
	public static Team getRRTeamdetails() {
		Team team = new Team();
		team.setId(211);
		team.setTeamname("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(false);
		team.setnRR(8.0f);
		return team;
	}	


}
