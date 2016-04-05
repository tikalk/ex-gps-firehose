package com.tikal.fleettracker.gpsFirehose;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("socket")
public class SocketSender implements GpsSender{
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SocketSender.class);
	
	@Override
	public void send(final String g) throws Exception{
	}
}
