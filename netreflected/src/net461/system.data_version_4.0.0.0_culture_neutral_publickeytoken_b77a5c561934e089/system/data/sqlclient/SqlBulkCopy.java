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

package system.data.sqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.sqlclient.SqlConnection;
import system.data.sqlclient.SqlBulkCopyOptions;
import system.data.sqlclient.SqlTransaction;
import system.threading.tasks.Task;
import system.data.common.DbDataReader;
import system.threading.CancellationToken;
import system.data.DataRow;
import system.data.DataTable;
import system.data.DataRowState;
import system.data.IDataReader;
import system.data.IDataReaderImplementation;
import system.data.sqlclient.SqlBulkCopyColumnMappingCollection;
import system.data.sqlclient.SqlRowsCopiedEventHandler;
import system.IDisposable;
import system.IDisposableImplementation;


/**
 * The base .NET class managing System.Data.SqlClient.SqlBulkCopy, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlClient.SqlBulkCopy" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlClient.SqlBulkCopy</a>
 */
public class SqlBulkCopy extends NetObject implements system.IDisposable, AutoCloseable {
    /**
     * Fully assembly qualified name: System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data
     */
    public static final String assemblyShortName = "System.Data";
    /**
     * Qualified class name: System.Data.SqlClient.SqlBulkCopy
     */
    public static final String className = "System.Data.SqlClient.SqlBulkCopy";
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

    public SqlBulkCopy(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlBulkCopy}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlBulkCopy} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlBulkCopy cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlBulkCopy(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlBulkCopy() throws Throwable {
    }

    public SqlBulkCopy(SqlConnection connection) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connection == null ? null : connection.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopy(SqlConnection connection, SqlBulkCopyOptions copyOptions, SqlTransaction externalTransaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connection == null ? null : connection.getJCOInstance(), copyOptions == null ? null : copyOptions.getJCOInstance(), externalTransaction == null ? null : externalTransaction.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopy(java.lang.String connectionString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopy(java.lang.String connectionString, SqlBulkCopyOptions copyOptions) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString, copyOptions == null ? null : copyOptions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Task WriteToServerAsync(DbDataReader reader) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", reader == null ? null : reader.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DbDataReader reader, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", reader == null ? null : reader.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DataRow[] rows) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", (Object)toObjectFromArray(rows));
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DataRow[] rows, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", toObjectFromArray(rows), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DataTable table) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", table == null ? null : table.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DataTable table, DataRowState rowState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", table == null ? null : table.getJCOInstance(), rowState == null ? null : rowState.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DataTable table, DataRowState rowState, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", table == null ? null : table.getJCOInstance(), rowState == null ? null : rowState.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(DataTable table, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", table == null ? null : table.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(IDataReader reader) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", reader == null ? null : reader.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToServerAsync(IDataReader reader, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToServerAsync = (JCObject)classInstance.Invoke("WriteToServerAsync", reader == null ? null : reader.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteToServerAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToServer(DbDataReader reader) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteToServer", reader == null ? null : reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToServer(DataRow[] rows) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteToServer", (Object)toObjectFromArray(rows));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToServer(DataTable table) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqlclient.SqlException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteToServer", table == null ? null : table.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToServer(DataTable table, DataRowState rowState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteToServer", table == null ? null : table.getJCOInstance(), rowState == null ? null : rowState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToServer(IDataReader reader) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.IndexOutOfRangeException, system.data.sqlclient.SqlException, system.diagnostics.tracing.EventSourceException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.NotSupportedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.OperationAbortedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteToServer", reader == null ? null : reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIDisposable method available in IDisposable to obtain an object with an invocable method
     */
    @Deprecated 
    public void Dispose() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIDisposable to obtain the full interface.");
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public boolean getEnableStreaming() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnableStreaming");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableStreaming(boolean EnableStreaming) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnableStreaming", EnableStreaming);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBatchSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BatchSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBatchSize(int BatchSize) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BatchSize", BatchSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBulkCopyTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BulkCopyTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBulkCopyTimeout(int BulkCopyTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BulkCopyTimeout", BulkCopyTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNotifyAfter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NotifyAfter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNotifyAfter(int NotifyAfter) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NotifyAfter", NotifyAfter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopyColumnMappingCollection getColumnMappings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnMappings");
            return new SqlBulkCopyColumnMappingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDestinationTableName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DestinationTableName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDestinationTableName(java.lang.String DestinationTableName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DestinationTableName", DestinationTableName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addSqlRowsCopied(SqlRowsCopiedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("SqlRowsCopied", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSqlRowsCopied(SqlRowsCopiedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("SqlRowsCopied", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}