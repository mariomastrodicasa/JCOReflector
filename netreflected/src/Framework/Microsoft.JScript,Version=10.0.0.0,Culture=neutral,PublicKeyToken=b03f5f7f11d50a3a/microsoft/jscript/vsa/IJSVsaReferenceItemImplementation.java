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
 *      This code was generated from a template using JCOReflector version 1.1.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.jscript.vsa;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.vsa.JSVsaItemType;


/**
 * The base .NET class managing Microsoft.JScript.Vsa.IJSVsaReferenceItem, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class IJSVsaReferenceItemImplementation extends NetObject implements IJSVsaReferenceItem {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.Vsa.IJSVsaReferenceItem";
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

    public IJSVsaReferenceItemImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static IJSVsaReferenceItem ToIJSVsaReferenceItem(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IJSVsaReferenceItemImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public NetObject GetOption(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOption = (JCObject)classInstance.Invoke("GetOption", name);
            return new NetObject(objGetOption);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOption(java.lang.String name, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOption", name, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getAssemblyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AssemblyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyName(java.lang.String AssemblyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AssemblyName", AssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Name", Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JSVsaItemType getItemType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ItemType");
            return new JSVsaItemType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDirty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDirty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}