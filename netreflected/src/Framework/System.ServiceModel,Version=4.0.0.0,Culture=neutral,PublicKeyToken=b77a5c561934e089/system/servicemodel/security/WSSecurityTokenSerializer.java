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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.security.SecurityVersion;
import system.identitymodel.tokens.SamlSerializer;
import system.servicemodel.security.SecurityStateEncoder;
import system.servicemodel.security.TrustVersion;
import system.servicemodel.security.SecureConversationVersion;
import system.xml.XmlElement;
import system.servicemodel.security.tokens.SecurityTokenReferenceStyle;
import system.identitymodel.tokens.SecurityKeyIdentifierClause;
import system.xml.XmlReader;
import system.identitymodel.tokens.SecurityToken;
import system.identitymodel.tokens.SecurityKeyIdentifier;
import system.identitymodel.selectors.SecurityTokenResolver;
import system.xml.XmlWriter;
import system.servicemodel.security.WSSecurityTokenSerializer;


/**
 * The base .NET class managing System.ServiceModel.Security.WSSecurityTokenSerializer, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class WSSecurityTokenSerializer extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Security.WSSecurityTokenSerializer";
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

    public WSSecurityTokenSerializer(Object instance) throws Throwable {
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

    public static WSSecurityTokenSerializer castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WSSecurityTokenSerializer(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WSSecurityTokenSerializer() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSSecurityTokenSerializer(boolean emitBspRequiredAttributes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(emitBspRequiredAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSSecurityTokenSerializer(SecurityVersion securityVersion) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)securityVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSSecurityTokenSerializer(SecurityVersion securityVersion, boolean emitBspRequiredAttributes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)securityVersion.getJCOInstance(), emitBspRequiredAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSSecurityTokenSerializer(SecurityVersion securityVersion, boolean emitBspRequiredAttributes, SamlSerializer samlSerializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)securityVersion.getJCOInstance(), emitBspRequiredAttributes, (Object)samlSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public SecurityKeyIdentifierClause CreateKeyIdentifierClauseFromTokenXml(XmlElement element, SecurityTokenReferenceStyle tokenReferenceStyle) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objCreateKeyIdentifierClauseFromTokenXml = (JCObject)classInstance.Invoke("CreateKeyIdentifierClauseFromTokenXml", (Object)element.getJCOInstance(), (Object)tokenReferenceStyle.getJCOInstance());
            return new SecurityKeyIdentifierClause(objCreateKeyIdentifierClauseFromTokenXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanReadToken(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanReadToken", (Object)reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanWriteToken(SecurityToken token) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanWriteToken", (Object)token.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanReadKeyIdentifier(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanReadKeyIdentifier", (Object)reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanWriteKeyIdentifier(SecurityKeyIdentifier keyIdentifier) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanWriteKeyIdentifier", (Object)keyIdentifier.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanReadKeyIdentifierClause(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanReadKeyIdentifierClause", (Object)reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanWriteKeyIdentifierClause(SecurityKeyIdentifierClause keyIdentifierClause) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanWriteKeyIdentifierClause", (Object)keyIdentifierClause.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken ReadToken(XmlReader reader, SecurityTokenResolver tokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objReadToken = (JCObject)classInstance.Invoke("ReadToken", (Object)reader.getJCOInstance(), (Object)tokenResolver.getJCOInstance());
            return new SecurityToken(objReadToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToken(XmlWriter writer, SecurityToken token) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteToken", (Object)writer.getJCOInstance(), (Object)token.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyIdentifier ReadKeyIdentifier(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objReadKeyIdentifier = (JCObject)classInstance.Invoke("ReadKeyIdentifier", (Object)reader.getJCOInstance());
            return new SecurityKeyIdentifier(objReadKeyIdentifier);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteKeyIdentifier(XmlWriter writer, SecurityKeyIdentifier keyIdentifier) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteKeyIdentifier", (Object)writer.getJCOInstance(), (Object)keyIdentifier.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyIdentifierClause ReadKeyIdentifierClause(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objReadKeyIdentifierClause = (JCObject)classInstance.Invoke("ReadKeyIdentifierClause", (Object)reader.getJCOInstance());
            return new SecurityKeyIdentifierClause(objReadKeyIdentifierClause);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteKeyIdentifierClause(XmlWriter writer, SecurityKeyIdentifierClause keyIdentifierClause) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteKeyIdentifierClause", (Object)writer.getJCOInstance(), (Object)keyIdentifierClause.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getEmitBspRequiredAttributes() throws Throwable {
        try {
            return (boolean)classInstance.Get("EmitBspRequiredAttributes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityVersion getSecurityVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityVersion");
            return new SecurityVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximumKeyDerivationOffset() throws Throwable {
        try {
            return (int)classInstance.Get("MaximumKeyDerivationOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximumKeyDerivationLabelLength() throws Throwable {
        try {
            return (int)classInstance.Get("MaximumKeyDerivationLabelLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximumKeyDerivationNonceLength() throws Throwable {
        try {
            return (int)classInstance.Get("MaximumKeyDerivationNonceLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static WSSecurityTokenSerializer getDefaultInstance() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DefaultInstance");
            return new WSSecurityTokenSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}