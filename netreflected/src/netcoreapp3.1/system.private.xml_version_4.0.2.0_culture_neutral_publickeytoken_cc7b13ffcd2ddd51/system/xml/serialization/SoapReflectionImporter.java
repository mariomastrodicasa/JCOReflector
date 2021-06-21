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

package system.xml.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.serialization.SoapAttributeOverrides;
import system.xml.serialization.XmlMembersMapping;
import system.xml.serialization.XmlReflectionMember;
import system.xml.serialization.XmlMappingAccess;
import system.xml.serialization.XmlTypeMapping;
import system.reflection.ICustomAttributeProvider;
import system.reflection.ICustomAttributeProviderImplementation;


/**
 * The base .NET class managing System.Xml.Serialization.SoapReflectionImporter, System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.SoapReflectionImporter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.SoapReflectionImporter</a>
 */
public class SoapReflectionImporter extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Private.Xml
     */
    public static final String assemblyShortName = "System.Private.Xml";
    /**
     * Qualified class name: System.Xml.Serialization.SoapReflectionImporter
     */
    public static final String className = "System.Xml.Serialization.SoapReflectionImporter";
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

    public SoapReflectionImporter(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SoapReflectionImporter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SoapReflectionImporter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SoapReflectionImporter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SoapReflectionImporter(from.getJCOInstance());
    }

    // Constructors section
    
    public SoapReflectionImporter() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapReflectionImporter(java.lang.String defaultNamespace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(defaultNamespace));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapReflectionImporter(SoapAttributeOverrides attributeOverrides) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attributeOverrides == null ? null : attributeOverrides.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapReflectionImporter(SoapAttributeOverrides attributeOverrides, java.lang.String defaultNamespace) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attributeOverrides == null ? null : attributeOverrides.getJCOInstance(), defaultNamespace));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members));
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean writeAccessors) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement, writeAccessors);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean writeAccessors, boolean validate) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement, writeAccessors, validate);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean writeAccessors, boolean validate, XmlMappingAccess access) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement, writeAccessors, validate, access == null ? null : access.getJCOInstance());
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", type == null ? null : type.getJCOInstance());
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type, java.lang.String defaultNamespace) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", type == null ? null : type.getJCOInstance(), defaultNamespace);
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void IncludeType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("IncludeType", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void IncludeTypes(ICustomAttributeProvider provider) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("IncludeTypes", provider == null ? null : provider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}