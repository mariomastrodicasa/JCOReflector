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

package microsoft.win32;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.win32.RegistryKey;
import microsoft.win32.RegistryOptions;
import microsoft.win32.RegistryKeyPermissionCheck;
import system.security.accesscontrol.RegistrySecurity;
import microsoft.win32.RegistryHive;
import microsoft.win32.RegistryView;
import system.security.accesscontrol.RegistryRights;
import system.security.accesscontrol.AccessControlSections;
import microsoft.win32.safehandles.SafeRegistryHandle;
import microsoft.win32.RegistryValueOptions;
import microsoft.win32.RegistryValueKind;


/**
 * The base .NET class managing Microsoft.Win32.RegistryKey, Microsoft.Win32.Registry, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RegistryKey extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Win32.Registry, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Win32.Registry";
    public static final String className = "Microsoft.Win32.RegistryKey";
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

    public RegistryKey(Object instance) throws Throwable {
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

    public static RegistryKey castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RegistryKey(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void Flush() throws Throwable {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.FormatException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey);
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, boolean writable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey, writable);
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, boolean writable, RegistryOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey, writable, (Object)options.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey, (Object)permissionCheck.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck, RegistryOptions registryOptions, RegistrySecurity registrySecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey, (Object)permissionCheck.getJCOInstance(), (Object)registryOptions.getJCOInstance(), (Object)registrySecurity.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck, RegistrySecurity registrySecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey, (Object)permissionCheck.getJCOInstance(), (Object)registrySecurity.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck, RegistryOptions registryOptions) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", (Object)subkey, (Object)permissionCheck.getJCOInstance(), (Object)registryOptions.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKey(java.lang.String subkey) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.FormatException, system.io.IOException {
        try {
            classInstance.Invoke("DeleteSubKey", (Object)subkey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKey(java.lang.String subkey, boolean throwOnMissingSubKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            classInstance.Invoke("DeleteSubKey", (Object)subkey, throwOnMissingSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKeyTree(java.lang.String subkey) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.FormatException, system.io.IOException {
        try {
            classInstance.Invoke("DeleteSubKeyTree", (Object)subkey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKeyTree(java.lang.String subkey, boolean throwOnMissingSubKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.io.IOException {
        try {
            classInstance.Invoke("DeleteSubKeyTree", (Object)subkey, throwOnMissingSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteValue(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("DeleteValue", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteValue(java.lang.String name, boolean throwOnMissingValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("DeleteValue", (Object)name, throwOnMissingValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey OpenBaseKey(RegistryHive hKey, RegistryView view) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objOpenBaseKey = (JCObject)classType.Invoke("OpenBaseKey", (Object)hKey.getJCOInstance(), (Object)view.getJCOInstance());
            return new RegistryKey(objOpenBaseKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey OpenRemoteBaseKey(RegistryHive hKey, java.lang.String machineName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UnauthorizedAccessException, system.io.IOException {
        try {
            JCObject objOpenRemoteBaseKey = (JCObject)classType.Invoke("OpenRemoteBaseKey", (Object)hKey.getJCOInstance(), (Object)machineName);
            return new RegistryKey(objOpenRemoteBaseKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey OpenRemoteBaseKey(RegistryHive hKey, java.lang.String machineName, RegistryView view) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException, system.UnauthorizedAccessException, system.io.IOException {
        try {
            JCObject objOpenRemoteBaseKey = (JCObject)classType.Invoke("OpenRemoteBaseKey", (Object)hKey.getJCOInstance(), (Object)machineName, (Object)view.getJCOInstance());
            return new RegistryKey(objOpenRemoteBaseKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", (Object)name);
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, boolean writable) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", (Object)name, writable);
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, RegistryKeyPermissionCheck permissionCheck) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.OutOfMemoryException {
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", (Object)name, (Object)permissionCheck.getJCOInstance());
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, RegistryRights rights) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", (Object)name, (Object)rights.getJCOInstance());
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, RegistryKeyPermissionCheck permissionCheck, RegistryRights rights) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.OutOfMemoryException {
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", (Object)name, (Object)permissionCheck.getJCOInstance(), (Object)rights.getJCOInstance());
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistrySecurity GetAccessControl() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetAccessControl = (JCObject)classInstance.Invoke("GetAccessControl");
            return new RegistrySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistrySecurity GetAccessControl(AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetAccessControl = (JCObject)classInstance.Invoke("GetAccessControl", (Object)includeSections.getJCOInstance());
            return new RegistrySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessControl(RegistrySecurity registrySecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetAccessControl", (Object)registrySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey FromHandle(SafeRegistryHandle handle) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objFromHandle = (JCObject)classType.Invoke("FromHandle", (Object)handle.getJCOInstance());
            return new RegistryKey(objFromHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey FromHandle(SafeRegistryHandle handle, RegistryView view) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objFromHandle = (JCObject)classType.Invoke("FromHandle", (Object)handle.getJCOInstance(), (Object)view.getJCOInstance());
            return new RegistryKey(objFromHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetSubKeyNames() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSubKeyNames");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetSubKeyNames = 0; indexGetSubKeyNames < resultingArrayList.size(); indexGetSubKeyNames++ ) {
				resultingArray[indexGetSubKeyNames] = (java.lang.String)resultingArrayList.get(indexGetSubKeyNames);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetValueNames() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetValueNames");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetValueNames = 0; indexGetValueNames < resultingArrayList.size(); indexGetValueNames++ ) {
				resultingArray[indexGetValueNames] = (java.lang.String)resultingArrayList.get(indexGetValueNames);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)name);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(java.lang.String name, NetObject defaultValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)name, (Object)defaultValue.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(java.lang.String name, NetObject defaultValue, RegistryValueOptions options) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)name, (Object)defaultValue.getJCOInstance(), (Object)options.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryValueKind GetValueKind(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objGetValueKind = (JCObject)classInstance.Invoke("GetValueKind", (Object)name);
            return new RegistryValueKind(objGetValueKind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(java.lang.String name, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UnauthorizedAccessException, system.io.IOException {
        try {
            classInstance.Invoke("SetValue", (Object)name, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(java.lang.String name, NetObject value, RegistryValueKind valueKind) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.io.IOException {
        try {
            classInstance.Invoke("SetValue", (Object)name, (Object)value.getJCOInstance(), (Object)valueKind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getSubKeyCount() throws Throwable {
        try {
            return (int)classInstance.Get("SubKeyCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryView getView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("View");
            return new RegistryView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SafeRegistryHandle getHandle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Handle");
            return new SafeRegistryHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getValueCount() throws Throwable {
        try {
            return (int)classInstance.Get("ValueCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}