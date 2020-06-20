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

package system.data.oledb;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Data.OleDb.OleDbType, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class OleDbType extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.OleDb.OleDbType";
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

    public OleDbType(Object instance) {
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

    public OleDbType() {
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

    final static OleDbType getFrom(JCEnum object, String value) {
        try {
            return new OleDbType(object.fromValue(value));
        } catch (JCException e) {
            return new OleDbType(object);
        }
    }

    // Enum fields section
    
    public static OleDbType Empty = getFrom(enumReflected, "Empty");
    public static OleDbType SmallInt = getFrom(enumReflected, "SmallInt");
    public static OleDbType Integer = getFrom(enumReflected, "Integer");
    public static OleDbType Single = getFrom(enumReflected, "Single");
    public static OleDbType Double = getFrom(enumReflected, "Double");
    public static OleDbType Currency = getFrom(enumReflected, "Currency");
    public static OleDbType Date = getFrom(enumReflected, "Date");
    public static OleDbType BSTR = getFrom(enumReflected, "BSTR");
    public static OleDbType IDispatch = getFrom(enumReflected, "IDispatch");
    public static OleDbType Error = getFrom(enumReflected, "Error");
    public static OleDbType Boolean = getFrom(enumReflected, "Boolean");
    public static OleDbType Variant = getFrom(enumReflected, "Variant");
    public static OleDbType IUnknown = getFrom(enumReflected, "IUnknown");
    public static OleDbType Decimal = getFrom(enumReflected, "Decimal");
    public static OleDbType TinyInt = getFrom(enumReflected, "TinyInt");
    public static OleDbType UnsignedTinyInt = getFrom(enumReflected, "UnsignedTinyInt");
    public static OleDbType UnsignedSmallInt = getFrom(enumReflected, "UnsignedSmallInt");
    public static OleDbType UnsignedInt = getFrom(enumReflected, "UnsignedInt");
    public static OleDbType BigInt = getFrom(enumReflected, "BigInt");
    public static OleDbType UnsignedBigInt = getFrom(enumReflected, "UnsignedBigInt");
    public static OleDbType Filetime = getFrom(enumReflected, "Filetime");
    public static OleDbType Guid = getFrom(enumReflected, "Guid");
    public static OleDbType Binary = getFrom(enumReflected, "Binary");
    public static OleDbType Char = getFrom(enumReflected, "Char");
    public static OleDbType WChar = getFrom(enumReflected, "WChar");
    public static OleDbType Numeric = getFrom(enumReflected, "Numeric");
    public static OleDbType DBDate = getFrom(enumReflected, "DBDate");
    public static OleDbType DBTime = getFrom(enumReflected, "DBTime");
    public static OleDbType DBTimeStamp = getFrom(enumReflected, "DBTimeStamp");
    public static OleDbType PropVariant = getFrom(enumReflected, "PropVariant");
    public static OleDbType VarNumeric = getFrom(enumReflected, "VarNumeric");
    public static OleDbType VarChar = getFrom(enumReflected, "VarChar");
    public static OleDbType LongVarChar = getFrom(enumReflected, "LongVarChar");
    public static OleDbType VarWChar = getFrom(enumReflected, "VarWChar");
    public static OleDbType LongVarWChar = getFrom(enumReflected, "LongVarWChar");
    public static OleDbType VarBinary = getFrom(enumReflected, "VarBinary");
    public static OleDbType LongVarBinary = getFrom(enumReflected, "LongVarBinary");


    // Flags management section


}