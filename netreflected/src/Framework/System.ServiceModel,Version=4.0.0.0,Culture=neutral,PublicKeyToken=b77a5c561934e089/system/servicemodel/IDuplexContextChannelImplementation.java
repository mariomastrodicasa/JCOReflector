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

package system.servicemodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.TimeSpan;
import system.AsyncCallback;
import system.servicemodel.InstanceContext;
import system.servicemodel.channels.IInputSession;
import system.servicemodel.channels.IInputSessionImplementation;
import system.servicemodel.EndpointAddress;
import system.servicemodel.channels.IOutputSession;
import system.servicemodel.channels.IOutputSessionImplementation;
import system.servicemodel.CommunicationState;
import system.EventHandler;


/**
 * The base .NET class managing System.ServiceModel.IDuplexContextChannel, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class IDuplexContextChannelImplementation extends NetObject implements IDuplexContextChannel {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.IDuplexContextChannel";
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

    public IDuplexContextChannelImplementation(Object instance) throws Throwable {
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

    public static IDuplexContextChannel ToIDuplexContextChannel(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IDuplexContextChannelImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IAsyncResult BeginCloseOutputSession(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginCloseOutputSession = (JCObject)classInstance.Invoke("BeginCloseOutputSession", timeout == null ? null : timeout.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginCloseOutputSession);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndCloseOutputSession(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndCloseOutputSession", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CloseOutputSession(TimeSpan timeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CloseOutputSession", timeout == null ? null : timeout.getJCOInstance());
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

    public void EndClose(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndClose", result == null ? null : result.getJCOInstance());
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

    public void EndOpen(IAsyncResult result) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndOpen", result == null ? null : result.getJCOInstance());
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


    
    // Properties section
    
    public boolean getAutomaticInputSessionShutdown() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutomaticInputSessionShutdown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutomaticInputSessionShutdown(boolean AutomaticInputSessionShutdown) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutomaticInputSessionShutdown", AutomaticInputSessionShutdown);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceContext getCallbackInstance() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CallbackInstance");
            return new InstanceContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCallbackInstance(InstanceContext CallbackInstance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CallbackInstance", CallbackInstance == null ? null : CallbackInstance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowOutputBatching() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowOutputBatching");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowOutputBatching(boolean AllowOutputBatching) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowOutputBatching", AllowOutputBatching);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IInputSession getInputSession() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InputSession");
            return new IInputSessionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EndpointAddress getLocalAddress() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LocalAddress");
            return new EndpointAddress(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getOperationTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OperationTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOperationTimeout(TimeSpan OperationTimeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OperationTimeout", OperationTimeout == null ? null : OperationTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IOutputSession getOutputSession() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OutputSession");
            return new IOutputSessionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EndpointAddress getRemoteAddress() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RemoteAddress");
            return new EndpointAddress(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSessionId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SessionId");
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