/*
 * This file is generated by jOOQ.
 */
package generated.jooq


import generated.jooq.tables.Company
import generated.jooq.tables.Computer

import javax.annotation.Generated

import org.jooq.Index
import org.jooq.OrderField
import org.jooq.impl.Internal

import scala.Array


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.11.9"
  ),
  comments = "This class is generated by jOOQ"
)
object Indexes {

  // -------------------------------------------------------------------------
  // INDEX definitions
  // -------------------------------------------------------------------------

  val PK_COMPANY = Indexes0.PK_COMPANY
  val IX_COMPUTER_COMPANY_1 = Indexes0.IX_COMPUTER_COMPANY_1
  val PK_COMPUTER = Indexes0.PK_COMPUTER

  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private object Indexes0 {
    val PK_COMPANY : Index = Internal.createIndex("pk_company", Company.COMPANY, Array[OrderField [_] ](Company.COMPANY.ID), true)
    val IX_COMPUTER_COMPANY_1 : Index = Internal.createIndex("ix_computer_company_1", Computer.COMPUTER, Array[OrderField [_] ](Computer.COMPUTER.COMPANY_ID), false)
    val PK_COMPUTER : Index = Internal.createIndex("pk_computer", Computer.COMPUTER, Array[OrderField [_] ](Computer.COMPUTER.ID), true)
  }
}