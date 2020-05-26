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

package system.security.permissions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.permissions.PermissionState;
import system.security.SecurityElement;
import system.security.permissions.IsolatedStorageContainment;


/**
 * The base .NET class managing System.Security.Permissions.IsolatedStorageFilePermission, System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class IsolatedStorageFilePermission extends NetObject  {
    public static final String assemblyFullName = "System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Security.Permissions";
    public static final String className = "System.Security.Permissions.IsolatedStorageFilePermission";
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

    public IsolatedStorageFilePermission(Object instance) throws Throwable {
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

    public static IsolatedStorageFilePermission castFrom(IJCOBridgeReflected from) throws Throwable {
        return new IsolatedStorageFilePermission(from.getJCOInstance());
    }

    // Constructors section
    
    
    public IsolatedStorageFilePermission(PermissionState state) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public SecurityElement ToXml() throws Throwable {
        try {
            JCObject objToXml = (JCObject)classInstance.Invoke("ToXml");
            return new SecurityElement(objToXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsUnrestricted() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsUnrestricted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FromXml(SecurityElement esd) throws Throwable {
        try {
            classInstance.Invoke("FromXml", (Object)esd.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Assert() throws Throwable {
        try {
            classInstance.Invoke("Assert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Demand() throws Throwable {
        try {
            classInstance.Invoke("Demand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Deny() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("Deny");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PermitOnly() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("PermitOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public long getUserQuota() throws Throwable {
        try {
            return (long)classInstance.Get("UserQuota");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserQuota(long UserQuota) throws Throwable {
        try {
            classInstance.Set("UserQuota", UserQuota);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageContainment getUsageAllowed() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UsageAllowed");
            return new IsolatedStorageContainment(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUsageAllowed(IsolatedStorageContainment UsageAllowed) throws Throwable {
        try {
            classInstance.Set("UsageAllowed", (Object)UsageAllowed.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}