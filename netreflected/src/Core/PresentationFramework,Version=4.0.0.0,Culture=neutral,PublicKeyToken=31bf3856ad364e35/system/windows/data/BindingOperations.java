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

package system.windows.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.DependencyObject;
import system.windows.DependencyProperty;
import system.windows.data.BindingBase;
import system.windows.data.BindingExpression;
import system.windows.data.BindingExpressionBase;
import system.windows.data.MultiBinding;
import system.windows.data.MultiBindingExpression;
import system.windows.data.PriorityBinding;
import system.windows.data.PriorityBindingExpression;
import system.Action;
import system.windows.data.CollectionSynchronizationCallback;


/**
 * The base .NET class managing System.Windows.Data.BindingOperations, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Data.BindingOperations" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Data.BindingOperations</a>
 */
public class BindingOperations extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Data.BindingOperations
     */
    public static final String className = "System.Windows.Data.BindingOperations";
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

    public BindingOperations(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BindingOperations}, a cast assert is made to check if types are compatible.
     */
    public static BindingOperations cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BindingOperations(from.getJCOInstance());
    }

    // Constructors section
    
    public BindingOperations() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsDataBound(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDataBound", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static system.windows.data.Binding GetBinding(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBinding = (JCObject)classType.Invoke("GetBinding", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new system.windows.data.Binding(objGetBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BindingBase GetBindingBase(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBindingBase = (JCObject)classType.Invoke("GetBindingBase", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new BindingBase(objGetBindingBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BindingExpression GetBindingExpression(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBindingExpression = (JCObject)classType.Invoke("GetBindingExpression", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new BindingExpression(objGetBindingExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BindingExpressionBase GetBindingExpressionBase(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBindingExpressionBase = (JCObject)classType.Invoke("GetBindingExpressionBase", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new BindingExpressionBase(objGetBindingExpressionBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BindingExpressionBase SetBinding(DependencyObject target, DependencyProperty dp, BindingBase binding) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetBinding = (JCObject)classType.Invoke("SetBinding", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance(), binding == null ? null : binding.getJCOInstance());
            return new BindingExpressionBase(objSetBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MultiBinding GetMultiBinding(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMultiBinding = (JCObject)classType.Invoke("GetMultiBinding", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new MultiBinding(objGetMultiBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MultiBindingExpression GetMultiBindingExpression(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMultiBindingExpression = (JCObject)classType.Invoke("GetMultiBindingExpression", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new MultiBindingExpression(objGetMultiBindingExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PriorityBinding GetPriorityBinding(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPriorityBinding = (JCObject)classType.Invoke("GetPriorityBinding", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new PriorityBinding(objGetPriorityBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PriorityBindingExpression GetPriorityBindingExpression(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPriorityBindingExpression = (JCObject)classType.Invoke("GetPriorityBindingExpression", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
            return new PriorityBindingExpression(objGetPriorityBindingExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AccessCollection(IEnumerable collection, Action accessMethod, boolean writeAccess) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AccessCollection", collection == null ? null : collection.getJCOInstance(), accessMethod, writeAccess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearAllBindings(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearAllBindings", target == null ? null : target.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearBinding(DependencyObject target, DependencyProperty dp) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearBinding", target == null ? null : target.getJCOInstance(), dp == null ? null : dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DisableCollectionSynchronization(IEnumerable collection) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DisableCollectionSynchronization", collection == null ? null : collection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EnableCollectionSynchronization(IEnumerable collection, NetObject lockObject) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("EnableCollectionSynchronization", collection == null ? null : collection.getJCOInstance(), lockObject == null ? null : lockObject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EnableCollectionSynchronization(IEnumerable collection, NetObject context, CollectionSynchronizationCallback synchronizationCallback) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("EnableCollectionSynchronization", collection == null ? null : collection.getJCOInstance(), context == null ? null : context.getJCOInstance(), synchronizationCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static NetObject getDisconnectedSource() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DisconnectedSource");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}