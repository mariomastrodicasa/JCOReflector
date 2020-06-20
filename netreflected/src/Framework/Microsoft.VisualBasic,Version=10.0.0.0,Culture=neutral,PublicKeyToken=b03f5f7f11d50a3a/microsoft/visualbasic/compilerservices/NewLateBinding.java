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

package microsoft.visualbasic.compilerservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.visualbasic.CallType;


/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.NewLateBinding, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class NewLateBinding extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.CompilerServices.NewLateBinding";
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

    public NewLateBinding(Object instance) throws Throwable {
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

    public static NewLateBinding cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NewLateBinding(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static boolean LateCanEvaluate(NetObject instance, NetType type, java.lang.String memberName, NetObject[] arguments, boolean allowFunctionEvaluation, boolean allowPropertyEvaluation) throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.RankException, system.MissingMemberException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LateCanEvaluate", instance == null ? null : instance.getJCOInstance(), type == null ? null : type.getJCOInstance(), memberName, toObjectFromArray(arguments), allowFunctionEvaluation, allowPropertyEvaluation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LateCall(NetObject Instance, NetType Type, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames, NetType[] TypeArguments, boolean[] CopyBack, boolean IgnoreReturn) throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMemberException, system.InvalidCastException, system.FormatException, system.OverflowException, system.MissingMethodException, system.NullReferenceException, system.NotSupportedException, system.reflection.AmbiguousMatchException, system.security.SecurityException, system.RankException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateCall = (JCObject)classType.Invoke("LateCall", Instance == null ? null : Instance.getJCOInstance(), Type == null ? null : Type.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames, toObjectFromArray(TypeArguments), CopyBack, IgnoreReturn);
            return new NetObject(objLateCall);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject FallbackCall(NetObject Instance, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean IgnoreReturn) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.MissingMemberException, system.InvalidCastException, microsoft.visualbasic.compilerservices.InternalErrorException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFallbackCall = (JCObject)classType.Invoke("FallbackCall", Instance == null ? null : Instance.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames, IgnoreReturn);
            return new NetObject(objFallbackCall);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LateCallInvokeDefault(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean ReportErrors) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.RankException, system.InvalidCastException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateCallInvokeDefault = (JCObject)classType.Invoke("LateCallInvokeDefault", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames, ReportErrors);
            return new NetObject(objLateCallInvokeDefault);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LateGetInvokeDefault(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean ReportErrors) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.RankException, system.InvalidCastException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateGetInvokeDefault = (JCObject)classType.Invoke("LateGetInvokeDefault", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames, ReportErrors);
            return new NetObject(objLateGetInvokeDefault);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject FallbackInvokeDefault1(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean ReportErrors) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFallbackInvokeDefault1 = (JCObject)classType.Invoke("FallbackInvokeDefault1", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames, ReportErrors);
            return new NetObject(objFallbackInvokeDefault1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject FallbackInvokeDefault2(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean ReportErrors) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidCastException, system.NotSupportedException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.NullReferenceException, system.MissingMethodException, system.OverflowException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFallbackInvokeDefault2 = (JCObject)classType.Invoke("FallbackInvokeDefault2", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames, ReportErrors);
            return new NetObject(objFallbackInvokeDefault2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LateIndexGet(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.RankException, system.InvalidCastException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateIndexGet = (JCObject)classType.Invoke("LateIndexGet", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames);
            return new NetObject(objLateIndexGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LateGet(NetObject Instance, NetType Type, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames, NetType[] TypeArguments, boolean[] CopyBack) throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.NullReferenceException, system.NotSupportedException, system.InvalidCastException, system.RankException, system.FormatException, system.OverflowException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.security.SecurityException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateGet = (JCObject)classType.Invoke("LateGet", Instance == null ? null : Instance.getJCOInstance(), Type == null ? null : Type.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames, toObjectFromArray(TypeArguments), CopyBack);
            return new NetObject(objLateGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject FallbackGet(NetObject Instance, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.MissingMemberException, system.NullReferenceException, system.FormatException, system.InvalidCastException, system.reflection.AmbiguousMatchException, system.MissingMethodException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFallbackGet = (JCObject)classType.Invoke("FallbackGet", Instance == null ? null : Instance.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames);
            return new NetObject(objFallbackGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateIndexSetComplex(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean OptimisticSet, boolean RValueBase) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.MissingMemberException, system.reflection.AmbiguousMatchException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateIndexSetComplex", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames, OptimisticSet, RValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FallbackIndexSetComplex(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames, boolean OptimisticSet, boolean RValueBase) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.FormatException, system.InvalidCastException, system.OverflowException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.MissingMethodException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("FallbackIndexSetComplex", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames, OptimisticSet, RValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateIndexSet(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.MissingMemberException, system.reflection.AmbiguousMatchException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateIndexSet", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FallbackIndexSet(NetObject Instance, NetObject[] Arguments, java.lang.String[] ArgumentNames) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.MissingMemberException, system.NotSupportedException, system.NotImplementedException, system.reflection.AmbiguousMatchException, system.ArgumentOutOfRangeException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("FallbackIndexSet", Instance == null ? null : Instance.getJCOInstance(), toObjectFromArray(Arguments), ArgumentNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateSetComplex(NetObject Instance, NetType Type, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames, NetType[] TypeArguments, boolean OptimisticSet, boolean RValueBase) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.globalization.CultureNotFoundException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.RankException, system.reflection.AmbiguousMatchException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateSetComplex", Instance == null ? null : Instance.getJCOInstance(), Type == null ? null : Type.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames, toObjectFromArray(TypeArguments), OptimisticSet, RValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateSet(NetObject Instance, NetType Type, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames, NetType[] TypeArguments) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.globalization.CultureNotFoundException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.RankException, system.reflection.AmbiguousMatchException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateSet", Instance == null ? null : Instance.getJCOInstance(), Type == null ? null : Type.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames, toObjectFromArray(TypeArguments));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FallbackSet(NetObject Instance, java.lang.String MemberName, NetObject[] Arguments) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.FormatException, system.OverflowException, system.NotImplementedException, system.NullReferenceException, system.NotSupportedException, system.RankException, system.reflection.AmbiguousMatchException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("FallbackSet", Instance == null ? null : Instance.getJCOInstance(), MemberName, toObjectFromArray(Arguments));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FallbackSetComplex(NetObject Instance, java.lang.String MemberName, NetObject[] Arguments, boolean OptimisticSet, boolean RValueBase) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.FormatException, system.OverflowException, system.NotImplementedException, system.NullReferenceException, system.NotSupportedException, system.RankException, system.reflection.AmbiguousMatchException, system.reflection.TargetInvocationException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("FallbackSetComplex", Instance == null ? null : Instance.getJCOInstance(), MemberName, toObjectFromArray(Arguments), OptimisticSet, RValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateSet(NetObject Instance, NetType Type, java.lang.String MemberName, NetObject[] Arguments, java.lang.String[] ArgumentNames, NetType[] TypeArguments, boolean OptimisticSet, boolean RValueBase, CallType CallType) throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.FormatException, system.OverflowException, system.NullReferenceException, system.NotSupportedException, system.RankException, system.reflection.AmbiguousMatchException, system.reflection.TargetInvocationException, system.reflection.TargetParameterCountException, microsoft.visualbasic.compilerservices.InternalErrorException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateSet", Instance == null ? null : Instance.getJCOInstance(), Type == null ? null : Type.getJCOInstance(), MemberName, toObjectFromArray(Arguments), ArgumentNames, toObjectFromArray(TypeArguments), OptimisticSet, RValueBase, CallType == null ? null : CallType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}