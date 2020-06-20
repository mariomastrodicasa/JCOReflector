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

package system.componentmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.ICustomTypeDescriptor;
import system.componentmodel.ICustomTypeDescriptorImplementation;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;


/**
 * The base .NET class managing System.ComponentModel.TypeDescriptionProvider, System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class TypeDescriptionProvider extends NetObject  {
    public static final String assemblyFullName = "System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.ComponentModel.TypeConverter";
    public static final String className = "System.ComponentModel.TypeDescriptionProvider";
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

    public TypeDescriptionProvider(Object instance) throws Throwable {
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

    public static TypeDescriptionProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TypeDescriptionProvider(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public NetType GetReflectionType(NetType objectType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetReflectionType = (JCObject)classInstance.Invoke("GetReflectionType", objectType == null ? null : objectType.getJCOInstance());
            return new NetType(objGetReflectionType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetReflectionType(NetType objectType, NetObject instance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetReflectionType = (JCObject)classInstance.Invoke("GetReflectionType", objectType == null ? null : objectType.getJCOInstance(), instance == null ? null : instance.getJCOInstance());
            return new NetType(objGetReflectionType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICustomTypeDescriptor GetTypeDescriptor(NetType objectType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTypeDescriptor = (JCObject)classInstance.Invoke("GetTypeDescriptor", objectType == null ? null : objectType.getJCOInstance());
            return new ICustomTypeDescriptorImplementation(objGetTypeDescriptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICustomTypeDescriptor GetTypeDescriptor(NetType objectType, NetObject instance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTypeDescriptor = (JCObject)classInstance.Invoke("GetTypeDescriptor", objectType == null ? null : objectType.getJCOInstance(), instance == null ? null : instance.getJCOInstance());
            return new ICustomTypeDescriptorImplementation(objGetTypeDescriptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(IServiceProvider provider, NetType objectType, NetType[] argTypes, NetObject[] args) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", provider == null ? null : provider.getJCOInstance(), objectType == null ? null : objectType.getJCOInstance(), toObjectFromArray(argTypes), toObjectFromArray(args));
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDictionary GetCache(NetObject instance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCache = (JCObject)classInstance.Invoke("GetCache", instance == null ? null : instance.getJCOInstance());
            return new IDictionaryImplementation(objGetCache);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICustomTypeDescriptor GetExtendedTypeDescriptor(NetObject instance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetExtendedTypeDescriptor = (JCObject)classInstance.Invoke("GetExtendedTypeDescriptor", instance == null ? null : instance.getJCOInstance());
            return new ICustomTypeDescriptorImplementation(objGetExtendedTypeDescriptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetFullComponentName(NetObject component) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetFullComponentName", component == null ? null : component.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetReflectionType(NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetReflectionType = (JCObject)classInstance.Invoke("GetReflectionType", instance == null ? null : instance.getJCOInstance());
            return new NetType(objGetReflectionType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetRuntimeType(NetType reflectionType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRuntimeType = (JCObject)classInstance.Invoke("GetRuntimeType", reflectionType == null ? null : reflectionType.getJCOInstance());
            return new NetType(objGetRuntimeType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICustomTypeDescriptor GetTypeDescriptor(NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTypeDescriptor = (JCObject)classInstance.Invoke("GetTypeDescriptor", instance == null ? null : instance.getJCOInstance());
            return new ICustomTypeDescriptorImplementation(objGetTypeDescriptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSupportedType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSupportedType", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}