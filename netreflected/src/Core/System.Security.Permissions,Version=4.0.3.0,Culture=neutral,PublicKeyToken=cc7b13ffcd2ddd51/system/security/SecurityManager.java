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

package system.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.IPermission;
import system.security.IPermissionImplementation;
import system.security.policy.Evidence;
import system.security.PermissionSet;
import system.security.policy.PolicyLevel;
import system.security.PolicyLevelType;


/**
 * The base .NET class managing System.Security.SecurityManager, System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class SecurityManager extends NetObject  {
    public static final String assemblyFullName = "System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    public static final String assemblyShortName = "System.Security.Permissions";
    public static final String className = "System.Security.SecurityManager";
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

    public SecurityManager(Object instance) throws Throwable {
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

    public static SecurityManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SecurityManager(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static boolean CurrentThreadRequiresSecurityContextCapture() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CurrentThreadRequiresSecurityContextCapture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsGranted(IPermission perm) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsGranted", perm == null ? null : perm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IEnumerator PolicyHierarchy() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPolicyHierarchy = (JCObject)classType.Invoke("PolicyHierarchy");
            return new IEnumeratorImplementation(objPolicyHierarchy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IEnumerator ResolvePolicyGroups(Evidence evidence) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicyGroups = (JCObject)classType.Invoke("ResolvePolicyGroups", evidence == null ? null : evidence.getJCOInstance());
            return new IEnumeratorImplementation(objResolvePolicyGroups);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet GetStandardSandbox(Evidence evidence) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetStandardSandbox = (JCObject)classType.Invoke("GetStandardSandbox", evidence == null ? null : evidence.getJCOInstance());
            return new PermissionSet(objGetStandardSandbox);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolvePolicy(Evidence evidence) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicy = (JCObject)classType.Invoke("ResolvePolicy", evidence == null ? null : evidence.getJCOInstance());
            return new PermissionSet(objResolvePolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolvePolicy(Evidence[] evidences) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicy = (JCObject)classType.Invoke("ResolvePolicy", (Object)toObjectFromArray(evidences));
            return new PermissionSet(objResolvePolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolveSystemPolicy(Evidence evidence) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolveSystemPolicy = (JCObject)classType.Invoke("ResolveSystemPolicy", evidence == null ? null : evidence.getJCOInstance());
            return new PermissionSet(objResolveSystemPolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PolicyLevel LoadPolicyLevelFromFile(java.lang.String path, PolicyLevelType type) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoadPolicyLevelFromFile = (JCObject)classType.Invoke("LoadPolicyLevelFromFile", path, type == null ? null : type.getJCOInstance());
            return new PolicyLevel(objLoadPolicyLevelFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PolicyLevel LoadPolicyLevelFromString(java.lang.String str, PolicyLevelType type) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoadPolicyLevelFromString = (JCObject)classType.Invoke("LoadPolicyLevelFromString", str, type == null ? null : type.getJCOInstance());
            return new PolicyLevel(objLoadPolicyLevelFromString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SavePolicyLevel(PolicyLevel level) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SavePolicyLevel", level == null ? null : level.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getCheckExecutionRights() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("CheckExecutionRights");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCheckExecutionRights(boolean CheckExecutionRights) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("CheckExecutionRights", CheckExecutionRights);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getSecurityEnabled() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("SecurityEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSecurityEnabled(boolean SecurityEnabled) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("SecurityEnabled", SecurityEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}