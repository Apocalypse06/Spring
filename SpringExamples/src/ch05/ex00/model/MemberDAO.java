package ch05.ex00.model;

import java.util.List;

public interface MemberDAO {
	/** 
	 *  新增一筆記錄
	 */
	public int save(Member mem);
    /** 
    *  依主鍵讀取一筆記錄
	*/
	public Member get(int id);
	
	
	public boolean idExists(String id);
   /** 
    *  依主鍵更新一筆記錄
    */	
	public int update(Member mem);
   /** 
    *  依主鍵刪除一筆記錄
    */
	public int delete(Integer pk) ;
   /** 
    * 讀取多筆記錄
    */
	public List<Member> getAll() ;
}
