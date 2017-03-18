package com.strikers.utils.logger;

import org.slf4j.LoggerFactory;

public class LogBackLogger implements Logger {

	public transient org.slf4j.Logger logger;
	
	public static LogBackLogger getLogger(Class<?> cls){
		LogBackLogger logBackLogger = new LogBackLogger();
		logBackLogger.logger = LoggerFactory.getLogger(cls);
		return logBackLogger;
	}
	
	private String concat( Object... parts ){
		if( parts == null || parts.length == 0 ){
			return "";
		}
		StringBuilder sb = new StringBuilder();

		for( Object s : parts ){
			sb.append( s );
		}

		return sb.toString();
	}
	
	@Override
	public boolean isDebug() {
		return 	logger.isDebugEnabled();
	}

	@Override
	public void debug(Object... message) {
		logger.debug(concat(message));
	}

	@Override
	public boolean isInfo() {
		return logger.isInfoEnabled();
	}

	@Override
	public void info(Object... message) {
		logger.info(concat(message));
	}

	@Override
	public boolean isWarn() {
		return logger.isWarnEnabled();
	}

	@Override
	public void warn(Object... message) {
		logger.warn(concat(message));
	}

	@Override
	public boolean isError() {
		return logger.isErrorEnabled();
	}

	@Override
	public void error(Object... message) {
		logger.error(concat(message));
	}

	@Override
	public boolean isTrace() {
		return logger.isTraceEnabled();
	}

	@Override
	public void trace(Object... message) {
		logger.trace(concat(message));
	}

}
