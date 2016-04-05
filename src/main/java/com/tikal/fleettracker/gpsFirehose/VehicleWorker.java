package com.tikal.fleettracker.gpsFirehose;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

public class VehicleWorker implements Runnable {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(VehicleWorker.class);

	private final SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");

	

	@Override
	public void run() {
		

	}

	

}
