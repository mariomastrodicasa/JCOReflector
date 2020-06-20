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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.Sockets.SocketError, System.Net.Primitives, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SocketError extends NetObject  {
    public static final String assemblyFullName = "System.Net.Primitives, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Net.Primitives";
    public static final String className = "System.Net.Sockets.SocketError";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public SocketError(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public SocketError() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static SocketError getFrom(JCEnum object, String value) {
        try {
            return new SocketError(object.fromValue(value));
        } catch (JCException e) {
            return new SocketError(object);
        }
    }

    // Enum fields section
    
    public static SocketError Success = getFrom(enumReflected, "Success");
    public static SocketError OperationAborted = getFrom(enumReflected, "OperationAborted");
    public static SocketError IOPending = getFrom(enumReflected, "IOPending");
    public static SocketError Interrupted = getFrom(enumReflected, "Interrupted");
    public static SocketError AccessDenied = getFrom(enumReflected, "AccessDenied");
    public static SocketError Fault = getFrom(enumReflected, "Fault");
    public static SocketError InvalidArgument = getFrom(enumReflected, "InvalidArgument");
    public static SocketError TooManyOpenSockets = getFrom(enumReflected, "TooManyOpenSockets");
    public static SocketError WouldBlock = getFrom(enumReflected, "WouldBlock");
    public static SocketError InProgress = getFrom(enumReflected, "InProgress");
    public static SocketError AlreadyInProgress = getFrom(enumReflected, "AlreadyInProgress");
    public static SocketError NotSocket = getFrom(enumReflected, "NotSocket");
    public static SocketError DestinationAddressRequired = getFrom(enumReflected, "DestinationAddressRequired");
    public static SocketError MessageSize = getFrom(enumReflected, "MessageSize");
    public static SocketError ProtocolType = getFrom(enumReflected, "ProtocolType");
    public static SocketError ProtocolOption = getFrom(enumReflected, "ProtocolOption");
    public static SocketError ProtocolNotSupported = getFrom(enumReflected, "ProtocolNotSupported");
    public static SocketError SocketNotSupported = getFrom(enumReflected, "SocketNotSupported");
    public static SocketError OperationNotSupported = getFrom(enumReflected, "OperationNotSupported");
    public static SocketError ProtocolFamilyNotSupported = getFrom(enumReflected, "ProtocolFamilyNotSupported");
    public static SocketError AddressFamilyNotSupported = getFrom(enumReflected, "AddressFamilyNotSupported");
    public static SocketError AddressAlreadyInUse = getFrom(enumReflected, "AddressAlreadyInUse");
    public static SocketError AddressNotAvailable = getFrom(enumReflected, "AddressNotAvailable");
    public static SocketError NetworkDown = getFrom(enumReflected, "NetworkDown");
    public static SocketError NetworkUnreachable = getFrom(enumReflected, "NetworkUnreachable");
    public static SocketError NetworkReset = getFrom(enumReflected, "NetworkReset");
    public static SocketError ConnectionAborted = getFrom(enumReflected, "ConnectionAborted");
    public static SocketError ConnectionReset = getFrom(enumReflected, "ConnectionReset");
    public static SocketError NoBufferSpaceAvailable = getFrom(enumReflected, "NoBufferSpaceAvailable");
    public static SocketError IsConnected = getFrom(enumReflected, "IsConnected");
    public static SocketError NotConnected = getFrom(enumReflected, "NotConnected");
    public static SocketError Shutdown = getFrom(enumReflected, "Shutdown");
    public static SocketError TimedOut = getFrom(enumReflected, "TimedOut");
    public static SocketError ConnectionRefused = getFrom(enumReflected, "ConnectionRefused");
    public static SocketError HostDown = getFrom(enumReflected, "HostDown");
    public static SocketError HostUnreachable = getFrom(enumReflected, "HostUnreachable");
    public static SocketError ProcessLimit = getFrom(enumReflected, "ProcessLimit");
    public static SocketError SystemNotReady = getFrom(enumReflected, "SystemNotReady");
    public static SocketError VersionNotSupported = getFrom(enumReflected, "VersionNotSupported");
    public static SocketError NotInitialized = getFrom(enumReflected, "NotInitialized");
    public static SocketError Disconnecting = getFrom(enumReflected, "Disconnecting");
    public static SocketError TypeNotFound = getFrom(enumReflected, "TypeNotFound");
    public static SocketError HostNotFound = getFrom(enumReflected, "HostNotFound");
    public static SocketError TryAgain = getFrom(enumReflected, "TryAgain");
    public static SocketError NoRecovery = getFrom(enumReflected, "NoRecovery");
    public static SocketError NoData = getFrom(enumReflected, "NoData");
    public static SocketError SocketError = getFrom(enumReflected, "SocketError");


    // Flags management section


}