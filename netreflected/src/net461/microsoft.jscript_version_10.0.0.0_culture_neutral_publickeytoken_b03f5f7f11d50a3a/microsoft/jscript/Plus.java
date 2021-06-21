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
import microsoft.jscript.BinaryOp;


/**
 * The base .NET class managing Microsoft.JScript.Plus, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Plus" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Plus</a>
 */
public class Plus extends BinaryOp  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.Plus
     */
    public static final String className = "Microsoft.JScript.Plus";
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

    public Plus(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Plus}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Plus} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Plus cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Plus(from.getJCOInstance());
    }

    // Constructors section
    
    public Plus() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static NetObject DoOp(NetObject v1, NetObject v2) throws Throwable, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, microsoft.jscript.JScriptException, system.NullReferenceException, microsoft.jscript.EndOfFile, system.MissingMethodException, system.OverflowException, system.globalization.CultureNotFoundException, system.FormatException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDoOp = (JCObject)classType.Invoke("DoOp", v1 == null ? null : v1.getJCOInstance(), v2 == null ? null : v2.getJCOInstance());
            return new NetObject(objDoOp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject EvaluatePlus(NetObject v1, NetObject v2) throws Throwable, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, microsoft.jscript.JScriptException, system.IndexOutOfRangeException, system.ArgumentNullException, system.MissingMethodException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEvaluatePlus = (JCObject)classInstance.Invoke("EvaluatePlus", v1 == null ? null : v1.getJCOInstance(), v2 == null ? null : v2.getJCOInstance());
            return new NetObject(objEvaluatePlus);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}