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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.ActiveDirectoryTransportType;
import system.directoryservices.activedirectory.ActiveDirectorySchedule;
import system.directoryservices.activedirectory.ActiveDirectorySiteLink;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ActiveDirectorySiteCollection;
import system.TimeSpan;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLink, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ActiveDirectorySiteLink extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.DirectoryServices";
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLink";
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

    public ActiveDirectorySiteLink(Object instance) throws Throwable {
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

    public static ActiveDirectorySiteLink cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectorySiteLink(from.getJCOInstance());
    }

    // Constructors section
    

    public ActiveDirectorySiteLink(DirectoryContext context, java.lang.String siteLinkName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), siteLinkName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySiteLink(DirectoryContext context, java.lang.String siteLinkName, ActiveDirectoryTransportType transport) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), siteLinkName, transport == null ? null : transport.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySiteLink(DirectoryContext context, java.lang.String siteLinkName, ActiveDirectoryTransportType transport, ActiveDirectorySchedule schedule) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), siteLinkName, transport == null ? null : transport.getJCOInstance(), schedule == null ? null : schedule.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static ActiveDirectorySiteLink FindByName(DirectoryContext context, java.lang.String siteLinkName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), siteLinkName);
            return new ActiveDirectorySiteLink(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ActiveDirectorySiteLink FindByName(DirectoryContext context, java.lang.String siteLinkName, ActiveDirectoryTransportType transport) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), siteLinkName, transport == null ? null : transport.getJCOInstance());
            return new ActiveDirectorySiteLink(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.AccessViolationException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.FormatException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getDataCompressionEnabled() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DataCompressionEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataCompressionEnabled(boolean DataCompressionEnabled) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataCompressionEnabled", DataCompressionEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNotificationEnabled() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("NotificationEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNotificationEnabled(boolean NotificationEnabled) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NotificationEnabled", NotificationEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReciprocalReplicationEnabled() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ReciprocalReplicationEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReciprocalReplicationEnabled(boolean ReciprocalReplicationEnabled) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReciprocalReplicationEnabled", ReciprocalReplicationEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCost() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Cost");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCost(int Cost) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Cost", Cost);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchedule getInterSiteReplicationSchedule() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.InvalidTimeZoneException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InterSiteReplicationSchedule");
            return new ActiveDirectorySchedule(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInterSiteReplicationSchedule(ActiveDirectorySchedule InterSiteReplicationSchedule) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InterSiteReplicationSchedule", InterSiteReplicationSchedule == null ? null : InterSiteReplicationSchedule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySiteCollection getSites() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException, system.NotImplementedException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Sites");
            return new ActiveDirectorySiteCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectoryTransportType getTransportType() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TransportType");
            return new ActiveDirectoryTransportType(val);
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

    public TimeSpan getReplicationInterval() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReplicationInterval");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReplicationInterval(TimeSpan ReplicationInterval) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReplicationInterval", ReplicationInterval == null ? null : ReplicationInterval.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}