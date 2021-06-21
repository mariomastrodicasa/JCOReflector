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
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.servicemodel.channels.Message;
import system.AsyncCallback;


/**
 * The base .NET class managing System.ServiceModel.Security.IWSTrust13AsyncContract, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.IWSTrust13AsyncContract" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.IWSTrust13AsyncContract</a>
 */
public class IWSTrust13AsyncContractImplementation extends NetObject implements IWSTrust13AsyncContract {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Security.IWSTrust13AsyncContract
     */
    public static final String className = "System.ServiceModel.Security.IWSTrust13AsyncContract";
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

    public IWSTrust13AsyncContractImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IWSTrust13AsyncContract}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IWSTrust13AsyncContract} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IWSTrust13AsyncContract ToIWSTrust13AsyncContract(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IWSTrust13AsyncContractImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IAsyncResult BeginTrust13Cancel(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13Cancel = (JCObject)classInstance.Invoke("BeginTrust13Cancel", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13Cancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13CancelResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13CancelResponse = (JCObject)classInstance.Invoke("BeginTrust13CancelResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13CancelResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13Issue(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13Issue = (JCObject)classInstance.Invoke("BeginTrust13Issue", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13Issue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13IssueResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13IssueResponse = (JCObject)classInstance.Invoke("BeginTrust13IssueResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13IssueResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13Renew(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13Renew = (JCObject)classInstance.Invoke("BeginTrust13Renew", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13Renew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13RenewResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13RenewResponse = (JCObject)classInstance.Invoke("BeginTrust13RenewResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13RenewResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13Validate(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13Validate = (JCObject)classInstance.Invoke("BeginTrust13Validate", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13Validate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginTrust13ValidateResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginTrust13ValidateResponse = (JCObject)classInstance.Invoke("BeginTrust13ValidateResponse", request == null ? null : request.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginTrust13ValidateResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13Cancel(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13Cancel = (JCObject)classInstance.Invoke("EndTrust13Cancel", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13Cancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13CancelResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13CancelResponse = (JCObject)classInstance.Invoke("EndTrust13CancelResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13CancelResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13Issue(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13Issue = (JCObject)classInstance.Invoke("EndTrust13Issue", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13Issue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13IssueResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13IssueResponse = (JCObject)classInstance.Invoke("EndTrust13IssueResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13IssueResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13Renew(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13Renew = (JCObject)classInstance.Invoke("EndTrust13Renew", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13Renew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13RenewResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13RenewResponse = (JCObject)classInstance.Invoke("EndTrust13RenewResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13RenewResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13Validate(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13Validate = (JCObject)classInstance.Invoke("EndTrust13Validate", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13Validate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndTrust13ValidateResponse(IAsyncResult ar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndTrust13ValidateResponse = (JCObject)classInstance.Invoke("EndTrust13ValidateResponse", ar == null ? null : ar.getJCOInstance());
            return new Message(objEndTrust13ValidateResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}