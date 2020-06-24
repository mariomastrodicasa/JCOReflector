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

package system.security.cryptography.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.HashAlgorithm;
import system.xml.XmlElement;
import system.xml.XmlNodeList;
import system.collections.Hashtable;
import system.security.cryptography.xml.IRelDecryptor;
import system.security.cryptography.xml.IRelDecryptorImplementation;
import system.xml.XmlResolver;


/**
 * The base .NET class managing System.Security.Cryptography.Xml.XmlLicenseTransform, System.Security.Cryptography.Xml, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class XmlLicenseTransform extends NetObject  {
    public static final String assemblyFullName = "System.Security.Cryptography.Xml, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    public static final String assemblyShortName = "System.Security.Cryptography.Xml";
    public static final String className = "System.Security.Cryptography.Xml.XmlLicenseTransform";
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

    public XmlLicenseTransform(Object instance) throws Throwable {
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

    public static XmlLicenseTransform cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlLicenseTransform(from.getJCOInstance());
    }

    // Constructors section
    

    public XmlLicenseTransform() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public byte[] GetDigestedOutput(HashAlgorithm hash) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDigestedOutput", hash == null ? null : hash.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetDigestedOutput = 0; indexGetDigestedOutput < resultingArrayList.size(); indexGetDigestedOutput++ ) {
				resultingArray[indexGetDigestedOutput] = (byte)resultingArrayList.get(indexGetDigestedOutput);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetOutput() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOutput = (JCObject)classInstance.Invoke("GetOutput");
            return new NetObject(objGetOutput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetOutput(NetType type) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOutput = (JCObject)classInstance.Invoke("GetOutput", type == null ? null : type.getJCOInstance());
            return new NetObject(objGetOutput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetXml() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.XmlException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetXml = (JCObject)classInstance.Invoke("GetXml");
            return new XmlElement(objGetXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadInnerXml(XmlNodeList nodeList) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadInnerXml", nodeList == null ? null : nodeList.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadInput(NetObject obj) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.OutOfMemoryException, system.NotSupportedException, system.ArrayTypeMismatchException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadInput", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Hashtable getPropagatedNamespaces() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PropagatedNamespaces");
            return new Hashtable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRelDecryptor getDecryptor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Decryptor");
            return new IRelDecryptorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDecryptor(IRelDecryptor Decryptor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Decryptor", Decryptor == null ? null : Decryptor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Algorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlgorithm(java.lang.String Algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Algorithm", Algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] getInputTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Get("InputTypes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] getOutputTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Get("OutputTypes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement getContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new XmlElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContext(XmlElement Context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Context", Context == null ? null : Context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlResolver getResolver() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Resolver");
            return new XmlResolver(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResolver(XmlResolver Resolver) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Resolver", Resolver == null ? null : Resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}