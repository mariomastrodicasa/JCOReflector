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
import java.util.ArrayList;

// Import section
import system.data.MappingType;
import system.componentmodel.IContainer;
import system.componentmodel.IContainerImplementation;
import system.componentmodel.ISite;
import system.componentmodel.ISiteImplementation;
import system.data.DataSetDateTime;
import system.data.DataTable;
import system.data.PropertyCollection;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.DataColumn, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DataColumn extends NetObject  {
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Data.Common";
    public static final String className = "System.Data.DataColumn";
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

    public DataColumn(Object instance) throws Throwable {
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

    public static DataColumn cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataColumn(from.getJCOInstance());
    }

    // Constructors section
    

    public DataColumn() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(columnName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName, NetType dataType) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(columnName, dataType == null ? null : dataType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName, NetType dataType, java.lang.String expr) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(columnName, dataType == null ? null : dataType.getJCOInstance(), expr));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName, NetType dataType, java.lang.String expr, MappingType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.InvalidCastException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(columnName, dataType == null ? null : dataType.getJCOInstance(), expr, type == null ? null : type.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject GetService(NetType service) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetService = (JCObject)classInstance.Invoke("GetService", service == null ? null : service.getJCOInstance());
            return new NetObject(objGetService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOrdinal(int ordinal) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.RankException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOrdinal", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAllowDBNull() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowDBNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowDBNull(boolean AllowDBNull) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowDBNull", AllowDBNull);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutoIncrement() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoIncrement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoIncrement(boolean AutoIncrement) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoIncrement", AutoIncrement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDesignMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DesignMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUnique() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Unique");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnique(boolean Unique) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Unique", Unique);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxLength(int MaxLength) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxLength", MaxLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getOrdinal() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Ordinal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAutoIncrementSeed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("AutoIncrementSeed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoIncrementSeed(long AutoIncrementSeed) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoIncrementSeed", AutoIncrementSeed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAutoIncrementStep() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("AutoIncrementStep");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoIncrementStep(long AutoIncrementStep) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoIncrementStep", AutoIncrementStep);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IContainer getContainer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Container");
            return new IContainerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISite getSite() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Site");
            return new ISiteImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSite(ISite Site) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Site", Site == null ? null : Site.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSetDateTime getDateTimeMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DateTimeMode");
            return new DataSetDateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDateTimeMode(DataSetDateTime DateTimeMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DateTimeMode", DateTimeMode == null ? null : DateTimeMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable getTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Table");
            return new DataTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MappingType getColumnMapping() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnMapping");
            return new MappingType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnMapping(MappingType ColumnMapping) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.SynchronizationLockException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnMapping", ColumnMapping == null ? null : ColumnMapping.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyCollection getExtendedProperties() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExtendedProperties");
            return new PropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDefaultValue() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException, system.UriFormatException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultValue(NetObject DefaultValue) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.IndexOutOfRangeException, system.InvalidOperationException, system.OverflowException, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException, system.UriFormatException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultValue", DefaultValue == null ? null : DefaultValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCaption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Caption");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCaption(java.lang.String Caption) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Caption", Caption);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getColumnName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ColumnName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnName(java.lang.String ColumnName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnName", ColumnName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getExpression() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Expression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExpression(java.lang.String Expression) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.IndexOutOfRangeException, system.InvalidOperationException, system.OverflowException, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException, system.InvalidCastException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Expression", Expression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNamespace() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Namespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespace(java.lang.String Namespace) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Namespace", Namespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPrefix() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Prefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrefix(java.lang.String Prefix) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Prefix", Prefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDataType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataType(NetType DataType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.data.sqltypes.SqlTypeException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException, system.UriFormatException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataType", DataType == null ? null : DataType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addDisposed(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}