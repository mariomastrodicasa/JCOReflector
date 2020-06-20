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

package system.directoryservices.protocols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.protocols.LdapDirectoryIdentifier;
import system.net.NetworkCredential;
import system.directoryservices.protocols.AuthType;
import system.directoryservices.protocols.DirectoryResponse;
import system.directoryservices.protocols.DirectoryRequest;
import system.TimeSpan;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.directoryservices.protocols.PartialResultProcessing;
import system.AsyncCallback;
import system.directoryservices.protocols.PartialResultsCollection;
import system.directoryservices.protocols.LdapSessionOptions;
import system.directoryservices.protocols.DirectoryIdentifier;
import system.security.cryptography.x509certificates.X509CertificateCollection;


/**
 * The base .NET class managing System.DirectoryServices.Protocols.LdapConnection, System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class LdapConnection extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.DirectoryServices.Protocols";
    public static final String className = "System.DirectoryServices.Protocols.LdapConnection";
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

    public LdapConnection(Object instance) throws Throwable {
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

    public static LdapConnection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LdapConnection(from.getJCOInstance());
    }

    // Constructors section
    

    public LdapConnection(java.lang.String server) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.NotSupportedException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(server));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LdapConnection(LdapDirectoryIdentifier identifier) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.UriFormatException, system.AccessViolationException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.NotSupportedException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(identifier == null ? null : identifier.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LdapConnection(LdapDirectoryIdentifier identifier, NetworkCredential credential) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.UriFormatException, system.AccessViolationException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.NotSupportedException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(identifier == null ? null : identifier.getJCOInstance(), credential == null ? null : credential.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LdapConnection(LdapDirectoryIdentifier identifier, NetworkCredential credential, AuthType authType) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.AccessViolationException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.NotSupportedException, system.FormatException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(identifier == null ? null : identifier.getJCOInstance(), credential == null ? null : credential.getJCOInstance(), authType == null ? null : authType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public DirectoryResponse SendRequest(DirectoryRequest request) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException, system.OutOfMemoryException, system.AccessViolationException, system.IndexOutOfRangeException, system.UriFormatException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.FormatException, system.directoryservices.protocols.DirectoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSendRequest = (JCObject)classInstance.Invoke("SendRequest", request == null ? null : request.getJCOInstance());
            return new DirectoryResponse(objSendRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryResponse SendRequest(DirectoryRequest request, TimeSpan requestTimeout) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.FormatException, system.security.SecurityException, system.UriFormatException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.directoryservices.protocols.DirectoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSendRequest = (JCObject)classInstance.Invoke("SendRequest", request == null ? null : request.getJCOInstance(), requestTimeout == null ? null : requestTimeout.getJCOInstance());
            return new DirectoryResponse(objSendRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginSendRequest(DirectoryRequest request, PartialResultProcessing partialMode, AsyncCallback callback, NetObject state) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException, system.OutOfMemoryException, system.AccessViolationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidTimeZoneException, system.directoryservices.protocols.DirectoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginSendRequest = (JCObject)classInstance.Invoke("BeginSendRequest", request == null ? null : request.getJCOInstance(), partialMode == null ? null : partialMode.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginSendRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Bind() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Bind");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Bind(NetworkCredential newCredential) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Bind", newCredential == null ? null : newCredential.getJCOInstance());
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

    public IAsyncResult BeginSendRequest(DirectoryRequest request, TimeSpan requestTimeout, PartialResultProcessing partialMode, AsyncCallback callback, NetObject state) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidTimeZoneException, system.directoryservices.protocols.DirectoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginSendRequest = (JCObject)classInstance.Invoke("BeginSendRequest", request == null ? null : request.getJCOInstance(), requestTimeout == null ? null : requestTimeout.getJCOInstance(), partialMode == null ? null : partialMode.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginSendRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort(IAsyncResult asyncResult) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Abort", asyncResult == null ? null : asyncResult.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PartialResultsCollection GetPartialResults(IAsyncResult asyncResult) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.RankException, system.xml.xpath.XPathException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPartialResults = (JCObject)classInstance.Invoke("GetPartialResults", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new PartialResultsCollection(objGetPartialResults);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryResponse EndSendRequest(IAsyncResult asyncResult) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.threading.AbandonedMutexException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndSendRequest = (JCObject)classInstance.Invoke("EndSendRequest", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new DirectoryResponse(objEndSendRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public TimeSpan getTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Timeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeout(TimeSpan Timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Timeout", Timeout == null ? null : Timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthType getAuthType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuthType");
            return new AuthType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthType(AuthType AuthType) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AuthType", AuthType == null ? null : AuthType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LdapSessionOptions getSessionOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SessionOptions");
            return new LdapSessionOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCredential(NetworkCredential Credential) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Credential", Credential == null ? null : Credential.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutoBind() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoBind");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoBind(boolean AutoBind) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoBind", AutoBind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryIdentifier getDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Directory");
            return new DirectoryIdentifier(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateCollection getClientCertificates() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientCertificates");
            return new X509CertificateCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}