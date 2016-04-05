package com.tikal.fleettracker.gpsFirehose;

public interface GpsSender {
	void send(final String g) throws Exception;
}
