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

package system.dynamic;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.linq.expressions.Expression;
import system.dynamic.BindingRestrictions;
import system.dynamic.DynamicMetaObject;
import system.dynamic.BinaryOperationBinder;
import system.dynamic.ConvertBinder;
import system.dynamic.CreateInstanceBinder;
import system.dynamic.DeleteIndexBinder;
import system.dynamic.DeleteMemberBinder;
import system.dynamic.GetIndexBinder;
import system.dynamic.GetMemberBinder;
import system.dynamic.InvokeBinder;
import system.dynamic.InvokeMemberBinder;
import system.dynamic.SetIndexBinder;
import system.dynamic.SetMemberBinder;
import system.dynamic.UnaryOperationBinder;


/**
 * The base .NET class managing System.Dynamic.DynamicMetaObject, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DynamicMetaObject extends NetObject  {
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Core";
    public static final String className = "System.Dynamic.DynamicMetaObject";
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

    public DynamicMetaObject(Object instance) throws Throwable {
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

    public static DynamicMetaObject cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DynamicMetaObject(from.getJCOInstance());
    }

    // Constructors section
    

    public DynamicMetaObject(Expression expression, BindingRestrictions restrictions) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(expression == null ? null : expression.getJCOInstance(), restrictions == null ? null : restrictions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject(Expression expression, BindingRestrictions restrictions, NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(expression == null ? null : expression.getJCOInstance(), restrictions == null ? null : restrictions.getJCOInstance(), value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public DynamicMetaObject BindBinaryOperation(BinaryOperationBinder binder, DynamicMetaObject arg) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindBinaryOperation = (JCObject)classInstance.Invoke("BindBinaryOperation", binder == null ? null : binder.getJCOInstance(), arg == null ? null : arg.getJCOInstance());
            return new DynamicMetaObject(objBindBinaryOperation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindConvert(ConvertBinder binder) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindConvert = (JCObject)classInstance.Invoke("BindConvert", binder == null ? null : binder.getJCOInstance());
            return new DynamicMetaObject(objBindConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindCreateInstance(CreateInstanceBinder binder, DynamicMetaObject[] args) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindCreateInstance = (JCObject)classInstance.Invoke("BindCreateInstance", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args));
            return new DynamicMetaObject(objBindCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindDeleteIndex(DeleteIndexBinder binder, DynamicMetaObject[] indexes) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindDeleteIndex = (JCObject)classInstance.Invoke("BindDeleteIndex", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(indexes));
            return new DynamicMetaObject(objBindDeleteIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindDeleteMember(DeleteMemberBinder binder) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindDeleteMember = (JCObject)classInstance.Invoke("BindDeleteMember", binder == null ? null : binder.getJCOInstance());
            return new DynamicMetaObject(objBindDeleteMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindGetIndex(GetIndexBinder binder, DynamicMetaObject[] indexes) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindGetIndex = (JCObject)classInstance.Invoke("BindGetIndex", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(indexes));
            return new DynamicMetaObject(objBindGetIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindGetMember(GetMemberBinder binder) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindGetMember = (JCObject)classInstance.Invoke("BindGetMember", binder == null ? null : binder.getJCOInstance());
            return new DynamicMetaObject(objBindGetMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindInvoke(InvokeBinder binder, DynamicMetaObject[] args) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindInvoke = (JCObject)classInstance.Invoke("BindInvoke", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args));
            return new DynamicMetaObject(objBindInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindInvokeMember(InvokeMemberBinder binder, DynamicMetaObject[] args) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindInvokeMember = (JCObject)classInstance.Invoke("BindInvokeMember", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args));
            return new DynamicMetaObject(objBindInvokeMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindSetIndex(SetIndexBinder binder, DynamicMetaObject[] indexes, DynamicMetaObject value) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindSetIndex = (JCObject)classInstance.Invoke("BindSetIndex", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(indexes), value == null ? null : value.getJCOInstance());
            return new DynamicMetaObject(objBindSetIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindSetMember(SetMemberBinder binder, DynamicMetaObject value) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindSetMember = (JCObject)classInstance.Invoke("BindSetMember", binder == null ? null : binder.getJCOInstance(), value == null ? null : value.getJCOInstance());
            return new DynamicMetaObject(objBindSetMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicMetaObject BindUnaryOperation(UnaryOperationBinder binder) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBindUnaryOperation = (JCObject)classInstance.Invoke("BindUnaryOperation", binder == null ? null : binder.getJCOInstance());
            return new DynamicMetaObject(objBindUnaryOperation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicMetaObject Create(NetObject value, Expression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", value == null ? null : value.getJCOInstance(), expression == null ? null : expression.getJCOInstance());
            return new DynamicMetaObject(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHasValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingRestrictions getRestrictions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Restrictions");
            return new BindingRestrictions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Expression getExpression() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Expression");
            return new Expression(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getLimitType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LimitType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getRuntimeType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RuntimeType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}