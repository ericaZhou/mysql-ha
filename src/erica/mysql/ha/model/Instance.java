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
	 * �ж�һ��mysqlʵ���Ƿ���Ч
	 * @param mysql ��Ҫ�����жϵ�ʵ��
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
 
