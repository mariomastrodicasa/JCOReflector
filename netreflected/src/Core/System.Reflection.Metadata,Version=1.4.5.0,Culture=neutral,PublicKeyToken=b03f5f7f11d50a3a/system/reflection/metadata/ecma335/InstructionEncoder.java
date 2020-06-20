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

package system.reflection.metadata.ecma335;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.metadata.BlobBuilder;
import system.reflection.metadata.ecma335.ControlFlowBuilder;
import system.reflection.metadata.ILOpCode;
import system.reflection.metadata.EntityHandle;
import system.reflection.metadata.UserStringHandle;
import system.reflection.metadata.MethodDefinitionHandle;
import system.reflection.metadata.MethodSpecificationHandle;
import system.reflection.metadata.MemberReferenceHandle;
import system.reflection.metadata.StandaloneSignatureHandle;
import system.Single;
import system.reflection.metadata.ecma335.LabelHandle;


/**
 * The base .NET class managing System.Reflection.Metadata.Ecma335.InstructionEncoder, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class InstructionEncoder extends NetObject  {
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Reflection.Metadata";
    public static final String className = "System.Reflection.Metadata.Ecma335.InstructionEncoder";
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

    public InstructionEncoder(Object instance) throws Throwable {
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

    public static InstructionEncoder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InstructionEncoder(from.getJCOInstance());
    }

    // Constructors section
    

    public InstructionEncoder(BlobBuilder codeBuilder, ControlFlowBuilder controlFlowBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(codeBuilder == null ? null : codeBuilder.getJCOInstance(), controlFlowBuilder == null ? null : controlFlowBuilder.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void OpCode(ILOpCode code) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OpCode", code == null ? null : code.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Token(EntityHandle handle) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Token", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Token(int token) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Token", token);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadString(UserStringHandle handle) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadString", handle == null ? null : handle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Call(EntityHandle methodHandle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Call", methodHandle == null ? null : methodHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Call(MethodDefinitionHandle methodHandle) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Call", methodHandle == null ? null : methodHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Call(MethodSpecificationHandle methodHandle) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Call", methodHandle == null ? null : methodHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Call(MemberReferenceHandle methodHandle) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Call", methodHandle == null ? null : methodHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CallIndirect(StandaloneSignatureHandle signature) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CallIndirect", signature == null ? null : signature.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadConstantI4(int value) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadConstantI4", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadConstantI8(long value) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadConstantI8", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadConstantR4(Single value) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadConstantR4", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadConstantR8(double value) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadConstantR8", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadLocal(int slotIndex) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadLocal", slotIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StoreLocal(int slotIndex) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StoreLocal", slotIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadLocalAddress(int slotIndex) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadLocalAddress", slotIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadArgument(int argumentIndex) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadArgument", argumentIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadArgumentAddress(int argumentIndex) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadArgumentAddress", argumentIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StoreArgument(int argumentIndex) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StoreArgument", argumentIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LabelHandle DefineLabel() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineLabel = (JCObject)classInstance.Invoke("DefineLabel");
            return new LabelHandle(objDefineLabel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Branch(ILOpCode code, LabelHandle label) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Branch", code == null ? null : code.getJCOInstance(), label == null ? null : label.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MarkLabel(LabelHandle label) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MarkLabel", label == null ? null : label.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public BlobBuilder getCodeBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CodeBuilder");
            return new BlobBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ControlFlowBuilder getControlFlowBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ControlFlowBuilder");
            return new ControlFlowBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Offset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}