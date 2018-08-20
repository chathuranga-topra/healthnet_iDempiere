package org.topra.colloutFactory;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.MOrderLine;
import org.topra.collout.CalloutOrder;

public class TopraColloutFactory implements IColumnCalloutFactory{

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		
		List<IColumnCallout> list = new ArrayList<IColumnCallout>();
		
		if(tableName.equalsIgnoreCase(MOrderLine.Table_Name) && columnName.equalsIgnoreCase(MOrderLine.COLUMNNAME_M_Product_ID)){
			list.add(new CalloutOrder());
		}
		return list != null ?list.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}
}
