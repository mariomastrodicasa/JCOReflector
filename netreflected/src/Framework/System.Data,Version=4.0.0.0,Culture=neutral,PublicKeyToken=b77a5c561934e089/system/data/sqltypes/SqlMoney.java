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

package system.data.sqltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Decimal;
import system.data.sqltypes.SqlMoney;
import system.data.sqltypes.SqlBoolean;
import system.data.sqltypes.SqlByte;
import system.data.sqltypes.SqlDecimal;
import system.data.sqltypes.SqlDouble;
import system.data.sqltypes.SqlInt16;
import system.data.sqltypes.SqlInt32;
import system.data.sqltypes.SqlInt64;
import system.data.sqltypes.SqlSingle;
import system.data.sqltypes.SqlString;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;


/**
 * The base .NET class managing System.Data.SqlTypes.SqlMoney, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlMoney extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlTypes.SqlMoney";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public SqlMoney(Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }

    public static SqlMoney cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlMoney(from.getJCOInstance());
    }

    // Constructors section
    

    public SqlMoney(double value) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney(int value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney(long value) throws Throwable, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney(Decimal value) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public double ToDouble() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("ToDouble");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(SqlMoney value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ToInt32() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ToInt32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ToInt64() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ToInt64");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean Equals(SqlMoney x, SqlMoney y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThan(SqlMoney x, SqlMoney y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThanOrEqual(SqlMoney x, SqlMoney y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThan(SqlMoney x, SqlMoney y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThanOrEqual(SqlMoney x, SqlMoney y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean NotEquals(SqlMoney x, SqlMoney y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNotEquals = (JCObject)classType.Invoke("NotEquals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objNotEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBoolean ToSqlBoolean() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlBoolean = (JCObject)classInstance.Invoke("ToSqlBoolean");
            return new SqlBoolean(objToSqlBoolean);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlByte ToSqlByte() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlByte = (JCObject)classInstance.Invoke("ToSqlByte");
            return new SqlByte(objToSqlByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal ToSqlDecimal() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDecimal = (JCObject)classInstance.Invoke("ToSqlDecimal");
            return new SqlDecimal(objToSqlDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDouble ToSqlDouble() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDouble = (JCObject)classInstance.Invoke("ToSqlDouble");
            return new SqlDouble(objToSqlDouble);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt16 ToSqlInt16() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt16 = (JCObject)classInstance.Invoke("ToSqlInt16");
            return new SqlInt16(objToSqlInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt32 ToSqlInt32() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt32 = (JCObject)classInstance.Invoke("ToSqlInt32");
            return new SqlInt32(objToSqlInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt64 ToSqlInt64() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt64 = (JCObject)classInstance.Invoke("ToSqlInt64");
            return new SqlInt64(objToSqlInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlMoney Add(SqlMoney x, SqlMoney y) throws Throwable, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlMoney(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlMoney Divide(SqlMoney x, SqlMoney y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlMoney(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlMoney Multiply(SqlMoney x, SqlMoney y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlMoney(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlMoney Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", s);
            return new SqlMoney(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlMoney Subtract(SqlMoney x, SqlMoney y) throws Throwable, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlMoney(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlSingle ToSqlSingle() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlSingle = (JCObject)classInstance.Invoke("ToSqlSingle");
            return new SqlSingle(objToSqlSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString ToSqlString() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlString = (JCObject)classInstance.Invoke("ToSqlString");
            return new SqlString(objToSqlString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal ToDecimal() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToDecimal = (JCObject)classInstance.Invoke("ToDecimal");
            return new Decimal(objToDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlQualifiedName GetXsdType(XmlSchemaSet schemaSet) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetXsdType = (JCObject)classType.Invoke("GetXsdType", schemaSet == null ? null : schemaSet.getJCOInstance());
            return new XmlQualifiedName(objGetXsdType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsNull() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal getValue() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new Decimal(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}