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
 *      This code was generated from a template using JCOReflector version 1.1.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.runtime.remoting.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.runtime.remoting.channels.IServerChannelSink;
import system.runtime.remoting.channels.IServerChannelSinkImplementation;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.runtime.remoting.messaging.IMessage;
import system.runtime.remoting.messaging.IMessageImplementation;
import system.runtime.remoting.channels.ITransportHeaders;
import system.runtime.remoting.channels.ITransportHeadersImplementation;
import system.io.Stream;


/**
 * The base .NET class managing System.Runtime.Remoting.Channels.IServerChannelSinkStack, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 */
public interface IServerChannelSinkStack extends IJCOBridgeReflected {

    public static IServerChannelSinkStack ToIServerChannelSinkStack(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType("System.Runtime.Remoting.Channels.IServerChannelSinkStack, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089" : "mscorlib"));
        NetType.AssertCast(classType, from);
        return new IServerChannelSinkStackImplementation(from.getJCOInstance());
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
    
    public void Push(IServerChannelSink sink, NetObject state) throws Throwable;

    public NetObject Pop(IServerChannelSink sink) throws Throwable;

    public void Store(IServerChannelSink sink, NetObject state) throws Throwable;

    public void StoreAndDispatch(IServerChannelSink sink, NetObject state) throws Throwable;

    public void ServerCallback(IAsyncResult ar) throws Throwable;

    public void AsyncProcessResponse(IMessage msg, ITransportHeaders headers, Stream stream) throws Throwable;

    public Stream GetResponseStream(IMessage msg, ITransportHeaders headers) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}