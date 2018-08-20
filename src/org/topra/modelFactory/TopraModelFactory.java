package org.topra.modelFactory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.MOrder;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.topra.model.TpMOrder;

public class TopraModelFactory implements IModelFactory{

	@Override
	public Class<?> getClass(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		
		if(tableName.equalsIgnoreCase(MOrder.Table_Name))
			return new TpMOrder(Env.getCtx(), Record_ID, trxName);
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		
		if(tableName.equalsIgnoreCase(MOrder.Table_Name))
			return new TpMOrder(Env.getCtx(), rs, trxName);
		
		return null;
	}

}
