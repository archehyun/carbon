package donga.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import donga.domain.ResultInfo;

public class ResultDAO {

	//protected Logger logger = Logger.getLogger(getClass());
	protected SqlMapClient sqlMap;

	public ResultDAO() {
		try {

			sqlMap = SqlMapManager.getSqlMapInstance();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getTotalCarbonValue() throws SQLException
	{

		return (int) sqlMap.queryForObject("tb_carbon_result.selectTotalCarbonValue");
	}

	public List searchResult() throws SQLException
	{
		return sqlMap.queryForList("tb_carbon_result.selectResult");
	}
	
	
	// 장비ID별 배출량 합계
	public List searchSumByEquipmentCode() throws SQLException
	{
		return sqlMap.queryForList("tb_carbon_result.selectSumByEquipmentCode");
	}
	
	// 장비ID별 배출량 합계
	public List searchSumByEquipmentType() throws SQLException
	{
		return sqlMap.queryForList("tb_carbon_result.selectSumByEquipmentType");
	}
	
	public Object insertResult(ResultInfo info) throws SQLException
	{
		return sqlMap.insert("mysql_tb_carbon_result.insert",info);
	}
	/**
	 * @return
	 * @throws SQLException
	 */
	public int deleteResult() throws SQLException
	{
		return sqlMap.delete("tb_carbon_result.delete");
	}
	public List selectList()
	{
		return null;
	}

	public List searchSumByArea()  throws SQLException{
		// TODO Auto-generated method stub
		return sqlMap.queryForList("tb_carbon_result.selectSumByEquipmentType");
	}
}
