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
import system.net.WebRequest;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.AsyncCallback;
import system.io.Stream;
import system.net.WebResponse;
import system.net.ICredentials;
import system.net.ICredentialsImplementation;
import system.net.IWebProxy;
import system.net.IWebProxyImplementation;
import system.net.WebHeaderCollection;
import system.Uri;


/**
 * The base .NET class managing System.Net.FileWebRequest, System.Net.Requests, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.FileWebRequest" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.FileWebRequest</a>
 */
public class FileWebRequest extends WebRequest  {
    /**
     * Fully assembly qualified name: System.Net.Requests, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Requests, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Requests
     */
    public static final String assemblyShortName = "System.Net.Requests";
    /**
     * Qualified class name: System.Net.FileWebRequest
     */
    public static final String className = "System.Net.FileWebRequest";
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

    public FileWebRequest(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FileWebRequest}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FileWebRequest} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FileWebRequest cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FileWebRequest(from.getJCOInstance());
    }

    // Constructors section
    
    public FileWebRequest() throws Throwable {
    }



    
    // Methods section
    
    public IAsyncResult BeginGetRequestStream(AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.net.ProtocolViolationException, system.ArgumentOutOfRangeException, system.UriFormatException, system.ArrayTypeMismatchException, system.FormatException, system.runtime.serialization.SerializationException, system.NotSupportedException, system.io.IOException, system.net.WebException, system.diagnostics.tracing.EventSourceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginGetRequestStream = (JCObject)classInstance.Invoke("BeginGetRequestStream", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginGetRequestStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginGetResponse(AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.threading.SynchronizationLockException, system.IndexOutOfRangeException, system.UriFormatException, system.runtime.serialization.SerializationException, system.NotSupportedException, system.io.IOException, system.net.WebException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginGetResponse = (JCObject)classInstance.Invoke("BeginGetResponse", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginGetResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream EndGetRequestStream(IAsyncResult asyncResult) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndGetRequestStream = (JCObject)classInstance.Invoke("EndGetRequestStream", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Stream(objEndGetRequestStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetRequestStream() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException, system.net.WebException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRequestStream = (JCObject)classInstance.Invoke("GetRequestStream");
            return new Stream(objGetRequestStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebResponse EndGetResponse(IAsyncResult asyncResult) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndGetResponse = (JCObject)classInstance.Invoke("EndGetResponse", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new WebResponse(objEndGetResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebResponse GetResponse() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException, system.net.WebException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetResponse = (JCObject)classInstance.Invoke("GetResponse");
            return new WebResponse(objGetResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort() throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}