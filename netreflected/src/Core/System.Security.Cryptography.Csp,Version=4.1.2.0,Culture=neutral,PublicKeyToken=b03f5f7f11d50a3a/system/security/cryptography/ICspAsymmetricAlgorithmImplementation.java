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

package system.security.cryptography;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.CspKeyContainerInfo;


/**
 * The base .NET class managing System.Security.Cryptography.ICspAsymmetricAlgorithm, System.Security.Cryptography.Csp, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ICspAsymmetricAlgorithmImplementation extends NetObject implements ICspAsymmetricAlgorithm {
    public static final String assemblyFullName = "System.Security.Cryptography.Csp, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Security.Cryptography.Csp";
    public static final String className = "System.Security.Cryptography.ICspAsymmetricAlgorithm";
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

    public ICspAsymmetricAlgorithmImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static ICspAsymmetricAlgorithm ToICspAsymmetricAlgorithm(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ICspAsymmetricAlgorithmImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public byte[] ExportCspBlob(boolean includePrivateParameters) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ExportCspBlob", includePrivateParameters);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexExportCspBlob = 0; indexExportCspBlob < resultingArrayList.size(); indexExportCspBlob++ ) {
				resultingArray[indexExportCspBlob] = (byte)resultingArrayList.get(indexExportCspBlob);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ImportCspBlob(byte[] rawData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ImportCspBlob", (Object)rawData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public CspKeyContainerInfo getCspKeyContainerInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CspKeyContainerInfo");
            return new CspKeyContainerInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}