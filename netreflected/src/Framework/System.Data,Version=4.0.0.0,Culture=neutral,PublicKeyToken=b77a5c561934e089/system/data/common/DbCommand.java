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

package system.data.common;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbParameter;
import system.data.common.DbDataReader;
import system.data.CommandBehavior;
import system.runtime.remoting.ObjRef;
import system.data.CommandType;
import system.data.common.DbConnection;
import system.data.common.DbParameterCollection;
import system.data.common.DbTransaction;
import system.data.UpdateRowSource;
import system.componentmodel.ISite;
import system.componentmodel.ISiteImplementation;
import system.componentmodel.IContainer;
import system.componentmodel.IContainerImplementation;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.Common.DbCommand, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DbCommand extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.Common.DbCommand";
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

    public DbCommand(Object instance) throws Throwable {
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

    public static DbCommand cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DbCommand(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public void Cancel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbParameter CreateParameter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateParameter = (JCObject)classInstance.Invoke("CreateParameter");
            return new DbParameter(objCreateParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteNonQuery() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteNonQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDataReader ExecuteReader() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader");
            return new DbDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDataReader ExecuteReader(CommandBehavior behavior) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader", behavior == null ? null : behavior.getJCOInstance());
            return new DbDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ExecuteScalar() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecuteScalar = (JCObject)classInstance.Invoke("ExecuteScalar");
            return new NetObject(objExecuteScalar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepare() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Prepare");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", requestedType == null ? null : requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getCommandText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CommandText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandText(java.lang.String CommandText) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandText", CommandText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCommandTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CommandTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandTimeout(int CommandTimeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandTimeout", CommandTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommandType getCommandType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CommandType");
            return new CommandType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandType(CommandType CommandType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandType", CommandType == null ? null : CommandType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbConnection getConnection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new DbConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnection(DbConnection Connection) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Connection", Connection == null ? null : Connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDesignTimeVisible() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DesignTimeVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDesignTimeVisible(boolean DesignTimeVisible) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DesignTimeVisible", DesignTimeVisible);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbParameterCollection getParameters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new DbParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbTransaction getTransaction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transaction");
            return new DbTransaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransaction(DbTransaction Transaction) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transaction", Transaction == null ? null : Transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UpdateRowSource getUpdatedRowSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UpdatedRowSource");
            return new UpdateRowSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdatedRowSource(UpdateRowSource UpdatedRowSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UpdatedRowSource", UpdatedRowSource == null ? null : UpdatedRowSource.getJCOInstance());
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