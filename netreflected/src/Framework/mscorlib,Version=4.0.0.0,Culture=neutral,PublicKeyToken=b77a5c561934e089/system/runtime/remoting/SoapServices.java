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

package system.runtime.remoting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.MethodBase;
import system.reflection.Assembly;


/**
 * The base .NET class managing System.Runtime.Remoting.SoapServices, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.SoapServices" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.SoapServices</a>
 */
public class SoapServices extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.Remoting.SoapServices
     */
    public static final String className = "System.Runtime.Remoting.SoapServices";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public SoapServices(Object instance) throws Throwable {
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SoapServices}, a cast assert is made to check if types are compatible.
     */
    public static SoapServices cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SoapServices(from.getJCOInstance());
    }

    // Constructors section
    
    public SoapServices() throws Throwable {
    }



    
    // Methods section
    
    public static boolean IsClrTypeNamespace(java.lang.String namespaceString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsClrTypeNamespace", namespaceString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsSoapActionValidForMethodBase(java.lang.String soapAction, MethodBase mb) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotImplementedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsSoapActionValidForMethodBase", soapAction, mb == null ? null : mb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String CodeXmlNamespaceForClrTypeNamespace(java.lang.String typeNamespace, java.lang.String assemblyName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("CodeXmlNamespaceForClrTypeNamespace", typeNamespace, assemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetSoapActionFromMethodBase(MethodBase mb) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetSoapActionFromMethodBase", mb == null ? null : mb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetXmlNamespaceForMethodCall(MethodBase mb) throws Throwable, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetXmlNamespaceForMethodCall", mb == null ? null : mb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetXmlNamespaceForMethodResponse(MethodBase mb) throws Throwable, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetXmlNamespaceForMethodResponse", mb == null ? null : mb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetInteropTypeFromXmlElement(java.lang.String xmlElement, java.lang.String xmlNamespace) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetInteropTypeFromXmlElement = (JCObject)classType.Invoke("GetInteropTypeFromXmlElement", xmlElement, xmlNamespace);
            return new NetType(objGetInteropTypeFromXmlElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetInteropTypeFromXmlType(java.lang.String xmlType, java.lang.String xmlTypeNamespace) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetInteropTypeFromXmlType = (JCObject)classType.Invoke("GetInteropTypeFromXmlType", xmlType, xmlTypeNamespace);
            return new NetType(objGetInteropTypeFromXmlType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PreLoad(Assembly assembly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("PreLoad", assembly == null ? null : assembly.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PreLoad(NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("PreLoad", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterInteropXmlElement(java.lang.String xmlElement, java.lang.String xmlNamespace, NetType type) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RegisterInteropXmlElement", xmlElement, xmlNamespace, type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterInteropXmlType(java.lang.String xmlType, java.lang.String xmlTypeNamespace, NetType type) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RegisterInteropXmlType", xmlType, xmlTypeNamespace, type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterSoapActionForMethodBase(MethodBase mb) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RegisterSoapActionForMethodBase", mb == null ? null : mb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterSoapActionForMethodBase(MethodBase mb, java.lang.String soapAction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RegisterSoapActionForMethodBase", mb == null ? null : mb.getJCOInstance(), soapAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static java.lang.String getXmlNsForClrType() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("XmlNsForClrType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getXmlNsForClrTypeWithAssembly() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("XmlNsForClrTypeWithAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getXmlNsForClrTypeWithNs() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("XmlNsForClrTypeWithNs");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getXmlNsForClrTypeWithNsAndAssembly() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("XmlNsForClrTypeWithNsAndAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}