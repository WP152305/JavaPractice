/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *     |_  IDBManager
 *
 * 1.  개요 :
 * 2.  작성일 :  2017. 5. 25.
 * <pre>
 * 
 * @author  :  김동현
 * @version  : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		IDBManager idbmanager = null;
		if(database.equals(ORACLE_DATABASE)){
			idbmanager=new OracleDB();}
			else if(database.equals(SYBASE_DATABASE)){
				idbmanager = new SybaseDB();
			}
			return idbmanager;
		}
	}

