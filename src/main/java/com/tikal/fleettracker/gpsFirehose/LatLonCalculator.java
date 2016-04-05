package com.tikal.fleettracker.gpsFirehose;

public class LatLonCalculator {
	public static double distance(final double lat1, final double lon1, final double lat2, final double lon2, final String unit) {
		final double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
				+ Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}

		return (dist);
	}
	
	public static double angleFromCoordinate(final double lat1, final double long1, final double lat2, final double long2) {

		final double dLon = (long2 - long1);

		final double y = Math.sin(dLon) * Math.cos(lat2);
		final double x = Math.cos(lat1) * Math.sin(lat2) - Math.sin(lat1) * Math.cos(lat2) * Math.cos(dLon);

		double brng = Math.atan2(y, x);

		brng = Math.toDegrees(brng);
		brng = (brng + 360) % 360;
		brng = 360 - brng;

		return brng;
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts decimal degrees to radians : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double deg2rad(final double deg) {
		return (deg * Math.PI / 180.0);
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts radians to decimal degrees : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double rad2deg(final double rad) {
		return (rad * 180 / Math.PI);
	}
}
