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

package system.linq.expressions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.linq.expressions.Expression;
import system.linq.expressions.DynamicExpression;
import system.runtime.compilerservices.CallSiteBinder;
import system.linq.expressions.ExpressionType;


/**
 * The base .NET class managing System.Linq.Expressions.DynamicExpression, System.Linq.Expressions, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DynamicExpression extends NetObject  {
    public static final String assemblyFullName = "System.Linq.Expressions, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Linq.Expressions";
    public static final String className = "System.Linq.Expressions.DynamicExpression";
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

    public DynamicExpression(Object instance) throws Throwable {
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

    public static DynamicExpression cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DynamicExpression(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public Expression Reduce() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReduce = (JCObject)classInstance.Invoke("Reduce");
            return new Expression(objReduce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression Dynamic(CallSiteBinder binder, NetType returnType, Expression... arguments) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(arguments));
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression Dynamic(CallSiteBinder binder, NetType returnType, Expression arg0) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression Dynamic(CallSiteBinder binder, NetType returnType, Expression arg0, Expression arg1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression Dynamic(CallSiteBinder binder, NetType returnType, Expression arg0, Expression arg1, Expression arg2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression Dynamic(CallSiteBinder binder, NetType returnType, Expression arg0, Expression arg1, Expression arg2, Expression arg3) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDynamic = (JCObject)classType.Invoke("Dynamic", binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance(), arg3 == null ? null : arg3.getJCOInstance());
            return new DynamicExpression(objDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamic(NetType delegateType, CallSiteBinder binder, Expression... arguments) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(arguments));
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamic(NetType delegateType, CallSiteBinder binder, Expression arg0) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamic(NetType delegateType, CallSiteBinder binder, Expression arg0, Expression arg1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamic(NetType delegateType, CallSiteBinder binder, Expression arg0, Expression arg1, Expression arg2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicExpression MakeDynamic(NetType delegateType, CallSiteBinder binder, Expression arg0, Expression arg1, Expression arg2, Expression arg3) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMakeDynamic = (JCObject)classType.Invoke("MakeDynamic", delegateType == null ? null : delegateType.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance(), arg3 == null ? null : arg3.getJCOInstance());
            return new DynamicExpression(objMakeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression ReduceAndCheck() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReduceAndCheck = (JCObject)classInstance.Invoke("ReduceAndCheck");
            return new Expression(objReduceAndCheck);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression ReduceExtensions() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReduceExtensions = (JCObject)classInstance.Invoke("ReduceExtensions");
            return new Expression(objReduceExtensions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanReduce() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanReduce");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExpressionType getNodeType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NodeType");
            return new ExpressionType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CallSiteBinder getBinder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Binder");
            return new CallSiteBinder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDelegateType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DelegateType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}