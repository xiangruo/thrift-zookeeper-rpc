/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.qijiabin.demo.monitor.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-09")
public class BizMethodInvokeInfo implements org.apache.thrift.TBase<BizMethodInvokeInfo, BizMethodInvokeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BizMethodInvokeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BizMethodInvokeInfo");

  private static final org.apache.thrift.protocol.TField TOTAL_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalCount", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SUCCESS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("successCount", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField FAILURE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("failureCount", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SUCCESS_AVERAGE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("successAverageTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField SUCCESS_MIN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("successMinTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField SUCCESS_MAX_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("successMaxTime", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BizMethodInvokeInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BizMethodInvokeInfoTupleSchemeFactory());
  }

  public long totalCount; // required
  public long successCount; // required
  public long failureCount; // required
  public long successAverageTime; // required
  public long successMinTime; // required
  public long successMaxTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_COUNT((short)1, "totalCount"),
    SUCCESS_COUNT((short)2, "successCount"),
    FAILURE_COUNT((short)3, "failureCount"),
    SUCCESS_AVERAGE_TIME((short)4, "successAverageTime"),
    SUCCESS_MIN_TIME((short)5, "successMinTime"),
    SUCCESS_MAX_TIME((short)6, "successMaxTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOTAL_COUNT
          return TOTAL_COUNT;
        case 2: // SUCCESS_COUNT
          return SUCCESS_COUNT;
        case 3: // FAILURE_COUNT
          return FAILURE_COUNT;
        case 4: // SUCCESS_AVERAGE_TIME
          return SUCCESS_AVERAGE_TIME;
        case 5: // SUCCESS_MIN_TIME
          return SUCCESS_MIN_TIME;
        case 6: // SUCCESS_MAX_TIME
          return SUCCESS_MAX_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALCOUNT_ISSET_ID = 0;
  private static final int __SUCCESSCOUNT_ISSET_ID = 1;
  private static final int __FAILURECOUNT_ISSET_ID = 2;
  private static final int __SUCCESSAVERAGETIME_ISSET_ID = 3;
  private static final int __SUCCESSMINTIME_ISSET_ID = 4;
  private static final int __SUCCESSMAXTIME_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SUCCESS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("successCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FAILURE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("failureCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SUCCESS_AVERAGE_TIME, new org.apache.thrift.meta_data.FieldMetaData("successAverageTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SUCCESS_MIN_TIME, new org.apache.thrift.meta_data.FieldMetaData("successMinTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SUCCESS_MAX_TIME, new org.apache.thrift.meta_data.FieldMetaData("successMaxTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BizMethodInvokeInfo.class, metaDataMap);
  }

  public BizMethodInvokeInfo() {
  }

  public BizMethodInvokeInfo(
    long totalCount,
    long successCount,
    long failureCount,
    long successAverageTime,
    long successMinTime,
    long successMaxTime)
  {
    this();
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
    this.successCount = successCount;
    setSuccessCountIsSet(true);
    this.failureCount = failureCount;
    setFailureCountIsSet(true);
    this.successAverageTime = successAverageTime;
    setSuccessAverageTimeIsSet(true);
    this.successMinTime = successMinTime;
    setSuccessMinTimeIsSet(true);
    this.successMaxTime = successMaxTime;
    setSuccessMaxTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BizMethodInvokeInfo(BizMethodInvokeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.totalCount = other.totalCount;
    this.successCount = other.successCount;
    this.failureCount = other.failureCount;
    this.successAverageTime = other.successAverageTime;
    this.successMinTime = other.successMinTime;
    this.successMaxTime = other.successMaxTime;
  }

  public BizMethodInvokeInfo deepCopy() {
    return new BizMethodInvokeInfo(this);
  }

  @Override
  public void clear() {
    setTotalCountIsSet(false);
    this.totalCount = 0;
    setSuccessCountIsSet(false);
    this.successCount = 0;
    setFailureCountIsSet(false);
    this.failureCount = 0;
    setSuccessAverageTimeIsSet(false);
    this.successAverageTime = 0;
    setSuccessMinTimeIsSet(false);
    this.successMinTime = 0;
    setSuccessMaxTimeIsSet(false);
    this.successMaxTime = 0;
  }

  public long getTotalCount() {
    return this.totalCount;
  }

  public BizMethodInvokeInfo setTotalCount(long totalCount) {
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
    return this;
  }

  public void unsetTotalCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  /** Returns true if field totalCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  public void setTotalCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID, value);
  }

  public long getSuccessCount() {
    return this.successCount;
  }

  public BizMethodInvokeInfo setSuccessCount(long successCount) {
    this.successCount = successCount;
    setSuccessCountIsSet(true);
    return this;
  }

  public void unsetSuccessCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESSCOUNT_ISSET_ID);
  }

  /** Returns true if field successCount is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessCount() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESSCOUNT_ISSET_ID);
  }

  public void setSuccessCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESSCOUNT_ISSET_ID, value);
  }

  public long getFailureCount() {
    return this.failureCount;
  }

  public BizMethodInvokeInfo setFailureCount(long failureCount) {
    this.failureCount = failureCount;
    setFailureCountIsSet(true);
    return this;
  }

  public void unsetFailureCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FAILURECOUNT_ISSET_ID);
  }

  /** Returns true if field failureCount is set (has been assigned a value) and false otherwise */
  public boolean isSetFailureCount() {
    return EncodingUtils.testBit(__isset_bitfield, __FAILURECOUNT_ISSET_ID);
  }

  public void setFailureCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FAILURECOUNT_ISSET_ID, value);
  }

  public long getSuccessAverageTime() {
    return this.successAverageTime;
  }

  public BizMethodInvokeInfo setSuccessAverageTime(long successAverageTime) {
    this.successAverageTime = successAverageTime;
    setSuccessAverageTimeIsSet(true);
    return this;
  }

  public void unsetSuccessAverageTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESSAVERAGETIME_ISSET_ID);
  }

  /** Returns true if field successAverageTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessAverageTime() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESSAVERAGETIME_ISSET_ID);
  }

  public void setSuccessAverageTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESSAVERAGETIME_ISSET_ID, value);
  }

  public long getSuccessMinTime() {
    return this.successMinTime;
  }

  public BizMethodInvokeInfo setSuccessMinTime(long successMinTime) {
    this.successMinTime = successMinTime;
    setSuccessMinTimeIsSet(true);
    return this;
  }

  public void unsetSuccessMinTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESSMINTIME_ISSET_ID);
  }

  /** Returns true if field successMinTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessMinTime() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESSMINTIME_ISSET_ID);
  }

  public void setSuccessMinTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESSMINTIME_ISSET_ID, value);
  }

  public long getSuccessMaxTime() {
    return this.successMaxTime;
  }

  public BizMethodInvokeInfo setSuccessMaxTime(long successMaxTime) {
    this.successMaxTime = successMaxTime;
    setSuccessMaxTimeIsSet(true);
    return this;
  }

  public void unsetSuccessMaxTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESSMAXTIME_ISSET_ID);
  }

  /** Returns true if field successMaxTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessMaxTime() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESSMAXTIME_ISSET_ID);
  }

  public void setSuccessMaxTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESSMAXTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL_COUNT:
      if (value == null) {
        unsetTotalCount();
      } else {
        setTotalCount((Long)value);
      }
      break;

    case SUCCESS_COUNT:
      if (value == null) {
        unsetSuccessCount();
      } else {
        setSuccessCount((Long)value);
      }
      break;

    case FAILURE_COUNT:
      if (value == null) {
        unsetFailureCount();
      } else {
        setFailureCount((Long)value);
      }
      break;

    case SUCCESS_AVERAGE_TIME:
      if (value == null) {
        unsetSuccessAverageTime();
      } else {
        setSuccessAverageTime((Long)value);
      }
      break;

    case SUCCESS_MIN_TIME:
      if (value == null) {
        unsetSuccessMinTime();
      } else {
        setSuccessMinTime((Long)value);
      }
      break;

    case SUCCESS_MAX_TIME:
      if (value == null) {
        unsetSuccessMaxTime();
      } else {
        setSuccessMaxTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_COUNT:
      return getTotalCount();

    case SUCCESS_COUNT:
      return getSuccessCount();

    case FAILURE_COUNT:
      return getFailureCount();

    case SUCCESS_AVERAGE_TIME:
      return getSuccessAverageTime();

    case SUCCESS_MIN_TIME:
      return getSuccessMinTime();

    case SUCCESS_MAX_TIME:
      return getSuccessMaxTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_COUNT:
      return isSetTotalCount();
    case SUCCESS_COUNT:
      return isSetSuccessCount();
    case FAILURE_COUNT:
      return isSetFailureCount();
    case SUCCESS_AVERAGE_TIME:
      return isSetSuccessAverageTime();
    case SUCCESS_MIN_TIME:
      return isSetSuccessMinTime();
    case SUCCESS_MAX_TIME:
      return isSetSuccessMaxTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BizMethodInvokeInfo)
      return this.equals((BizMethodInvokeInfo)that);
    return false;
  }

  public boolean equals(BizMethodInvokeInfo that) {
    if (that == null)
      return false;

    boolean this_present_totalCount = true;
    boolean that_present_totalCount = true;
    if (this_present_totalCount || that_present_totalCount) {
      if (!(this_present_totalCount && that_present_totalCount))
        return false;
      if (this.totalCount != that.totalCount)
        return false;
    }

    boolean this_present_successCount = true;
    boolean that_present_successCount = true;
    if (this_present_successCount || that_present_successCount) {
      if (!(this_present_successCount && that_present_successCount))
        return false;
      if (this.successCount != that.successCount)
        return false;
    }

    boolean this_present_failureCount = true;
    boolean that_present_failureCount = true;
    if (this_present_failureCount || that_present_failureCount) {
      if (!(this_present_failureCount && that_present_failureCount))
        return false;
      if (this.failureCount != that.failureCount)
        return false;
    }

    boolean this_present_successAverageTime = true;
    boolean that_present_successAverageTime = true;
    if (this_present_successAverageTime || that_present_successAverageTime) {
      if (!(this_present_successAverageTime && that_present_successAverageTime))
        return false;
      if (this.successAverageTime != that.successAverageTime)
        return false;
    }

    boolean this_present_successMinTime = true;
    boolean that_present_successMinTime = true;
    if (this_present_successMinTime || that_present_successMinTime) {
      if (!(this_present_successMinTime && that_present_successMinTime))
        return false;
      if (this.successMinTime != that.successMinTime)
        return false;
    }

    boolean this_present_successMaxTime = true;
    boolean that_present_successMaxTime = true;
    if (this_present_successMaxTime || that_present_successMaxTime) {
      if (!(this_present_successMaxTime && that_present_successMaxTime))
        return false;
      if (this.successMaxTime != that.successMaxTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_totalCount = true;
    list.add(present_totalCount);
    if (present_totalCount)
      list.add(totalCount);

    boolean present_successCount = true;
    list.add(present_successCount);
    if (present_successCount)
      list.add(successCount);

    boolean present_failureCount = true;
    list.add(present_failureCount);
    if (present_failureCount)
      list.add(failureCount);

    boolean present_successAverageTime = true;
    list.add(present_successAverageTime);
    if (present_successAverageTime)
      list.add(successAverageTime);

    boolean present_successMinTime = true;
    list.add(present_successMinTime);
    if (present_successMinTime)
      list.add(successMinTime);

    boolean present_successMaxTime = true;
    list.add(present_successMaxTime);
    if (present_successMaxTime)
      list.add(successMaxTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(BizMethodInvokeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTotalCount()).compareTo(other.isSetTotalCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalCount, other.totalCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccessCount()).compareTo(other.isSetSuccessCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.successCount, other.successCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailureCount()).compareTo(other.isSetFailureCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailureCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failureCount, other.failureCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccessAverageTime()).compareTo(other.isSetSuccessAverageTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessAverageTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.successAverageTime, other.successAverageTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccessMinTime()).compareTo(other.isSetSuccessMinTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessMinTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.successMinTime, other.successMinTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccessMaxTime()).compareTo(other.isSetSuccessMaxTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessMaxTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.successMaxTime, other.successMaxTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BizMethodInvokeInfo(");
    boolean first = true;

    sb.append("totalCount:");
    sb.append(this.totalCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("successCount:");
    sb.append(this.successCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("failureCount:");
    sb.append(this.failureCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("successAverageTime:");
    sb.append(this.successAverageTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("successMinTime:");
    sb.append(this.successMinTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("successMaxTime:");
    sb.append(this.successMaxTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BizMethodInvokeInfoStandardSchemeFactory implements SchemeFactory {
    public BizMethodInvokeInfoStandardScheme getScheme() {
      return new BizMethodInvokeInfoStandardScheme();
    }
  }

  private static class BizMethodInvokeInfoStandardScheme extends StandardScheme<BizMethodInvokeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BizMethodInvokeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalCount = iprot.readI64();
              struct.setTotalCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUCCESS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.successCount = iprot.readI64();
              struct.setSuccessCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FAILURE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.failureCount = iprot.readI64();
              struct.setFailureCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SUCCESS_AVERAGE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.successAverageTime = iprot.readI64();
              struct.setSuccessAverageTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SUCCESS_MIN_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.successMinTime = iprot.readI64();
              struct.setSuccessMinTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SUCCESS_MAX_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.successMaxTime = iprot.readI64();
              struct.setSuccessMaxTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BizMethodInvokeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_COUNT_FIELD_DESC);
      oprot.writeI64(struct.totalCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUCCESS_COUNT_FIELD_DESC);
      oprot.writeI64(struct.successCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FAILURE_COUNT_FIELD_DESC);
      oprot.writeI64(struct.failureCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUCCESS_AVERAGE_TIME_FIELD_DESC);
      oprot.writeI64(struct.successAverageTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUCCESS_MIN_TIME_FIELD_DESC);
      oprot.writeI64(struct.successMinTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUCCESS_MAX_TIME_FIELD_DESC);
      oprot.writeI64(struct.successMaxTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BizMethodInvokeInfoTupleSchemeFactory implements SchemeFactory {
    public BizMethodInvokeInfoTupleScheme getScheme() {
      return new BizMethodInvokeInfoTupleScheme();
    }
  }

  private static class BizMethodInvokeInfoTupleScheme extends TupleScheme<BizMethodInvokeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BizMethodInvokeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTotalCount()) {
        optionals.set(0);
      }
      if (struct.isSetSuccessCount()) {
        optionals.set(1);
      }
      if (struct.isSetFailureCount()) {
        optionals.set(2);
      }
      if (struct.isSetSuccessAverageTime()) {
        optionals.set(3);
      }
      if (struct.isSetSuccessMinTime()) {
        optionals.set(4);
      }
      if (struct.isSetSuccessMaxTime()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTotalCount()) {
        oprot.writeI64(struct.totalCount);
      }
      if (struct.isSetSuccessCount()) {
        oprot.writeI64(struct.successCount);
      }
      if (struct.isSetFailureCount()) {
        oprot.writeI64(struct.failureCount);
      }
      if (struct.isSetSuccessAverageTime()) {
        oprot.writeI64(struct.successAverageTime);
      }
      if (struct.isSetSuccessMinTime()) {
        oprot.writeI64(struct.successMinTime);
      }
      if (struct.isSetSuccessMaxTime()) {
        oprot.writeI64(struct.successMaxTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BizMethodInvokeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.totalCount = iprot.readI64();
        struct.setTotalCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.successCount = iprot.readI64();
        struct.setSuccessCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.failureCount = iprot.readI64();
        struct.setFailureCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.successAverageTime = iprot.readI64();
        struct.setSuccessAverageTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.successMinTime = iprot.readI64();
        struct.setSuccessMinTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.successMaxTime = iprot.readI64();
        struct.setSuccessMaxTimeIsSet(true);
      }
    }
  }

}

