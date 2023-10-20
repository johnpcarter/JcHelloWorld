package jc.api.helloworld_.services;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
// --- <<IS-END-IMPORTS>> ---

public final class priv

{
	// ---( internal utility methods )---

	final static priv _instance = new priv();

	static priv _newInstance() { return new priv(); }

	static priv _cast(Object o) { return (priv)o; }

	// ---( server methods )---




	public static final void forceGC (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(forceGC)>> ---
		// @sigtype java 3.5
		System.gc();
		System.runFinalization();
			
		// --- <<IS-END>> ---

                
	}



	public static final void getHostName (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getHostName)>> ---
		// @sigtype java 3.5
		// [o] field:0:required hostname
		// pipeline in
		 
		// pipeline out
		IDataCursor pipelineCursor = pipeline.getCursor();
		try {
			IDataUtil.put(pipelineCursor, "hostname", InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			IDataUtil.put(pipelineCursor, "hostname", "unknown");
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void throwInvalidNameException (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(throwInvalidNameException)>> ---
		// @sigtype java 3.5
		// [i] field:0:required name
		// pipeline in
		
		IDataCursor pipelineCursor = pipeline.getCursor();
		String name = IDataUtil.getString( pipelineCursor, "name");
		pipelineCursor.destroy();
		
		throw new InvalidNameException(name);
		
		// pipeline
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	
	public static class InvalidNameException extends ServiceException {
	
		public InvalidNameException(String name) {
			super("Invalid name: " +  name);
		}
		
	}
	
	public static String convert(String arg) throws IOException {
	
	    int width = 600;
	    int height = 30;
	
	    //BufferedImage image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
	    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    Graphics g = image.getGraphics();
	    g.setFont(new Font("SansSerif", Font.BOLD, 24));
	
	    Graphics2D graphics = (Graphics2D) g;
	    graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
	            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	    graphics.drawString(arg, 10, 20);
	
	    //save this image
	    //ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));
	
	    String out = "";
	    
	    for (int y = 0; y < height; y++) {
	        StringBuilder sb = new StringBuilder();
	        for (int x = 0; x < width; x++) {
	
	            sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");
	
	        }
	
	        if (sb.toString().trim().isEmpty()) {
	            continue;
	        }
	
	        out += sb + "\n";
	    }
	    
	    return out;
	}
		
	// --- <<IS-END-SHARED>> ---
}

