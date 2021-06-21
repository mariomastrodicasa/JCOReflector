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

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.JSObject;


/**
 * The base .NET class managing Microsoft.JScript.MathObject, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.MathObject" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.MathObject</a>
 */
public class MathObject extends JSObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.MathObject
     */
    public static final String className = "Microsoft.JScript.MathObject";
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

    public MathObject(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MathObject}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MathObject} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MathObject cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MathObject(from.getJCOInstance());
    }

    // Constructors section
    
    public MathObject() throws Throwable {
    }



    
    // Methods section
    
    public static double abs(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("abs", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double acos(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("acos", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double asin(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("asin", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double atan(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("atan", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double atan2(double dy, double dx) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("atan2", dy, dx);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ceil(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("ceil", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double cos(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("cos", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double exp(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("exp", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double floor(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("floor", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double log(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("log", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double max(NetObject x, NetObject y, NetObject... args) throws Throwable, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, microsoft.jscript.JScriptException, system.IndexOutOfRangeException, system.ArgumentNullException, system.MissingMethodException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.OverflowException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("max", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance(), toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double min(NetObject x, NetObject y, NetObject... args) throws Throwable, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, microsoft.jscript.JScriptException, system.IndexOutOfRangeException, system.ArgumentNullException, system.MissingMethodException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.OverflowException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("min", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance(), toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double pow(double dx, double dy) throws Throwable, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("pow", dx, dy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double random() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("random");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double round(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("round", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double sin(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("sin", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double sqrt(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("sqrt", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double tan(double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("tan", x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}