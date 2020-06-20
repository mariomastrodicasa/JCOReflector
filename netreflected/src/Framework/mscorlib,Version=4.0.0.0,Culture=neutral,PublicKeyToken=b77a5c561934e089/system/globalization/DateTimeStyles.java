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

package system.globalization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Globalization.DateTimeStyles, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DateTimeStyles extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Globalization.DateTimeStyles";
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

    public DateTimeStyles(Object instance) {
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

    public DateTimeStyles() {
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

    final static DateTimeStyles getFrom(JCEnum object, String value) {
        try {
            return new DateTimeStyles(object.fromValue(value));
        } catch (JCException e) {
            return new DateTimeStyles(object);
        }
    }

    // Enum fields section
    
    public static DateTimeStyles None = getFrom(enumReflected, "None");
    public static DateTimeStyles AllowLeadingWhite = getFrom(enumReflected, "AllowLeadingWhite");
    public static DateTimeStyles AllowTrailingWhite = getFrom(enumReflected, "AllowTrailingWhite");
    public static DateTimeStyles AllowInnerWhite = getFrom(enumReflected, "AllowInnerWhite");
    public static DateTimeStyles AllowWhiteSpaces = getFrom(enumReflected, "AllowWhiteSpaces");
    public static DateTimeStyles NoCurrentDateDefault = getFrom(enumReflected, "NoCurrentDateDefault");
    public static DateTimeStyles AdjustToUniversal = getFrom(enumReflected, "AdjustToUniversal");
    public static DateTimeStyles AssumeLocal = getFrom(enumReflected, "AssumeLocal");
    public static DateTimeStyles AssumeUniversal = getFrom(enumReflected, "AssumeUniversal");
    public static DateTimeStyles RoundtripKind = getFrom(enumReflected, "RoundtripKind");


    // Flags management section

    public DateTimeStyles add(DateTimeStyles val) throws Throwable {
        return new DateTimeStyles(NetEnum.add(classInstance, val.classInstance));
    }

    public DateTimeStyles remove(DateTimeStyles val) throws Throwable {
        return new DateTimeStyles(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(DateTimeStyles val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(DateTimeStyles val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}