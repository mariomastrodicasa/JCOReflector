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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.HttpRequest;
import system.io.Stream;
import system.web.HttpBrowserCapabilitiesBase;
import system.collections.specialized.NameValueCollection;
import system.security.authentication.extendedprotection.ChannelBinding;
import system.web.HttpClientCertificate;
import system.text.Encoding;
import system.web.HttpCookieCollection;
import system.web.HttpFileCollectionBase;
import system.security.principal.WindowsIdentity;
import system.web.ReadEntityBodyMode;
import system.web.routing.RequestContext;
import system.threading.CancellationToken;
import system.web.UnvalidatedRequestValuesBase;
import system.Uri;


/**
 * The base .NET class managing System.Web.HttpRequestWrapper, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpRequestWrapper extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.HttpRequestWrapper";
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

    public HttpRequestWrapper(Object instance) throws Throwable {
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

    public static HttpRequestWrapper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpRequestWrapper(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HttpRequestWrapper(HttpRequest httpRequest) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)httpRequest.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Abort() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] BinaryRead(int count) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.security.SecurityException, system.FormatException, system.OverflowException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("BinaryRead", count);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexBinaryRead = 0; indexBinaryRead < resultingArrayList.size(); indexBinaryRead++ ) {
				resultingArray[indexBinaryRead] = (byte)resultingArrayList.get(indexBinaryRead);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetBufferedInputStream() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpException, system.FormatException, system.OverflowException {
        try {
            JCObject objGetBufferedInputStream = (JCObject)classInstance.Invoke("GetBufferedInputStream");
            return new Stream(objGetBufferedInputStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetBufferlessInputStream() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpException, system.FormatException, system.OverflowException {
        try {
            JCObject objGetBufferlessInputStream = (JCObject)classInstance.Invoke("GetBufferlessInputStream");
            return new Stream(objGetBufferlessInputStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetBufferlessInputStream(boolean disableMaxRequestLength) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpException, system.FormatException, system.OverflowException {
        try {
            JCObject objGetBufferlessInputStream = (JCObject)classInstance.Invoke("GetBufferlessInputStream", disableMaxRequestLength);
            return new Stream(objGetBufferlessInputStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertEntityBody() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("InsertEntityBody");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertEntityBody(byte[] buffer, int offset, int count) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            classInstance.Invoke("InsertEntityBody", buffer, offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] MapImageCoordinates(java.lang.String imageFieldName) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentException, system.web.HttpException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("MapImageCoordinates", (Object)imageFieldName);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
            for(int indexMapImageCoordinates = 0; indexMapImageCoordinates < resultingArrayList.size(); indexMapImageCoordinates++ ) {
				resultingArray[indexMapImageCoordinates] = (int)resultingArrayList.get(indexMapImageCoordinates);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double[] MapRawImageCoordinates(java.lang.String imageFieldName) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentException, system.web.HttpException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("MapRawImageCoordinates", (Object)imageFieldName);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            double[] resultingArray = new double[resultingArrayList.size()];
            for(int indexMapRawImageCoordinates = 0; indexMapRawImageCoordinates < resultingArrayList.size(); indexMapRawImageCoordinates++ ) {
				resultingArray[indexMapRawImageCoordinates] = (double)resultingArrayList.get(indexMapRawImageCoordinates);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String MapPath(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.web.HttpRequestValidationException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("MapPath", (Object)virtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String MapPath(java.lang.String virtualPath, java.lang.String baseVirtualDir, boolean allowCrossAppMapping) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.OutOfMemoryException, system.ArgumentException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.threading.ThreadAbortException, system.web.HttpRequestValidationException {
        try {
            return (java.lang.String)classInstance.Invoke("MapPath", (Object)virtualPath, (Object)baseVirtualDir, allowCrossAppMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateInput() throws Throwable {
        try {
            classInstance.Invoke("ValidateInput");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveAs(java.lang.String filename, boolean includeHeaders) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.web.HttpException, system.web.HttpRequestValidationException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.SecurityException, system.io.IOException, system.FormatException, system.OverflowException {
        try {
            classInstance.Invoke("SaveAs", (Object)filename, includeHeaders);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public HttpBrowserCapabilitiesBase getBrowser() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Browser");
            return new HttpBrowserCapabilitiesBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NameValueCollection getParams() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Params");
            return new NameValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Path");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFilePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NameValueCollection getHeaders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Headers");
            return new NameValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NameValueCollection getQueryString() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("QueryString");
            return new NameValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getAcceptTypes() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("AcceptTypes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexAcceptTypes = 0; indexAcceptTypes < resultingArrayList.size(); indexAcceptTypes++ ) {
				resultingArray[indexAcceptTypes] = (java.lang.String)resultingArrayList.get(indexAcceptTypes);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplicationPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAnonymousID() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AnonymousID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAppRelativeCurrentExecutionFilePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AppRelativeCurrentExecutionFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChannelBinding getHttpChannelBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HttpChannelBinding");
            return new ChannelBinding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpClientCertificate getClientCertificate() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClientCertificate");
            return new HttpClientCertificate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding getContentEncoding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentEncoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContentEncoding(Encoding ContentEncoding) throws Throwable {
        try {
            classInstance.Set("ContentEncoding", (Object)ContentEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getContentLength() throws Throwable {
        try {
            return (int)classInstance.Get("ContentLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getContentType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ContentType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContentType(java.lang.String ContentType) throws Throwable {
        try {
            classInstance.Set("ContentType", (Object)ContentType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpCookieCollection getCookies() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Cookies");
            return new HttpCookieCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCurrentExecutionFilePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CurrentExecutionFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCurrentExecutionFilePathExtension() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CurrentExecutionFilePathExtension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpFileCollectionBase getFiles() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Files");
            return new HttpFileCollectionBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream getFilter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Filter");
            return new Stream(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilter(Stream Filter) throws Throwable {
        try {
            classInstance.Set("Filter", (Object)Filter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NameValueCollection getForm() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Form");
            return new NameValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHttpMethod() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HttpMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream getInputStream() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InputStream");
            return new Stream(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAuthenticated() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAuthenticated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLocal() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsLocal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSecureConnection() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSecureConnection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WindowsIdentity getLogonUserIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogonUserIdentity");
            return new WindowsIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPathInfo() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PathInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPhysicalApplicationPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PhysicalApplicationPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPhysicalPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PhysicalPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRawUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RawUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadEntityBodyMode getReadEntityBodyMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReadEntityBodyMode");
            return new ReadEntityBodyMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestContext getRequestContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RequestContext");
            return new RequestContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequestContext(RequestContext RequestContext) throws Throwable {
        try {
            classInstance.Set("RequestContext", (Object)RequestContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRequestType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RequestType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequestType(java.lang.String RequestType) throws Throwable {
        try {
            classInstance.Set("RequestType", (Object)RequestType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NameValueCollection getServerVariables() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ServerVariables");
            return new NameValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CancellationToken getTimedOutToken() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TimedOutToken");
            return new CancellationToken(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTotalBytes() throws Throwable {
        try {
            return (int)classInstance.Get("TotalBytes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UnvalidatedRequestValuesBase getUnvalidated() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Unvalidated");
            return new UnvalidatedRequestValuesBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getUrl() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Url");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getUrlReferrer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UrlReferrer");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUserAgent() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UserAgent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getUserLanguages() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("UserLanguages");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexUserLanguages = 0; indexUserLanguages < resultingArrayList.size(); indexUserLanguages++ ) {
				resultingArray[indexUserLanguages] = (java.lang.String)resultingArrayList.get(indexUserLanguages);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUserHostAddress() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UserHostAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUserHostName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UserHostName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}