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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.servicemodel.channels.Message;
import system.AsyncCallback;


/**
 * The base .NET class managing System.ServiceModel.Security.IWSTrustFeb2005AsyncContract, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.IWSTrustFeb2005AsyncContract" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.IWSTrustFeb2005AsyncContract</a>
 */
public class IWSTrustFeb2005AsyncContractImplementation extends NetObject implements IWSTrustFeb2005AsyncContract {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Security.IWSTrustFeb2005AsyncContract
     */
    public static final String className = "System.ServiceModel.Security.IWSTrustFeb2005AsyncContract";
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

    public IWSTrustFeb2005AsyncContractImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IWSTrustFeb2005AsyncContract}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IWSTrustFeb2005AsyncContract} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IWSTrustFeb2005AsyncContract ToIWSTrustFeb2005AsyncContract(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IWSTrustFeb2005AsyncContractImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IAsyncResult BeginTrustFeb2005Cancel(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005Cancel = (JCObject)classInstance.Invoke("BeginTrustFeb2005Cancel", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005Cancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005CancelResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005CancelResponse = (JCObject)classInstance.Invoke("BeginTrustFeb2005CancelResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005CancelResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005Issue(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005Issue = (JCObject)classInstance.Invoke("BeginTrustFeb2005Issue", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005Issue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005IssueResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005IssueResponse = (JCObject)classInstance.Invoke("BeginTrustFeb2005IssueResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005IssueResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005Renew(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005Renew = (JCObject)classInstance.Invoke("BeginTrustFeb2005Renew", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005Renew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005RenewResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005RenewResponse = (JCObject)classInstance.Invoke("BeginTrustFeb2005RenewResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005RenewResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005Validate(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005Validate = (JCObject)classInstance.Invoke("BeginTrustFeb2005Validate", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005Validate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrustFeb2005ValidateResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrustFeb2005ValidateResponse = (JCObject)classInstance.Invoke("BeginTrustFeb2005ValidateResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrustFeb2005ValidateResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005Cancel(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005Cancel = (JCObject)classInstance.Invoke("EndTrustFeb2005Cancel", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005Cancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005CancelResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005CancelResponse = (JCObject)classInstance.Invoke("EndTrustFeb2005CancelResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005CancelResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005Issue(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005Issue = (JCObject)classInstance.Invoke("EndTrustFeb2005Issue", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005Issue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005IssueResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005IssueResponse = (JCObject)classInstance.Invoke("EndTrustFeb2005IssueResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005IssueResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005Renew(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005Renew = (JCObject)classInstance.Invoke("EndTrustFeb2005Renew", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005Renew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005RenewResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005RenewResponse = (JCObject)classInstance.Invoke("EndTrustFeb2005RenewResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005RenewResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005Validate(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005Validate = (JCObject)classInstance.Invoke("EndTrustFeb2005Validate", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005Validate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrustFeb2005ValidateResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrustFeb2005ValidateResponse = (JCObject)classInstance.Invoke("EndTrustFeb2005ValidateResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrustFeb2005ValidateResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}