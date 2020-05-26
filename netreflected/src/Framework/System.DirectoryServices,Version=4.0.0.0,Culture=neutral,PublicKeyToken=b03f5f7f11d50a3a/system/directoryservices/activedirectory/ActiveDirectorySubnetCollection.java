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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.ActiveDirectorySubnet;
import system.directoryservices.activedirectory.ActiveDirectorySubnetCollection;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySubnetCollection, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ActiveDirectorySubnetCollection extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.DirectoryServices";
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySubnetCollection";
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

    public ActiveDirectorySubnetCollection(Object instance) throws Throwable {
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

    public static ActiveDirectorySubnetCollection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ActiveDirectorySubnetCollection(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void AddRange(ActiveDirectorySubnet[] subnets) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            classInstance.Invoke("AddRange", (Object)toObjectFromArray(subnets));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddRange(ActiveDirectorySubnetCollection subnets) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            classInstance.Invoke("AddRange", (Object)subnets.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(ActiveDirectorySubnet[] array, int index) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Add(ActiveDirectorySubnet subnet) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        try {
            return (int)classInstance.Invoke("Add", (Object)subnet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(ActiveDirectorySubnet subnet) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.IndexOutOfRangeException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)subnet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(ActiveDirectorySubnet subnet) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.IndexOutOfRangeException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)subnet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(int index, ActiveDirectorySubnet subnet) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Insert", index, (Object)subnet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(ActiveDirectorySubnet subnet) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.IndexOutOfRangeException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            classInstance.Invoke("Remove", (Object)subnet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getCapacity() throws Throwable {
        try {
            return (int)classInstance.Get("Capacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCapacity(int Capacity) throws Throwable {
        try {
            classInstance.Set("Capacity", Capacity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}