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
import java.util.ArrayList;

// Import section
import system.runtime.remoting.messaging.IMessage;
import system.runtime.remoting.messaging.IMessageImplementation;
import system.runtime.remoting.messaging.IMessageCtrl;
import system.runtime.remoting.messaging.IMessageCtrlImplementation;
import system.runtime.remoting.messaging.IMessageSink;
import system.runtime.remoting.messaging.IMessageSinkImplementation;
import system.runtime.remoting.channels.ITransportHeaders;
import system.runtime.remoting.channels.ITransportHeadersImplementation;
import system.io.Stream;
import system.runtime.remoting.channels.IClientChannelSinkStack;
import system.runtime.remoting.channels.IClientChannelSinkStackImplementation;
import system.runtime.remoting.channels.IClientResponseChannelSinkStack;
import system.runtime.remoting.channels.IClientResponseChannelSinkStackImplementation;
import system.runtime.remoting.channels.IClientChannelSink;
import system.runtime.remoting.channels.IClientChannelSinkImplementation;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;


/**
 * The base .NET class managing System.Runtime.Remoting.Channels.IClientFormatterSink, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class IClientFormatterSinkImplementation extends NetObject implements IClientFormatterSink {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Runtime.Remoting.Channels.IClientFormatterSink";
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

    public IClientFormatterSinkImplementation(Object instance) throws Throwable {
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

    public static IClientFormatterSink ToIClientFormatterSink(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IClientFormatterSinkImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IMessage SyncProcessMessage(IMessage msg) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSyncProcessMessage = (JCObject)classInstance.Invoke("SyncProcessMessage", msg == null ? null : msg.getJCOInstance());
            return new IMessageImplementation(objSyncProcessMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IMessageCtrl AsyncProcessMessage(IMessage msg, IMessageSink replySink) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAsyncProcessMessage = (JCObject)classInstance.Invoke("AsyncProcessMessage", msg == null ? null : msg.getJCOInstance(), replySink == null ? null : replySink.getJCOInstance());
            return new IMessageCtrlImplementation(objAsyncProcessMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AsyncProcessRequest(IClientChannelSinkStack sinkStack, IMessage msg, ITransportHeaders headers, Stream stream) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AsyncProcessRequest", sinkStack == null ? null : sinkStack.getJCOInstance(), msg == null ? null : msg.getJCOInstance(), headers == null ? null : headers.getJCOInstance(), stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AsyncProcessResponse(IClientResponseChannelSinkStack sinkStack, NetObject state, ITransportHeaders headers, Stream stream) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AsyncProcessResponse", sinkStack == null ? null : sinkStack.getJCOInstance(), state == null ? null : state.getJCOInstance(), headers == null ? null : headers.getJCOInstance(), stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetRequestStream(IMessage msg, ITransportHeaders headers) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRequestStream = (JCObject)classInstance.Invoke("GetRequestStream", msg == null ? null : msg.getJCOInstance(), headers == null ? null : headers.getJCOInstance());
            return new Stream(objGetRequestStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IMessageSink getNextSink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NextSink");
            return new IMessageSinkImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IClientChannelSink getNextChannelSink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NextChannelSink");
            return new IClientChannelSinkImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDictionary getProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new IDictionaryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}