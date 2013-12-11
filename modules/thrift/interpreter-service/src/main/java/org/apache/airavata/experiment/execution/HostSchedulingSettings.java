/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.experiment.execution;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HostSchedulingSettings implements org.apache.thrift.TBase<HostSchedulingSettings, HostSchedulingSettings._Fields>, java.io.Serializable, Cloneable, Comparable<HostSchedulingSettings> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostSchedulingSettings");

    private static final org.apache.thrift.protocol.TField HOST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("hostID", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField IS_WSGRAM_PREFERRED_FIELD_DESC = new org.apache.thrift.protocol.TField("isWSGramPreferred", org.apache.thrift.protocol.TType.BOOL, (short)2);
    private static final org.apache.thrift.protocol.TField GATEKEEPER_EPR_FIELD_DESC = new org.apache.thrift.protocol.TField("gatekeeperEPR", org.apache.thrift.protocol.TType.STRING, (short)3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new HostSchedulingSettingsStandardSchemeFactory());
        schemes.put(TupleScheme.class, new HostSchedulingSettingsTupleSchemeFactory());
    }

    public String hostID; // optional
    public boolean isWSGramPreferred; // optional
    public String gatekeeperEPR; // optional

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        HOST_ID((short)1, "hostID"),
        IS_WSGRAM_PREFERRED((short)2, "isWSGramPreferred"),
        GATEKEEPER_EPR((short)3, "gatekeeperEPR");

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
                case 1: // HOST_ID
                    return HOST_ID;
                case 2: // IS_WSGRAM_PREFERRED
                    return IS_WSGRAM_PREFERRED;
                case 3: // GATEKEEPER_EPR
                    return GATEKEEPER_EPR;
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
    private static final int __ISWSGRAMPREFERRED_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    private _Fields optionals[] = {_Fields.HOST_ID,_Fields.IS_WSGRAM_PREFERRED,_Fields.GATEKEEPER_EPR};
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.HOST_ID, new org.apache.thrift.meta_data.FieldMetaData("hostID", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.IS_WSGRAM_PREFERRED, new org.apache.thrift.meta_data.FieldMetaData("isWSGramPreferred", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
        tmpMap.put(_Fields.GATEKEEPER_EPR, new org.apache.thrift.meta_data.FieldMetaData("gatekeeperEPR", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostSchedulingSettings.class, metaDataMap);
    }

    public HostSchedulingSettings() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public HostSchedulingSettings(HostSchedulingSettings other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetHostID()) {
            this.hostID = other.hostID;
        }
        this.isWSGramPreferred = other.isWSGramPreferred;
        if (other.isSetGatekeeperEPR()) {
            this.gatekeeperEPR = other.gatekeeperEPR;
        }
    }

    public HostSchedulingSettings deepCopy() {
        return new HostSchedulingSettings(this);
    }

    @Override
    public void clear() {
        this.hostID = null;
        setIsWSGramPreferredIsSet(false);
        this.isWSGramPreferred = false;
        this.gatekeeperEPR = null;
    }

    public String getHostID() {
        return this.hostID;
    }

    public HostSchedulingSettings setHostID(String hostID) {
        this.hostID = hostID;
        return this;
    }

    public void unsetHostID() {
        this.hostID = null;
    }

    /** Returns true if field hostID is set (has been assigned a value) and false otherwise */
    public boolean isSetHostID() {
        return this.hostID != null;
    }

    public void setHostIDIsSet(boolean value) {
        if (!value) {
            this.hostID = null;
        }
    }

    public boolean isIsWSGramPreferred() {
        return this.isWSGramPreferred;
    }

    public HostSchedulingSettings setIsWSGramPreferred(boolean isWSGramPreferred) {
        this.isWSGramPreferred = isWSGramPreferred;
        setIsWSGramPreferredIsSet(true);
        return this;
    }

    public void unsetIsWSGramPreferred() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISWSGRAMPREFERRED_ISSET_ID);
    }

    /** Returns true if field isWSGramPreferred is set (has been assigned a value) and false otherwise */
    public boolean isSetIsWSGramPreferred() {
        return EncodingUtils.testBit(__isset_bitfield, __ISWSGRAMPREFERRED_ISSET_ID);
    }

    public void setIsWSGramPreferredIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISWSGRAMPREFERRED_ISSET_ID, value);
    }

    public String getGatekeeperEPR() {
        return this.gatekeeperEPR;
    }

    public HostSchedulingSettings setGatekeeperEPR(String gatekeeperEPR) {
        this.gatekeeperEPR = gatekeeperEPR;
        return this;
    }

    public void unsetGatekeeperEPR() {
        this.gatekeeperEPR = null;
    }

    /** Returns true if field gatekeeperEPR is set (has been assigned a value) and false otherwise */
    public boolean isSetGatekeeperEPR() {
        return this.gatekeeperEPR != null;
    }

    public void setGatekeeperEPRIsSet(boolean value) {
        if (!value) {
            this.gatekeeperEPR = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case HOST_ID:
                if (value == null) {
                    unsetHostID();
                } else {
                    setHostID((String)value);
                }
                break;

            case IS_WSGRAM_PREFERRED:
                if (value == null) {
                    unsetIsWSGramPreferred();
                } else {
                    setIsWSGramPreferred((Boolean)value);
                }
                break;

            case GATEKEEPER_EPR:
                if (value == null) {
                    unsetGatekeeperEPR();
                } else {
                    setGatekeeperEPR((String)value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case HOST_ID:
                return getHostID();

            case IS_WSGRAM_PREFERRED:
                return Boolean.valueOf(isIsWSGramPreferred());

            case GATEKEEPER_EPR:
                return getGatekeeperEPR();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case HOST_ID:
                return isSetHostID();
            case IS_WSGRAM_PREFERRED:
                return isSetIsWSGramPreferred();
            case GATEKEEPER_EPR:
                return isSetGatekeeperEPR();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof HostSchedulingSettings)
            return this.equals((HostSchedulingSettings)that);
        return false;
    }

    public boolean equals(HostSchedulingSettings that) {
        if (that == null)
            return false;

        boolean this_present_hostID = true && this.isSetHostID();
        boolean that_present_hostID = true && that.isSetHostID();
        if (this_present_hostID || that_present_hostID) {
            if (!(this_present_hostID && that_present_hostID))
                return false;
            if (!this.hostID.equals(that.hostID))
                return false;
        }

        boolean this_present_isWSGramPreferred = true && this.isSetIsWSGramPreferred();
        boolean that_present_isWSGramPreferred = true && that.isSetIsWSGramPreferred();
        if (this_present_isWSGramPreferred || that_present_isWSGramPreferred) {
            if (!(this_present_isWSGramPreferred && that_present_isWSGramPreferred))
                return false;
            if (this.isWSGramPreferred != that.isWSGramPreferred)
                return false;
        }

        boolean this_present_gatekeeperEPR = true && this.isSetGatekeeperEPR();
        boolean that_present_gatekeeperEPR = true && that.isSetGatekeeperEPR();
        if (this_present_gatekeeperEPR || that_present_gatekeeperEPR) {
            if (!(this_present_gatekeeperEPR && that_present_gatekeeperEPR))
                return false;
            if (!this.gatekeeperEPR.equals(that.gatekeeperEPR))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(HostSchedulingSettings other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetHostID()).compareTo(other.isSetHostID());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetHostID()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostID, other.hostID);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetIsWSGramPreferred()).compareTo(other.isSetIsWSGramPreferred());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetIsWSGramPreferred()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isWSGramPreferred, other.isWSGramPreferred);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetGatekeeperEPR()).compareTo(other.isSetGatekeeperEPR());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetGatekeeperEPR()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatekeeperEPR, other.gatekeeperEPR);
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
        StringBuilder sb = new StringBuilder("HostSchedulingSettings(");
        boolean first = true;

        if (isSetHostID()) {
            sb.append("hostID:");
            if (this.hostID == null) {
                sb.append("null");
            } else {
                sb.append(this.hostID);
            }
            first = false;
        }
        if (isSetIsWSGramPreferred()) {
            if (!first) sb.append(", ");
            sb.append("isWSGramPreferred:");
            sb.append(this.isWSGramPreferred);
            first = false;
        }
        if (isSetGatekeeperEPR()) {
            if (!first) sb.append(", ");
            sb.append("gatekeeperEPR:");
            if (this.gatekeeperEPR == null) {
                sb.append("null");
            } else {
                sb.append(this.gatekeeperEPR);
            }
            first = false;
        }
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

    private static class HostSchedulingSettingsStandardSchemeFactory implements SchemeFactory {
        public HostSchedulingSettingsStandardScheme getScheme() {
            return new HostSchedulingSettingsStandardScheme();
        }
    }

    private static class HostSchedulingSettingsStandardScheme extends StandardScheme<HostSchedulingSettings> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, HostSchedulingSettings struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // HOST_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.hostID = iprot.readString();
                            struct.setHostIDIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // IS_WSGRAM_PREFERRED
                        if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                            struct.isWSGramPreferred = iprot.readBool();
                            struct.setIsWSGramPreferredIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // GATEKEEPER_EPR
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.gatekeeperEPR = iprot.readString();
                            struct.setGatekeeperEPRIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, HostSchedulingSettings struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.hostID != null) {
                if (struct.isSetHostID()) {
                    oprot.writeFieldBegin(HOST_ID_FIELD_DESC);
                    oprot.writeString(struct.hostID);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.isSetIsWSGramPreferred()) {
                oprot.writeFieldBegin(IS_WSGRAM_PREFERRED_FIELD_DESC);
                oprot.writeBool(struct.isWSGramPreferred);
                oprot.writeFieldEnd();
            }
            if (struct.gatekeeperEPR != null) {
                if (struct.isSetGatekeeperEPR()) {
                    oprot.writeFieldBegin(GATEKEEPER_EPR_FIELD_DESC);
                    oprot.writeString(struct.gatekeeperEPR);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class HostSchedulingSettingsTupleSchemeFactory implements SchemeFactory {
        public HostSchedulingSettingsTupleScheme getScheme() {
            return new HostSchedulingSettingsTupleScheme();
        }
    }

    private static class HostSchedulingSettingsTupleScheme extends TupleScheme<HostSchedulingSettings> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, HostSchedulingSettings struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetHostID()) {
                optionals.set(0);
            }
            if (struct.isSetIsWSGramPreferred()) {
                optionals.set(1);
            }
            if (struct.isSetGatekeeperEPR()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetHostID()) {
                oprot.writeString(struct.hostID);
            }
            if (struct.isSetIsWSGramPreferred()) {
                oprot.writeBool(struct.isWSGramPreferred);
            }
            if (struct.isSetGatekeeperEPR()) {
                oprot.writeString(struct.gatekeeperEPR);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, HostSchedulingSettings struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.hostID = iprot.readString();
                struct.setHostIDIsSet(true);
            }
            if (incoming.get(1)) {
                struct.isWSGramPreferred = iprot.readBool();
                struct.setIsWSGramPreferredIsSet(true);
            }
            if (incoming.get(2)) {
                struct.gatekeeperEPR = iprot.readString();
                struct.setGatekeeperEPRIsSet(true);
            }
        }
    }

}

