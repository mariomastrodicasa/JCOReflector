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

package system.web.ui.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.DataSourceView;
import system.web.ui.webcontrols.ModelDataSource;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.web.ui.DataSourceViewOperationCallback;
import system.web.ui.DataSourceSelectArguments;
import system.web.ui.DataSourceViewSelectCallback;
import system.web.ui.webcontrols.CallingDataMethodsEventHandler;


/**
 * The base .NET class managing System.Web.UI.WebControls.ModelDataSourceView, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.WebControls.ModelDataSourceView" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.WebControls.ModelDataSourceView</a>
 */
public class ModelDataSourceView extends DataSourceView  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.UI.WebControls.ModelDataSourceView
     */
    public static final String className = "System.Web.UI.WebControls.ModelDataSourceView";
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

    public ModelDataSourceView(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ModelDataSourceView}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ModelDataSourceView} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ModelDataSourceView cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ModelDataSourceView(from.getJCOInstance());
    }

    // Constructors section
    
    public ModelDataSourceView() throws Throwable {
    }

    public ModelDataSourceView(ModelDataSource owner) throws Throwable, system.ArgumentNullException, system.MulticastNotSupportedException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.web.HttpException, system.collections.generic.KeyNotFoundException, system.threading.ThreadAbortException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(owner == null ? null : owner.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Delete(IDictionary keys, IDictionary oldValues, DataSourceViewOperationCallback callback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.web.HttpException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.configuration.ConfigurationException, system.InvalidCastException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.threading.ThreadAbortException, system.security.SecurityException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete", keys == null ? null : keys.getJCOInstance(), oldValues == null ? null : oldValues.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(IDictionary values, DataSourceViewOperationCallback callback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.web.HttpException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.configuration.ConfigurationException, system.InvalidCastException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.threading.ThreadAbortException, system.security.SecurityException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Insert", values == null ? null : values.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Select(DataSourceSelectArguments arguments, DataSourceViewSelectCallback callback) throws Throwable, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.web.HttpException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.configuration.ConfigurationException, system.InvalidCastException, system.NullReferenceException, system.security.SecurityException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Select", arguments == null ? null : arguments.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Update(IDictionary keys, IDictionary values, IDictionary oldValues, DataSourceViewOperationCallback callback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.web.HttpException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.configuration.ConfigurationException, system.InvalidCastException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.threading.ThreadAbortException, system.security.SecurityException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Update", keys == null ? null : keys.getJCOInstance(), values == null ? null : values.getJCOInstance(), oldValues == null ? null : oldValues.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateProperties(java.lang.String modelTypeName, java.lang.String selectMethod, java.lang.String updateMethod, java.lang.String insertMethod, java.lang.String deleteMethod, java.lang.String dataKeyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateProperties", modelTypeName, selectMethod, updateMethod, insertMethod, deleteMethod, dataKeyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIStateManager method available in IStateManager to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject SaveViewState() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIStateManager to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIStateManager method available in IStateManager to obtain an object with an invocable method
     */
    @Deprecated 
    public void LoadViewState(NetObject state) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIStateManager to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIStateManager method available in IStateManager to obtain an object with an invocable method
     */
    @Deprecated 
    public void TrackViewState() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIStateManager to obtain the full interface.");
    }


    
    // Properties section
    
    public java.lang.String getDataKeyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DataKeyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataKeyName(java.lang.String DataKeyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataKeyName", DataKeyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDeleteMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DeleteMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeleteMethod(java.lang.String DeleteMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DeleteMethod", DeleteMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInsertMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("InsertMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInsertMethod(java.lang.String InsertMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InsertMethod", InsertMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getModelTypeName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ModelTypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelTypeName(java.lang.String ModelTypeName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ModelTypeName", ModelTypeName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSelectMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SelectMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectMethod(java.lang.String SelectMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SelectMethod", SelectMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUpdateMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("UpdateMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateMethod(java.lang.String UpdateMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UpdateMethod", UpdateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addCallingDataMethods(CallingDataMethodsEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CallingDataMethods", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCallingDataMethods(CallingDataMethodsEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CallingDataMethods", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}