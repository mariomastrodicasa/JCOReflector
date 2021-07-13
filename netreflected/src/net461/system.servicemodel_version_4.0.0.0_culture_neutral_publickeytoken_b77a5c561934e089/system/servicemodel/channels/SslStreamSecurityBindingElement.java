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

package system.servicemodel.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.channels.StreamUpgradeBindingElement;
import system.servicemodel.channels.BindingElement;
import system.servicemodel.channels.StreamUpgradeProvider;
import system.servicemodel.channels.BindingContext;
import system.xml.XmlElement;
import system.servicemodel.description.MetadataExporter;
import system.servicemodel.description.PolicyConversionContext;
import system.security.authentication.SslProtocols;
import system.servicemodel.security.IdentityVerifier;
import system.servicemodel.description.IPolicyExportExtension;
import system.servicemodel.description.IPolicyExportExtensionImplementation;


/**
 * The base .NET class managing System.ServiceModel.Channels.SslStreamSecurityBindingElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Channels.SslStreamSecurityBindingElement" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Channels.SslStreamSecurityBindingElement</a>
 */
public class SslStreamSecurityBindingElement extends StreamUpgradeBindingElement implements system.servicemodel.description.IPolicyExportExtension {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Channels.SslStreamSecurityBindingElement
     */
    public static final String className = "System.ServiceModel.Channels.SslStreamSecurityBindingElement";
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

    public SslStreamSecurityBindingElement(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SslStreamSecurityBindingElement}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SslStreamSecurityBindingElement} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SslStreamSecurityBindingElement cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SslStreamSecurityBindingElement(from.getJCOInstance());
    }

    // Constructors section
    
    public SslStreamSecurityBindingElement() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean ShouldSerializeIdentityVerifier() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeIdentityVerifier");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingElement Clone() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new BindingElement(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StreamUpgradeProvider BuildClientStreamUpgradeProvider(BindingContext context) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuildClientStreamUpgradeProvider = (JCObject)classInstance.Invoke("BuildClientStreamUpgradeProvider", context == null ? null : context.getJCOInstance());
            return new StreamUpgradeProvider(objBuildClientStreamUpgradeProvider);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StreamUpgradeProvider BuildServerStreamUpgradeProvider(BindingContext context) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.UriFormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuildServerStreamUpgradeProvider = (JCObject)classInstance.Invoke("BuildServerStreamUpgradeProvider", context == null ? null : context.getJCOInstance());
            return new StreamUpgradeProvider(objBuildServerStreamUpgradeProvider);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetTransportTokenAssertion() throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTransportTokenAssertion = (JCObject)classInstance.Invoke("GetTransportTokenAssertion");
            return new XmlElement(objGetTransportTokenAssertion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIPolicyExportExtension method available in IPolicyExportExtension to obtain an object with an invocable method
     */
    @Deprecated 
    public void ExportPolicy(MetadataExporter exporter, PolicyConversionContext context) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIPolicyExportExtension to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getRequireClientCertificate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RequireClientCertificate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequireClientCertificate(boolean RequireClientCertificate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RequireClientCertificate", RequireClientCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SslProtocols getSslProtocols() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SslProtocols");
            return new SslProtocols(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSslProtocols(SslProtocols SslProtocols) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SslProtocols", SslProtocols == null ? null : SslProtocols.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityVerifier getIdentityVerifier() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IdentityVerifier");
            return new IdentityVerifier(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIdentityVerifier(IdentityVerifier IdentityVerifier) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IdentityVerifier", IdentityVerifier == null ? null : IdentityVerifier.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}