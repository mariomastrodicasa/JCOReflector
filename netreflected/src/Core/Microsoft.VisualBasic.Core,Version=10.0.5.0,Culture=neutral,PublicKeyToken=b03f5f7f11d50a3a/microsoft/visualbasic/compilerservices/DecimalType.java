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
import system.Decimal;
import system.globalization.NumberFormatInfo;


/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.DecimalType, Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DecimalType extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    public static final String className = "Microsoft.VisualBasic.CompilerServices.DecimalType";
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

    public DecimalType(Object instance) throws Throwable {
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

    public static DecimalType cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DecimalType(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static Decimal Parse(java.lang.String Value, NumberFormatInfo NumberFormat) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", Value, NumberFormat == null ? null : NumberFormat.getJCOInstance());
            return new Decimal(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal FromObject(NetObject Value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.InvalidCastException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromObject = (JCObject)classType.Invoke("FromObject", Value == null ? null : Value.getJCOInstance());
            return new Decimal(objFromObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal FromObject(NetObject Value, NumberFormatInfo NumberFormat) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromObject = (JCObject)classType.Invoke("FromObject", Value == null ? null : Value.getJCOInstance(), NumberFormat == null ? null : NumberFormat.getJCOInstance());
            return new Decimal(objFromObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal FromBoolean(boolean Value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromBoolean = (JCObject)classType.Invoke("FromBoolean", Value);
            return new Decimal(objFromBoolean);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal FromString(java.lang.String Value, NumberFormatInfo NumberFormat) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromString = (JCObject)classType.Invoke("FromString", Value, NumberFormat == null ? null : NumberFormat.getJCOInstance());
            return new Decimal(objFromString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal FromString(java.lang.String Value) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.OverflowException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromString = (JCObject)classType.Invoke("FromString", Value);
            return new Decimal(objFromString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}