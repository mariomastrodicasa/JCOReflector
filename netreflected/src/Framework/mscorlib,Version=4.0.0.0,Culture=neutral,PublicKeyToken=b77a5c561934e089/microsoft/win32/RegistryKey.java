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

package microsoft.win32;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.win32.RegistryKey;
import microsoft.win32.RegistryHive;
import microsoft.win32.RegistryView;
import microsoft.win32.safehandles.SafeRegistryHandle;
import microsoft.win32.RegistryKeyPermissionCheck;
import microsoft.win32.RegistryOptions;
import system.security.accesscontrol.RegistrySecurity;
import system.security.accesscontrol.RegistryRights;
import microsoft.win32.RegistryValueOptions;
import microsoft.win32.RegistryValueKind;
import system.security.accesscontrol.AccessControlSections;
import system.runtime.remoting.ObjRef;


/**
 * The base .NET class managing Microsoft.Win32.RegistryKey, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class RegistryKey extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
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

    public static RegistryKey cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RegistryKey(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public void Dispose() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey OpenBaseKey(RegistryHive hKey, RegistryView view) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenBaseKey = (JCObject)classType.Invoke("OpenBaseKey", hKey == null ? null : hKey.getJCOInstance(), view == null ? null : view.getJCOInstance());
            return new RegistryKey(objOpenBaseKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey OpenRemoteBaseKey(RegistryHive hKey, java.lang.String machineName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenRemoteBaseKey = (JCObject)classType.Invoke("OpenRemoteBaseKey", hKey == null ? null : hKey.getJCOInstance(), machineName);
            return new RegistryKey(objOpenRemoteBaseKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey OpenRemoteBaseKey(RegistryHive hKey, java.lang.String machineName, RegistryView view) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenRemoteBaseKey = (JCObject)classType.Invoke("OpenRemoteBaseKey", hKey == null ? null : hKey.getJCOInstance(), machineName, view == null ? null : view.getJCOInstance());
            return new RegistryKey(objOpenRemoteBaseKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey FromHandle(SafeRegistryHandle handle) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromHandle = (JCObject)classType.Invoke("FromHandle", handle == null ? null : handle.getJCOInstance());
            return new RegistryKey(objFromHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey FromHandle(SafeRegistryHandle handle, RegistryView view) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromHandle = (JCObject)classType.Invoke("FromHandle", handle == null ? null : handle.getJCOInstance(), view == null ? null : view.getJCOInstance());
            return new RegistryKey(objFromHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey);
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey, permissionCheck == null ? null : permissionCheck.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck, RegistryOptions options) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey, permissionCheck == null ? null : permissionCheck.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, boolean writable) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey, writable);
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, boolean writable, RegistryOptions options) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey, writable, options == null ? null : options.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck, RegistrySecurity registrySecurity) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey, permissionCheck == null ? null : permissionCheck.getJCOInstance(), registrySecurity == null ? null : registrySecurity.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey CreateSubKey(java.lang.String subkey, RegistryKeyPermissionCheck permissionCheck, RegistryOptions registryOptions, RegistrySecurity registrySecurity) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubKey = (JCObject)classInstance.Invoke("CreateSubKey", subkey, permissionCheck == null ? null : permissionCheck.getJCOInstance(), registryOptions == null ? null : registryOptions.getJCOInstance(), registrySecurity == null ? null : registrySecurity.getJCOInstance());
            return new RegistryKey(objCreateSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKey(java.lang.String subkey) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteSubKey", subkey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKey(java.lang.String subkey, boolean throwOnMissingSubKey) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.FormatException, system.IndexOutOfRangeException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteSubKey", subkey, throwOnMissingSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKeyTree(java.lang.String subkey) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteSubKeyTree", subkey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteSubKeyTree(java.lang.String subkey, boolean throwOnMissingSubKey) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.FormatException, system.IndexOutOfRangeException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteSubKeyTree", subkey, throwOnMissingSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteValue(java.lang.String name) throws Throwable, system.ObjectDisposedException, system.UnauthorizedAccessException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteValue", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteValue(java.lang.String name, boolean throwOnMissingValue) throws Throwable, system.ObjectDisposedException, system.UnauthorizedAccessException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteValue", name, throwOnMissingValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, boolean writable) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", name, writable);
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, RegistryKeyPermissionCheck permissionCheck) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", name, permissionCheck == null ? null : permissionCheck.getJCOInstance());
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, RegistryRights rights) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", name, rights == null ? null : rights.getJCOInstance());
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name, RegistryKeyPermissionCheck permissionCheck, RegistryRights rights) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", name, permissionCheck == null ? null : permissionCheck.getJCOInstance(), rights == null ? null : rights.getJCOInstance());
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey OpenSubKey(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenSubKey = (JCObject)classInstance.Invoke("OpenSubKey", name);
            return new RegistryKey(objOpenSubKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetSubKeyNames() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
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

    public java.lang.String[] GetValueNames() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
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

    public NetObject GetValue(java.lang.String name) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", name);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(java.lang.String name, NetObject defaultValue) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", name, defaultValue == null ? null : defaultValue.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(java.lang.String name, NetObject defaultValue, RegistryValueOptions options) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", name, defaultValue == null ? null : defaultValue.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryValueKind GetValueKind(java.lang.String name) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValueKind = (JCObject)classInstance.Invoke("GetValueKind", name);
            return new RegistryValueKind(objGetValueKind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(java.lang.String name, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetValue", name, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(java.lang.String name, NetObject value, RegistryValueKind valueKind) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetValue", name, value == null ? null : value.getJCOInstance(), valueKind == null ? null : valueKind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistrySecurity GetAccessControl() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.InvalidOperationException, system.security.accesscontrol.PrivilegeNotHeldException, system.SystemException, system.OverflowException, system.IndexOutOfRangeException, system.NullReferenceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classInstance.Invoke("GetAccessControl");
            return new RegistrySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistrySecurity GetAccessControl(AccessControlSections includeSections) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.SystemException, system.OverflowException, system.IndexOutOfRangeException, system.NullReferenceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classInstance.Invoke("GetAccessControl", includeSections == null ? null : includeSections.getJCOInstance());
            return new RegistrySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessControl(RegistrySecurity registrySecurity) throws Throwable, system.ObjectDisposedException, system.UnauthorizedAccessException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.NotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.InvalidProgramException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAccessControl", registrySecurity == null ? null : registrySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", requestedType == null ? null : requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getSubKeyCount() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SubKeyCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryView getView() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("View");
            return new RegistryView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SafeRegistryHandle getHandle() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Handle");
            return new SafeRegistryHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getValueCount() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ValueCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}