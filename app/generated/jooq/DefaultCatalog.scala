/*
 * This file is generated by jOOQ.
 */
package generated.jooq


import java.util.Arrays
import java.util.List

import org.jooq.Schema
import org.jooq.impl.CatalogImpl


object DefaultCatalog {

  /**
   * The reference instance of <code>DEFAULT_CATALOG</code>
   */
  val DEFAULT_CATALOG = new DefaultCatalog
}

/**
 * This class is generated by jOOQ.
 */
class DefaultCatalog extends CatalogImpl("") {

  /**
   * The schema <code>public</code>.
   */
  val PUBLIC = Public.PUBLIC

  override def getSchemas : List[Schema] = {
    return Arrays.asList[Schema](
      Public.PUBLIC)
  }
}
