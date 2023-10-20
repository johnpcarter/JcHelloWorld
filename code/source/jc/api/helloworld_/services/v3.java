package jc.api.helloworld_.services;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class v3

{
	// ---( internal utility methods )---

	final static v3 _instance = new v3();

	static v3 _newInstance() { return new v3(); }

	static v3 _cast(Object o) { return (v3)o; }

	// ---( server methods )---




	public static final void goodByeWorld (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(goodByeWorld)>> ---
		// @sigtype java 3.5
		// [i] field:0:required name
		// [o] field:0:required output
		
		// pipeline in
		
		IDataCursor pipelineCursor = pipeline.getCursor();
		String name = IDataUtil.getString(pipelineCursor, "name");
		
		// process
		
		String output = "Goodbye " + name;
		
		// pipeline out
		
		IDataUtil.put(pipelineCursor, "output", output);
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

