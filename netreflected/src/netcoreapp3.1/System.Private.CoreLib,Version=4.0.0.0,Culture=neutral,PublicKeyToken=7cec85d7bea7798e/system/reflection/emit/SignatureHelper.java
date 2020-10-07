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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.emit.SignatureHelper;
import system.reflection.Module;
import system.reflection.CallingConventions;
import system.runtime.interopservices.CallingConvention;


/**
 * The base .NET class managing System.Reflection.Emit.SignatureHelper, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.SignatureHelper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.SignatureHelper</a>
 */
public class SignatureHelper extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Reflection.Emit.SignatureHelper
     */
    public static final String className = "System.Reflection.Emit.SignatureHelper";
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

    public SignatureHelper(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SignatureHelper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SignatureHelper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SignatureHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SignatureHelper(from.getJCOInstance());
    }

    // Constructors section
    
    public SignatureHelper() throws Throwable {
    }



    
    // Methods section
    
    public byte[] GetSignature() throws Throwable, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSignature");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSignature = 0; indexGetSignature < resultingArrayList.size(); indexGetSignature++ ) {
				resultingArray[indexGetSignature] = (byte)resultingArrayList.get(indexGetSignature);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetFieldSigHelper(Module mod) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetFieldSigHelper = (JCObject)classType.Invoke("GetFieldSigHelper", mod == null ? null : mod.getJCOInstance());
            return new SignatureHelper(objGetFieldSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetLocalVarSigHelper() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetLocalVarSigHelper = (JCObject)classType.Invoke("GetLocalVarSigHelper");
            return new SignatureHelper(objGetLocalVarSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetLocalVarSigHelper(Module mod) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetLocalVarSigHelper = (JCObject)classType.Invoke("GetLocalVarSigHelper", mod == null ? null : mod.getJCOInstance());
            return new SignatureHelper(objGetLocalVarSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(CallingConventions callingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, CallingConventions callingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", mod == null ? null : mod.getJCOInstance(), callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, CallingConvention unmanagedCallConv, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", mod == null ? null : mod.getJCOInstance(), unmanagedCallConv == null ? null : unmanagedCallConv.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", mod == null ? null : mod.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(CallingConvention unmanagedCallingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", unmanagedCallingConvention == null ? null : unmanagedCallingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetPropertySigHelper(Module mod, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPropertySigHelper = (JCObject)classType.Invoke("GetPropertySigHelper", mod == null ? null : mod.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new SignatureHelper(objGetPropertySigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType clsArgument) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddArgument", clsArgument == null ? null : clsArgument.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType argument, boolean pinned) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddArgument", argument == null ? null : argument.getJCOInstance(), pinned);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType argument, NetType[] requiredCustomModifiers, NetType[] optionalCustomModifiers) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddArgument", argument == null ? null : argument.getJCOInstance(), toObjectFromArray(requiredCustomModifiers), toObjectFromArray(optionalCustomModifiers));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSentinel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSentinel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}