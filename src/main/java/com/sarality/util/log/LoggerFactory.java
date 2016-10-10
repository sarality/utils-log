package com.sarality.util.log;

/**
 * Factory for a Logger that skips the logger level checks
 *
 * @author abhideep@ (Abhideep Singh)
 */
public class LoggerFactory {

  public static Logger getLogger(Class<?> loggerClass) {
    return new Logger(loggerClass.getSimpleName());
  }
}
