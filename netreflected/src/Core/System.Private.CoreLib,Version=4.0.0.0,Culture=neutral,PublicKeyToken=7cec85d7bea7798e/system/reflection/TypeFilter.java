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
import java.util.ArrayList;

// Import section
import system.reflection.ITypeFilter;

/**
 * The base .NET class managing System.Reflection.TypeFilter, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link JCDelegate}. Implements {@link IJCEventEmit}, {@link IJCOBridgeReflected}
 */
public class TypeFilter extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.Reflection.TypeFilter";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    JCObject classInstance = null;
    ITypeFilter callerInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final Object EventRaised(Object... argsFromJCOBridge) {
        try
        {
            NetType m = argsFromJCOBridge[0] == null ? null : new NetType(argsFromJCOBridge[0]);
            NetObject filterCriteria = argsFromJCOBridge[1] == null ? null : new NetObject(argsFromJCOBridge[1]);


            Object retVal = null;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(m, filterCriteria);
            } else {
                retVal = Invoke(m, filterCriteria);
            }
            return retVal;
        }
        catch (Throwable throwableFromJCEvent)
        {
            if (JCOBridgeInstance.getDebug())
                throwableFromJCEvent.printStackTrace();
            return false;
        }
    }

    public final Object DelegateInvoked(Object... argsFromJCOBridge) {
        try
        {
            NetType m = argsFromJCOBridge[0] == null ? null : new NetType(argsFromJCOBridge[0]);
            NetObject filterCriteria = argsFromJCOBridge[1] == null ? null : new NetObject(argsFromJCOBridge[1]);


            Object retVal = null;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(m, filterCriteria);
            } else {
                retVal = Invoke(m, filterCriteria);
            }
            return retVal;
        }
        catch (Throwable throwableFromJCEvent)
        {
            if (JCOBridgeInstance.getDebug())
                throwableFromJCEvent.printStackTrace();
            return false;
        }
    }

    public TypeFilter() {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public TypeFilter(ITypeFilter instance) {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }

    public TypeFilter(Object instance) throws Throwable {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof ITypeFilter) {
            callerInstance = (ITypeFilter) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public final boolean DynamicInvoke(NetType m, NetObject filterCriteria) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DynamicInvoke", m == null ? null : m.getJCOInstance(), filterCriteria == null ? null : filterCriteria.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    public boolean Invoke(NetType m, NetObject filterCriteria) {
        return false;
    }
}