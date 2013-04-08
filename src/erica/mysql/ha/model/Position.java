package erica.mysql.ha.model;

public abstract class Position {
 
	private String file;
	 
	private String pos;
	 
	public abstract boolean isBehindMaster(Position master);
}
 
