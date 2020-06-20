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

package system.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Data.DbType, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DbType extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.DbType";
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

    public DbType(Object instance) {
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

    public DbType() {
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

    final static DbType getFrom(JCEnum object, String value) {
        try {
            return new DbType(object.fromValue(value));
        } catch (JCException e) {
            return new DbType(object);
        }
    }

    // Enum fields section
    
    public static DbType AnsiString = getFrom(enumReflected, "AnsiString");
    public static DbType Binary = getFrom(enumReflected, "Binary");
    public static DbType Byte = getFrom(enumReflected, "Byte");
    public static DbType Boolean = getFrom(enumReflected, "Boolean");
    public static DbType Currency = getFrom(enumReflected, "Currency");
    public static DbType Date = getFrom(enumReflected, "Date");
    public static DbType DateTime = getFrom(enumReflected, "DateTime");
    public static DbType Decimal = getFrom(enumReflected, "Decimal");
    public static DbType Double = getFrom(enumReflected, "Double");
    public static DbType Guid = getFrom(enumReflected, "Guid");
    public static DbType Int16 = getFrom(enumReflected, "Int16");
    public static DbType Int32 = getFrom(enumReflected, "Int32");
    public static DbType Int64 = getFrom(enumReflected, "Int64");
    public static DbType Object = getFrom(enumReflected, "Object");
    public static DbType SByte = getFrom(enumReflected, "SByte");
    public static DbType Single = getFrom(enumReflected, "Single");
    public static DbType String = getFrom(enumReflected, "String");
    public static DbType Time = getFrom(enumReflected, "Time");
    public static DbType UInt16 = getFrom(enumReflected, "UInt16");
    public static DbType UInt32 = getFrom(enumReflected, "UInt32");
    public static DbType UInt64 = getFrom(enumReflected, "UInt64");
    public static DbType VarNumeric = getFrom(enumReflected, "VarNumeric");
    public static DbType AnsiStringFixedLength = getFrom(enumReflected, "AnsiStringFixedLength");
    public static DbType StringFixedLength = getFrom(enumReflected, "StringFixedLength");
    public static DbType Xml = getFrom(enumReflected, "Xml");
    public static DbType DateTime2 = getFrom(enumReflected, "DateTime2");
    public static DbType DateTimeOffset = getFrom(enumReflected, "DateTimeOffset");


    // Flags management section


}