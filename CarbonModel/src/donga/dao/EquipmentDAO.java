package donga.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import donga.domain.EquipmentInfo;
import donga.domain.EquipmentTypeInfo;
import donga.domain.PortEquipmentInfo;
import donga.domain.TruckTypeInfo;

/**
 * @author archehyun
 *
 */
public class EquipmentDAO {
	
	
	private SqlMapClient sqlMapManager;
	public EquipmentDAO() {
		try {
			sqlMapManager =SqlMapManager.getSqlMapInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// equipment type
	public Object insertEquipmentType(EquipmentTypeInfo op) throws SQLException
	{
		return sqlMapManager.insert("Equipment.insertEquipmentType",op);
	}
	public List selectEquipmentTypeList(EquipmentTypeInfo op) throws SQLException
	{	
		return sqlMapManager.queryForList("Equipment.selectEquipmentTypeList",op);
	}
	public int deleteEquipmentType(EquipmentTypeInfo op) throws SQLException
	{
		return sqlMapManager.delete("Equipment.deleteEquipmentType",op);
	}
	public Object updateEquipmentType(EquipmentTypeInfo op) throws SQLException
	{
		return sqlMapManager.update("Equipment.updateEquipmentType",op);
	}
	
	
	// equipment
	public Object insertEquipment(EquipmentInfo op) throws SQLException
	{
		return sqlMapManager.insert("Equipment.insertEquipment",op);
	}
	public List selectEquipmentList(EquipmentInfo op) throws SQLException
	{	
		return sqlMapManager.queryForList("Equipment.selectEquipmentList",op);
	}
	public int deleteEquipment(EquipmentInfo op) throws SQLException
	{
		return sqlMapManager.delete("Equipment.deleteEquipment",op);	
	}
	public Object updateEquipment(EquipmentInfo op) throws SQLException
	{
		return sqlMapManager.update("Equipment.updateEquipment",op);
	}
	
	
	// truck type
	/**트럭 정보 저장
	 * @param op
	 * @return
	 * @throws SQLException
	 */
	public Object insertTruck(TruckTypeInfo op) throws SQLException
	{
		return sqlMapManager.insert("Equipment.insertTruckType",op);
	}
	/**트럭 목록 조회
	 * @param op
	 * @return
	 * @throws SQLException
	 */
	public List selectTruckList(TruckTypeInfo op) throws SQLException
	{	
		return sqlMapManager.queryForList("Equipment.selectTruckList",op);
	}
	public int deleteTruckInfo(TruckTypeInfo op) throws SQLException
	{
		return sqlMapManager.delete("Equipment.deleteTruckType",op);	
	}
	public Object updateTruck(TruckTypeInfo op) throws SQLException
	{
		return sqlMapManager.update("Equipment.updateTruckType",op);
	}
	
	// Port equipment
	public Object insert(PortEquipmentInfo op) throws SQLException, IOException
	{
		return sqlMapManager.insert("Equipment.insertPortEquipment",op);
	}
	public List selectList(PortEquipmentInfo op) throws SQLException, IOException
	{	
		return sqlMapManager.queryForList("Equipment.selectPortEquipmentList",op);
	}
	public int deleteInfo(PortEquipmentInfo op) throws SQLException, IOException
	{
		return SqlMapManager.getSqlMapInstance().delete("Equipment.deletePortEquipment",op);	
	}
	public Object update(PortEquipmentInfo op) throws SQLException, IOException
	{
		return sqlMapManager.update("Equipment.updatePortEquipment",op);
	}
	public List selectStaticPortEquipmentCarbonValueList(PortEquipmentInfo op) throws SQLException, IOException
	{	
		return sqlMapManager.queryForList("Equipment.selectEquipmentCarbonValue",op);
	}
	public List selectStaticAreaCarbonValueList(PortEquipmentInfo op) throws SQLException, IOException
	{	
		return sqlMapManager.queryForList("Equipment.selectAreaCarbonValue",op);
	}
	
	
	
	
}
