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

package system.text;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.text.Encoding;
import system.text.EncoderFallback;
import system.text.DecoderFallback;
import system.text.EncodingProvider;


/**
 * The base .NET class managing System.Text.CodePagesEncodingProvider, System.Text.Encoding.CodePages, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class CodePagesEncodingProvider extends NetObject  {
    public static final String assemblyFullName = "System.Text.Encoding.CodePages, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Text.Encoding.CodePages";
    public static final String className = "System.Text.CodePagesEncodingProvider";
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

    public CodePagesEncodingProvider(Object instance) throws Throwable {
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

    public static CodePagesEncodingProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CodePagesEncodingProvider(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public Encoding GetEncoding(int codepage) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEncoding = (JCObject)classInstance.Invoke("GetEncoding", codepage);
            return new Encoding(objGetEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding GetEncoding(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEncoding = (JCObject)classInstance.Invoke("GetEncoding", name);
            return new Encoding(objGetEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding GetEncoding(java.lang.String name, EncoderFallback encoderFallback, DecoderFallback decoderFallback) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEncoding = (JCObject)classInstance.Invoke("GetEncoding", name, encoderFallback == null ? null : encoderFallback.getJCOInstance(), decoderFallback == null ? null : decoderFallback.getJCOInstance());
            return new Encoding(objGetEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding GetEncoding(int codepage, EncoderFallback encoderFallback, DecoderFallback decoderFallback) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEncoding = (JCObject)classInstance.Invoke("GetEncoding", codepage, encoderFallback == null ? null : encoderFallback.getJCOInstance(), decoderFallback == null ? null : decoderFallback.getJCOInstance());
            return new Encoding(objGetEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static EncodingProvider getInstance() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Instance");
            return new EncodingProvider(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}