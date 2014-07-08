package gov.usgs.wqp.ogcproxy.model.attributes;

/**
 * BaseAttributeType
 * @author prusso
 *<br /><br />
 *	This enumeration explicitly defines all known WQP Feature Attributes possible
 *	in a dataset used for creating a shapefile.
 */
public enum BaseAttributeType {
	Provider, LocationIdentifier, LocationType, Latitude, Longitude, UNKNOWN;

	public static BaseAttributeType getTypeFromString(String string) {
		if (string.equals("Provider")) {
			return Provider;
		}
		
		if (string.equals("LocationIdentifier")) {
			return LocationIdentifier;
		}
		
		if (string.equals("LocationType")) {
			return LocationType;
		}

		if (string.equals("Latitude")) {
			return Latitude;
		}
		
		if (string.equals("Longitude")) {
			return Longitude;
		}

		return UNKNOWN;
	}

	public static String getStringFromType(BaseAttributeType type) {
		switch (type) {
			case Provider: {
				return "Provider";
			}
			
			case LocationIdentifier: {
				return "LocationIdentifier";
			}
			
			case LocationType: {
				return "LocationType";
			}
			
			case Latitude: {
				return "Latitude";
			}
			
			case Longitude: {
				return "Longitude";
			}
			
			default: {
				return "UNKNOWN";
			}
		}
	}
}
