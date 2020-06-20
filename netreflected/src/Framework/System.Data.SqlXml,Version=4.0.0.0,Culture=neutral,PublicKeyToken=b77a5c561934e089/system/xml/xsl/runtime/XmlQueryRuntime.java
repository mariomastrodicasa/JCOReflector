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

package system.xml.xsl.runtime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.IList;
import system.collections.IListImplementation;
import system.xml.xsl.runtime.XmlNavigatorFilter;
import system.xml.xpath.XPathNodeType;
import system.xml.XmlQualifiedName;
import system.xml.xpath.XPathNavigator;
import system.xml.xpath.XPathItem;
import system.xml.schema.XmlTypeCode;
import system.xml.xsl.runtime.XmlCollation;
import system.xml.xsl.runtime.XmlILIndex;
import system.xml.xsl.runtime.XmlQueryContext;
import system.xml.xsl.runtime.XsltLibrary;
import system.xml.XmlNameTable;
import system.xml.xsl.runtime.XmlQueryOutput;


/**
 * The base .NET class managing System.Xml.Xsl.Runtime.XmlQueryRuntime, System.Data.SqlXml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlQueryRuntime extends NetObject  {
    public static final String assemblyFullName = "System.Data.SqlXml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data.SqlXml";
    public static final String className = "System.Xml.Xsl.Runtime.XmlQueryRuntime";
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

    public XmlQueryRuntime(Object instance) throws Throwable {
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

    public static XmlQueryRuntime cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlQueryRuntime(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public java.lang.String[] DebugGetGlobalNames() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DebugGetGlobalNames");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexDebugGetGlobalNames = 0; indexDebugGetGlobalNames < resultingArrayList.size(); indexDebugGetGlobalNames++ ) {
				resultingArray[indexDebugGetGlobalNames] = (java.lang.String)resultingArrayList.get(indexDebugGetGlobalNames);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList DebugGetGlobalValue(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDebugGetGlobalValue = (JCObject)classInstance.Invoke("DebugGetGlobalValue", name);
            return new IListImplementation(objDebugGetGlobalValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject DebugGetXsltValue(IList seq) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDebugGetXsltValue = (JCObject)classInstance.Invoke("DebugGetXsltValue", seq == null ? null : seq.getJCOInstance());
            return new NetObject(objDebugGetXsltValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean EarlyBoundFunctionExists(java.lang.String name, java.lang.String namespaceUri) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("EarlyBoundFunctionExists", name, namespaceUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsGlobalComputed(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsGlobalComputed", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetGlobalValue(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGlobalValue = (JCObject)classInstance.Invoke("GetGlobalValue", index);
            return new NetObject(objGetGlobalValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGlobalValue(int index, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetGlobalValue", index, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAtomizedName(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAtomizedName", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNavigatorFilter GetNameFilter(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetNameFilter = (JCObject)classInstance.Invoke("GetNameFilter", index);
            return new XmlNavigatorFilter(objGetNameFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNavigatorFilter GetTypeFilter(XPathNodeType nodeType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTypeFilter = (JCObject)classInstance.Invoke("GetTypeFilter", nodeType == null ? null : nodeType.getJCOInstance());
            return new XmlNavigatorFilter(objGetTypeFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlQualifiedName ParseTagName(java.lang.String tagName, int indexPrefixMappings) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException, system.ObjectDisposedException, system.NullReferenceException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseTagName = (JCObject)classInstance.Invoke("ParseTagName", tagName, indexPrefixMappings);
            return new XmlQualifiedName(objParseTagName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlQualifiedName ParseTagName(java.lang.String tagName, java.lang.String ns) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseTagName = (JCObject)classInstance.Invoke("ParseTagName", tagName, ns);
            return new XmlQualifiedName(objParseTagName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsQNameEqual(XPathNavigator n1, XPathNavigator n2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsQNameEqual", n1 == null ? null : n1.getJCOInstance(), n2 == null ? null : n2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsQNameEqual(XPathNavigator navigator, int indexLocalName, int indexNamespaceUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsQNameEqual", navigator == null ? null : navigator.getJCOInstance(), indexLocalName, indexNamespaceUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ChangeTypeXsltArgument(int indexType, NetObject value, NetType destinationType) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.OverflowException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeTypeXsltArgument = (JCObject)classInstance.Invoke("ChangeTypeXsltArgument", indexType, value == null ? null : value.getJCOInstance(), destinationType == null ? null : destinationType.getJCOInstance());
            return new NetObject(objChangeTypeXsltArgument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ChangeTypeXsltResult(int indexType, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.OverflowException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeTypeXsltResult = (JCObject)classInstance.Invoke("ChangeTypeXsltResult", indexType, value == null ? null : value.getJCOInstance());
            return new NetObject(objChangeTypeXsltResult);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MatchesXmlType(XPathItem item, int indexType) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MatchesXmlType", item == null ? null : item.getJCOInstance(), indexType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MatchesXmlType(XPathItem item, XmlTypeCode code) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MatchesXmlType", item == null ? null : item.getJCOInstance(), code == null ? null : code.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlCollation GetCollation(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCollation = (JCObject)classInstance.Invoke("GetCollation", index);
            return new XmlCollation(objGetCollation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlCollation CreateCollation(java.lang.String collation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCollation = (JCObject)classInstance.Invoke("CreateCollation", collation);
            return new XmlCollation(objCreateCollation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ComparePosition(XPathNavigator navigatorThis, XPathNavigator navigatorThat) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ComparePosition", navigatorThis == null ? null : navigatorThis.getJCOInstance(), navigatorThat == null ? null : navigatorThat.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XPathNavigator TextRtfConstruction(java.lang.String text, java.lang.String baseUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTextRtfConstruction = (JCObject)classInstance.Invoke("TextRtfConstruction", text, baseUri);
            return new XPathNavigator(objTextRtfConstruction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendMessage(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendMessage", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ThrowException(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ThrowException", text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int OnCurrentNodeChanged(XPathNavigator currentNode) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("OnCurrentNodeChanged", currentNode == null ? null : currentNode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DebugSetGlobalValue(java.lang.String name, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DebugSetGlobalValue", name, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetEarlyBoundObject(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEarlyBoundObject = (JCObject)classInstance.Invoke("GetEarlyBoundObject", index);
            return new NetObject(objGetEarlyBoundObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GenerateId(XPathNavigator navigator) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GenerateId", navigator == null ? null : navigator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddNewIndex(XPathNavigator context, int indexId, XmlILIndex index) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddNewIndex", context == null ? null : context.getJCOInstance(), indexId, index == null ? null : index.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public XmlQueryContext getExternalContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExternalContext");
            return new XmlQueryContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XsltLibrary getXsltFunctions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XsltFunctions");
            return new XsltLibrary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNameTable getNameTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NameTable");
            return new XmlNameTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlQueryOutput getOutput() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Output");
            return new XmlQueryOutput(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}