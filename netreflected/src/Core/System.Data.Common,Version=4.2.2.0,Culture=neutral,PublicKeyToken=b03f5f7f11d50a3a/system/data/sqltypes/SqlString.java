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
import system.data.sqltypes.SqlCompareOptions;
import system.data.sqltypes.SqlString;
import system.data.sqltypes.SqlBoolean;
import system.data.sqltypes.SqlByte;
import system.data.sqltypes.SqlDateTime;
import system.data.sqltypes.SqlDouble;
import system.data.sqltypes.SqlInt16;
import system.data.sqltypes.SqlInt32;
import system.data.sqltypes.SqlInt64;
import system.data.sqltypes.SqlMoney;
import system.data.sqltypes.SqlDecimal;
import system.data.sqltypes.SqlSingle;
import system.data.sqltypes.SqlGuid;
import system.globalization.CompareOptions;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;
import system.globalization.CultureInfo;
import system.globalization.CompareInfo;


/**
 * The base .NET class managing System.Data.SqlTypes.SqlString, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SqlString extends NetObject  {
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Data.Common";
    public static final String className = "System.Data.SqlTypes.SqlString";
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

    public SqlString(Object instance) throws Throwable {
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

    public static SqlString cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlString(from.getJCOInstance());
    }

    // Constructors section
    

    public SqlString(java.lang.String data) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(data));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString(java.lang.String data, int lcid, SqlCompareOptions compareOptions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(data, lcid, compareOptions == null ? null : compareOptions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString(int lcid, SqlCompareOptions compareOptions, byte[] data, int index, int count, boolean fUnicode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(lcid, compareOptions == null ? null : compareOptions.getJCOInstance(), data, index, count, fUnicode));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString(int lcid, SqlCompareOptions compareOptions, byte[] data, boolean fUnicode) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(lcid, compareOptions == null ? null : compareOptions.getJCOInstance(), data, fUnicode));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString(int lcid, SqlCompareOptions compareOptions, byte[] data, int index, int count) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(lcid, compareOptions == null ? null : compareOptions.getJCOInstance(), data, index, count));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString(int lcid, SqlCompareOptions compareOptions, byte[] data) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(lcid, compareOptions == null ? null : compareOptions.getJCOInstance(), data));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString(java.lang.String data, int lcid) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(data, lcid));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public byte[] GetUnicodeBytes() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetUnicodeBytes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetUnicodeBytes = 0; indexGetUnicodeBytes < resultingArrayList.size(); indexGetUnicodeBytes++ ) {
				resultingArray[indexGetUnicodeBytes] = (byte)resultingArrayList.get(indexGetUnicodeBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetNonUnicodeBytes() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetNonUnicodeBytes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetNonUnicodeBytes = 0; indexGetNonUnicodeBytes < resultingArrayList.size(); indexGetNonUnicodeBytes++ ) {
				resultingArray[indexGetNonUnicodeBytes] = (byte)resultingArrayList.get(indexGetNonUnicodeBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString Clone() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new SqlString(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlString Concat(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlTypeException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConcat = (JCObject)classType.Invoke("Concat", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlString(objConcat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlString Add(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlTypeException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlString(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean Equals(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean NotEquals(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNotEquals = (JCObject)classType.Invoke("NotEquals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objNotEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThan(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThan(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThanOrEqual(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThanOrEqual(SqlString x, SqlString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBoolean ToSqlBoolean() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlBoolean = (JCObject)classInstance.Invoke("ToSqlBoolean");
            return new SqlBoolean(objToSqlBoolean);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlByte ToSqlByte() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlByte = (JCObject)classInstance.Invoke("ToSqlByte");
            return new SqlByte(objToSqlByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDateTime ToSqlDateTime() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.OverflowException, system.TypeInitializationException, system.FormatException, system.data.sqltypes.SqlTypeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDateTime = (JCObject)classInstance.Invoke("ToSqlDateTime");
            return new SqlDateTime(objToSqlDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDouble ToSqlDouble() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDouble = (JCObject)classInstance.Invoke("ToSqlDouble");
            return new SqlDouble(objToSqlDouble);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt16 ToSqlInt16() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt16 = (JCObject)classInstance.Invoke("ToSqlInt16");
            return new SqlInt16(objToSqlInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt32 ToSqlInt32() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt32 = (JCObject)classInstance.Invoke("ToSqlInt32");
            return new SqlInt32(objToSqlInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt64 ToSqlInt64() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt64 = (JCObject)classInstance.Invoke("ToSqlInt64");
            return new SqlInt64(objToSqlInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney ToSqlMoney() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.sqltypes.SqlTruncateException, system.OverflowException, system.DivideByZeroException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlMoney = (JCObject)classInstance.Invoke("ToSqlMoney");
            return new SqlMoney(objToSqlMoney);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal ToSqlDecimal() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDecimal = (JCObject)classInstance.Invoke("ToSqlDecimal");
            return new SqlDecimal(objToSqlDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlSingle ToSqlSingle() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlSingle = (JCObject)classInstance.Invoke("ToSqlSingle");
            return new SqlSingle(objToSqlSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlGuid ToSqlGuid() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.NotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlGuid = (JCObject)classInstance.Invoke("ToSqlGuid");
            return new SqlGuid(objToSqlGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CompareOptions CompareOptionsFromSqlCompareOptions(SqlCompareOptions compareOptions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCompareOptionsFromSqlCompareOptions = (JCObject)classType.Invoke("CompareOptionsFromSqlCompareOptions", compareOptions == null ? null : compareOptions.getJCOInstance());
            return new CompareOptions(objCompareOptionsFromSqlCompareOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(SqlString value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlTypeException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
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

    public java.lang.String getValue() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLCID() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("LCID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CultureInfo getCultureInfo() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CultureInfo");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompareInfo getCompareInfo() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CompareInfo");
            return new CompareInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCompareOptions getSqlCompareOptions() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SqlCompareOptions");
            return new SqlCompareOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}