/*
 * This file is generated by jOOQ.
 */
package generated.jooq.tables.records


import generated.jooq.tables.Computer

import java.lang.Long
import java.lang.String
import java.sql.Timestamp

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.11.9"
  ),
  comments = "This class is generated by jOOQ"
)
class ComputerRecord extends UpdatableRecordImpl[ComputerRecord](Computer.COMPUTER) with Record5[Long, String, Timestamp, Timestamp, Long] {

  /**
   * Setter for <code>public.computer.id</code>.
   */
  def setId(value : Long) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.computer.id</code>.
   */
  def getId : Long = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Long]
  }

  /**
   * Setter for <code>public.computer.name</code>.
   */
  def setName(value : String) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.computer.name</code>.
   */
  def getName : String = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>public.computer.introduced</code>.
   */
  def setIntroduced(value : Timestamp) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.computer.introduced</code>.
   */
  def getIntroduced : Timestamp = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Timestamp]
  }

  /**
   * Setter for <code>public.computer.discontinued</code>.
   */
  def setDiscontinued(value : Timestamp) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>public.computer.discontinued</code>.
   */
  def getDiscontinued : Timestamp = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Timestamp]
  }

  /**
   * Setter for <code>public.computer.company_id</code>.
   */
  def setCompanyId(value : Long) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>public.computer.company_id</code>.
   */
  def getCompanyId : Long = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Long]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key : Record1[Long] = {
    return super.key.asInstanceOf[ Record1[Long] ]
  }

  // -------------------------------------------------------------------------
  // Record5 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row5[Long, String, Timestamp, Timestamp, Long] = {
    super.fieldsRow.asInstanceOf[ Row5[Long, String, Timestamp, Timestamp, Long] ]
  }

  override def valuesRow : Row5[Long, String, Timestamp, Timestamp, Long] = {
    super.valuesRow.asInstanceOf[ Row5[Long, String, Timestamp, Timestamp, Long] ]
  }
  override def field1 : Field[Long] = Computer.COMPUTER.ID
  override def field2 : Field[String] = Computer.COMPUTER.NAME
  override def field3 : Field[Timestamp] = Computer.COMPUTER.INTRODUCED
  override def field4 : Field[Timestamp] = Computer.COMPUTER.DISCONTINUED
  override def field5 : Field[Long] = Computer.COMPUTER.COMPANY_ID
  override def component1 : Long = getId
  override def component2 : String = getName
  override def component3 : Timestamp = getIntroduced
  override def component4 : Timestamp = getDiscontinued
  override def component5 : Long = getCompanyId
  override def value1 : Long = getId
  override def value2 : String = getName
  override def value3 : Timestamp = getIntroduced
  override def value4 : Timestamp = getDiscontinued
  override def value5 : Long = getCompanyId

  override def value1(value : Long) : ComputerRecord = {
    setId(value)
    this
  }

  override def value2(value : String) : ComputerRecord = {
    setName(value)
    this
  }

  override def value3(value : Timestamp) : ComputerRecord = {
    setIntroduced(value)
    this
  }

  override def value4(value : Timestamp) : ComputerRecord = {
    setDiscontinued(value)
    this
  }

  override def value5(value : Long) : ComputerRecord = {
    setCompanyId(value)
    this
  }

  override def values(value1 : Long, value2 : String, value3 : Timestamp, value4 : Timestamp, value5 : Long) : ComputerRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this
  }

  /**
   * Create a detached, initialised ComputerRecord
   */
  def this(id : Long, name : String, introduced : Timestamp, discontinued : Timestamp, companyId : Long) = {
    this()

    set(0, id)
    set(1, name)
    set(2, introduced)
    set(3, discontinued)
    set(4, companyId)
  }
}