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

package system.data.entityclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbCommand;
import system.data.entityclient.EntityConnection;
import system.data.entityclient.EntityTransaction;
import system.data.entityclient.EntityDataReader;
import system.data.CommandBehavior;
import system.data.entityclient.EntityParameter;
import system.data.CommandType;
import system.data.common.commandtrees.DbCommandTree;
import system.data.entityclient.EntityParameterCollection;
import system.data.UpdateRowSource;


/**
 * The base .NET class managing System.Data.EntityClient.EntityCommand, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.EntityClient.EntityCommand" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.EntityClient.EntityCommand</a>
 */
public class EntityCommand extends DbCommand  {
    /**
     * Fully assembly qualified name: System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data.Entity
     */
    public static final String assemblyShortName = "System.Data.Entity";
    /**
     * Qualified class name: System.Data.EntityClient.EntityCommand
     */
    public static final String className = "System.Data.EntityClient.EntityCommand";
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

    public EntityCommand(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EntityCommand}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EntityCommand} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EntityCommand cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EntityCommand(from.getJCOInstance());
    }

    // Constructors section
    
    public EntityCommand() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityCommand(java.lang.String statement) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(statement));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityCommand(java.lang.String statement, EntityConnection connection) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(statement, connection == null ? null : connection.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityCommand(java.lang.String statement, EntityConnection connection, EntityTransaction transaction) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(statement, connection == null ? null : connection.getJCOInstance(), transaction == null ? null : transaction.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public int ExecuteNonQuery() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.ProviderIncompatibleException, system.data.EntityCommandExecutionException, system.threading.SynchronizationLockException, system.data.MetadataException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteNonQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityDataReader ExecuteReaderNewEntityCommand() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.ProviderIncompatibleException, system.data.EntityCommandExecutionException, system.data.MetadataException, system.threading.SynchronizationLockException, system.globalization.CultureNotFoundException, system.io.FileNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader");
            return new EntityDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityDataReader ExecuteReaderNewEntityCommand(CommandBehavior behavior) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.data.ProviderIncompatibleException, system.data.EntityCommandExecutionException, system.data.MetadataException, system.threading.SynchronizationLockException, system.threading.LockRecursionException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader", behavior == null ? null : behavior.getJCOInstance());
            return new EntityDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityParameter CreateParameterNewEntityCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateParameter = (JCObject)classInstance.Invoke("CreateParameter");
            return new EntityParameter(objCreateParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ExecuteScalar() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.data.ProviderIncompatibleException, system.data.EntityCommandExecutionException, system.threading.SynchronizationLockException, system.data.MetadataException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteScalar = (JCObject)classInstance.Invoke("ExecuteScalar");
            return new NetObject(objExecuteScalar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToTraceString() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.data.MetadataException, system.data.EntitySqlException, system.data.ProviderIncompatibleException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToTraceString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepare() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.data.MetadataException, system.data.EntitySqlException, system.data.ProviderIncompatibleException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Prepare");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getEnablePlanCaching() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnablePlanCaching");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnablePlanCaching(boolean EnablePlanCaching) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnablePlanCaching", EnablePlanCaching);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbCommandTree getCommandTree() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CommandTree");
            return new DbCommandTree(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandTree(DbCommandTree CommandTree) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandTree", CommandTree == null ? null : CommandTree.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityConnection getConnectionNewEntityCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new EntityConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnection(EntityConnection Connection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Connection", Connection == null ? null : Connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityParameterCollection getParametersNewEntityCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new EntityParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityTransaction getTransactionNewEntityCommand() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transaction");
            return new EntityTransaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransaction(EntityTransaction Transaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transaction", Transaction == null ? null : Transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}