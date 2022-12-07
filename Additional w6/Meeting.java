public class Meeting {
	private String time;
	private String location;
	private String subject;
 
	public Meeting (String initialTime, String initialLocation, String initialSubject) {
		this.time=initialTime;
		this.location=initialLocation;
		this.subject=initialSubject;
	}

	public void setTime(String newTime) {
        this.time=newTime;
	}

	public void setLocation(String newLocation) {
		this.location=newLocation;
	}

	public void setSubject(String newSubject) {
		this.subject=newSubject;
	}

	public String getSubject() {
		return this.subject;
	}
    
	public void printDetails() {
		System.out.println("meeting in " + this.location + " at " + this.time + " subject: "+ this.subject);
	}
}