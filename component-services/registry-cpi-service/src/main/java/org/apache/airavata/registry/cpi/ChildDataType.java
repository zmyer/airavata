    /*
     * Licensed to the Apache Software Foundation (ASF) under one or more
     * contributor license agreements.  See the NOTICE file distributed with
     * this work for additional information regarding copyright ownership.
     * The ASF licenses this file to You under the Apache License, Version 2.0
     * (the "License"); you may not use this file except in compliance with
     * the License.  You may obtain a copy of the License at
     *
     *     http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.registry.cpi;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

@SuppressWarnings("all") public enum ChildDataType implements org.apache.thrift.TEnum {
  EXPERIMENT_INPUT(0),
  EXPERIMENT_OUTPUT(1),
  WORKFLOW_NODE_DETAIL(2),
  TASK_DETAIL(3),
  ERROR_DETAIL(4),
  APPLICATION_INPUT(5),
  APPLICATION_OUTPUT(6),
  NODE_INPUT(7),
  NODE_OUTPUT(8),
  JOB_DETAIL(9),
  DATA_TRANSFER_DETAIL(10),
  STATUS(11),
  EXPERIMENT_CONFIGURATION_DATA(12),
  COMPUTATIONAL_RESOURCE_SCHEDULING(13),
  ADVANCE_INPUT_DATA_HANDLING(14),
  ADVANCE_OUTPUT_DATA_HANDLING(15),
  QOS_PARAM(16);

  private final int value;

  private ChildDataType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ChildDataType findByValue(int value) { 
    switch (value) {
      case 0:
        return EXPERIMENT_INPUT;
      case 1:
        return EXPERIMENT_OUTPUT;
      case 2:
        return WORKFLOW_NODE_DETAIL;
      case 3:
        return TASK_DETAIL;
      case 4:
        return ERROR_DETAIL;
      case 5:
        return APPLICATION_INPUT;
      case 6:
        return APPLICATION_OUTPUT;
      case 7:
        return NODE_INPUT;
      case 8:
        return NODE_OUTPUT;
      case 9:
        return JOB_DETAIL;
      case 10:
        return DATA_TRANSFER_DETAIL;
      case 11:
        return STATUS;
      case 12:
        return EXPERIMENT_CONFIGURATION_DATA;
      case 13:
        return COMPUTATIONAL_RESOURCE_SCHEDULING;
      case 14:
        return ADVANCE_INPUT_DATA_HANDLING;
      case 15:
        return ADVANCE_OUTPUT_DATA_HANDLING;
      case 16:
        return QOS_PARAM;
      default:
        return null;
    }
  }
}
