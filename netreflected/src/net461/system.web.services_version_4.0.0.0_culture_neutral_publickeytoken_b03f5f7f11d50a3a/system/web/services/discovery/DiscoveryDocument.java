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

package system.web.services.discovery;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlReader;
import system.web.services.discovery.DiscoveryDocument;
import system.io.Stream;
import system.io.TextReader;
import system.io.TextWriter;
import system.xml.XmlWriter;
import system.collections.IList;
import system.collections.IListImplementation;


/**
 * The base .NET class managing System.Web.Services.Discovery.DiscoveryDocument, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Services.Discovery.DiscoveryDocument" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Services.Discovery.DiscoveryDocument</a>
 */
public class DiscoveryDocument extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web.Services
     */
    public static final String assemblyShortName = "System.Web.Services";
    /**
     * Qualified class name: System.Web.Services.Discovery.DiscoveryDocument
     */
    public static final String className = "System.Web.Services.Discovery.DiscoveryDocument";
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

    public DiscoveryDocument(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DiscoveryDocument}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DiscoveryDocument} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DiscoveryDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DiscoveryDocument(from.getJCOInstance());
    }

    // Constructors section
    
    public DiscoveryDocument() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean CanRead(XmlReader xmlReader) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CanRead", xmlReader == null ? null : xmlReader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DiscoveryDocument Read(Stream stream) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.NullReferenceException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.web.HttpException, system.web.HttpRequestValidationException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", stream == null ? null : stream.getJCOInstance());
            return new DiscoveryDocument(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DiscoveryDocument Read(TextReader reader) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.NullReferenceException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.web.HttpException, system.web.HttpRequestValidationException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", reader == null ? null : reader.getJCOInstance());
            return new DiscoveryDocument(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DiscoveryDocument Read(XmlReader xmlReader) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.MulticastNotSupportedException, system.FormatException, system.xml.XmlException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", xmlReader == null ? null : xmlReader.getJCOInstance());
            return new DiscoveryDocument(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Stream stream) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(TextWriter writer) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(XmlWriter writer) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.MulticastNotSupportedException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IList getReferences() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("References");
            return new IListImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}