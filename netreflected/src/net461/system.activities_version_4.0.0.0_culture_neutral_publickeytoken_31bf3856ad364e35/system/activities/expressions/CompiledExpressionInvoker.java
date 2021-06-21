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

package system.activities.expressions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.expressions.ITextExpression;
import system.activities.expressions.ITextExpressionImplementation;
import system.activities.CodeActivityMetadata;
import system.activities.ActivityContext;
import system.activities.xamlintegration.ICompiledExpressionRoot;
import system.activities.xamlintegration.ICompiledExpressionRootImplementation;


/**
 * The base .NET class managing System.Activities.Expressions.CompiledExpressionInvoker, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Expressions.CompiledExpressionInvoker" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Expressions.CompiledExpressionInvoker</a>
 */
public class CompiledExpressionInvoker extends NetObject  {
    /**
     * Fully assembly qualified name: System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Activities
     */
    public static final String assemblyShortName = "System.Activities";
    /**
     * Qualified class name: System.Activities.Expressions.CompiledExpressionInvoker
     */
    public static final String className = "System.Activities.Expressions.CompiledExpressionInvoker";
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

    public CompiledExpressionInvoker(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CompiledExpressionInvoker}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CompiledExpressionInvoker} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CompiledExpressionInvoker cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CompiledExpressionInvoker(from.getJCOInstance());
    }

    // Constructors section
    
    public CompiledExpressionInvoker() throws Throwable {
    }

    public CompiledExpressionInvoker(ITextExpression expression, boolean isReference, CodeActivityMetadata metadata) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(expression == null ? null : expression.getJCOInstance(), isReference, metadata == null ? null : metadata.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static NetObject GetCompiledExpressionRoot(NetObject target) throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompiledExpressionRoot = (JCObject)classType.Invoke("GetCompiledExpressionRoot", target == null ? null : target.getJCOInstance());
            return new NetObject(objGetCompiledExpressionRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetCompiledExpressionRootForImplementation(NetObject target) throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompiledExpressionRootForImplementation = (JCObject)classType.Invoke("GetCompiledExpressionRootForImplementation", target == null ? null : target.getJCOInstance());
            return new NetObject(objGetCompiledExpressionRootForImplementation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InvokeExpression(ActivityContext activityContext) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadAbortException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvokeExpression = (JCObject)classInstance.Invoke("InvokeExpression", activityContext == null ? null : activityContext.getJCOInstance());
            return new NetObject(objInvokeExpression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCompiledExpressionRoot(NetObject target, ICompiledExpressionRoot compiledExpressionRoot) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCompiledExpressionRoot", target == null ? null : target.getJCOInstance(), compiledExpressionRoot == null ? null : compiledExpressionRoot.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCompiledExpressionRootForImplementation(NetObject target, ICompiledExpressionRoot compiledExpressionRoot) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCompiledExpressionRootForImplementation", target == null ? null : target.getJCOInstance(), compiledExpressionRoot == null ? null : compiledExpressionRoot.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsStaticallyCompiled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsStaticallyCompiled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsStaticallyCompiled(boolean IsStaticallyCompiled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsStaticallyCompiled", IsStaticallyCompiled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}