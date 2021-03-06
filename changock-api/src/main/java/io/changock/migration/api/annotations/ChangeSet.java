package io.changock.migration.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Set of changes to be added to the DB. Many changesets are included in one changelog.
 *
 *
 * @see ChangeLog
 * @since 27/07/2014
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ChangeSet {

  /**
   * Author of the changeset.
   * Obligatory
   *
   * @return author
   */
  String author();  // must be set

  /**
   * Unique ID of the changeset.
   * Obligatory
   *
   * @return unique id
   */
  String id();      // must be set

  /**
   * Sequence that provide correct order for changeSets. Sorted alphabetically, ascending.
   * Obligatory.
   *
   * @return ordering
   */
  String order();   // must be set

  /**
   * Executes the change set on every Changock's execution, even if it has been run before.
   * Optional (default is false)
   *
   * @return should run always?
   */
  boolean runAlways() default false;

  /**
   * Specifies the software systemVersion on which the ChangeSet is to be applied.
   * Optional (default is 0 and means all)
   *
   * @return systemVersion
   */
  String systemVersion() default "0";

  /**
   * If true, will make the entire migration to break if the changeSet produce an exception or the validation doesn't
   * success. Migration will continue otherwise.
   * @return failFast
   */
  boolean failFast() default true;

}
