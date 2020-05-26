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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.enterpriseservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.enterpriseservices.SecurityIdentity;
import system.enterpriseservices.SecurityCallers;
import system.enterpriseservices.SecurityCallContext;


/**
 * The base .NET class managing System.EnterpriseServices.SecurityCallContext, System.EnterpriseServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SecurityCallContext extends NetObject  {
    public static final String assemblyFullName = "System.EnterpriseServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.EnterpriseServices";
    public static final String className = "System.EnterpriseServices.SecurityCallContext";
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

    public SecurityCallContext(Object instance) throws Throwable {
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

    public static SecurityCallContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SecurityCallContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean IsCallerInRole(java.lang.String role) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsCallerInRole", (Object)role);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsUserInRole(java.lang.String user, java.lang.String role) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsUserInRole", (Object)user, (Object)role);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsSecurityEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSecurityEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityIdentity getDirectCaller() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DirectCaller");
            return new SecurityIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityIdentity getOriginalCaller() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OriginalCaller");
            return new SecurityIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNumCallers() throws Throwable {
        try {
            return (int)classInstance.Get("NumCallers");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinAuthenticationLevel() throws Throwable {
        try {
            return (int)classInstance.Get("MinAuthenticationLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityCallers getCallers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Callers");
            return new SecurityCallers(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityCallContext getCurrentCall() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("CurrentCall");
            return new SecurityCallContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}