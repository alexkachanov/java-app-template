package com.kachanov.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger( Main.class );

	public static void main( String[] args ) {
		logger.info( "app started" );
		System.out.println( "app" );
		logger.info( "app finished" );
	}

}