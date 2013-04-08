package erica.mysql.ha.model;
/**
 * 
 * @author Erica
 * @version 1.0
 */
public  class Instance {
 
	private String version;
	 
	private String IP;
	 
	private Instance master;
	 
	/**
	 * 判断一个mysql实例是否有效
	 * @param mysql 需要进行判断的实例
	 * @return
	 */
	public static boolean isAlive(Instance mysql){
		return false;
	}
	public  void getBinlog(){
		
	}
	public  void setIP(String IP){
		
	}
	public int switchToMaster(MasterInfo master){
		return 0;
	}
	
}
 
