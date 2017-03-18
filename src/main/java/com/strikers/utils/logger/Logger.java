package com.strikers.utils.logger;

public interface Logger {
	
	public boolean isDebug();
	
	public void debug(Object...message);
	
	public boolean isInfo();
	
	public void info(Object...message);
	
	public boolean isWarn();
	
	public void warn(Object...message);
	
	public boolean isError();
	
	public void error(Object...message);
	
	public boolean isTrace();
	
	public void trace(Object...message);
	
}
