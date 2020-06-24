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

package system.security.cryptography.x509certificates;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.x509certificates.X500DistinguishedName;
import system.security.cryptography.ECDsa;
import system.security.cryptography.HashAlgorithmName;
import system.security.cryptography.RSA;
import system.security.cryptography.RSASignaturePadding;
import system.security.cryptography.x509certificates.PublicKey;
import system.security.cryptography.x509certificates.X509SignatureGenerator;
import system.security.cryptography.x509certificates.X509Certificate2;
import system.DateTimeOffset;


/**
 * The base .NET class managing System.Security.Cryptography.X509Certificates.CertificateRequest, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class CertificateRequest extends NetObject  {
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Core";
    public static final String className = "System.Security.Cryptography.X509Certificates.CertificateRequest";
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

    public CertificateRequest(Object instance) throws Throwable {
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

    public static CertificateRequest cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CertificateRequest(from.getJCOInstance());
    }

    // Constructors section
    

    public CertificateRequest(X500DistinguishedName subjectName, ECDsa key, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(subjectName == null ? null : subjectName.getJCOInstance(), key == null ? null : key.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertificateRequest(X500DistinguishedName subjectName, RSA key, HashAlgorithmName hashAlgorithm, RSASignaturePadding padding) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(subjectName == null ? null : subjectName.getJCOInstance(), key == null ? null : key.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), padding == null ? null : padding.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertificateRequest(X500DistinguishedName subjectName, PublicKey publicKey, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(subjectName == null ? null : subjectName.getJCOInstance(), publicKey == null ? null : publicKey.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertificateRequest(java.lang.String subjectName, ECDsa key, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(subjectName, key == null ? null : key.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertificateRequest(java.lang.String subjectName, RSA key, HashAlgorithmName hashAlgorithm, RSASignaturePadding padding) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(subjectName, key == null ? null : key.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), padding == null ? null : padding.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public byte[] CreateSigningRequest() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CreateSigningRequest");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCreateSigningRequest = 0; indexCreateSigningRequest < resultingArrayList.size(); indexCreateSigningRequest++ ) {
				resultingArray[indexCreateSigningRequest] = (byte)resultingArrayList.get(indexCreateSigningRequest);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] CreateSigningRequest(X509SignatureGenerator signatureGenerator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CreateSigningRequest", signatureGenerator == null ? null : signatureGenerator.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCreateSigningRequest = 0; indexCreateSigningRequest < resultingArrayList.size(); indexCreateSigningRequest++ ) {
				resultingArray[indexCreateSigningRequest] = (byte)resultingArrayList.get(indexCreateSigningRequest);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate2 Create(X500DistinguishedName issuerName, X509SignatureGenerator generator, DateTimeOffset notBefore, DateTimeOffset notAfter, byte[] serialNumber) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", issuerName == null ? null : issuerName.getJCOInstance(), generator == null ? null : generator.getJCOInstance(), notBefore == null ? null : notBefore.getJCOInstance(), notAfter == null ? null : notAfter.getJCOInstance(), serialNumber);
            return new X509Certificate2(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate2 Create(X509Certificate2 issuerCertificate, DateTimeOffset notBefore, DateTimeOffset notAfter, byte[] serialNumber) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.security.SecurityException, system.ApplicationException, system.NotSupportedException, system.io.IOException, system.AccessViolationException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NullReferenceException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create", issuerCertificate == null ? null : issuerCertificate.getJCOInstance(), notBefore == null ? null : notBefore.getJCOInstance(), notAfter == null ? null : notAfter.getJCOInstance(), serialNumber);
            return new X509Certificate2(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate2 CreateSelfSigned(DateTimeOffset notBefore, DateTimeOffset notAfter) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.ApplicationException, system.io.IOException, system.security.cryptography.CryptographicException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.AccessViolationException, system.NullReferenceException, system.PlatformNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSelfSigned = (JCObject)classInstance.Invoke("CreateSelfSigned", notBefore == null ? null : notBefore.getJCOInstance(), notAfter == null ? null : notAfter.getJCOInstance());
            return new X509Certificate2(objCreateSelfSigned);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public HashAlgorithmName getHashAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HashAlgorithm");
            return new HashAlgorithmName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicKey getPublicKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PublicKey");
            return new PublicKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X500DistinguishedName getSubjectName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SubjectName");
            return new X500DistinguishedName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}