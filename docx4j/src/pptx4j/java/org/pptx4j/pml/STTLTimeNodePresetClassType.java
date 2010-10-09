/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

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
 * <p>Java class for ST_TLTimeNodePresetClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TLTimeNodePresetClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="entr"/>
 *     &lt;enumeration value="exit"/>
 *     &lt;enumeration value="emph"/>
 *     &lt;enumeration value="path"/>
 *     &lt;enumeration value="verb"/>
 *     &lt;enumeration value="mediacall"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_TLTimeNodePresetClassType")
@XmlEnum
public enum STTLTimeNodePresetClassType {


    /**
     * 
     * 						Preset Type Enum ( Entrance )
     * 					
     * 
     */
    @XmlEnumValue("entr")
    ENTR("entr"),

    /**
     * Exit
     * 
     */
    @XmlEnumValue("exit")
    EXIT("exit"),

    /**
     * 
     * 						Preset Type Enum ( Emphasis )
     * 					
     * 
     */
    @XmlEnumValue("emph")
    EMPH("emph"),

    /**
     * 
     * 						Preset Type Enum ( Path )
     * 					
     * 
     */
    @XmlEnumValue("path")
    PATH("path"),

    /**
     * 
     * 						Preset Type Enum ( Verb )
     * 					
     * 
     */
    @XmlEnumValue("verb")
    VERB("verb"),

    /**
     * 
     * 						Preset Type Enum ( Media Call )
     * 					
     * 
     */
    @XmlEnumValue("mediacall")
    MEDIACALL("mediacall");
    private final String value;

    STTLTimeNodePresetClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTLTimeNodePresetClassType fromValue(String v) {
        for (STTLTimeNodePresetClassType c: STTLTimeNodePresetClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}