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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.accesscontrol.ObjectSecurity;
import system.security.accesscontrol.AccessRule;
import system.security.principal.IdentityReference;
import system.security.accesscontrol.InheritanceFlags;
import system.security.accesscontrol.PropagationFlags;
import system.security.accesscontrol.AccessControlType;
import system.Guid;
import system.security.accesscontrol.AuditRule;
import system.security.accesscontrol.AuditFlags;
import system.security.accesscontrol.AuthorizationRuleCollection;


/**
 * The base .NET class managing System.Security.AccessControl.DirectoryObjectSecurity, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.DirectoryObjectSecurity" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.DirectoryObjectSecurity</a>
 */
public class DirectoryObjectSecurity extends ObjectSecurity  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Security.AccessControl.DirectoryObjectSecurity
     */
    public static final String className = "System.Security.AccessControl.DirectoryObjectSecurity";
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

    public DirectoryObjectSecurity(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DirectoryObjectSecurity}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DirectoryObjectSecurity} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DirectoryObjectSecurity cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DirectoryObjectSecurity(from.getJCOInstance());
    }

    // Constructors section
    
    public DirectoryObjectSecurity() throws Throwable {
    }

    
    // Methods section
    
    public AccessRule AccessRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AccessControlType type, Guid objectType, Guid inheritedObjectType) throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAccessRuleFactory = (JCObject)classInstance.Invoke("AccessRuleFactory", identityReference == null ? null : identityReference.getJCOInstance(), accessMask, isInherited, inheritanceFlags == null ? null : inheritanceFlags.getJCOInstance(), propagationFlags == null ? null : propagationFlags.getJCOInstance(), type == null ? null : type.getJCOInstance(), objectType == null ? null : objectType.getJCOInstance(), inheritedObjectType == null ? null : inheritedObjectType.getJCOInstance());
            return new AccessRule(objAccessRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditRule AuditRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AuditFlags flags, Guid objectType, Guid inheritedObjectType) throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAuditRuleFactory = (JCObject)classInstance.Invoke("AuditRuleFactory", identityReference == null ? null : identityReference.getJCOInstance(), accessMask, isInherited, inheritanceFlags == null ? null : inheritanceFlags.getJCOInstance(), propagationFlags == null ? null : propagationFlags.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), objectType == null ? null : objectType.getJCOInstance(), inheritedObjectType == null ? null : inheritedObjectType.getJCOInstance());
            return new AuditRule(objAuditRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthorizationRuleCollection GetAccessRules(boolean includeExplicit, boolean includeInherited, NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.SystemException, system.InvalidOperationException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.AccessViolationException, system.security.principal.IdentityNotMappedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAccessRules = (JCObject)classInstance.Invoke("GetAccessRules", includeExplicit, includeInherited, targetType == null ? null : targetType.getJCOInstance());
            return new AuthorizationRuleCollection(objGetAccessRules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthorizationRuleCollection GetAuditRules(boolean includeExplicit, boolean includeInherited, NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.SystemException, system.InvalidOperationException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.AccessViolationException, system.security.principal.IdentityNotMappedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAuditRules = (JCObject)classInstance.Invoke("GetAuditRules", includeExplicit, includeInherited, targetType == null ? null : targetType.getJCOInstance());
            return new AuthorizationRuleCollection(objGetAuditRules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}