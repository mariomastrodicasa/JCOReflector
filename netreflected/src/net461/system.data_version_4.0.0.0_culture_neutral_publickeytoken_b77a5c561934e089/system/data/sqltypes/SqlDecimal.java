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

package system.data.sqltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.Decimal;
import system.data.sqltypes.SqlDecimal;
import system.data.sqltypes.SqlBoolean;
import system.data.sqltypes.SqlByte;
import system.data.sqltypes.SqlDouble;
import system.data.sqltypes.SqlInt16;
import system.data.sqltypes.SqlInt32;
import system.data.sqltypes.SqlInt64;
import system.data.sqltypes.SqlMoney;
import system.data.sqltypes.SqlSingle;
import system.data.sqltypes.SqlString;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;
import system.xml.schema.XmlSchema;
import system.xml.XmlReader;
import system.xml.XmlWriter;
import system.xml.serialization.IXmlSerializable;
import system.xml.serialization.IXmlSerializableImplementation;


/**
 * The base .NET class managing System.Data.SqlTypes.SqlDecimal, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlTypes.SqlDecimal" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlTypes.SqlDecimal</a>
 */
public class SqlDecimal extends ValueType implements system.xml.serialization.IXmlSerializable {
    /**
     * Fully assembly qualified name: System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data
     */
    public static final String assemblyShortName = "System.Data";
    /**
     * Qualified class name: System.Data.SqlTypes.SqlDecimal
     */
    public static final String className = "System.Data.SqlTypes.SqlDecimal";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

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

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlDecimal}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlDecimal} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlDecimal cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlDecimal(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlDecimal() throws Throwable {
    }

    public SqlDecimal(byte bPrecision, byte bScale, boolean fPositive, int data1, int data2, int data3, int data4) throws Throwable, system.data.sqltypes.SqlTypeException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(bPrecision, bScale, fPositive, data1, data2, data3, data4));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal(byte bPrecision, byte bScale, boolean fPositive, int[] bits) throws Throwable, system.data.sqltypes.SqlTypeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(bPrecision, bScale, fPositive, bits));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal(double dVal) throws Throwable, system.OverflowException, system.DivideByZeroException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(dVal));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal(int value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal(long value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal(Decimal value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public double ToDouble() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("ToDouble");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(SqlDecimal value) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean Equals(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThan(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThanOrEqual(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThan(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThanOrEqual(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean NotEquals(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
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

    public SqlByte ToSqlByte() throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlByte = (JCObject)classInstance.Invoke("ToSqlByte");
            return new SqlByte(objToSqlByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Abs(SqlDecimal n) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAbs = (JCObject)classType.Invoke("Abs", n == null ? null : n.getJCOInstance());
            return new SqlDecimal(objAbs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Add(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException, system.data.sqltypes.SqlTypeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlDecimal(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal AdjustScale(SqlDecimal n, int digits, boolean fRound) throws Throwable, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdjustScale = (JCObject)classType.Invoke("AdjustScale", n == null ? null : n.getJCOInstance(), digits, fRound);
            return new SqlDecimal(objAdjustScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Ceiling(SqlDecimal n) throws Throwable, system.DivideByZeroException, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCeiling = (JCObject)classType.Invoke("Ceiling", n == null ? null : n.getJCOInstance());
            return new SqlDecimal(objCeiling);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal ConvertToPrecScale(SqlDecimal n, int precision, int scale) throws Throwable, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConvertToPrecScale = (JCObject)classType.Invoke("ConvertToPrecScale", n == null ? null : n.getJCOInstance(), precision, scale);
            return new SqlDecimal(objConvertToPrecScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Divide(SqlDecimal x, SqlDecimal y) throws Throwable, system.DivideByZeroException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.data.sqltypes.SqlTypeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlDecimal(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Floor(SqlDecimal n) throws Throwable, system.DivideByZeroException, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFloor = (JCObject)classType.Invoke("Floor", n == null ? null : n.getJCOInstance());
            return new SqlDecimal(objFloor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Multiply(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlDecimal(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.FormatException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", s);
            return new SqlDecimal(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Power(SqlDecimal n, double exp) throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException, system.DivideByZeroException, system.data.sqltypes.SqlTruncateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPower = (JCObject)classType.Invoke("Power", n == null ? null : n.getJCOInstance(), exp);
            return new SqlDecimal(objPower);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Round(SqlDecimal n, int position) throws Throwable, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", n == null ? null : n.getJCOInstance(), position);
            return new SqlDecimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Subtract(SqlDecimal x, SqlDecimal y) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException, system.data.sqltypes.SqlTypeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlDecimal(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDecimal Truncate(SqlDecimal n, int position) throws Throwable, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTruncate = (JCObject)classType.Invoke("Truncate", n == null ? null : n.getJCOInstance(), position);
            return new SqlDecimal(objTruncate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDouble ToSqlDouble() throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDouble = (JCObject)classInstance.Invoke("ToSqlDouble");
            return new SqlDouble(objToSqlDouble);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt16 ToSqlInt16() throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt16 = (JCObject)classInstance.Invoke("ToSqlInt16");
            return new SqlInt16(objToSqlInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Sign(SqlDecimal n) throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSign = (JCObject)classType.Invoke("Sign", n == null ? null : n.getJCOInstance());
            return new SqlInt32(objSign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt32 ToSqlInt32() throws Throwable, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt32 = (JCObject)classInstance.Invoke("ToSqlInt32");
            return new SqlInt32(objToSqlInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt64 ToSqlInt64() throws Throwable, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt64 = (JCObject)classInstance.Invoke("ToSqlInt64");
            return new SqlInt64(objToSqlInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney ToSqlMoney() throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException, system.ArgumentOutOfRangeException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlMoney = (JCObject)classInstance.Invoke("ToSqlMoney");
            return new SqlMoney(objToSqlMoney);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlSingle ToSqlSingle() throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException {
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

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public XmlSchema GetSchema() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void ReadXml(XmlReader reader) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void WriteXml(XmlWriter writer) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
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

    public boolean getIsPositive() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsPositive");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getPrecision() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("Precision");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getScale() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("Scale");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getBinData() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("BinData");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexBinData = 0; indexBinData < resultingArrayList.size(); indexBinData++ ) {
				resultingArray[indexBinData] = (byte)resultingArrayList.get(indexBinData);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] getData() throws Throwable, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Data");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
			for(int indexData = 0; indexData < resultingArrayList.size(); indexData++ ) {
				resultingArray[indexData] = (int)resultingArrayList.get(indexData);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal getValue() throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException, system.ArgumentOutOfRangeException {
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