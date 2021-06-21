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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.Sockets.SocketOptionName, System.Net.Sockets, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.SocketOptionName" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.SocketOptionName</a>
 */
public class SocketOptionName extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.Sockets, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Sockets, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Sockets
     */
    public static final String assemblyShortName = "System.Net.Sockets";
    /**
     * Qualified class name: System.Net.Sockets.SocketOptionName
     */
    public static final String className = "System.Net.Sockets.SocketOptionName";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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

    public SocketOptionName(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public SocketOptionName() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    final static SocketOptionName getFrom(JCEnum object, String value) {
        try {
            return new SocketOptionName(object.fromValue(value));
        } catch (JCException e) {
            return new SocketOptionName(object);
        }
    }

    // Enum fields section
    
    public static SocketOptionName IPOptions = getFrom(enumReflected, "IPOptions");
    public static SocketOptionName NoChecksum = getFrom(enumReflected, "NoChecksum");
    public static SocketOptionName NoDelay = getFrom(enumReflected, "NoDelay");
    public static SocketOptionName Debug = getFrom(enumReflected, "Debug");
    public static SocketOptionName HeaderIncluded = getFrom(enumReflected, "HeaderIncluded");
    public static SocketOptionName AcceptConnection = getFrom(enumReflected, "AcceptConnection");
    public static SocketOptionName Expedited = getFrom(enumReflected, "Expedited");
    public static SocketOptionName BsdUrgent = getFrom(enumReflected, "BsdUrgent");
    public static SocketOptionName TypeOfService = getFrom(enumReflected, "TypeOfService");
    public static SocketOptionName TcpKeepAliveTime = getFrom(enumReflected, "TcpKeepAliveTime");
    public static SocketOptionName IpTimeToLive = getFrom(enumReflected, "IpTimeToLive");
    public static SocketOptionName ReuseAddress = getFrom(enumReflected, "ReuseAddress");
    public static SocketOptionName KeepAlive = getFrom(enumReflected, "KeepAlive");
    public static SocketOptionName MulticastInterface = getFrom(enumReflected, "MulticastInterface");
    public static SocketOptionName MulticastTimeToLive = getFrom(enumReflected, "MulticastTimeToLive");
    public static SocketOptionName MulticastLoopback = getFrom(enumReflected, "MulticastLoopback");
    public static SocketOptionName AddMembership = getFrom(enumReflected, "AddMembership");
    public static SocketOptionName DropMembership = getFrom(enumReflected, "DropMembership");
    public static SocketOptionName DontFragment = getFrom(enumReflected, "DontFragment");
    public static SocketOptionName AddSourceMembership = getFrom(enumReflected, "AddSourceMembership");
    public static SocketOptionName TcpKeepAliveRetryCount = getFrom(enumReflected, "TcpKeepAliveRetryCount");
    public static SocketOptionName DontRoute = getFrom(enumReflected, "DontRoute");
    public static SocketOptionName DropSourceMembership = getFrom(enumReflected, "DropSourceMembership");
    public static SocketOptionName BlockSource = getFrom(enumReflected, "BlockSource");
    public static SocketOptionName TcpKeepAliveInterval = getFrom(enumReflected, "TcpKeepAliveInterval");
    public static SocketOptionName UnblockSource = getFrom(enumReflected, "UnblockSource");
    public static SocketOptionName PacketInformation = getFrom(enumReflected, "PacketInformation");
    public static SocketOptionName ChecksumCoverage = getFrom(enumReflected, "ChecksumCoverage");
    public static SocketOptionName HopLimit = getFrom(enumReflected, "HopLimit");
    public static SocketOptionName IPProtectionLevel = getFrom(enumReflected, "IPProtectionLevel");
    public static SocketOptionName IPv6Only = getFrom(enumReflected, "IPv6Only");
    public static SocketOptionName Broadcast = getFrom(enumReflected, "Broadcast");
    public static SocketOptionName UseLoopback = getFrom(enumReflected, "UseLoopback");
    public static SocketOptionName Linger = getFrom(enumReflected, "Linger");
    public static SocketOptionName OutOfBandInline = getFrom(enumReflected, "OutOfBandInline");
    public static SocketOptionName SendBuffer = getFrom(enumReflected, "SendBuffer");
    public static SocketOptionName ReceiveBuffer = getFrom(enumReflected, "ReceiveBuffer");
    public static SocketOptionName SendLowWater = getFrom(enumReflected, "SendLowWater");
    public static SocketOptionName ReceiveLowWater = getFrom(enumReflected, "ReceiveLowWater");
    public static SocketOptionName SendTimeout = getFrom(enumReflected, "SendTimeout");
    public static SocketOptionName ReceiveTimeout = getFrom(enumReflected, "ReceiveTimeout");
    public static SocketOptionName Error = getFrom(enumReflected, "Error");
    public static SocketOptionName Type = getFrom(enumReflected, "Type");
    public static SocketOptionName ReuseUnicastPort = getFrom(enumReflected, "ReuseUnicastPort");
    public static SocketOptionName UpdateAcceptContext = getFrom(enumReflected, "UpdateAcceptContext");
    public static SocketOptionName UpdateConnectContext = getFrom(enumReflected, "UpdateConnectContext");
    public static SocketOptionName MaxConnections = getFrom(enumReflected, "MaxConnections");
    public static SocketOptionName DontLinger = getFrom(enumReflected, "DontLinger");
    public static SocketOptionName ExclusiveAddressUse = getFrom(enumReflected, "ExclusiveAddressUse");


    // Flags management section


}