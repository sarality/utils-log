package com.sarality.util.log;

import android.util.Log;

import org.slf4j.helpers.MessageFormatter;

/**
 * Logger that delegates to Android Logger
 *
 * @author abhideep@ (Abhideep Singh)
 */
public class Logger {

  private final String tag;

  public Logger(String tag) {
    this.tag = tag;
  }

  public void debug(String format, Object... arguments) {
    Log.d(tag, MessageFormatter.arrayFormat(format, arguments).getMessage());
  }

  public void trace(String format, Object... arguments) {
    Log.v(tag, MessageFormatter.arrayFormat(format, arguments).getMessage());
  }
}
