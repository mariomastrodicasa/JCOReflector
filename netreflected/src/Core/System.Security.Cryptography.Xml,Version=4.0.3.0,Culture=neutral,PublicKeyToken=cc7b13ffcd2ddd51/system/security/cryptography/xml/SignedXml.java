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

package system.security.cryptography.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlDocument;
import system.xml.XmlElement;
import system.security.cryptography.xml.Reference;
import system.security.cryptography.xml.DataObject;
import system.security.cryptography.AsymmetricAlgorithm;
import system.security.cryptography.KeyedHashAlgorithm;
import system.security.cryptography.x509certificates.X509Certificate2;
import system.xml.XmlResolver;
import system.security.cryptography.xml.EncryptedXml;
import system.security.cryptography.xml.Signature;
import system.security.cryptography.xml.SignedInfo;
import system.security.cryptography.xml.KeyInfo;


/**
 * The base .NET class managing System.Security.Cryptography.Xml.SignedXml, System.Security.Cryptography.Xml, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class SignedXml extends NetObject  {
    public static final String assemblyFullName = "System.Security.Cryptography.Xml, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Security.Cryptography.Xml";
    public static final String className = "System.Security.Cryptography.Xml.SignedXml";
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

    public SignedXml(Object instance) throws Throwable {
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

    public static SignedXml castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SignedXml(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SignedXml() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.ArgumentException, system.TypeLoadException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedXml(XmlDocument document) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.ArgumentException, system.TypeLoadException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)document.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedXml(XmlElement elem) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.ArgumentException, system.TypeLoadException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)elem.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public XmlElement GetXml() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.ObjectDisposedException, system.security.cryptography.CryptographicUnexpectedOperationException, system.OutOfMemoryException {
        try {
            JCObject objGetXml = (JCObject)classInstance.Invoke("GetXml");
            return new XmlElement(objGetXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadXml(XmlElement value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException {
        try {
            classInstance.Invoke("LoadXml", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddReference(Reference reference) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("AddReference", (Object)reference.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddObject(DataObject dataObject) throws Throwable {
        try {
            classInstance.Invoke("AddObject", (Object)dataObject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckSignature() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.security.cryptography.CryptographicException, system.security.cryptography.CryptographicUnexpectedOperationException, system.xml.XmlException, system.xml.xpath.XPathException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CheckSignature");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckSignature(AsymmetricAlgorithm key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.TypeLoadException, system.xml.XmlException, system.security.cryptography.CryptographicUnexpectedOperationException, system.OutOfMemoryException, system.xml.schema.XmlSchemaException, system.xml.xpath.XPathException {
        try {
            return (boolean)classInstance.Invoke("CheckSignature", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckSignature(KeyedHashAlgorithm macAlg) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.xml.XmlException, system.security.cryptography.CryptographicUnexpectedOperationException, system.OutOfMemoryException, system.xml.schema.XmlSchemaException, system.xml.xpath.XPathException {
        try {
            return (boolean)classInstance.Invoke("CheckSignature", (Object)macAlg.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckSignature(X509Certificate2 certificate, boolean verifySignatureOnly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException, system.reflection.TargetInvocationException, system.TypeLoadException, system.xml.XmlException, system.security.cryptography.CryptographicUnexpectedOperationException, system.xml.xpath.XPathException {
        try {
            return (boolean)classInstance.Invoke("CheckSignature", (Object)certificate.getJCOInstance(), verifySignatureOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ComputeSignature() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.RankException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException, system.OutOfMemoryException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            classInstance.Invoke("ComputeSignature");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ComputeSignature(KeyedHashAlgorithm macAlg) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.RankException, system.xml.XmlException, system.ArrayTypeMismatchException, system.TypeLoadException, system.FormatException, system.xml.xpath.XPathException, system.OutOfMemoryException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            classInstance.Invoke("ComputeSignature", (Object)macAlg.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetIdElement(XmlDocument document, java.lang.String idValue) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        try {
            JCObject objGetIdElement = (JCObject)classInstance.Invoke("GetIdElement", (Object)document.getJCOInstance(), (Object)idValue);
            return new XmlElement(objGetIdElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getSigningKeyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SigningKeyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSigningKeyName(java.lang.String SigningKeyName) throws Throwable {
        try {
            classInstance.Set("SigningKeyName", (Object)SigningKeyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResolver(XmlResolver Resolver) throws Throwable {
        try {
            classInstance.Set("Resolver", (Object)Resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricAlgorithm getSigningKey() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SigningKey");
            return new AsymmetricAlgorithm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSigningKey(AsymmetricAlgorithm SigningKey) throws Throwable {
        try {
            classInstance.Set("SigningKey", (Object)SigningKey.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncryptedXml getEncryptedXml() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EncryptedXml");
            return new EncryptedXml(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncryptedXml(EncryptedXml EncryptedXml) throws Throwable {
        try {
            classInstance.Set("EncryptedXml", (Object)EncryptedXml.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Signature getSignature() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Signature");
            return new Signature(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedInfo getSignedInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SignedInfo");
            return new SignedInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignatureMethod() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SignatureMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignatureLength() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SignatureLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSignatureValue() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SignatureValue");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSignatureValue = 0; indexSignatureValue < resultingArrayList.size(); indexSignatureValue++ ) {
				resultingArray[indexSignatureValue] = (byte)resultingArrayList.get(indexSignatureValue);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyInfo getKeyInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyInfo");
            return new KeyInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyInfo(KeyInfo KeyInfo) throws Throwable {
        try {
            classInstance.Set("KeyInfo", (Object)KeyInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}