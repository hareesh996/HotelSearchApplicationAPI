package com.strikers.utils.logger;

public class Utils {

	public static String concat(Object...parts){
		if( parts == null || parts.length == 0 ){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for( Object s : parts ){
			sb.append( s );
		}
		return sb.toString();
	}
	
}
