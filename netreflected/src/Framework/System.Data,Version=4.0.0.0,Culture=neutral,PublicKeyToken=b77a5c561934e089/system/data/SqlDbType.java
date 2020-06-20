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
 * The base .NET class managing System.Data.SqlDbType, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlDbType extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlDbType";
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

    public SqlDbType(Object instance) {
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

    public SqlDbType() {
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

    final static SqlDbType getFrom(JCEnum object, String value) {
        try {
            return new SqlDbType(object.fromValue(value));
        } catch (JCException e) {
            return new SqlDbType(object);
        }
    }

    // Enum fields section
    
    public static SqlDbType BigInt = getFrom(enumReflected, "BigInt");
    public static SqlDbType Binary = getFrom(enumReflected, "Binary");
    public static SqlDbType Bit = getFrom(enumReflected, "Bit");
    public static SqlDbType Char = getFrom(enumReflected, "Char");
    public static SqlDbType DateTime = getFrom(enumReflected, "DateTime");
    public static SqlDbType Decimal = getFrom(enumReflected, "Decimal");
    public static SqlDbType Float = getFrom(enumReflected, "Float");
    public static SqlDbType Image = getFrom(enumReflected, "Image");
    public static SqlDbType Int = getFrom(enumReflected, "Int");
    public static SqlDbType Money = getFrom(enumReflected, "Money");
    public static SqlDbType NChar = getFrom(enumReflected, "NChar");
    public static SqlDbType NText = getFrom(enumReflected, "NText");
    public static SqlDbType NVarChar = getFrom(enumReflected, "NVarChar");
    public static SqlDbType Real = getFrom(enumReflected, "Real");
    public static SqlDbType UniqueIdentifier = getFrom(enumReflected, "UniqueIdentifier");
    public static SqlDbType SmallDateTime = getFrom(enumReflected, "SmallDateTime");
    public static SqlDbType SmallInt = getFrom(enumReflected, "SmallInt");
    public static SqlDbType SmallMoney = getFrom(enumReflected, "SmallMoney");
    public static SqlDbType Text = getFrom(enumReflected, "Text");
    public static SqlDbType Timestamp = getFrom(enumReflected, "Timestamp");
    public static SqlDbType TinyInt = getFrom(enumReflected, "TinyInt");
    public static SqlDbType VarBinary = getFrom(enumReflected, "VarBinary");
    public static SqlDbType VarChar = getFrom(enumReflected, "VarChar");
    public static SqlDbType Variant = getFrom(enumReflected, "Variant");
    public static SqlDbType Xml = getFrom(enumReflected, "Xml");
    public static SqlDbType Udt = getFrom(enumReflected, "Udt");
    public static SqlDbType Structured = getFrom(enumReflected, "Structured");
    public static SqlDbType Date = getFrom(enumReflected, "Date");
    public static SqlDbType Time = getFrom(enumReflected, "Time");
    public static SqlDbType DateTime2 = getFrom(enumReflected, "DateTime2");
    public static SqlDbType DateTimeOffset = getFrom(enumReflected, "DateTimeOffset");


    // Flags management section


}