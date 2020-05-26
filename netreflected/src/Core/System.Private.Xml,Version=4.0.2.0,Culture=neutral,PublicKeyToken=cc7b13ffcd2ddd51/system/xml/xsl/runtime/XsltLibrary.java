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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.xml.xsl.runtime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlQualifiedName;
import system.xml.xpath.XPathNavigator;


/**
 * The base .NET class managing System.Xml.Xsl.Runtime.XsltLibrary, System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class XsltLibrary extends NetObject  {
    public static final String assemblyFullName = "System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Private.Xml";
    public static final String className = "System.Xml.Xsl.Runtime.XsltLibrary";
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

    public XsltLibrary(Object instance) throws Throwable {
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

    public static XsltLibrary castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XsltLibrary(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public int CheckScriptNamespace(java.lang.String nsUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (int)classInstance.Invoke("CheckScriptNamespace", (Object)nsUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ElementAvailable(XmlQualifiedName name) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("ElementAvailable", (Object)name.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean FunctionAvailable(XmlQualifiedName name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            return (boolean)classInstance.Invoke("FunctionAvailable", (Object)name.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int RegisterDecimalFormat(XmlQualifiedName name, java.lang.String infinitySymbol, java.lang.String nanSymbol, java.lang.String characters) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException {
        try {
            return (int)classInstance.Invoke("RegisterDecimalFormat", (Object)name.getJCOInstance(), (Object)infinitySymbol, (Object)nanSymbol, (Object)characters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double RegisterDecimalFormatter(java.lang.String formatPicture, java.lang.String infinitySymbol, java.lang.String nanSymbol, java.lang.String characters) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException {
        try {
            return (double)classInstance.Invoke("RegisterDecimalFormatter", (Object)formatPicture, (Object)infinitySymbol, (Object)nanSymbol, (Object)characters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String FormatNumberStatic(double value, double decimalFormatterIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            return (java.lang.String)classInstance.Invoke("FormatNumberStatic", value, decimalFormatterIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String FormatNumberDynamic(double value, java.lang.String formatPicture, XmlQualifiedName decimalFormatName, java.lang.String errorMessageName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("FormatNumberDynamic", value, (Object)formatPicture, (Object)decimalFormatName.getJCOInstance(), (Object)errorMessageName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int LangToLcid(java.lang.String lang, boolean forwardCompatibility) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("LangToLcid", (Object)lang, forwardCompatibility);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSameNodeSort(XPathNavigator nav1, XPathNavigator nav2) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsSameNodeSort", (Object)nav1.getJCOInstance(), (Object)nav2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}