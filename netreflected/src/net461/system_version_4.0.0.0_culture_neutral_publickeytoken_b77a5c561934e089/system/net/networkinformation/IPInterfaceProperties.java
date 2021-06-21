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
import java.util.ArrayList;

// Import section
import system.net.networkinformation.IPv4InterfaceProperties;
import system.net.networkinformation.IPv6InterfaceProperties;
import system.net.networkinformation.GatewayIPAddressInformationCollection;
import system.net.networkinformation.IPAddressCollection;
import system.net.networkinformation.IPAddressInformationCollection;
import system.net.networkinformation.MulticastIPAddressInformationCollection;
import system.net.networkinformation.UnicastIPAddressInformationCollection;


/**
 * The base .NET class managing System.Net.NetworkInformation.IPInterfaceProperties, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.NetworkInformation.IPInterfaceProperties" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.NetworkInformation.IPInterfaceProperties</a>
 */
public class IPInterfaceProperties extends NetObject  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Net.NetworkInformation.IPInterfaceProperties
     */
    public static final String className = "System.Net.NetworkInformation.IPInterfaceProperties";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

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

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPInterfaceProperties(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IPInterfaceProperties}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IPInterfaceProperties} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IPInterfaceProperties cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IPInterfaceProperties(from.getJCOInstance());
    }

    // Constructors section
    
    public IPInterfaceProperties() throws Throwable {
    }

    
    // Methods section
    
    public IPv4InterfaceProperties GetIPv4Properties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIPv4Properties = (JCObject)classInstance.Invoke("GetIPv4Properties");
            return new IPv4InterfaceProperties(objGetIPv4Properties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPv6InterfaceProperties GetIPv6Properties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetIPv6Properties = (JCObject)classInstance.Invoke("GetIPv6Properties");
            return new IPv6InterfaceProperties(objGetIPv6Properties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsDnsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDnsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDynamicDnsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDynamicDnsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GatewayIPAddressInformationCollection getGatewayAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("GatewayAddresses");
            return new GatewayIPAddressInformationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPAddressCollection getDhcpServerAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DhcpServerAddresses");
            return new IPAddressCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPAddressCollection getDnsAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DnsAddresses");
            return new IPAddressCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPAddressCollection getWinsServersAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WinsServersAddresses");
            return new IPAddressCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPAddressInformationCollection getAnycastAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AnycastAddresses");
            return new IPAddressInformationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MulticastIPAddressInformationCollection getMulticastAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MulticastAddresses");
            return new MulticastIPAddressInformationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UnicastIPAddressInformationCollection getUnicastAddresses() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UnicastAddresses");
            return new UnicastIPAddressInformationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDnsSuffix() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DnsSuffix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}