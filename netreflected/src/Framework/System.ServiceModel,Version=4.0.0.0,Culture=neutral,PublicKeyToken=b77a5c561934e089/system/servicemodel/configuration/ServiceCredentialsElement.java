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

package system.servicemodel.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.configuration.ServiceModelExtensionElement;
import system.configuration.Configuration;
import system.configuration.ConfigurationLockCollection;
import system.configuration.ElementInformation;
import system.servicemodel.configuration.IssuedTokenServiceElement;
import system.servicemodel.configuration.PeerCredentialElement;
import system.servicemodel.configuration.SecureConversationServiceElement;
import system.servicemodel.configuration.UserNameServiceElement;
import system.servicemodel.configuration.WindowsServiceElement;
import system.servicemodel.configuration.X509InitiatorCertificateServiceElement;
import system.servicemodel.configuration.X509RecipientCertificateServiceElement;


/**
 * The base .NET class managing System.ServiceModel.Configuration.ServiceCredentialsElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ServiceCredentialsElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Configuration.ServiceCredentialsElement";
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

    public ServiceCredentialsElement(Object instance) throws Throwable {
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

    public static ServiceCredentialsElement cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServiceCredentialsElement(from.getJCOInstance());
    }

    // Constructors section
    

    public ServiceCredentialsElement() throws Throwable, system.ArgumentNullException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean IsReadOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyFrom(ServiceModelExtensionElement from) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyFrom", from == null ? null : from.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getLockItem() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("LockItem");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLockItem(boolean LockItem) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LockItem", LockItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseIdentityConfiguration() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseIdentityConfiguration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseIdentityConfiguration(boolean UseIdentityConfiguration) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.NullReferenceException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseIdentityConfiguration", UseIdentityConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Configuration getCurrentConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentConfiguration");
            return new Configuration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockAllAttributesExcept() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LockAllAttributesExcept");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockAllElementsExcept() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LockAllElementsExcept");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockAttributes() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LockAttributes");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockElements() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LockElements");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ElementInformation getElementInformation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ElementInformation");
            return new ElementInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IssuedTokenServiceElement getIssuedTokenAuthentication() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IssuedTokenAuthentication");
            return new IssuedTokenServiceElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerCredentialElement getPeer() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Peer");
            return new PeerCredentialElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecureConversationServiceElement getSecureConversationAuthentication() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SecureConversationAuthentication");
            return new SecureConversationServiceElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UserNameServiceElement getUserNameAuthentication() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UserNameAuthentication");
            return new UserNameServiceElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WindowsServiceElement getWindowsAuthentication() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WindowsAuthentication");
            return new WindowsServiceElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509InitiatorCertificateServiceElement getClientCertificate() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientCertificate");
            return new X509InitiatorCertificateServiceElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509RecipientCertificateServiceElement getServiceCertificate() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceCertificate");
            return new X509RecipientCertificateServiceElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getConfigurationElementName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ConfigurationElementName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfigurationElementName(java.lang.String ConfigurationElementName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConfigurationElementName", ConfigurationElementName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getIdentityConfiguration() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("IdentityConfiguration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIdentityConfiguration(java.lang.String IdentityConfiguration) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.NullReferenceException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IdentityConfiguration", IdentityConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getType() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Type");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setType(java.lang.String Type) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.NullReferenceException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Type", Type);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getBehaviorType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BehaviorType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}