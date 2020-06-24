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

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.JSToken;


/**
 * The base .NET class managing Microsoft.JScript.NumericBinary, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class NumericBinary extends NetObject  {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.NumericBinary";
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

    public NumericBinary(Object instance) throws Throwable {
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

    public static NumericBinary cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NumericBinary(from.getJCOInstance());
    }

    // Constructors section
    

    public NumericBinary(int operatorTok) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(operatorTok));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static NetObject DoOp(NetObject v1, NetObject v2, JSToken operatorTok) throws Throwable, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, microsoft.jscript.JScriptException, microsoft.jscript.EndOfFile, system.ArgumentNullException, system.MissingMethodException, system.OverflowException, system.FormatException, system.ArithmeticException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDoOp = (JCObject)classType.Invoke("DoOp", v1 == null ? null : v1.getJCOInstance(), v2 == null ? null : v2.getJCOInstance(), operatorTok == null ? null : operatorTok.getJCOInstance());
            return new NetObject(objDoOp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject EvaluateNumericBinary(NetObject v1, NetObject v2) throws Throwable, microsoft.jscript.JScriptException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.MissingMethodException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.OverflowException, system.ArithmeticException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.TypeInitializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEvaluateNumericBinary = (JCObject)classInstance.Invoke("EvaluateNumericBinary", v1 == null ? null : v1.getJCOInstance(), v2 == null ? null : v2.getJCOInstance());
            return new NetObject(objEvaluateNumericBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}