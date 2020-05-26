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

package system.net.peertopeer;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.peertopeer.PeerNameRecordCollection;
import system.net.peertopeer.PeerName;
import system.net.peertopeer.Cloud;


/**
 * The base .NET class managing System.Net.PeerToPeer.PeerNameResolver, System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PeerNameResolver extends NetObject  {
    public static final String assemblyFullName = "System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net";
    public static final String className = "System.Net.PeerToPeer.PeerNameResolver";
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

    public PeerNameResolver(Object instance) throws Throwable {
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

    public static PeerNameResolver castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PeerNameResolver(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PeerNameResolver() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public PeerNameRecordCollection Resolve(PeerName peerName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.AccessViolationException, system.net.sockets.SocketException {
        try {
            JCObject objResolve = (JCObject)classInstance.Invoke("Resolve", (Object)peerName.getJCOInstance());
            return new PeerNameRecordCollection(objResolve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerNameRecordCollection Resolve(PeerName peerName, Cloud cloud) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.AccessViolationException, system.net.sockets.SocketException {
        try {
            JCObject objResolve = (JCObject)classInstance.Invoke("Resolve", (Object)peerName.getJCOInstance(), (Object)cloud.getJCOInstance());
            return new PeerNameRecordCollection(objResolve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerNameRecordCollection Resolve(PeerName peerName, int maxRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.AccessViolationException, system.net.sockets.SocketException {
        try {
            JCObject objResolve = (JCObject)classInstance.Invoke("Resolve", (Object)peerName.getJCOInstance(), maxRecords);
            return new PeerNameRecordCollection(objResolve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerNameRecordCollection Resolve(PeerName peerName, Cloud cloud, int maxRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.AccessViolationException, system.net.sockets.SocketException {
        try {
            JCObject objResolve = (JCObject)classInstance.Invoke("Resolve", (Object)peerName.getJCOInstance(), (Object)cloud.getJCOInstance(), maxRecords);
            return new PeerNameRecordCollection(objResolve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResolveAsync(PeerName peerName, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AccessViolationException, system.net.sockets.SocketException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("ResolveAsync", (Object)peerName.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResolveAsync(PeerName peerName, Cloud cloud, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AccessViolationException, system.net.sockets.SocketException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("ResolveAsync", (Object)peerName.getJCOInstance(), (Object)cloud.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResolveAsync(PeerName peerName, int maxRecords, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AccessViolationException, system.net.sockets.SocketException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("ResolveAsync", (Object)peerName.getJCOInstance(), maxRecords, (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResolveAsync(PeerName peerName, Cloud cloud, int maxRecords, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.threading.WaitHandleCannotBeOpenedException, system.AccessViolationException, system.net.sockets.SocketException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("ResolveAsync", (Object)peerName.getJCOInstance(), (Object)cloud.getJCOInstance(), maxRecords, (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResolveAsyncCancel(NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("ResolveAsyncCancel", (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    

}