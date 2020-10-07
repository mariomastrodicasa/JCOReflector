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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.DateTime;
import system.AsyncCallback;
import system.Guid;


/**
 * The base .NET class managing System.Web.HttpWorkerRequest, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.HttpWorkerRequest" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.HttpWorkerRequest</a>
 */
public class HttpWorkerRequest extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.HttpWorkerRequest
     */
    public static final String className = "System.Web.HttpWorkerRequest";
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

    public HttpWorkerRequest(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HttpWorkerRequest}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HttpWorkerRequest} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HttpWorkerRequest cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HttpWorkerRequest(from.getJCOInstance());
    }

    // Constructors section
    
    public HttpWorkerRequest() throws Throwable {
    }

    
    // Methods section
    
    public boolean HasEntityBody() throws Throwable, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("HasEntityBody");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HeadersSent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("HeadersSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientConnected() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsClientConnected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEntireEntityBodyIsPreloaded() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEntireEntityBodyIsPreloaded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSecure() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSecure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetClientCertificate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClientCertificate");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetClientCertificate = 0; indexGetClientCertificate < resultingArrayList.size(); indexGetClientCertificate++ ) {
				resultingArray[indexGetClientCertificate] = (byte)resultingArrayList.get(indexGetClientCertificate);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetClientCertificateBinaryIssuer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClientCertificateBinaryIssuer");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetClientCertificateBinaryIssuer = 0; indexGetClientCertificateBinaryIssuer < resultingArrayList.size(); indexGetClientCertificateBinaryIssuer++ ) {
				resultingArray[indexGetClientCertificateBinaryIssuer] = (byte)resultingArrayList.get(indexGetClientCertificateBinaryIssuer);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetClientCertificatePublicKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClientCertificatePublicKey");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetClientCertificatePublicKey = 0; indexGetClientCertificatePublicKey < resultingArrayList.size(); indexGetClientCertificatePublicKey++ ) {
				resultingArray[indexGetClientCertificatePublicKey] = (byte)resultingArrayList.get(indexGetClientCertificatePublicKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetPreloadedEntityBody() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPreloadedEntityBody");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetPreloadedEntityBody = 0; indexGetPreloadedEntityBody < resultingArrayList.size(); indexGetPreloadedEntityBody++ ) {
				resultingArray[indexGetPreloadedEntityBody] = (byte)resultingArrayList.get(indexGetPreloadedEntityBody);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetQueryStringRawBytes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetQueryStringRawBytes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetQueryStringRawBytes = 0; indexGetQueryStringRawBytes < resultingArrayList.size(); indexGetQueryStringRawBytes++ ) {
				resultingArray[indexGetQueryStringRawBytes] = (byte)resultingArrayList.get(indexGetQueryStringRawBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int EndRead(IAsyncResult asyncResult) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("EndRead", asyncResult == null ? null : asyncResult.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetClientCertificateEncoding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetClientCertificateEncoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetKnownRequestHeaderIndex(java.lang.String header) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetKnownRequestHeaderIndex", header);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetKnownResponseHeaderIndex(java.lang.String header) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetKnownResponseHeaderIndex", header);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetLocalPort() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetLocalPort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreloadedEntityBody(byte[] buffer, int offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetPreloadedEntityBody", buffer, offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreloadedEntityBody(JCRefOut dupParam0, int dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetPreloadedEntityBody", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreloadedEntityBodyLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetPreloadedEntityBodyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetRemotePort() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetRemotePort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetRequestReason() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetRequestReason");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetTotalEntityBodyLength() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetTotalEntityBodyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadEntityBody(byte[] buffer, int size) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadEntityBody", buffer, size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadEntityBody(JCRefOut dupParam0, int dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadEntityBody", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadEntityBody(byte[] buffer, int offset, int size) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadEntityBody", buffer, offset, size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadEntityBody(JCRefOut dupParam0, int dupParam1, int dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadEntityBody", dupParam0, dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytesRead() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetBytesRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetConnectionID() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetConnectionID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetUrlContextID() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetUrlContextID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetClientCertificateValidFrom() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetClientCertificateValidFrom = (JCObject)classInstance.Invoke("GetClientCertificateValidFrom");
            return new DateTime(objGetClientCertificateValidFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetClientCertificateValidUntil() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetClientCertificateValidUntil = (JCObject)classInstance.Invoke("GetClientCertificateValidUntil");
            return new DateTime(objGetClientCertificateValidUntil);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginFlush(AsyncCallback callback, NetObject state) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginFlush = (JCObject)classInstance.Invoke("BeginFlush", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginFlush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRead(byte[] buffer, int offset, int count, AsyncCallback callback, NetObject state) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRead = (JCObject)classInstance.Invoke("BeginRead", buffer, offset, count, callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRead(JCRefOut dupParam0, int dupParam1, int dupParam2, AsyncCallback dupParam3, NetObject dupParam4) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRead = (JCObject)classInstance.Invoke("BeginRead", dupParam0, dupParam1, dupParam2, dupParam3, dupParam4 == null ? null : dupParam4.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAppPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAppPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAppPathTranslated() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAppPathTranslated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAppPoolID() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAppPoolID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetFilePath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetFilePathTranslated() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetFilePathTranslated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetHttpVerbName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetHttpVerbName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetHttpVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetHttpVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetKnownRequestHeader(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetKnownRequestHeader", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetKnownRequestHeaderName(int index) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetKnownRequestHeaderName", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetKnownResponseHeaderName(int index) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetKnownResponseHeaderName", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetLocalAddress() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetLocalAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPathInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPathInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetProtocol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetProtocol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetQueryString() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetQueryString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRawUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetRawUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRemoteAddress() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetRemoteAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRemoteName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetRemoteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetServerName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetServerName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetServerVariable(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetServerVariable", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetStatusDescription(int code) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetStatusDescription", code);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUnknownRequestHeader(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetUnknownRequestHeader", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUriPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetUriPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String MapPath(java.lang.String virtualPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("MapPath", virtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CloseConnection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CloseConnection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndFlush(IAsyncResult asyncResult) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndFlush", asyncResult == null ? null : asyncResult.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndOfRequest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndOfRequest");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FlushResponse(boolean finalFlush) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("FlushResponse", finalFlush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendCalculatedContentLength(int contentLength) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendCalculatedContentLength", contentLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendCalculatedContentLength(long contentLength) throws Throwable, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendCalculatedContentLength", contentLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendKnownResponseHeader(int index, java.lang.String value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendKnownResponseHeader", index, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendResponseFromFile(java.lang.String filename, long offset, long length) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendResponseFromFile", filename, offset, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendResponseFromMemory(byte[] data, int length) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendResponseFromMemory", data, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendResponseFromMemory(JCRefOut dupParam0, int dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendResponseFromMemory", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendStatus(int statusCode, java.lang.String statusDescription) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendStatus", statusCode, statusDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendUnknownResponseHeader(java.lang.String name, java.lang.String value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendUnknownResponseHeader", name, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getSupportsAsyncFlush() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SupportsAsyncFlush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsAsyncRead() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SupportsAsyncRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getRequestTraceIdentifier() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RequestTraceIdentifier");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMachineConfigPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MachineConfigPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMachineInstallDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MachineInstallDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootWebConfigPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RootWebConfigPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}