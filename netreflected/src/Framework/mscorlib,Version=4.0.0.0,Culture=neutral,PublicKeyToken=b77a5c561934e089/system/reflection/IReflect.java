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

package system.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.reflection.MethodInfo;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.reflection.ParameterModifier;
import system.reflection.FieldInfo;
import system.reflection.PropertyInfo;
import system.reflection.MemberInfo;
import system.globalization.CultureInfo;


/**
 * The base .NET class managing System.Reflection.IReflect, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 */
public interface IReflect extends IJCOBridgeReflected {

    public static IReflect ToIReflect(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType("System.Reflection.IReflect, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089" : "mscorlib"));
        NetType.AssertCast(classType, from);
        return new IReflectImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr, Binder binder, NetType[] types, ParameterModifier[] modifiers) throws Throwable;

    public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr) throws Throwable;

    public MethodInfo[] GetMethods(BindingFlags bindingAttr) throws Throwable;

    public FieldInfo GetField(java.lang.String name, BindingFlags bindingAttr) throws Throwable;

    public FieldInfo[] GetFields(BindingFlags bindingAttr) throws Throwable;

    public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr) throws Throwable;

    public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr, Binder binder, NetType returnType, NetType[] types, ParameterModifier[] modifiers) throws Throwable;

    public PropertyInfo[] GetProperties(BindingFlags bindingAttr) throws Throwable;

    public MemberInfo[] GetMember(java.lang.String name, BindingFlags bindingAttr) throws Throwable;

    public MemberInfo[] GetMembers(BindingFlags bindingAttr) throws Throwable;

    public NetObject InvokeMember(java.lang.String name, BindingFlags invokeAttr, Binder binder, NetObject target, NetObject[] args, ParameterModifier[] modifiers, CultureInfo culture, java.lang.String[] namedParameters) throws Throwable;


    
    // Properties section
    
    public NetType getUnderlyingSystemType() throws Throwable;



    // Instance Events section
    

}