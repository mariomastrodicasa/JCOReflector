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

package system.net;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.AsyncCallback;
import system.net.HttpListenerContext;
import system.net.AuthenticationSchemes;
import system.net.AuthenticationSchemeSelector;
import system.net.HttpListenerPrefixCollection;
import system.net.HttpListenerTimeoutManager;
import system.security.authentication.extendedprotection.ExtendedProtectionPolicy;
import system.security.authentication.extendedprotection.ServiceNameCollection;


/**
 * The base .NET class managing System.Net.HttpListener, System.Net.HttpListener, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.HttpListener" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.HttpListener</a>
 */
public class HttpListener extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.HttpListener, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Net.HttpListener, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Net.HttpListener
     */
    public static final String assemblyShortName = "System.Net.HttpListener";
    /**
     * Qualified class name: System.Net.HttpListener
     */
    public static final String className = "System.Net.HttpListener";
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

    public HttpListener(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HttpListener}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HttpListener} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HttpListener cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HttpListener(from.getJCOInstance());
    }

    // Constructors section
    
    public HttpListener() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public IAsyncResult BeginGetContext(AsyncCallback callback, NetObject state) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.net.HttpListenerException, system.componentmodel.Win32Exception, system.UriFormatException, system.security.SecurityException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginGetContext = (JCObject)classInstance.Invoke("BeginGetContext", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginGetContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpListenerContext EndGetContext(IAsyncResult asyncResult) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndGetContext = (JCObject)classInstance.Invoke("EndGetContext", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new HttpListenerContext(objEndGetContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpListenerContext GetContext() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.net.HttpListenerException, system.componentmodel.Win32Exception, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetContext = (JCObject)classInstance.Invoke("GetContext");
            return new HttpListenerContext(objGetContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Start() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.ObjectDisposedException, system.net.HttpListenerException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Start");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Stop() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Stop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIgnoreWriteExceptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreWriteExceptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreWriteExceptions(boolean IgnoreWriteExceptions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IgnoreWriteExceptions", IgnoreWriteExceptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsListening() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsListening");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getIsSupported() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("IsSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUnsafeConnectionNtlmAuthentication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UnsafeConnectionNtlmAuthentication");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnsafeConnectionNtlmAuthentication(boolean UnsafeConnectionNtlmAuthentication) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UnsafeConnectionNtlmAuthentication", UnsafeConnectionNtlmAuthentication);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationSchemes getAuthenticationSchemes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuthenticationSchemes");
            return new AuthenticationSchemes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthenticationSchemes(AuthenticationSchemes AuthenticationSchemes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AuthenticationSchemes", AuthenticationSchemes == null ? null : AuthenticationSchemes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationSchemeSelector getAuthenticationSchemeSelectorDelegate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (AuthenticationSchemeSelector)classInstance.Get("AuthenticationSchemeSelectorDelegate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthenticationSchemeSelectorDelegate(AuthenticationSchemeSelector AuthenticationSchemeSelectorDelegate) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AuthenticationSchemeSelectorDelegate", AuthenticationSchemeSelectorDelegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpListenerPrefixCollection getPrefixes() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Prefixes");
            return new HttpListenerPrefixCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpListenerTimeoutManager getTimeoutManager() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException, system.net.HttpListenerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TimeoutManager");
            return new HttpListenerTimeoutManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExtendedProtectionPolicy getExtendedProtectionPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExtendedProtectionPolicy");
            return new ExtendedProtectionPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExtendedProtectionPolicy(ExtendedProtectionPolicy ExtendedProtectionPolicy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExtendedProtectionPolicy", ExtendedProtectionPolicy == null ? null : ExtendedProtectionPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceNameCollection getDefaultServiceNames() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultServiceNames");
            return new ServiceNameCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRealm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Realm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRealm(java.lang.String Realm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Realm", Realm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}