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
 * The base .NET class managing System.Net.Sockets.ProtocolFamily, System.Net.Sockets, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ProtocolFamily extends NetObject  {
    public static final String assemblyFullName = "System.Net.Sockets, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Net.Sockets";
    public static final String className = "System.Net.Sockets.ProtocolFamily";
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

    public ProtocolFamily(Object instance) {
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

    public ProtocolFamily() {
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

    final static ProtocolFamily getFrom(JCEnum object, String value) {
        try {
            return new ProtocolFamily(object.fromValue(value));
        } catch (JCException e) {
            return new ProtocolFamily(object);
        }
    }

    // Enum fields section
    
    public static ProtocolFamily Unspecified = getFrom(enumReflected, "Unspecified");
    public static ProtocolFamily Unix = getFrom(enumReflected, "Unix");
    public static ProtocolFamily InterNetwork = getFrom(enumReflected, "InterNetwork");
    public static ProtocolFamily ImpLink = getFrom(enumReflected, "ImpLink");
    public static ProtocolFamily Pup = getFrom(enumReflected, "Pup");
    public static ProtocolFamily Chaos = getFrom(enumReflected, "Chaos");
    public static ProtocolFamily NS = getFrom(enumReflected, "NS");
    public static ProtocolFamily Ipx = getFrom(enumReflected, "Ipx");
    public static ProtocolFamily Osi = getFrom(enumReflected, "Osi");
    public static ProtocolFamily Iso = getFrom(enumReflected, "Iso");
    public static ProtocolFamily Ecma = getFrom(enumReflected, "Ecma");
    public static ProtocolFamily DataKit = getFrom(enumReflected, "DataKit");
    public static ProtocolFamily Ccitt = getFrom(enumReflected, "Ccitt");
    public static ProtocolFamily Sna = getFrom(enumReflected, "Sna");
    public static ProtocolFamily DecNet = getFrom(enumReflected, "DecNet");
    public static ProtocolFamily DataLink = getFrom(enumReflected, "DataLink");
    public static ProtocolFamily Lat = getFrom(enumReflected, "Lat");
    public static ProtocolFamily HyperChannel = getFrom(enumReflected, "HyperChannel");
    public static ProtocolFamily AppleTalk = getFrom(enumReflected, "AppleTalk");
    public static ProtocolFamily NetBios = getFrom(enumReflected, "NetBios");
    public static ProtocolFamily VoiceView = getFrom(enumReflected, "VoiceView");
    public static ProtocolFamily FireFox = getFrom(enumReflected, "FireFox");
    public static ProtocolFamily Banyan = getFrom(enumReflected, "Banyan");
    public static ProtocolFamily Atm = getFrom(enumReflected, "Atm");
    public static ProtocolFamily InterNetworkV6 = getFrom(enumReflected, "InterNetworkV6");
    public static ProtocolFamily Cluster = getFrom(enumReflected, "Cluster");
    public static ProtocolFamily Ieee12844 = getFrom(enumReflected, "Ieee12844");
    public static ProtocolFamily Irda = getFrom(enumReflected, "Irda");
    public static ProtocolFamily NetworkDesigners = getFrom(enumReflected, "NetworkDesigners");
    public static ProtocolFamily Max = getFrom(enumReflected, "Max");
    public static ProtocolFamily Packet = getFrom(enumReflected, "Packet");
    public static ProtocolFamily ControllerAreaNetwork = getFrom(enumReflected, "ControllerAreaNetwork");
    public static ProtocolFamily Unknown = getFrom(enumReflected, "Unknown");


    // Flags management section


}