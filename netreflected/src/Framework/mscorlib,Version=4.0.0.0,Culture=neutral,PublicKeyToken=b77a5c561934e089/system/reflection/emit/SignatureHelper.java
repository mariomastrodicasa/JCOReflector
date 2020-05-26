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
 * The base .NET class managing System.Reflection.Emit.SignatureHelper, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SignatureHelper extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Reflection.Emit.SignatureHelper";
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

    public SignatureHelper(Object instance) throws Throwable {
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

    public static SignatureHelper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SignatureHelper(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static SignatureHelper GetMethodSigHelper(Module mod, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException {
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", (Object)mod.getJCOInstance(), (Object)returnType.getJCOInstance(), (Object)toObjectFromArray(parameterTypes));
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, CallingConventions callingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException {
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", (Object)mod.getJCOInstance(), (Object)callingConvention.getJCOInstance(), (Object)returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, CallingConvention unmanagedCallConv, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException {
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", (Object)mod.getJCOInstance(), (Object)unmanagedCallConv.getJCOInstance(), (Object)returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetLocalVarSigHelper() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            JCObject objGetLocalVarSigHelper = (JCObject)classType.Invoke("GetLocalVarSigHelper");
            return new SignatureHelper(objGetLocalVarSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(CallingConventions callingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", (Object)callingConvention.getJCOInstance(), (Object)returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(CallingConvention unmanagedCallingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException {
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", (Object)unmanagedCallingConvention.getJCOInstance(), (Object)returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetLocalVarSigHelper(Module mod) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            JCObject objGetLocalVarSigHelper = (JCObject)classType.Invoke("GetLocalVarSigHelper", (Object)mod.getJCOInstance());
            return new SignatureHelper(objGetLocalVarSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetFieldSigHelper(Module mod) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            JCObject objGetFieldSigHelper = (JCObject)classType.Invoke("GetFieldSigHelper", (Object)mod.getJCOInstance());
            return new SignatureHelper(objGetFieldSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetPropertySigHelper(Module mod, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        try {
            JCObject objGetPropertySigHelper = (JCObject)classType.Invoke("GetPropertySigHelper", (Object)mod.getJCOInstance(), (Object)returnType.getJCOInstance(), (Object)toObjectFromArray(parameterTypes));
            return new SignatureHelper(objGetPropertySigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType clsArgument) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddArgument", (Object)clsArgument.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType argument, boolean pinned) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.NotImplementedException {
        try {
            classInstance.Invoke("AddArgument", (Object)argument.getJCOInstance(), pinned);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType argument, NetType[] requiredCustomModifiers, NetType[] optionalCustomModifiers) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddArgument", (Object)argument.getJCOInstance(), (Object)toObjectFromArray(requiredCustomModifiers), (Object)toObjectFromArray(optionalCustomModifiers));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSentinel() throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("AddSentinel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSignature() throws Throwable, system.ArgumentNullException, system.ArgumentException {
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


    
    // Properties section
    
    

	// Instance Events section
    
    
}