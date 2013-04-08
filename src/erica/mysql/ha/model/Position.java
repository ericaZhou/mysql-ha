package erica.mysql.ha.model;

public interface Position {
 
	private String file;
	 
	private String pos;
	 
	public abstract boolean isBehindMaster(Position master);
}
 
