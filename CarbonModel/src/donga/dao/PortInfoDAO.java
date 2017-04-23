package donga.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import donga.domain.PortInfo;

public class PortInfoDAO {
	
	public Object insertPortInfo(PortInfo op) throws SQLException, IOException
	{
		return SqlMapManager.getSqlMapInstance().insert("Port.insert",op);
	}
	public List selectPortInfo(PortInfo op) throws SQLException, IOException
	{
		return SqlMapManager.getSqlMapInstance().queryForList("Port.selectList",op);
	}
	public int deletePortInfo(PortInfo op) throws SQLException, IOException
	{
		return SqlMapManager.getSqlMapInstance().delete("Port.delete",op);	
	}
	public Object updatePortInfo(PortInfo op) throws SQLException, IOException
	{
		return SqlMapManager.getSqlMapInstance().update("Port.update",op);
	}	
}
