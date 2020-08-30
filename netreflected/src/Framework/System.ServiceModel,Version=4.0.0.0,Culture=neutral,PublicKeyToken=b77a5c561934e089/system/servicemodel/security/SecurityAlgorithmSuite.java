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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.security.SecurityAlgorithmSuite;


/**
 * The base .NET class managing System.ServiceModel.Security.SecurityAlgorithmSuite, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.SecurityAlgorithmSuite" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.SecurityAlgorithmSuite</a>
 */
public class SecurityAlgorithmSuite extends NetObject  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Security.SecurityAlgorithmSuite
     */
    public static final String className = "System.ServiceModel.Security.SecurityAlgorithmSuite";
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

    public SecurityAlgorithmSuite(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SecurityAlgorithmSuite}, a cast assert is made to check if types are compatible.
     */
    public static SecurityAlgorithmSuite cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SecurityAlgorithmSuite(from.getJCOInstance());
    }

    // Constructors section
    
    public SecurityAlgorithmSuite() throws Throwable {
    }

    
    // Methods section
    
    public boolean IsAsymmetricKeyLengthSupported(int length) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricKeyLengthSupported", length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAsymmetricKeyWrapAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricKeyWrapAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAsymmetricSignatureAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricSignatureAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsCanonicalizationAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsCanonicalizationAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDigestAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDigestAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEncryptionAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEncryptionAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEncryptionKeyDerivationAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEncryptionKeyDerivationAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSignatureKeyDerivationAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSignatureKeyDerivationAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSymmetricKeyLengthSupported(int length) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSymmetricKeyLengthSupported", length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSymmetricKeyWrapAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSymmetricKeyWrapAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSymmetricSignatureAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSymmetricSignatureAlgorithmSupported", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getDefaultEncryptionKeyDerivationLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DefaultEncryptionKeyDerivationLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDefaultSignatureKeyDerivationLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DefaultSignatureKeyDerivationLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDefaultSymmetricKeyLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DefaultSymmetricKeyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic128() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic128");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic128Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic128Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic128Sha256() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic128Sha256");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic128Sha256Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic128Sha256Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic192() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic192");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic192Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic192Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic192Sha256() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic192Sha256");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic192Sha256Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic192Sha256Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic256() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic256");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic256Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic256Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic256Sha256() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic256Sha256");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getBasic256Sha256Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Basic256Sha256Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getDefault() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Default");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getTripleDes() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TripleDes");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getTripleDesRsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TripleDesRsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getTripleDesSha256() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TripleDesSha256");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityAlgorithmSuite getTripleDesSha256Rsa15() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TripleDesSha256Rsa15");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultAsymmetricKeyWrapAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultAsymmetricKeyWrapAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultAsymmetricSignatureAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultAsymmetricSignatureAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultCanonicalizationAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultCanonicalizationAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultDigestAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultDigestAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultEncryptionAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultEncryptionAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultSymmetricKeyWrapAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultSymmetricKeyWrapAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultSymmetricSignatureAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DefaultSymmetricSignatureAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}