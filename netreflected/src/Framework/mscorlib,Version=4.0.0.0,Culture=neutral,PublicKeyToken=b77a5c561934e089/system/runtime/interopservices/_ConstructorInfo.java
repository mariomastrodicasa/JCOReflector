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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.UInt32;
import system.reflection.ParameterInfo;
import system.reflection.MethodImplAttributes;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.reflection.MemberTypes;
import system.RuntimeMethodHandle;
import system.reflection.MethodAttributes;
import system.reflection.CallingConventions;


/**
 * The base .NET class managing System.Runtime.InteropServices._ConstructorInfo, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 */
public interface _ConstructorInfo extends IJCOBridgeReflected {

    public static _ConstructorInfo To_ConstructorInfo(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType("System.Runtime.InteropServices._ConstructorInfo, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089" : "mscorlib"));
        NetType.AssertCast(classType, from);
        return new _ConstructorInfoImplementation(from.getJCOInstance());
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
    
    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable;

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable;

    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable;

    public ParameterInfo[] GetParameters() throws Throwable;

    public MethodImplAttributes GetMethodImplementationFlags() throws Throwable;

    public NetObject Invoke_2(NetObject obj, BindingFlags invokeAttr, Binder binder, NetObject[] parameters, CultureInfo culture) throws Throwable;

    public NetObject Invoke_3(NetObject obj, NetObject[] parameters) throws Throwable;

    public NetObject Invoke_4(BindingFlags invokeAttr, Binder binder, NetObject[] parameters, CultureInfo culture) throws Throwable;

    public NetObject Invoke_5(NetObject[] parameters) throws Throwable;


    
    // Properties section
    
    public MemberTypes getMemberType() throws Throwable;

    public java.lang.String getName() throws Throwable;

    public NetType getDeclaringType() throws Throwable;

    public NetType getReflectedType() throws Throwable;

    public RuntimeMethodHandle getMethodHandle() throws Throwable;

    public MethodAttributes getAttributes() throws Throwable;

    public CallingConventions getCallingConvention() throws Throwable;

    public boolean getIsPublic() throws Throwable;

    public boolean getIsPrivate() throws Throwable;

    public boolean getIsFamily() throws Throwable;

    public boolean getIsAssembly() throws Throwable;

    public boolean getIsFamilyAndAssembly() throws Throwable;

    public boolean getIsFamilyOrAssembly() throws Throwable;

    public boolean getIsStatic() throws Throwable;

    public boolean getIsFinal() throws Throwable;

    public boolean getIsVirtual() throws Throwable;

    public boolean getIsHideBySig() throws Throwable;

    public boolean getIsAbstract() throws Throwable;

    public boolean getIsSpecialName() throws Throwable;

    public boolean getIsConstructor() throws Throwable;



    // Instance Events section
    

}