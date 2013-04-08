package erica.mysql.ha.model;

public interface Instance {
 
	private final String version;
	 
	private String IP;
	 
	private Instance master;
	 
	public static abstract boolean isAlive(Instance mysql);
	public abstract void getBinlog();
	public abstract void setIP(String IP);
	public abstract int setMaster(Instance master);
}
 
