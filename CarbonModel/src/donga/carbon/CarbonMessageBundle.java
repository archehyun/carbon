package donga.carbon;

import java.util.HashMap;

public class CarbonMessageBundle extends HashMap<String, CarbonMessage>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarbonMessage getMessage(String clinetID) {
		if(this.containsKey(clinetID))
		{
			return this.get(clinetID);
		}
		else
		{
			return null;	
		}
		
	}

}
