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

package system.workflow.runtime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.runtime.configuration.WorkflowRuntimeSection;
import system.workflow.runtime.WorkflowInstance;
import system.Guid;
import system.xml.XmlReader;


/**
 * The base .NET class managing System.Workflow.Runtime.WorkflowRuntime, System.Workflow.Runtime, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowRuntime extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.Runtime, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.Runtime";
    public static final String className = "System.Workflow.Runtime.WorkflowRuntime";
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

    public WorkflowRuntime(Object instance) throws Throwable {
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

    public static WorkflowRuntime castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowRuntime(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowRuntime() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.SystemException, system.threading.AbandonedMutexException, system.runtime.remoting.RemotingException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowRuntime(java.lang.String configSectionName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.SystemException, system.threading.AbandonedMutexException, system.runtime.remoting.RemotingException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)configSectionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowRuntime(WorkflowRuntimeSection settings) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.SystemException, system.threading.AbandonedMutexException, system.runtime.remoting.RemotingException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)settings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Dispose() throws Throwable, system.ArgumentException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.runtime.remoting.RemotingException, system.FormatException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.resources.MissingManifestResourceException, system.NotSupportedException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowInstance GetWorkflow(Guid instanceId) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.workflow.componentmodel.compiler.WorkflowValidationFailedException, system.IndexOutOfRangeException, system.xml.XmlException, system.UnauthorizedAccessException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException {
        try {
            JCObject objGetWorkflow = (JCObject)classInstance.Invoke("GetWorkflow", (Object)instanceId.getJCOInstance());
            return new WorkflowInstance(objGetWorkflow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowInstance CreateWorkflow(NetType workflowType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.workflow.runtime.tracking.TrackingProfileDeserializationException, system.security.cryptography.CryptographicException, system.ApplicationException, system.security.SecurityException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.OverflowException, system.xml.XmlException {
        try {
            JCObject objCreateWorkflow = (JCObject)classInstance.Invoke("CreateWorkflow", (Object)workflowType.getJCOInstance());
            return new WorkflowInstance(objCreateWorkflow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowInstance CreateWorkflow(XmlReader workflowDefinitionReader) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.InvalidOperationException, system.MulticastNotSupportedException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.OverflowException, system.xml.XmlException, system.UnauthorizedAccessException, system.workflow.componentmodel.compiler.WorkflowValidationFailedException {
        try {
            JCObject objCreateWorkflow = (JCObject)classInstance.Invoke("CreateWorkflow", (Object)workflowDefinitionReader.getJCOInstance());
            return new WorkflowInstance(objCreateWorkflow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddService(NetObject service) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.FormatException {
        try {
            classInstance.Invoke("AddService", (Object)service.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveService(NetObject service) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.collections.generic.KeyNotFoundException, system.FormatException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("RemoveService", (Object)service.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetService(NetType serviceType) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.ArgumentException, system.collections.generic.KeyNotFoundException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException {
        try {
            JCObject objGetService = (JCObject)classInstance.Invoke("GetService", (Object)serviceType.getJCOInstance());
            return new NetObject(objGetService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StartRuntime() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.workflow.componentmodel.compiler.WorkflowValidationFailedException, system.xml.schema.XmlSchemaException, system.xml.XmlException, system.workflow.runtime.tracking.TrackingProfileDeserializationException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.io.IOException, system.ApplicationException {
        try {
            classInstance.Invoke("StartRuntime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StopRuntime() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.transactions.TransactionAbortedException, system.workflow.runtime.hosting.PersistenceException, system.workflow.componentmodel.compiler.WorkflowValidationFailedException, system.xml.schema.XmlSchemaException, system.xml.XmlException, system.workflow.runtime.tracking.TrackingProfileDeserializationException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.io.IOException, system.ApplicationException {
        try {
            classInstance.Invoke("StopRuntime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsStarted() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsStarted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    

}