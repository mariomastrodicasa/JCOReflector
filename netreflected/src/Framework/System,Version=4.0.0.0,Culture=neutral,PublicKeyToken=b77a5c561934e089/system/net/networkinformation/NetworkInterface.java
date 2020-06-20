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

package system.net.networkinformation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.networkinformation.NetworkInterface;
import system.net.networkinformation.IPInterfaceProperties;
import system.net.networkinformation.IPv4InterfaceStatistics;
import system.net.networkinformation.IPInterfaceStatistics;
import system.net.networkinformation.PhysicalAddress;
import system.net.networkinformation.NetworkInterfaceComponent;
import system.net.networkinformation.OperationalStatus;
import system.net.networkinformation.NetworkInterfaceType;


/**
 * The base .NET class managing System.Net.NetworkInformation.NetworkInterface, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class NetworkInterface extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System";
    public static final String className = "System.Net.NetworkInformation.NetworkInterface";
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

    public NetworkInterface(Object instance) throws Throwable {
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }

    public static NetworkInterface cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NetworkInterface(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static NetworkInterface[] GetAllNetworkInterfaces() throws Throwable, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.net.networkinformation.NetworkInformationException, system.resources.MissingManifestResourceException, system.net.sockets.SocketException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<NetworkInterface> resultingArrayList = new ArrayList<NetworkInterface>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetAllNetworkInterfaces");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetworkInterface(resultingObject));
            }
            NetworkInterface[] resultingArray = new NetworkInterface[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GetIsNetworkAvailable() throws Throwable, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.net.networkinformation.NetworkInformationException, system.net.sockets.SocketException, system.NotImplementedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GetIsNetworkAvailable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPInterfaceProperties GetIPProperties() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIPProperties = (JCObject)classInstance.Invoke("GetIPProperties");
            return new IPInterfaceProperties(objGetIPProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPv4InterfaceStatistics GetIPv4Statistics() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIPv4Statistics = (JCObject)classInstance.Invoke("GetIPv4Statistics");
            return new IPv4InterfaceStatistics(objGetIPv4Statistics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPInterfaceStatistics GetIPStatistics() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIPStatistics = (JCObject)classInstance.Invoke("GetIPStatistics");
            return new IPInterfaceStatistics(objGetIPStatistics);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PhysicalAddress GetPhysicalAddress() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPhysicalAddress = (JCObject)classInstance.Invoke("GetPhysicalAddress");
            return new PhysicalAddress(objGetPhysicalAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Supports(NetworkInterfaceComponent networkInterfaceComponent) throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Supports", networkInterfaceComponent == null ? null : networkInterfaceComponent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getId() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OperationalStatus getOperationalStatus() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OperationalStatus");
            return new OperationalStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getSpeed() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Speed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReceiveOnly() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReceiveOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsMulticast() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SupportsMulticast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetworkInterfaceType getNetworkInterfaceType() throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NetworkInterfaceType");
            return new NetworkInterfaceType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getLoopbackInterfaceIndex() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.net.sockets.SocketException, system.net.networkinformation.NetworkInformationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("LoopbackInterfaceIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getIPv6LoopbackInterfaceIndex() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.net.sockets.SocketException, system.net.networkinformation.NetworkInformationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("IPv6LoopbackInterfaceIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}