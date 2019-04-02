/*
 *  Copyright 2010-2012, Plutext Pty Ltd.
 *   
 *  This file is part of pptx4j, a component of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */
package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TLTriggerRuntimeNode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TLTriggerRuntimeNode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="first"/>
 *     &lt;enumeration value="last"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_TLTriggerRuntimeNode")
@XmlEnum
public enum STTLTriggerRuntimeNode {


    /**
     * Trigger RunTime Node ( First )
     * 
     */
    @XmlEnumValue("first")
    FIRST("first"),

    /**
     * Trigger RunTime Node ( Last )
     * 
     */
    @XmlEnumValue("last")
    LAST("last"),

    /**
     * Trigger RunTime Node Enum ( All )
     * 
     */
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    STTLTriggerRuntimeNode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTLTriggerRuntimeNode fromValue(String v) {
        for (STTLTriggerRuntimeNode c: STTLTriggerRuntimeNode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}