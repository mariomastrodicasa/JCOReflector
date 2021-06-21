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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.security.WSTrustChannelFactory;
import system.servicemodel.security.IWSTrustChannelContract;
import system.servicemodel.security.IWSTrustChannelContractImplementation;
import system.servicemodel.security.TrustVersion;
import system.identitymodel.protocols.wstrust.WSTrustSerializationContext;
import system.identitymodel.protocols.wstrust.WSTrustRequestSerializer;
import system.identitymodel.protocols.wstrust.WSTrustResponseSerializer;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.identitymodel.protocols.wstrust.RequestSecurityToken;
import system.AsyncCallback;
import system.servicemodel.channels.Message;
import system.TimeSpan;
import system.identitymodel.protocols.wstrust.RequestSecurityTokenResponse;
import system.identitymodel.tokens.SecurityToken;
import system.servicemodel.channels.IChannel;
import system.servicemodel.channels.IChannelImplementation;
import system.servicemodel.CommunicationState;
import system.EventHandler;


/**
 * The base .NET class managing System.ServiceModel.Security.WSTrustChannel, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.WSTrustChannel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.WSTrustChannel</a>
 */
public class WSTrustChannel extends NetObject  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Security.WSTrustChannel
     */
    public static final String className = "System.ServiceModel.Security.WSTrustChannel";
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

    public WSTrustChannel(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link WSTrustChannel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link WSTrustChannel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static WSTrustChannel cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new WSTrustChannel(from.getJCOInstance());
    }

    // Constructors section
    
    public WSTrustChannel() throws Throwable {
    }

    public WSTrustChannel(WSTrustChannelFactory factory, IWSTrustChannelContract inner, TrustVersion trustVersion, WSTrustSerializationContext context, WSTrustRequestSerializer requestSerializer, WSTrustResponseSerializer responseSerializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(factory == null ? null : factory.getJCOInstance(), inner == null ? null : inner.getJCOInstance(), trustVersion == null ? null : trustVersion.getJCOInstance(), context == null ? null : context.getJCOInstance(), requestSerializer == null ? null : requestSerializer.getJCOInstance(), responseSerializer == null ? null : responseSerializer.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public IAsyncResult BeginCancel(RequestSecurityToken rst, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginCancel = (JCObject)classInstance.Invoke("BeginCancel", rst == null ? null : rst.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginCancel(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginCancel = (JCObject)classInstance.Invoke("BeginCancel", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginClose(AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginClose = (JCObject)classInstance.Invoke("BeginClose", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginClose);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginClose(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginClose = (JCObject)classInstance.Invoke("BeginClose", timeout == null ? null : timeout.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginClose);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginIssue(RequestSecurityToken rst, AsyncCallback callback, NetObject asyncState) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginIssue = (JCObject)classInstance.Invoke("BeginIssue", rst == null ? null : rst.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginIssue(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginIssue = (JCObject)classInstance.Invoke("BeginIssue", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginOpen(AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginOpen = (JCObject)classInstance.Invoke("BeginOpen", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginOpen(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginOpen = (JCObject)classInstance.Invoke("BeginOpen", timeout == null ? null : timeout.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRenew(RequestSecurityToken rst, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRenew = (JCObject)classInstance.Invoke("BeginRenew", rst == null ? null : rst.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRenew(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRenew = (JCObject)classInstance.Invoke("BeginRenew", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginValidate(RequestSecurityToken rst, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginValidate = (JCObject)classInstance.Invoke("BeginValidate", rst == null ? null : rst.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginValidate(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginValidate = (JCObject)classInstance.Invoke("BeginValidate", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestSecurityTokenResponse Cancel(RequestSecurityToken rst) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.NotSupportedException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCancel = (JCObject)classInstance.Invoke("Cancel", rst == null ? null : rst.getJCOInstance());
            return new RequestSecurityTokenResponse(objCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestSecurityTokenResponse Renew(RequestSecurityToken rst) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.NotSupportedException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRenew = (JCObject)classInstance.Invoke("Renew", rst == null ? null : rst.getJCOInstance());
            return new RequestSecurityTokenResponse(objRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestSecurityTokenResponse Validate(RequestSecurityToken rst) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.NotSupportedException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objValidate = (JCObject)classInstance.Invoke("Validate", rst == null ? null : rst.getJCOInstance());
            return new RequestSecurityTokenResponse(objValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken GetTokenFromResponse(RequestSecurityToken request, RequestSecurityTokenResponse response) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.InvalidTimeZoneException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTokenFromResponse = (JCObject)classInstance.Invoke("GetTokenFromResponse", request == null ? null : request.getJCOInstance(), response == null ? null : response.getJCOInstance());
            return new SecurityToken(objGetTokenFromResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken Issue(RequestSecurityToken rst) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.xml.XmlException, system.NotSupportedException, system.MissingMethodException, system.security.cryptography.CryptographicException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIssue = (JCObject)classInstance.Invoke("Issue", rst == null ? null : rst.getJCOInstance());
            return new SecurityToken(objIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Cancel(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCancel = (JCObject)classInstance.Invoke("Cancel", message == null ? null : message.getJCOInstance());
            return new Message(objCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndCancel(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndCancel = (JCObject)classInstance.Invoke("EndCancel", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndIssue(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndIssue = (JCObject)classInstance.Invoke("EndIssue", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndRenew(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndRenew = (JCObject)classInstance.Invoke("EndRenew", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndValidate(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndValidate = (JCObject)classInstance.Invoke("EndValidate", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Issue(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIssue = (JCObject)classInstance.Invoke("Issue", message == null ? null : message.getJCOInstance());
            return new Message(objIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Renew(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRenew = (JCObject)classInstance.Invoke("Renew", message == null ? null : message.getJCOInstance());
            return new Message(objRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Validate(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objValidate = (JCObject)classInstance.Invoke("Validate", message == null ? null : message.getJCOInstance());
            return new Message(objValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close(TimeSpan timeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close", timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndClose(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndClose", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndOpen(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndOpen", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Open");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open(TimeSpan timeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Open", timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public WSTrustRequestSerializer getWSTrustRequestSerializer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WSTrustRequestSerializer");
            return new WSTrustRequestSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWSTrustRequestSerializer(WSTrustRequestSerializer WSTrustRequestSerializer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WSTrustRequestSerializer", WSTrustRequestSerializer == null ? null : WSTrustRequestSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSTrustResponseSerializer getWSTrustResponseSerializer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WSTrustResponseSerializer");
            return new WSTrustResponseSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWSTrustResponseSerializer(WSTrustResponseSerializer WSTrustResponseSerializer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WSTrustResponseSerializer", WSTrustResponseSerializer == null ? null : WSTrustResponseSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSTrustSerializationContext getWSTrustSerializationContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WSTrustSerializationContext");
            return new WSTrustSerializationContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWSTrustSerializationContext(WSTrustSerializationContext WSTrustSerializationContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WSTrustSerializationContext", WSTrustSerializationContext == null ? null : WSTrustSerializationContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IChannel getChannel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Channel");
            return new IChannelImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChannel(IChannel Channel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Channel", Channel == null ? null : Channel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommunicationState getState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new CommunicationState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IWSTrustChannelContract getContract() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Contract");
            return new IWSTrustChannelContractImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContract(IWSTrustChannelContract Contract) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Contract", Contract == null ? null : Contract.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrustVersion getTrustVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TrustVersion");
            return new TrustVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustVersion(TrustVersion TrustVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TrustVersion", TrustVersion == null ? null : TrustVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSTrustChannelFactory getChannelFactory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ChannelFactory");
            return new WSTrustChannelFactory(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChannelFactory(WSTrustChannelFactory ChannelFactory) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ChannelFactory", ChannelFactory == null ? null : ChannelFactory.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addClosed(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Closed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeClosed(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Closed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addClosing(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Closing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeClosing(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Closing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFaulted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Faulted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFaulted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Faulted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addOpened(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Opened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeOpened(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Opened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addOpening(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Opening", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeOpening(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Opening", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}