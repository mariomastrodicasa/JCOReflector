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

package system.servicemodel.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import system.activities.Activity;
import system.servicemodel.activities.WorkflowService;
import system.servicemodel.description.ServiceEndpoint;
import system.xml.linq.XName;
import system.TimeSpan;
import system.activities.hosting.WorkflowInstanceExtensionManager;
import system.servicemodel.activities.DurableInstancingOptions;
import system.servicemodel.description.ServiceAuthorizationBehavior;
import system.servicemodel.description.ServiceAuthenticationBehavior;
import system.servicemodel.dispatcher.ChannelDispatcherCollection;
import system.servicemodel.description.ServiceCredentials;
import system.servicemodel.description.ServiceDescription;
import system.servicemodel.CommunicationState;
import system.EventHandler;


/**
 * The base .NET class managing System.ServiceModel.Activities.WorkflowServiceHost, System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowServiceHost extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.ServiceModel.Activities";
    public static final String className = "System.ServiceModel.Activities.WorkflowServiceHost";
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

    public WorkflowServiceHost(Object instance) throws Throwable {
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

    public static WorkflowServiceHost castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowServiceHost(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowServiceHost(NetObject serviceImplementation, Uri... baseAddresses) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.globalization.CultureNotFoundException, system.net.sockets.SocketException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)serviceImplementation.getJCOInstance(), (Object[])toObjectFromArray(baseAddresses));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowServiceHost(Activity activity, Uri... baseAddresses) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.globalization.CultureNotFoundException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)activity.getJCOInstance(), (Object[])toObjectFromArray(baseAddresses));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowServiceHost(WorkflowService serviceDefinition, Uri... baseAddresses) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.FormatException, system.globalization.CultureNotFoundException, system.net.sockets.SocketException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)serviceDefinition.getJCOInstance(), (Object[])toObjectFromArray(baseAddresses));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public ServiceEndpoint AddServiceEndpoint(XName serviceContractName, system.servicemodel.channels.Binding binding, java.lang.String address, Uri listenUri, java.lang.String behaviorConfigurationName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.configuration.ConfigurationException, system.UriFormatException, system.OutOfMemoryException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.xml.XmlException {
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", (Object)serviceContractName.getJCOInstance(), (Object)binding.getJCOInstance(), (Object)address, (Object)listenUri.getJCOInstance(), (Object)behaviorConfigurationName);
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(XName serviceContractName, system.servicemodel.channels.Binding binding, Uri address, Uri listenUri, java.lang.String behaviorConfigurationName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.OverflowException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.NotImplementedException {
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", (Object)serviceContractName.getJCOInstance(), (Object)binding.getJCOInstance(), (Object)address.getJCOInstance(), (Object)listenUri.getJCOInstance(), (Object)behaviorConfigurationName);
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, java.lang.String address) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.UriFormatException {
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", (Object)implementedContract, (Object)binding.getJCOInstance(), (Object)address);
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, Uri address) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", (Object)implementedContract, (Object)binding.getJCOInstance(), (Object)address.getJCOInstance());
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, java.lang.String address, Uri listenUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", (Object)implementedContract, (Object)binding.getJCOInstance(), (Object)address, (Object)listenUri.getJCOInstance());
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, Uri address, Uri listenUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", (Object)implementedContract, (Object)binding.getJCOInstance(), (Object)address.getJCOInstance(), (Object)listenUri.getJCOInstance());
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddServiceEndpoint(ServiceEndpoint endpoint) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            classInstance.Invoke("AddServiceEndpoint", (Object)endpoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IncrementManualFlowControlLimit(int incrementBy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("IncrementManualFlowControlLimit", incrementBy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetEndpointAddress(ServiceEndpoint endpoint, java.lang.String relativeAddress) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.configuration.ConfigurationException, system.UriFormatException {
        try {
            classInstance.Invoke("SetEndpointAddress", (Object)endpoint.getJCOInstance(), (Object)relativeAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close(TimeSpan timeout) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        try {
            classInstance.Invoke("Close", (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open(TimeSpan timeout) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        try {
            classInstance.Invoke("Open", (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Activity getActivity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Activity");
            return new Activity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowInstanceExtensionManager getWorkflowExtensions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WorkflowExtensions");
            return new WorkflowInstanceExtensionManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DurableInstancingOptions getDurableInstancingOptions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DurableInstancingOptions");
            return new DurableInstancingOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceAuthorizationBehavior getAuthorization() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Authorization");
            return new ServiceAuthorizationBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceAuthenticationBehavior getAuthentication() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Authentication");
            return new ServiceAuthenticationBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChannelDispatcherCollection getChannelDispatchers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ChannelDispatchers");
            return new ChannelDispatcherCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getCloseTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CloseTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCloseTimeout(TimeSpan CloseTimeout) throws Throwable {
        try {
            classInstance.Set("CloseTimeout", (Object)CloseTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceCredentials getCredentials() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Credentials");
            return new ServiceCredentials(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescription getDescription() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Description");
            return new ServiceDescription(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getManualFlowControlLimit() throws Throwable {
        try {
            return (int)classInstance.Get("ManualFlowControlLimit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManualFlowControlLimit(int ManualFlowControlLimit) throws Throwable {
        try {
            classInstance.Set("ManualFlowControlLimit", ManualFlowControlLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getOpenTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OpenTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpenTimeout(TimeSpan OpenTimeout) throws Throwable {
        try {
            classInstance.Set("OpenTimeout", (Object)OpenTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommunicationState getState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new CommunicationState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addClosed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Closed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeClosed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Closed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addClosing(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Closing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeClosing(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Closing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFaulted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Faulted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFaulted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Faulted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addOpened(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Opened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeOpened(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Opened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addOpening(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Opening", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeOpening(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Opening", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}