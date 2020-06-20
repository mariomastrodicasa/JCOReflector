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


/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.LateBinding, Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class LateBinding extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    public static final String className = "Microsoft.VisualBasic.CompilerServices.LateBinding";
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

    public LateBinding(Object instance) throws Throwable {
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

    public static LateBinding cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LateBinding(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static NetObject LateGet(NetObject o, NetType objType, java.lang.String name, NetObject[] args, java.lang.String[] paramnames, boolean[] CopyBack) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.NotSupportedException, system.OutOfMemoryException, system.InvalidCastException, system.NullReferenceException, system.RankException, system.OverflowException, system.MissingMemberException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateGet = (JCObject)classType.Invoke("LateGet", o == null ? null : o.getJCOInstance(), objType == null ? null : objType.getJCOInstance(), name, toObjectFromArray(args), paramnames, CopyBack);
            return new NetObject(objLateGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateSetComplex(NetObject o, NetType objType, java.lang.String name, NetObject[] args, java.lang.String[] paramnames, boolean OptimisticSet, boolean RValueBase) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.RankException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateSetComplex", o == null ? null : o.getJCOInstance(), objType == null ? null : objType.getJCOInstance(), name, toObjectFromArray(args), paramnames, OptimisticSet, RValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateSet(NetObject o, NetType objType, java.lang.String name, NetObject[] args, java.lang.String[] paramnames) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.MissingMemberException, system.MissingMethodException, system.InvalidCastException, system.OverflowException, system.NullReferenceException, system.RankException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateSet", o == null ? null : o.getJCOInstance(), objType == null ? null : objType.getJCOInstance(), name, toObjectFromArray(args), paramnames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LateIndexGet(NetObject o, NetObject[] args, java.lang.String[] paramnames) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.RankException, system.OverflowException, system.InvalidCastException, system.OutOfMemoryException, system.NotSupportedException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLateIndexGet = (JCObject)classType.Invoke("LateIndexGet", o == null ? null : o.getJCOInstance(), toObjectFromArray(args), paramnames);
            return new NetObject(objLateIndexGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateIndexSetComplex(NetObject o, NetObject[] args, java.lang.String[] paramnames, boolean OptimisticSet, boolean RValueBase) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.InvalidCastException, system.OverflowException, system.RankException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateIndexSetComplex", o == null ? null : o.getJCOInstance(), toObjectFromArray(args), paramnames, OptimisticSet, RValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateIndexSet(NetObject o, NetObject[] args, java.lang.String[] paramnames) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidCastException, system.OverflowException, system.RankException, system.MissingMemberException, system.reflection.AmbiguousMatchException, system.MissingMethodException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateIndexSet", o == null ? null : o.getJCOInstance(), toObjectFromArray(args), paramnames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LateCall(NetObject o, NetType objType, java.lang.String name, NetObject[] args, java.lang.String[] paramnames, boolean[] CopyBack) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.MissingMemberException, system.InvalidCastException, system.OverflowException, system.MissingMethodException, system.NullReferenceException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LateCall", o == null ? null : o.getJCOInstance(), objType == null ? null : objType.getJCOInstance(), name, toObjectFromArray(args), paramnames, CopyBack);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}