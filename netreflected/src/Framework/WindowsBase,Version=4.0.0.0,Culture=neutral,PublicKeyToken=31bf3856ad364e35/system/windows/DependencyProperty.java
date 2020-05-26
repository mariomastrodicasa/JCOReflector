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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.DependencyProperty;
import system.windows.PropertyMetadata;
import system.windows.ValidateValueCallback;
import system.windows.DependencyPropertyKey;
import system.windows.DependencyObject;
import system.windows.DependencyObjectType;


/**
 * The base .NET class managing System.Windows.DependencyProperty, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DependencyProperty extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.Windows.DependencyProperty";
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

    public DependencyProperty(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static DependencyProperty castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DependencyProperty(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static DependencyProperty Register(java.lang.String name, NetType propertyType, NetType ownerType) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objRegister = (JCObject)classType.Invoke("Register", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance());
            return new DependencyProperty(objRegister);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyProperty Register(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata typeMetadata) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objRegister = (JCObject)classType.Invoke("Register", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)typeMetadata.getJCOInstance());
            return new DependencyProperty(objRegister);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyProperty Register(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata typeMetadata, ValidateValueCallback validateValueCallback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.MulticastNotSupportedException {
        try {
            JCObject objRegister = (JCObject)classType.Invoke("Register", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)typeMetadata.getJCOInstance(), validateValueCallback);
            return new DependencyProperty(objRegister);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyPropertyKey RegisterReadOnly(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata typeMetadata) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objRegisterReadOnly = (JCObject)classType.Invoke("RegisterReadOnly", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)typeMetadata.getJCOInstance());
            return new DependencyPropertyKey(objRegisterReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyPropertyKey RegisterReadOnly(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata typeMetadata, ValidateValueCallback validateValueCallback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.MulticastNotSupportedException {
        try {
            JCObject objRegisterReadOnly = (JCObject)classType.Invoke("RegisterReadOnly", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)typeMetadata.getJCOInstance(), validateValueCallback);
            return new DependencyPropertyKey(objRegisterReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyPropertyKey RegisterAttachedReadOnly(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata defaultMetadata) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            JCObject objRegisterAttachedReadOnly = (JCObject)classType.Invoke("RegisterAttachedReadOnly", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)defaultMetadata.getJCOInstance());
            return new DependencyPropertyKey(objRegisterAttachedReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyPropertyKey RegisterAttachedReadOnly(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata defaultMetadata, ValidateValueCallback validateValueCallback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException {
        try {
            JCObject objRegisterAttachedReadOnly = (JCObject)classType.Invoke("RegisterAttachedReadOnly", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)defaultMetadata.getJCOInstance(), validateValueCallback);
            return new DependencyPropertyKey(objRegisterAttachedReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyProperty RegisterAttached(java.lang.String name, NetType propertyType, NetType ownerType) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            JCObject objRegisterAttached = (JCObject)classType.Invoke("RegisterAttached", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance());
            return new DependencyProperty(objRegisterAttached);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyProperty RegisterAttached(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata defaultMetadata) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            JCObject objRegisterAttached = (JCObject)classType.Invoke("RegisterAttached", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)defaultMetadata.getJCOInstance());
            return new DependencyProperty(objRegisterAttached);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyProperty RegisterAttached(java.lang.String name, NetType propertyType, NetType ownerType, PropertyMetadata defaultMetadata, ValidateValueCallback validateValueCallback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException {
        try {
            JCObject objRegisterAttached = (JCObject)classType.Invoke("RegisterAttached", (Object)name, (Object)propertyType.getJCOInstance(), (Object)ownerType.getJCOInstance(), (Object)defaultMetadata.getJCOInstance(), validateValueCallback);
            return new DependencyProperty(objRegisterAttached);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyMetadata GetMetadata(NetType forType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetMetadata = (JCObject)classInstance.Invoke("GetMetadata", (Object)forType.getJCOInstance());
            return new PropertyMetadata(objGetMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyMetadata GetMetadata(DependencyObject dependencyObject) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetMetadata = (JCObject)classInstance.Invoke("GetMetadata", (Object)dependencyObject.getJCOInstance());
            return new PropertyMetadata(objGetMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyMetadata GetMetadata(DependencyObjectType dependencyObjectType) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetMetadata = (JCObject)classInstance.Invoke("GetMetadata", (Object)dependencyObjectType.getJCOInstance());
            return new PropertyMetadata(objGetMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyProperty AddOwner(NetType ownerType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.MulticastNotSupportedException {
        try {
            JCObject objAddOwner = (JCObject)classInstance.Invoke("AddOwner", (Object)ownerType.getJCOInstance());
            return new DependencyProperty(objAddOwner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidType(NetObject value) throws Throwable, system.NotSupportedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsValidType", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidValue(NetObject value) throws Throwable, system.NotSupportedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsValidValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OverrideMetadata(NetType forType, PropertyMetadata typeMetadata) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("OverrideMetadata", (Object)forType.getJCOInstance(), (Object)typeMetadata.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OverrideMetadata(NetType forType, PropertyMetadata typeMetadata, DependencyPropertyKey key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("OverrideMetadata", (Object)forType.getJCOInstance(), (Object)typeMetadata.getJCOInstance(), (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyProperty AddOwner(NetType ownerType, PropertyMetadata typeMetadata) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.MulticastNotSupportedException {
        try {
            JCObject objAddOwner = (JCObject)classInstance.Invoke("AddOwner", (Object)ownerType.getJCOInstance(), (Object)typeMetadata.getJCOInstance());
            return new DependencyProperty(objAddOwner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getPropertyType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getOwnerType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OwnerType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyMetadata getDefaultMetadata() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultMetadata");
            return new PropertyMetadata(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValidateValueCallback getValidateValueCallback() throws Throwable {
        try {
            return (ValidateValueCallback)classInstance.Get("ValidateValueCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getGlobalIndex() throws Throwable {
        try {
            return (int)classInstance.Get("GlobalIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}