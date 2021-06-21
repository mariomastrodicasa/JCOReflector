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

package system.servicemodel.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.servicemodel.channels.IChannel;
import system.servicemodel.channels.IChannelImplementation;
import system.servicemodel.ICommunicationObject;
import system.servicemodel.ICommunicationObjectImplementation;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.TimeSpan;
import system.AsyncCallback;
import system.servicemodel.channels.RequestContext;
import system.servicemodel.CommunicationState;
import system.servicemodel.EndpointAddress;
import system.EventHandler;


/**
 * The base .NET class managing System.ServiceModel.Channels.IReplyChannel, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Channels.IReplyChannel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Channels.IReplyChannel</a>
 */
public interface IReplyChannel extends IJCOBridgeReflected, IChannel, ICommunicationObject {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Channels.IReplyChannel
     */
    public static final String className = "System.ServiceModel.Channels.IReplyChannel";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IReplyChannel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IReplyChannel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IReplyChannel ToIReplyChannel(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IReplyChannelImplementation(from.getJCOInstance());
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
    
    public boolean EndWaitForRequest(IAsyncResult result) throws Throwable;

    public boolean WaitForRequest(TimeSpan timeout) throws Throwable;





    public IAsyncResult BeginReceiveRequest(AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginReceiveRequest(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTryReceiveRequest(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginWaitForRequest(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable;

    public RequestContext EndReceiveRequest(IAsyncResult result) throws Throwable;

    public RequestContext ReceiveRequest() throws Throwable;

    public RequestContext ReceiveRequest(TimeSpan timeout) throws Throwable;









    
    // Properties section
    
    public EndpointAddress getLocalAddress() throws Throwable;



    // Instance Events section
    

}