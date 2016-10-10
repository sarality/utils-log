package com.sarality.util.log;

import android.app.Activity;

/**
 * Utility class to display resource information.
 *
 * @author abhideep@ (Abhideep Singh)
 */
public class Resources {

  public static String name(Activity activity, int resourceId) {
    try {
      return activity.getResources().getResourceName(resourceId);
    } catch (android.content.res.Resources.NotFoundException nfe) {
      return String.valueOf(resourceId);
    }
  }
}
