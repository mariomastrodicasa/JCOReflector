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

package system.net.networkinformation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.NetworkInformation.NetworkInterfaceType, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.NetworkInformation.NetworkInterfaceType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.NetworkInformation.NetworkInterfaceType</a>
 */
public class NetworkInterfaceType extends NetObject  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Net.NetworkInformation.NetworkInterfaceType
     */
    public static final String className = "System.Net.NetworkInformation.NetworkInterfaceType";
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

    public NetworkInterfaceType(Object instance) {
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

    public NetworkInterfaceType() {
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

    final static NetworkInterfaceType getFrom(JCEnum object, String value) {
        try {
            return new NetworkInterfaceType(object.fromValue(value));
        } catch (JCException e) {
            return new NetworkInterfaceType(object);
        }
    }

    // Enum fields section
    
    public static NetworkInterfaceType Unknown = getFrom(enumReflected, "Unknown");
    public static NetworkInterfaceType Ethernet = getFrom(enumReflected, "Ethernet");
    public static NetworkInterfaceType TokenRing = getFrom(enumReflected, "TokenRing");
    public static NetworkInterfaceType Fddi = getFrom(enumReflected, "Fddi");
    public static NetworkInterfaceType BasicIsdn = getFrom(enumReflected, "BasicIsdn");
    public static NetworkInterfaceType PrimaryIsdn = getFrom(enumReflected, "PrimaryIsdn");
    public static NetworkInterfaceType Ppp = getFrom(enumReflected, "Ppp");
    public static NetworkInterfaceType Loopback = getFrom(enumReflected, "Loopback");
    public static NetworkInterfaceType Ethernet3Megabit = getFrom(enumReflected, "Ethernet3Megabit");
    public static NetworkInterfaceType Slip = getFrom(enumReflected, "Slip");
    public static NetworkInterfaceType Atm = getFrom(enumReflected, "Atm");
    public static NetworkInterfaceType GenericModem = getFrom(enumReflected, "GenericModem");
    public static NetworkInterfaceType FastEthernetT = getFrom(enumReflected, "FastEthernetT");
    public static NetworkInterfaceType Isdn = getFrom(enumReflected, "Isdn");
    public static NetworkInterfaceType FastEthernetFx = getFrom(enumReflected, "FastEthernetFx");
    public static NetworkInterfaceType Wireless80211 = getFrom(enumReflected, "Wireless80211");
    public static NetworkInterfaceType AsymmetricDsl = getFrom(enumReflected, "AsymmetricDsl");
    public static NetworkInterfaceType RateAdaptDsl = getFrom(enumReflected, "RateAdaptDsl");
    public static NetworkInterfaceType SymmetricDsl = getFrom(enumReflected, "SymmetricDsl");
    public static NetworkInterfaceType VeryHighSpeedDsl = getFrom(enumReflected, "VeryHighSpeedDsl");
    public static NetworkInterfaceType IPOverAtm = getFrom(enumReflected, "IPOverAtm");
    public static NetworkInterfaceType GigabitEthernet = getFrom(enumReflected, "GigabitEthernet");
    public static NetworkInterfaceType Tunnel = getFrom(enumReflected, "Tunnel");
    public static NetworkInterfaceType MultiRateSymmetricDsl = getFrom(enumReflected, "MultiRateSymmetricDsl");
    public static NetworkInterfaceType HighPerformanceSerialBus = getFrom(enumReflected, "HighPerformanceSerialBus");
    public static NetworkInterfaceType Wman = getFrom(enumReflected, "Wman");
    public static NetworkInterfaceType Wwanpp = getFrom(enumReflected, "Wwanpp");
    public static NetworkInterfaceType Wwanpp2 = getFrom(enumReflected, "Wwanpp2");


    // Flags management section


}