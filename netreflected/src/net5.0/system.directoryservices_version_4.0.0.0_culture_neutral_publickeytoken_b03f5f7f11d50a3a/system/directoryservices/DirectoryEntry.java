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

package system.directoryservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.Component;
import system.directoryservices.AuthenticationTypes;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.ActiveDirectorySecurity;
import system.directoryservices.DirectoryEntries;
import system.directoryservices.DirectoryEntryConfiguration;
import system.directoryservices.PropertyCollection;
import system.Guid;


/**
 * The base .NET class managing System.DirectoryServices.DirectoryEntry, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.DirectoryEntry" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.DirectoryEntry</a>
 */
public class DirectoryEntry extends Component  {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.DirectoryEntry
     */
    public static final String className = "System.DirectoryServices.DirectoryEntry";
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

    public DirectoryEntry(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DirectoryEntry}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DirectoryEntry} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DirectoryEntry cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DirectoryEntry(from.getJCOInstance());
    }

    // Constructors section
    
    public DirectoryEntry() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry(NetObject adsObject) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(adsObject == null ? null : adsObject.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry(java.lang.String path) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry(java.lang.String path, java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, username, password));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry(java.lang.String path, java.lang.String username, java.lang.String password, AuthenticationTypes authenticationType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, username, password, authenticationType == null ? null : authenticationType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean Exists(java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.ObjectDisposedException, system.FormatException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.NotSupportedException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Exists", path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry CopyTo(DirectoryEntry newParent) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCopyTo = (JCObject)classInstance.Invoke("CopyTo", newParent == null ? null : newParent.getJCOInstance());
            return new DirectoryEntry(objCopyTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry CopyTo(DirectoryEntry newParent, java.lang.String newName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCopyTo = (JCObject)classInstance.Invoke("CopyTo", newParent == null ? null : newParent.getJCOInstance(), newName);
            return new DirectoryEntry(objCopyTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Invoke(java.lang.String methodName, NetObject... args) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.reflection.TargetInvocationException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvoke = (JCObject)classInstance.Invoke("Invoke", methodName, toObjectFromArray(args));
            return new NetObject(objInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InvokeGet(java.lang.String propertyName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvokeGet = (JCObject)classInstance.Invoke("InvokeGet", propertyName);
            return new NetObject(objInvokeGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CommitChanges() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.threading.SynchronizationLockException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CommitChanges");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteTree() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteTree");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InvokeSet(java.lang.String propertyName, NetObject... args) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InvokeSet", propertyName, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(DirectoryEntry newParent) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.NullReferenceException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", newParent == null ? null : newParent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(DirectoryEntry newParent, java.lang.String newName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.NullReferenceException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", newParent == null ? null : newParent.getJCOInstance(), newName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RefreshCache() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RefreshCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RefreshCache(java.lang.String[] propertyNames) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RefreshCache", (Object)propertyNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RefreshCache(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RefreshCache", (Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rename(java.lang.String newName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.NullReferenceException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Rename", newName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getUsePropertyCache() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UsePropertyCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUsePropertyCache(boolean UsePropertyCache) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.threading.SynchronizationLockException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UsePropertyCache", UsePropertyCache);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySecurity getObjectSecurity() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ObjectSecurity");
            return new ActiveDirectorySecurity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setObjectSecurity(ActiveDirectorySecurity ObjectSecurity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ObjectSecurity", ObjectSecurity == null ? null : ObjectSecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationTypes getAuthenticationType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuthenticationType");
            return new AuthenticationTypes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthenticationType(AuthenticationTypes AuthenticationType) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AuthenticationType", AuthenticationType == null ? null : AuthenticationType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntries getChildren() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Children");
            return new DirectoryEntries(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getParent() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getSchemaEntry() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaEntry");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntryConfiguration getOptions() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Options");
            return new DirectoryEntryConfiguration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyCollection getProperties() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new PropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getGuid() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Guid");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getNativeObject() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NativeObject");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNativeGuid() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("NativeGuid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPassword(java.lang.String Password) throws Throwable, system.ObjectDisposedException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Password", Password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Path");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPath(java.lang.String Path) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Path", Path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSchemaClassName() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SchemaClassName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUsername() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Username");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUsername(java.lang.String Username) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Username", Username);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}