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

package system.data.oracleclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.oracleclient.OracleString;
import system.data.oracleclient.OracleBoolean;


/**
 * The base .NET class managing System.Data.OracleClient.OracleString, System.Data.OracleClient, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class OracleString extends NetObject  {
    public static final String assemblyFullName = "System.Data.OracleClient, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data.OracleClient";
    public static final String className = "System.Data.OracleClient.OracleString";
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

    public OracleString(Object instance) throws Throwable {
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

    public static OracleString cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OracleString(from.getJCOInstance());
    }

    // Constructors section
    

    public OracleString(java.lang.String s) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(s));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public int CompareTo(NetObject obj) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleString Concat(OracleString x, OracleString y) throws Throwable, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConcat = (JCObject)classType.Invoke("Concat", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleString(objConcat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleBoolean Equals(OracleString x, OracleString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleBoolean GreaterThan(OracleString x, OracleString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleBoolean GreaterThanOrEqual(OracleString x, OracleString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleBoolean LessThan(OracleString x, OracleString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleBoolean LessThanOrEqual(OracleString x, OracleString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static OracleBoolean NotEquals(OracleString x, OracleString y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNotEquals = (JCObject)classType.Invoke("NotEquals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new OracleBoolean(objNotEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsNull() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLength() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValue() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}