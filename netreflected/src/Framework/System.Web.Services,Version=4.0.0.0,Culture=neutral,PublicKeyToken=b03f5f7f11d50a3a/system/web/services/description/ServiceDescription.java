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

package system.web.services.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.services.description.NamedItem;
import system.xml.XmlReader;
import system.web.services.description.ServiceDescription;
import system.io.Stream;
import system.io.TextReader;
import system.io.TextWriter;
import system.xml.XmlWriter;
import system.collections.specialized.StringCollection;
import system.web.services.description.BindingCollection;
import system.web.services.description.ImportCollection;
import system.web.services.description.MessageCollection;
import system.web.services.description.PortTypeCollection;
import system.web.services.description.ServiceCollection;
import system.web.services.description.ServiceDescriptionCollection;
import system.web.services.description.ServiceDescriptionFormatExtensionCollection;
import system.web.services.description.Types;
import system.xml.schema.XmlSchema;
import system.xml.serialization.XmlSerializer;


/**
 * The base .NET class managing System.Web.Services.Description.ServiceDescription, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Services.Description.ServiceDescription" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Services.Description.ServiceDescription</a>
 */
public class ServiceDescription extends NamedItem  {
    /**
     * Fully assembly qualified name: System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web.Services
     */
    public static final String assemblyShortName = "System.Web.Services";
    /**
     * Qualified class name: System.Web.Services.Description.ServiceDescription
     */
    public static final String className = "System.Web.Services.Description.ServiceDescription";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public ServiceDescription(Object instance) throws Throwable {
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServiceDescription}, a cast assert is made to check if types are compatible.
     */
    public static ServiceDescription cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServiceDescription(from.getJCOInstance());
    }

    // Constructors section
    
    public ServiceDescription() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean CanRead(XmlReader reader) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.OutOfMemoryException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.FormatException, system.UriFormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.RankException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanRead", reader == null ? null : reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(Stream stream) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.RankException, system.MulticastNotSupportedException, system.MemberAccessException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", stream == null ? null : stream.getJCOInstance());
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(Stream stream, boolean validate) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.NullReferenceException, system.RankException, system.FormatException, system.MulticastNotSupportedException, system.MemberAccessException, system.io.PathTooLongException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", stream == null ? null : stream.getJCOInstance(), validate);
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(TextReader textReader) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.RankException, system.MulticastNotSupportedException, system.MemberAccessException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", textReader == null ? null : textReader.getJCOInstance());
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(TextReader textReader, boolean validate) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.NullReferenceException, system.RankException, system.FormatException, system.MulticastNotSupportedException, system.MemberAccessException, system.io.PathTooLongException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", textReader == null ? null : textReader.getJCOInstance(), validate);
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(java.lang.String fileName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.SecurityException, system.io.IOException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.RankException, system.MulticastNotSupportedException, system.MemberAccessException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", fileName);
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(java.lang.String fileName, boolean validate) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.security.SecurityException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.RankException, system.MulticastNotSupportedException, system.MemberAccessException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", fileName, validate);
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(XmlReader reader) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.NullReferenceException, system.RankException, system.threading.AbandonedMutexException, system.FormatException, system.MulticastNotSupportedException, system.MemberAccessException, system.io.PathTooLongException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", reader == null ? null : reader.getJCOInstance());
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServiceDescription Read(XmlReader reader, boolean validate) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.NotImplementedException, system.NotSupportedException, system.configuration.ConfigurationException, system.RankException, system.FormatException, system.MulticastNotSupportedException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.web.HttpException, system.web.HttpRequestValidationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", reader == null ? null : reader.getJCOInstance(), validate);
            return new ServiceDescription(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Stream stream) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.MemberAccessException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.RankException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(TextWriter writer) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.security.SecurityException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.RankException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String fileName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NullReferenceException, system.security.SecurityException, system.io.IOException, system.NotImplementedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.MemberAccessException, system.FormatException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.RankException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(XmlWriter writer) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.OutOfMemoryException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.FormatException, system.UriFormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.RankException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public StringCollection getValidationWarnings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ValidationWarnings");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRetrievalUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RetrievalUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRetrievalUrl(java.lang.String RetrievalUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RetrievalUrl", RetrievalUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetNamespace() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetNamespace(java.lang.String TargetNamespace) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetNamespace", TargetNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingCollection getBindings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Bindings");
            return new BindingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ImportCollection getImports() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Imports");
            return new ImportCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageCollection getMessages() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Messages");
            return new MessageCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PortTypeCollection getPortTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PortTypes");
            return new PortTypeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceCollection getServices() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Services");
            return new ServiceCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescriptionCollection getServiceDescriptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceDescriptions");
            return new ServiceDescriptionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Types getTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Types");
            return new Types(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypes(Types Types) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Types", Types == null ? null : Types.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSchema getSchema() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.resources.MissingManifestResourceException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.UriFormatException, system.NullReferenceException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Schema");
            return new XmlSchema(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSerializer getSerializer() throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.FormatException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.RankException, system.collections.generic.KeyNotFoundException, system.UnauthorizedAccessException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Serializer");
            return new XmlSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}