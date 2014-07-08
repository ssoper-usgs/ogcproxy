package gov.usgs.wqp.ogcproxy.model.sources;

/**
 * DataInputType
 * @author prusso
 *<br /><br />
 *	This enumeration explicitly defines all supported Data Formats 
 *	for a dataset used for creating a shapefile.
 */
public enum DataInputType {
	WQX_OB_XML, WQX_OB_FIS, UNKNOWN;

	public static DataInputType getTypeFromString(String string) {
		if (string.equals("WQX_OB_XML")) {
			return WQX_OB_XML;
		}
		
		if (string.equals("WQX_OB_FIS")) {
			return WQX_OB_FIS;
		}
		
		if (string.equals("UNKNOWN")) {
			return UNKNOWN;
		}

		return WQX_OB_XML;
	}

	public static String getStringFromType(DataInputType type) {
		switch (type) {
			case WQX_OB_XML: {
				return "WQX_OB_XML";
			}
			
			case WQX_OB_FIS: {
				return "WQX_OB_FIS";
			}
			
			case UNKNOWN: {
				return "UNKNOWN";
			}
			
			default: {
				return "WQX_OB_XML";
			}
		}
	}
}
