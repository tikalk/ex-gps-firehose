package com.tikal.fleettracker.gpsFirehose;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.goebl.david.Response;
import com.goebl.david.Webb;

@Component
@Profile("http")
public class HttpSender implements GpsSender{
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(HttpSender.class);

	
	@Override
	public void send(final String g) throws Exception{
	}
}


