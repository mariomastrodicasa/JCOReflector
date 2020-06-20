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

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.servicemodel.channels.Message;
import system.AsyncCallback;


/**
 * The base .NET class managing System.ServiceModel.Security.IWSTrust13AsyncContract, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 */
public interface IWSTrust13AsyncContract extends IJCOBridgeReflected {

    public static IWSTrust13AsyncContract ToIWSTrust13AsyncContract(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType("System.ServiceModel.Security.IWSTrust13AsyncContract, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089" : "System.ServiceModel"));
        NetType.AssertCast(classType, from);
        return new IWSTrust13AsyncContractImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public IAsyncResult BeginTrust13Cancel(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13Cancel(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13Issue(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13Issue(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13Renew(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13Renew(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13Validate(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13Validate(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13CancelResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13CancelResponse(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13IssueResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13IssueResponse(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13RenewResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13RenewResponse(IAsyncResult ar) throws Throwable;

    public IAsyncResult BeginTrust13ValidateResponse(Message request, AsyncCallback callback, NetObject state) throws Throwable;

    public Message EndTrust13ValidateResponse(IAsyncResult ar) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}