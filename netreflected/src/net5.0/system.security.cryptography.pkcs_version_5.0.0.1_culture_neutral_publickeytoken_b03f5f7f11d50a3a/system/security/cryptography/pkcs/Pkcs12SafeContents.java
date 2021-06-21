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

package system.security.cryptography.pkcs;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.pkcs.Pkcs12CertBag;
import system.security.cryptography.x509certificates.X509Certificate2;
import system.security.cryptography.pkcs.Pkcs12KeyBag;
import system.security.cryptography.AsymmetricAlgorithm;
import system.security.cryptography.pkcs.Pkcs12SafeContentsBag;
import system.security.cryptography.pkcs.Pkcs12SafeContents;
import system.security.cryptography.pkcs.Pkcs12SecretBag;
import system.security.cryptography.Oid;
import system.security.cryptography.pkcs.Pkcs12ShroudedKeyBag;
import system.security.cryptography.PbeParameters;
import system.security.cryptography.pkcs.Pkcs12SafeBag;
import system.security.cryptography.pkcs.Pkcs12ConfidentialityMode;


/**
 * The base .NET class managing System.Security.Cryptography.Pkcs.Pkcs12SafeContents, System.Security.Cryptography.Pkcs, Version=5.0.0.1, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.Pkcs.Pkcs12SafeContents" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.Pkcs.Pkcs12SafeContents</a>
 */
public class Pkcs12SafeContents extends NetObject  {
    /**
     * Fully assembly qualified name: System.Security.Cryptography.Pkcs, Version=5.0.0.1, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Cryptography.Pkcs, Version=5.0.0.1, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Cryptography.Pkcs
     */
    public static final String assemblyShortName = "System.Security.Cryptography.Pkcs";
    /**
     * Qualified class name: System.Security.Cryptography.Pkcs.Pkcs12SafeContents
     */
    public static final String className = "System.Security.Cryptography.Pkcs.Pkcs12SafeContents";
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

    public Pkcs12SafeContents(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Pkcs12SafeContents}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Pkcs12SafeContents} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Pkcs12SafeContents cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Pkcs12SafeContents(from.getJCOInstance());
    }

    // Constructors section
    
    public Pkcs12SafeContents() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public Pkcs12CertBag AddCertificate(X509Certificate2 certificate) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.security.cryptography.CryptographicException, system.OverflowException, system.formats.asn1.AsnContentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddCertificate = (JCObject)classInstance.Invoke("AddCertificate", certificate == null ? null : certificate.getJCOInstance());
            return new Pkcs12CertBag(objAddCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12KeyBag AddKeyUnencrypted(AsymmetricAlgorithm key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.NotImplementedException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddKeyUnencrypted = (JCObject)classInstance.Invoke("AddKeyUnencrypted", key == null ? null : key.getJCOInstance());
            return new Pkcs12KeyBag(objAddKeyUnencrypted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12SafeContentsBag AddNestedContents(Pkcs12SafeContents safeContents) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.formats.asn1.AsnContentException, system.OverflowException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddNestedContents = (JCObject)classInstance.Invoke("AddNestedContents", safeContents == null ? null : safeContents.getJCOInstance());
            return new Pkcs12SafeContentsBag(objAddNestedContents);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12ShroudedKeyBag AddShroudedKey(AsymmetricAlgorithm key, byte[] passwordBytes, PbeParameters pbeParameters) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.ArrayTypeMismatchException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddShroudedKey = (JCObject)classInstance.Invoke("AddShroudedKey", key == null ? null : key.getJCOInstance(), passwordBytes, pbeParameters == null ? null : pbeParameters.getJCOInstance());
            return new Pkcs12ShroudedKeyBag(objAddShroudedKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12ShroudedKeyBag AddShroudedKey(AsymmetricAlgorithm dupParam0, JCORefOut dupParam1, PbeParameters dupParam2) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.ArrayTypeMismatchException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddShroudedKey = (JCObject)classInstance.Invoke("AddShroudedKey", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
            return new Pkcs12ShroudedKeyBag(objAddShroudedKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12ShroudedKeyBag AddShroudedKey(AsymmetricAlgorithm key, java.lang.String password, PbeParameters pbeParameters) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.ArrayTypeMismatchException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddShroudedKey = (JCObject)classInstance.Invoke("AddShroudedKey", key == null ? null : key.getJCOInstance(), password, pbeParameters == null ? null : pbeParameters.getJCOInstance());
            return new Pkcs12ShroudedKeyBag(objAddShroudedKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSafeBag(Pkcs12SafeBag safeBag) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSafeBag", safeBag == null ? null : safeBag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt(byte[] passwordBytes) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.NullReferenceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Decrypt", (Object)passwordBytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt(JCORefOut dupParam0) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.NullReferenceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Decrypt", (Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt(java.lang.String password) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.NullReferenceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Decrypt", password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsReadOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pkcs12ConfidentialityMode getConfidentialityMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConfidentialityMode");
            return new Pkcs12ConfidentialityMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfidentialityMode(Pkcs12ConfidentialityMode ConfidentialityMode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConfidentialityMode", ConfidentialityMode == null ? null : ConfidentialityMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}