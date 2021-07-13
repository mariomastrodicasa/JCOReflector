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

package system.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.DataView;
import system.data.DataRelation;
import system.componentmodel.AttributeCollection;
import system.componentmodel.EventDescriptor;
import system.componentmodel.EventDescriptorCollection;
import system.Attribute;
import system.componentmodel.PropertyDescriptor;
import system.componentmodel.PropertyDescriptorCollection;
import system.componentmodel.TypeConverter;
import system.data.DataRow;
import system.data.DataRowVersion;
import system.componentmodel.PropertyChangedEventHandler;
import system.componentmodel.ICustomTypeDescriptor;
import system.componentmodel.ICustomTypeDescriptorImplementation;


/**
 * The base .NET class managing System.Data.DataRowView, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.DataRowView" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.DataRowView</a>
 */
public class DataRowView extends NetObject implements system.componentmodel.ICustomTypeDescriptor {
    /**
     * Fully assembly qualified name: System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Data.Common
     */
    public static final String assemblyShortName = "System.Data.Common";
    /**
     * Qualified class name: System.Data.DataRowView
     */
    public static final String className = "System.Data.DataRowView";
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

    public DataRowView(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataRowView}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataRowView} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataRowView cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataRowView(from.getJCOInstance());
    }

    // Constructors section
    
    public DataRowView() throws Throwable {
    }



    
    // Methods section
    
    public DataView CreateChildView(DataRelation relation) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", relation == null ? null : relation.getJCOInstance());
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView CreateChildView(DataRelation relation, boolean followParent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", relation == null ? null : relation.getJCOInstance(), followParent);
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView CreateChildView(java.lang.String relationName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.FormatException, system.threading.SynchronizationLockException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", relationName);
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView CreateChildView(java.lang.String relationName, boolean followParent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", relationName, followParent);
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginEdit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelEdit() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndEdit() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public AttributeCollection GetAttributes() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public EventDescriptor GetDefaultEvent() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public EventDescriptorCollection GetEvents() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public EventDescriptorCollection GetEvents(Attribute[] attributes) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public PropertyDescriptor GetDefaultProperty() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public PropertyDescriptorCollection GetProperties() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public PropertyDescriptorCollection GetProperties(Attribute[] attributes) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public TypeConverter GetConverter() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject GetEditor(NetType editorBaseType) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject GetPropertyOwner(PropertyDescriptor pd) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String GetClassName() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICustomTypeDescriptor method available in ICustomTypeDescriptor to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String GetComponentName() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICustomTypeDescriptor to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsEdit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNew() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRow getRow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Row");
            return new DataRow(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRowVersion getRowVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RowVersion");
            return new DataRowVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView getDataView() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataView");
            return new DataView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addPropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}