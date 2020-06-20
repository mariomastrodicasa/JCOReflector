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

package system.xml.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.codedom.CodeNamespace;
import system.codedom.CodeCompileUnit;
import system.xml.serialization.CodeGenerationOptions;
import system.collections.Hashtable;
import system.codedom.compiler.CodeDomProvider;
import system.xml.serialization.XmlTypeMapping;
import system.xml.serialization.XmlMembersMapping;
import system.codedom.CodeAttributeDeclarationCollection;
import system.xml.serialization.XmlMemberMapping;


/**
 * The base .NET class managing System.Xml.Serialization.XmlCodeExporter, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlCodeExporter extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Serialization.XmlCodeExporter";
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

    public XmlCodeExporter(Object instance) throws Throwable {
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

    public static XmlCodeExporter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlCodeExporter(from.getJCOInstance());
    }

    // Constructors section
    

    public XmlCodeExporter(CodeNamespace codeNamespace) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(codeNamespace == null ? null : codeNamespace.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlCodeExporter(CodeNamespace codeNamespace, CodeCompileUnit codeCompileUnit) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(codeNamespace == null ? null : codeNamespace.getJCOInstance(), codeCompileUnit == null ? null : codeCompileUnit.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlCodeExporter(CodeNamespace codeNamespace, CodeCompileUnit codeCompileUnit, CodeGenerationOptions options) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(codeNamespace == null ? null : codeNamespace.getJCOInstance(), codeCompileUnit == null ? null : codeCompileUnit.getJCOInstance(), options == null ? null : options.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlCodeExporter(CodeNamespace codeNamespace, CodeCompileUnit codeCompileUnit, CodeGenerationOptions options, Hashtable mappings) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(codeNamespace == null ? null : codeNamespace.getJCOInstance(), codeCompileUnit == null ? null : codeCompileUnit.getJCOInstance(), options == null ? null : options.getJCOInstance(), mappings == null ? null : mappings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlCodeExporter(CodeNamespace codeNamespace, CodeCompileUnit codeCompileUnit, CodeDomProvider codeProvider, CodeGenerationOptions options, Hashtable mappings) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(codeNamespace == null ? null : codeNamespace.getJCOInstance(), codeCompileUnit == null ? null : codeCompileUnit.getJCOInstance(), codeProvider == null ? null : codeProvider.getJCOInstance(), options == null ? null : options.getJCOInstance(), mappings == null ? null : mappings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void ExportTypeMapping(XmlTypeMapping xmlTypeMapping) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ExportTypeMapping", xmlTypeMapping == null ? null : xmlTypeMapping.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ExportMembersMapping(XmlMembersMapping xmlMembersMapping) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ExportMembersMapping", xmlMembersMapping == null ? null : xmlMembersMapping.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddMappingMetadata(CodeAttributeDeclarationCollection metadata, XmlTypeMapping mapping, java.lang.String ns) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddMappingMetadata", metadata == null ? null : metadata.getJCOInstance(), mapping == null ? null : mapping.getJCOInstance(), ns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddMappingMetadata(CodeAttributeDeclarationCollection metadata, XmlMemberMapping member, java.lang.String ns, boolean forceUseMemberName) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.FormatException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddMappingMetadata", metadata == null ? null : metadata.getJCOInstance(), member == null ? null : member.getJCOInstance(), ns, forceUseMemberName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddMappingMetadata(CodeAttributeDeclarationCollection metadata, XmlMemberMapping member, java.lang.String ns) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.FormatException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddMappingMetadata", metadata == null ? null : metadata.getJCOInstance(), member == null ? null : member.getJCOInstance(), ns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public CodeAttributeDeclarationCollection getIncludeMetadata() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IncludeMetadata");
            return new CodeAttributeDeclarationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}