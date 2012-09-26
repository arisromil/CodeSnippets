package sql;

public class SQL {

	//paging in MS SQL SERVER
	public static final String PAGING_SQL ="select * from (select ROW_NUMBER() over (order by itemid) as rownum, * from Item) i where i.rownum between 1 and 50"; 
	
}
