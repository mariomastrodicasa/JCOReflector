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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.ActiveDirectoryPartition;
import system.directoryservices.activedirectory.ActiveDirectorySchema;
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.ActiveDirectorySchemaClass;
import system.directoryservices.activedirectory.ActiveDirectorySchemaProperty;
import system.directoryservices.activedirectory.ReadOnlyActiveDirectorySchemaClassCollection;
import system.directoryservices.activedirectory.SchemaClassType;
import system.directoryservices.activedirectory.ReadOnlyActiveDirectorySchemaPropertyCollection;
import system.directoryservices.activedirectory.PropertyTypes;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.DirectoryServer;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySchema, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySchema" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySchema</a>
 */
public class ActiveDirectorySchema extends ActiveDirectoryPartition  {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.ActiveDirectorySchema
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySchema";
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

    public ActiveDirectorySchema(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectorySchema}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectorySchema} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectorySchema cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectorySchema(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectorySchema() throws Throwable {
    }



    
    // Methods section
    
    public static ActiveDirectorySchema GetCurrentSchema() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCurrentSchema = (JCObject)classType.Invoke("GetCurrentSchema");
            return new ActiveDirectorySchema(objGetCurrentSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ActiveDirectorySchema GetSchema(DirectoryContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSchema = (JCObject)classType.Invoke("GetSchema", context == null ? null : context.getJCOInstance());
            return new ActiveDirectorySchema(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaClass FindClass(java.lang.String ldapDisplayName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindClass = (JCObject)classInstance.Invoke("FindClass", ldapDisplayName);
            return new ActiveDirectorySchemaClass(objFindClass);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaClass FindDefunctClass(java.lang.String commonName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDefunctClass = (JCObject)classInstance.Invoke("FindDefunctClass", commonName);
            return new ActiveDirectorySchemaClass(objFindDefunctClass);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaProperty FindDefunctProperty(java.lang.String commonName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDefunctProperty = (JCObject)classInstance.Invoke("FindDefunctProperty", commonName);
            return new ActiveDirectorySchemaProperty(objFindDefunctProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaProperty FindProperty(java.lang.String ldapDisplayName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindProperty = (JCObject)classInstance.Invoke("FindProperty", ldapDisplayName);
            return new ActiveDirectorySchemaProperty(objFindProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaClassCollection FindAllClasses() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllClasses = (JCObject)classInstance.Invoke("FindAllClasses");
            return new ReadOnlyActiveDirectorySchemaClassCollection(objFindAllClasses);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaClassCollection FindAllClasses(SchemaClassType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllClasses = (JCObject)classInstance.Invoke("FindAllClasses", type == null ? null : type.getJCOInstance());
            return new ReadOnlyActiveDirectorySchemaClassCollection(objFindAllClasses);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaClassCollection FindAllDefunctClasses() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDefunctClasses = (JCObject)classInstance.Invoke("FindAllDefunctClasses");
            return new ReadOnlyActiveDirectorySchemaClassCollection(objFindAllDefunctClasses);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaPropertyCollection FindAllDefunctProperties() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDefunctProperties = (JCObject)classInstance.Invoke("FindAllDefunctProperties");
            return new ReadOnlyActiveDirectorySchemaPropertyCollection(objFindAllDefunctProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaPropertyCollection FindAllProperties() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllProperties = (JCObject)classInstance.Invoke("FindAllProperties");
            return new ReadOnlyActiveDirectorySchemaPropertyCollection(objFindAllProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaPropertyCollection FindAllProperties(PropertyTypes type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllProperties = (JCObject)classInstance.Invoke("FindAllProperties", type == null ? null : type.getJCOInstance());
            return new ReadOnlyActiveDirectorySchemaPropertyCollection(objFindAllProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RefreshSchema() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RefreshSchema");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DirectoryServer getSchemaRoleOwner() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaRoleOwner");
            return new DirectoryServer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}