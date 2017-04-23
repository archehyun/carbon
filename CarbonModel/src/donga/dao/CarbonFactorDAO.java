package donga.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import donga.domain.CarbonInfo;

public class CarbonFactorDAO {
	
	SqlMapClient sqlMapManager;
	public CarbonFactorDAO() {
		try {
			sqlMapManager =SqlMapManager.getSqlMapInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List selectCarbonFactor(CarbonInfo info) throws SQLException
	{
		return sqlMapManager.queryForList("tb_carbon_factor.selectList",info);
	}
	public Object insertCarbonFactor(CarbonInfo parameter) throws SQLException
	{
		return sqlMapManager.insert("tb_carbon_factor.insertCarbonFactor",parameter);
	}
	public Object updateCarbonFactor(CarbonInfo parameter) throws SQLException
	{
		return sqlMapManager.update("tb_carbon_factor.updateCarbonFactor",parameter);
	}
	public int deleteCarbonFactor(CarbonInfo parameter) throws SQLException
	{
		return sqlMapManager.delete("tb_carbon_factor.deleteCarbonFactor",parameter);
	}
}
