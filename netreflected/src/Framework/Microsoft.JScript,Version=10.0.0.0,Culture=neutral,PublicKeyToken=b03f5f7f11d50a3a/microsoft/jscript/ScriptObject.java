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
import system.reflection.FieldInfo;
import system.reflection.BindingFlags;
import system.reflection.MethodInfo;
import microsoft.jscript.ScriptObject;
import system.reflection.PropertyInfo;
import system.reflection.MemberInfo;
import system.reflection.Binder;
import system.reflection.ParameterModifier;
import system.globalization.CultureInfo;


/**
 * The base .NET class managing Microsoft.JScript.ScriptObject, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ScriptObject extends NetObject  {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.ScriptObject";
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

    public ScriptObject(Object instance) throws Throwable {
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

    public static ScriptObject cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ScriptObject(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public FieldInfo GetField(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetField = (JCObject)classInstance.Invoke("GetField", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            return new FieldInfo(objGetField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            return new MethodInfo(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScriptObject GetParent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetParent = (JCObject)classInstance.Invoke("GetParent");
            return new ScriptObject(objGetParent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProperty = (JCObject)classInstance.Invoke("GetProperty", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            return new PropertyInfo(objGetProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo[] GetFields(BindingFlags bindingAttr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FieldInfo> resultingArrayList = new ArrayList<FieldInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFields", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FieldInfo(resultingObject));
            }
            FieldInfo[] resultingArray = new FieldInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo[] GetMember(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<MemberInfo> resultingArrayList = new ArrayList<MemberInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMember", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MemberInfo(resultingObject));
            }
            MemberInfo[] resultingArray = new MemberInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo[] GetMembers(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<MemberInfo> resultingArrayList = new ArrayList<MemberInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMembers", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MemberInfo(resultingObject));
            }
            MemberInfo[] resultingArray = new MemberInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr, Binder binder, NetType[] types, ParameterModifier[] modifiers) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", name, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(types), toObjectFromArray(modifiers));
            return new MethodInfo(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo[] GetMethods(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<MethodInfo> resultingArrayList = new ArrayList<MethodInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMethods", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MethodInfo(resultingObject));
            }
            MethodInfo[] resultingArray = new MethodInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr, Binder binder, NetType returnType, NetType[] types, ParameterModifier[] modifiers) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProperty = (JCObject)classInstance.Invoke("GetProperty", name, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(types), toObjectFromArray(modifiers));
            return new PropertyInfo(objGetProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo[] GetProperties(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<PropertyInfo> resultingArrayList = new ArrayList<PropertyInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetProperties", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new PropertyInfo(resultingObject));
            }
            PropertyInfo[] resultingArray = new PropertyInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InvokeMember(java.lang.String name, BindingFlags invokeAttr, Binder binder, NetObject target, NetObject[] args, ParameterModifier[] modifiers, CultureInfo locale, java.lang.String[] namedParameters) throws Throwable, system.reflection.TargetException, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, microsoft.jscript.JScriptException, system.OverflowException, system.IndexOutOfRangeException, system.ArithmeticException, system.reflection.AmbiguousMatchException, system.MissingMemberException, system.InvalidCastException, system.security.SecurityException, system.MissingFieldException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvokeMember = (JCObject)classInstance.Invoke("InvokeMember", name, invokeAttr == null ? null : invokeAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), target == null ? null : target.getJCOInstance(), toObjectFromArray(args), toObjectFromArray(modifiers), locale == null ? null : locale.getJCOInstance(), namedParameters);
            return new NetObject(objInvokeMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public NetType getUnderlyingSystemType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UnderlyingSystemType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}