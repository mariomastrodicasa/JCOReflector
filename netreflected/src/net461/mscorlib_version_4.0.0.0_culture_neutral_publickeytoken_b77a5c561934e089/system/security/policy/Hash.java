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

package system.security.policy;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.policy.EvidenceBase;
import system.reflection.Assembly;
import system.security.cryptography.HashAlgorithm;
import system.security.policy.Hash;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;


/**
 * The base .NET class managing System.Security.Policy.Hash, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Policy.Hash" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Policy.Hash</a>
 */
public class Hash extends EvidenceBase  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Security.Policy.Hash
     */
    public static final String className = "System.Security.Policy.Hash";
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

    public Hash(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Hash}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Hash} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Hash cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Hash(from.getJCOInstance());
    }

    // Constructors section
    
    public Hash() throws Throwable {
    }

    public Hash(Assembly assembly) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(assembly == null ? null : assembly.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public byte[] GenerateHash(HashAlgorithm hashAlg) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.NotSupportedException, system.TypeLoadException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GenerateHash", hashAlg == null ? null : hashAlg.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGenerateHash = 0; indexGenerateHash < resultingArrayList.size(); indexGenerateHash++ ) {
				resultingArray[indexGenerateHash] = (byte)resultingArrayList.get(indexGenerateHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EvidenceBase Clone() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new EvidenceBase(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateMD5(byte[] md5) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMD5 = (JCObject)classType.Invoke("CreateMD5", (Object)md5);
            return new Hash(objCreateMD5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateMD5(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMD5 = (JCObject)classType.Invoke("CreateMD5", (Object)dupParam0.getJCRefOut());
            return new Hash(objCreateMD5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA1(byte[] sha1) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA1 = (JCObject)classType.Invoke("CreateSHA1", (Object)sha1);
            return new Hash(objCreateSHA1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA1(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA1 = (JCObject)classType.Invoke("CreateSHA1", (Object)dupParam0.getJCRefOut());
            return new Hash(objCreateSHA1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA256(byte[] sha256) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA256 = (JCObject)classType.Invoke("CreateSHA256", (Object)sha256);
            return new Hash(objCreateSHA256);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA256(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA256 = (JCObject)classType.Invoke("CreateSHA256", (Object)dupParam0.getJCRefOut());
            return new Hash(objCreateSHA256);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.TypeLoadException, system.ApplicationException, system.NotSupportedException, system.runtime.serialization.SerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetObjectData", info == null ? null : info.getJCOInstance(), context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public byte[] getMD5() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.TypeLoadException, system.ApplicationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("MD5");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexMD5 = 0; indexMD5 < resultingArrayList.size(); indexMD5++ ) {
				resultingArray[indexMD5] = (byte)resultingArrayList.get(indexMD5);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSHA1() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.TypeLoadException, system.ApplicationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SHA1");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSHA1 = 0; indexSHA1 < resultingArrayList.size(); indexSHA1++ ) {
				resultingArray[indexSHA1] = (byte)resultingArrayList.get(indexSHA1);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSHA256() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.TypeLoadException, system.ApplicationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SHA256");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSHA256 = 0; indexSHA256 < resultingArrayList.size(); indexSHA256++ ) {
				resultingArray[indexSHA256] = (byte)resultingArrayList.get(indexSHA256);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}