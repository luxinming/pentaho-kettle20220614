/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.di.core.plugins;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation describes extra plugin-specific class types to be managed by the registry.
 * <p>
 * The type, implementation and nodeName arrays are correlated 1-to-1.
 *
 * @author nbaker
 *
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
public @interface PluginClassTypeMapping {
  /**
   * Returns an array of class types that the PluginType will track and respond to. these classes are ususaly interfaces
   * and the implementation class needs to decend from them
   *
   * @return array of class types
   */
  Class<?>[] classTypes();

  /**
   * Returns as array of implementations that correspond to the class types in the Annotation
   *
   * @return
   */
  Class<?>[] implementationClass() default {
  // Empty
  };

}
