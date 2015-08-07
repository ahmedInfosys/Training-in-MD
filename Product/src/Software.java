
public class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os;
	public String getProgrammer() {
		return programmer;
	}
	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	} 
    
	 public void print_results(){
	    	System.out.println(toString() + "\nProgrammer: " +  getProgrammer() + "\nPlatform: " +  getPlatform() + "\nOperating System: " + getOs() );
	    }
}