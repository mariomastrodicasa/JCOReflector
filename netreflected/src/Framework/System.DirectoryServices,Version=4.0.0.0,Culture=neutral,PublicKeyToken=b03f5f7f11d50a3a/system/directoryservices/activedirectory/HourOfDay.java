/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.HourOfDay, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HourOfDay extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.DirectoryServices";
    public static final String className = "System.DirectoryServices.ActiveDirectory.HourOfDay";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HourOfDay(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public HourOfDay() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static HourOfDay getFrom(JCEnum object, String value) {
        try {
            return new HourOfDay(object.fromValue(value));
        } catch (JCException e) {
            return new HourOfDay(object);
        }
    }

    // Enum fields section
    
    public static HourOfDay Zero = getFrom(enumReflected, "Zero");
    public static HourOfDay One = getFrom(enumReflected, "One");
    public static HourOfDay Two = getFrom(enumReflected, "Two");
    public static HourOfDay Three = getFrom(enumReflected, "Three");
    public static HourOfDay Four = getFrom(enumReflected, "Four");
    public static HourOfDay Five = getFrom(enumReflected, "Five");
    public static HourOfDay Six = getFrom(enumReflected, "Six");
    public static HourOfDay Seven = getFrom(enumReflected, "Seven");
    public static HourOfDay Eight = getFrom(enumReflected, "Eight");
    public static HourOfDay Nine = getFrom(enumReflected, "Nine");
    public static HourOfDay Ten = getFrom(enumReflected, "Ten");
    public static HourOfDay Eleven = getFrom(enumReflected, "Eleven");
    public static HourOfDay Twelve = getFrom(enumReflected, "Twelve");
    public static HourOfDay Thirteen = getFrom(enumReflected, "Thirteen");
    public static HourOfDay Fourteen = getFrom(enumReflected, "Fourteen");
    public static HourOfDay Fifteen = getFrom(enumReflected, "Fifteen");
    public static HourOfDay Sixteen = getFrom(enumReflected, "Sixteen");
    public static HourOfDay Seventeen = getFrom(enumReflected, "Seventeen");
    public static HourOfDay Eighteen = getFrom(enumReflected, "Eighteen");
    public static HourOfDay Nineteen = getFrom(enumReflected, "Nineteen");
    public static HourOfDay Twenty = getFrom(enumReflected, "Twenty");
    public static HourOfDay TwentyOne = getFrom(enumReflected, "TwentyOne");
    public static HourOfDay TwentyTwo = getFrom(enumReflected, "TwentyTwo");
    public static HourOfDay TwentyThree = getFrom(enumReflected, "TwentyThree");


    // Flags management section


}