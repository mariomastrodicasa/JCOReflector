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
import system.data.DataSet;
import system.data.DataTable;
import system.data.SchemaType;
import system.data.IDataParameter;
import system.data.IDataParameterImplementation;
import system.runtime.remoting.ObjRef;
import system.componentmodel.IContainer;
import system.componentmodel.IContainerImplementation;
import system.componentmodel.ISite;
import system.componentmodel.ISiteImplementation;
import system.data.common.DataTableMappingCollection;
import system.data.LoadOption;
import system.data.MissingMappingAction;
import system.data.MissingSchemaAction;
import system.data.FillErrorEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.Common.DataAdapter, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataAdapter extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.Common.DataAdapter";
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

    public DataAdapter(Object instance) throws Throwable {
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

    public static DataAdapter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataAdapter(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public boolean ShouldSerializeAcceptChangesDuringFill() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeAcceptChangesDuringFill");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeFillLoadOption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeFillLoadOption");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Fill(DataSet dataSet) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Fill", dataSet == null ? null : dataSet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Update(DataSet dataSet) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Update", dataSet == null ? null : dataSet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable[] FillSchema(DataSet dataSet, SchemaType schemaType) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<DataTable> resultingArrayList = new ArrayList<DataTable>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("FillSchema", dataSet == null ? null : dataSet.getJCOInstance(), schemaType == null ? null : schemaType.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DataTable(resultingObject));
            }
            DataTable[] resultingArray = new DataTable[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDataParameter[] GetFillParameters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<IDataParameter> resultingArrayList = new ArrayList<IDataParameter>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFillParameters");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IDataParameterImplementation(resultingObject));
            }
            IDataParameter[] resultingArray = new IDataParameter[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
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

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetFillLoadOption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ResetFillLoadOption");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAcceptChangesDuringFill() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AcceptChangesDuringFill");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAcceptChangesDuringFill(boolean AcceptChangesDuringFill) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AcceptChangesDuringFill", AcceptChangesDuringFill);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAcceptChangesDuringUpdate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AcceptChangesDuringUpdate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAcceptChangesDuringUpdate(boolean AcceptChangesDuringUpdate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AcceptChangesDuringUpdate", AcceptChangesDuringUpdate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getContinueUpdateOnError() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ContinueUpdateOnError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContinueUpdateOnError(boolean ContinueUpdateOnError) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ContinueUpdateOnError", ContinueUpdateOnError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReturnProviderSpecificTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ReturnProviderSpecificTypes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReturnProviderSpecificTypes(boolean ReturnProviderSpecificTypes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReturnProviderSpecificTypes", ReturnProviderSpecificTypes);
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

    public DataTableMappingCollection getTableMappings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TableMappings");
            return new DataTableMappingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoadOption getFillLoadOption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FillLoadOption");
            return new LoadOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFillLoadOption(LoadOption FillLoadOption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FillLoadOption", FillLoadOption == null ? null : FillLoadOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MissingMappingAction getMissingMappingAction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MissingMappingAction");
            return new MissingMappingAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMissingMappingAction(MissingMappingAction MissingMappingAction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MissingMappingAction", MissingMappingAction == null ? null : MissingMappingAction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MissingSchemaAction getMissingSchemaAction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MissingSchemaAction");
            return new MissingSchemaAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMissingSchemaAction(MissingSchemaAction MissingSchemaAction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MissingSchemaAction", MissingSchemaAction == null ? null : MissingSchemaAction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addFillError(FillErrorEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("FillError", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFillError(FillErrorEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("FillError", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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