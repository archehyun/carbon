package donga.dao;

import java.io.IOException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

public class CarbonValueDAO {
	
	private SqlMapClient sqlMap;

	public CarbonValueDAO() {
		try {

			sqlMap = SqlMapManager.getSqlMapInstance();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List selectCarbonValue()
	{
		return null;
	}

}
