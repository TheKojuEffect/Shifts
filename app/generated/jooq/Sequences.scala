/*
 * This file is generated by jOOQ.
 */
package generated.jooq


import java.lang.Long

import javax.annotation.Generated

import org.jooq.Sequence
import org.jooq.impl.SequenceImpl

import scala.Array


/**
 * Convenience access to all sequences in public
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.11.9"
  ),
  comments = "This class is generated by jOOQ"
)
object Sequences {

  /**
   * The sequence <code>public.company_seq</code>
   */
  val COMPANY_SEQ : Sequence[Long] = new SequenceImpl[Long]("company_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false))

  /**
   * The sequence <code>public.computer_seq</code>
   */
  val COMPUTER_SEQ : Sequence[Long] = new SequenceImpl[Long]("computer_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false))
}