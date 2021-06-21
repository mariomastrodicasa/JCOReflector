/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
 * The base .NET class managing System.Data.DbType, System.Data.Common, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.DbType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.DbType</a>
 */
public class DbType extends NetObject  {
    /**
     * Fully assembly qualified name: System.Data.Common, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Data.Common, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Data.Common
     */
    public static final String assemblyShortName = "System.Data.Common";
    /**
     * Qualified class name: System.Data.DbType
     */
    public static final String className = "System.Data.DbType";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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
                JCOReflector.writeLog(t);
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
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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