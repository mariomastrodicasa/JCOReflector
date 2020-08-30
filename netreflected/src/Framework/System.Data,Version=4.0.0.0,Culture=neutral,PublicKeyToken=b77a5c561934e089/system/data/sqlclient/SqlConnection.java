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

package system.data.sqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbConnection;
import system.data.sqlclient.SqlCredential;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.data.DataTable;
import system.data.sqlclient.SqlCommand;
import system.data.sqlclient.SqlTransaction;
import system.data.IsolationLevel;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import system.security.SecureString;
import system.data.sqlclient.SqlConnection;
import system.enterpriseservices.ITransaction;
import system.enterpriseservices.ITransactionImplementation;
import system.transactions.Transaction;
import system.data.ConnectionState;
import system.Guid;
import system.TimeSpan;
import system.data.sqlclient.SqlInfoMessageEventHandler;


/**
 * The base .NET class managing System.Data.SqlClient.SqlConnection, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlClient.SqlConnection" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlClient.SqlConnection</a>
 */
public class SqlConnection extends DbConnection  {
    /**
     * Fully assembly qualified name: System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data
     */
    public static final String assemblyShortName = "System.Data";
    /**
     * Qualified class name: System.Data.SqlClient.SqlConnection
     */
    public static final String className = "System.Data.SqlClient.SqlConnection";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public SqlConnection(Object instance) throws Throwable {
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlConnection}, a cast assert is made to check if types are compatible.
     */
    public static SqlConnection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlConnection(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlConnection() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlConnection(java.lang.String connectionString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlConnection(java.lang.String connectionString, SqlCredential credential) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(connectionString, credential == null ? null : credential.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public IDictionary RetrieveStatistics() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRetrieveStatistics = (JCObject)classInstance.Invoke("RetrieveStatistics");
            return new IDictionaryImplementation(objRetrieveStatistics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema() throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema");
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String collectionName) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", collectionName);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String collectionName, java.lang.String[] restrictionValues) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", collectionName, restrictionValues);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String dupParam0, JCRefOut dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", dupParam0, dupParam1);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommand CreateCommandNewSqlConnection() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCommand = (JCObject)classInstance.Invoke("CreateCommand");
            return new SqlCommand(objCreateCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlTransaction BeginTransactionNewSqlConnection() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.threading.ThreadAbortException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.AggregateException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction");
            return new SqlTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlTransaction BeginTransactionNewSqlConnection(IsolationLevel iso) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.threading.ThreadAbortException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.AggregateException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction", iso == null ? null : iso.getJCOInstance());
            return new SqlTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlTransaction BeginTransaction(IsolationLevel iso, java.lang.String transactionName) throws Throwable, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.threading.ThreadAbortException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.OperationCanceledException, system.AggregateException, system.ArgumentException, system.OverflowException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction", iso == null ? null : iso.getJCOInstance(), transactionName);
            return new SqlTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlTransaction BeginTransaction(java.lang.String transactionName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.threading.ThreadAbortException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.AggregateException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction", transactionName);
            return new SqlTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task OpenAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.threading.tasks.TaskSchedulerException, system.security.SecurityException, system.OutOfMemoryException, system.AccessViolationException, system.threading.ThreadAbortException, system.transactions.TransactionInDoubtException, system.NotSupportedException, system.NullReferenceException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenAsync = (JCObject)classInstance.Invoke("OpenAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objOpenAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ChangeDatabase(java.lang.String database) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.threading.ThreadAbortException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.transactions.TransactionException, system.OverflowException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ChangeDatabase", database);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChangePassword(java.lang.String connectionString, SqlCredential credential, SecureString newSecurePassword) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.NotSupportedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.OutOfMemoryException, system.data.sqlclient.SqlException, system.data.sqltypes.SqlTruncateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ChangePassword", connectionString, credential == null ? null : credential.getJCOInstance(), newSecurePassword == null ? null : newSecurePassword.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChangePassword(java.lang.String connectionString, java.lang.String newPassword) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.NotSupportedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.OutOfMemoryException, system.data.sqlclient.SqlException, system.data.sqltypes.SqlTruncateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ChangePassword", connectionString, newPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearAllPools() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearAllPools");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearPool(SqlConnection connection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearPool", connection == null ? null : connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.ObjectDisposedException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidOperationException, system.AggregateException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.transactions.TransactionException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnlistDistributedTransaction(ITransaction transaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NullReferenceException, system.PlatformNotSupportedException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.transactions.TransactionException, system.IndexOutOfRangeException, system.OverflowException, system.transactions.TransactionManagerCommunicationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EnlistDistributedTransaction", transaction == null ? null : transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnlistTransaction(Transaction transaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.threading.SemaphoreFullException, system.IndexOutOfRangeException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EnlistTransaction", transaction == null ? null : transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.OutOfMemoryException, system.AccessViolationException, system.transactions.TransactionException, system.threading.ThreadAbortException, system.PlatformNotSupportedException, system.transactions.TransactionInDoubtException, system.transactions.TransactionManagerCommunicationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Open");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetStatistics() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ResetStatistics");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getColumnEncryptionQueryMetadataCacheEnabled() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("ColumnEncryptionQueryMetadataCacheEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setColumnEncryptionQueryMetadataCacheEnabled(boolean ColumnEncryptionQueryMetadataCacheEnabled) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("ColumnEncryptionQueryMetadataCacheEnabled", ColumnEncryptionQueryMetadataCacheEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFireInfoMessageEventOnUserErrors() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FireInfoMessageEventOnUserErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFireInfoMessageEventOnUserErrors(boolean FireInfoMessageEventOnUserErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FireInfoMessageEventOnUserErrors", FireInfoMessageEventOnUserErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getStatisticsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("StatisticsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStatisticsEnabled(boolean StatisticsEnabled) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StatisticsEnabled", StatisticsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPacketSize() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PacketSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCredential getCredential() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Credential");
            return new SqlCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCredential(SqlCredential Credential) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Credential", Credential == null ? null : Credential.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getClientConnectionId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientConnectionId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAccessToken() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AccessToken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAccessToken(java.lang.String AccessToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AccessToken", AccessToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWorkstationId() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NullReferenceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("WorkstationId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan getColumnEncryptionKeyCacheTtl() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ColumnEncryptionKeyCacheTtl");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setColumnEncryptionKeyCacheTtl(TimeSpan ColumnEncryptionKeyCacheTtl) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("ColumnEncryptionKeyCacheTtl", ColumnEncryptionKeyCacheTtl == null ? null : ColumnEncryptionKeyCacheTtl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addInfoMessage(SqlInfoMessageEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("InfoMessage", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInfoMessage(SqlInfoMessageEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("InfoMessage", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}