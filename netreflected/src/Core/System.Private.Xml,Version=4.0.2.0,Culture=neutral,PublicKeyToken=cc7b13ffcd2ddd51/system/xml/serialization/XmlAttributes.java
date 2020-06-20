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

package system.xml.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.ICustomAttributeProvider;
import system.reflection.ICustomAttributeProviderImplementation;
import system.xml.serialization.XmlElementAttributes;
import system.xml.serialization.XmlAttributeAttribute;
import system.xml.serialization.XmlEnumAttribute;
import system.xml.serialization.XmlTextAttribute;
import system.xml.serialization.XmlArrayAttribute;
import system.xml.serialization.XmlArrayItemAttributes;
import system.xml.serialization.XmlTypeAttribute;
import system.xml.serialization.XmlRootAttribute;
import system.xml.serialization.XmlAnyElementAttributes;
import system.xml.serialization.XmlAnyAttributeAttribute;
import system.xml.serialization.XmlChoiceIdentifierAttribute;


/**
 * The base .NET class managing System.Xml.Serialization.XmlAttributes, System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class XmlAttributes extends NetObject  {
    public static final String assemblyFullName = "System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    public static final String assemblyShortName = "System.Private.Xml";
    public static final String className = "System.Xml.Serialization.XmlAttributes";
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

    public XmlAttributes(Object instance) throws Throwable {
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

    public static XmlAttributes cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlAttributes(from.getJCOInstance());
    }

    // Constructors section
    

    public XmlAttributes() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttributes(ICustomAttributeProvider provider) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(provider == null ? null : provider.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public XmlElementAttributes getXmlElements() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlElements");
            return new XmlElementAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttributeAttribute getXmlAttribute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlAttribute");
            return new XmlAttributeAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlAttribute(XmlAttributeAttribute XmlAttribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlAttribute", XmlAttribute == null ? null : XmlAttribute.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlEnumAttribute getXmlEnum() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlEnum");
            return new XmlEnumAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlEnum(XmlEnumAttribute XmlEnum) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlEnum", XmlEnum == null ? null : XmlEnum.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTextAttribute getXmlText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlText");
            return new XmlTextAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlText(XmlTextAttribute XmlText) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlText", XmlText == null ? null : XmlText.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlArrayAttribute getXmlArray() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlArray");
            return new XmlArrayAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlArray(XmlArrayAttribute XmlArray) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlArray", XmlArray == null ? null : XmlArray.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlArrayItemAttributes getXmlArrayItems() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlArrayItems");
            return new XmlArrayItemAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getXmlDefaultValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlDefaultValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlDefaultValue(NetObject XmlDefaultValue) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlDefaultValue", XmlDefaultValue == null ? null : XmlDefaultValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getXmlIgnore() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("XmlIgnore");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlIgnore(boolean XmlIgnore) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlIgnore", XmlIgnore);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeAttribute getXmlType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlType");
            return new XmlTypeAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlType(XmlTypeAttribute XmlType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlType", XmlType == null ? null : XmlType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlRootAttribute getXmlRoot() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlRoot");
            return new XmlRootAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlRoot(XmlRootAttribute XmlRoot) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlRoot", XmlRoot == null ? null : XmlRoot.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAnyElementAttributes getXmlAnyElements() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlAnyElements");
            return new XmlAnyElementAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAnyAttributeAttribute getXmlAnyAttribute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlAnyAttribute");
            return new XmlAnyAttributeAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlAnyAttribute(XmlAnyAttributeAttribute XmlAnyAttribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlAnyAttribute", XmlAnyAttribute == null ? null : XmlAnyAttribute.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlChoiceIdentifierAttribute getXmlChoiceIdentifier() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlChoiceIdentifier");
            return new XmlChoiceIdentifierAttribute(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getXmlns() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Xmlns");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlns(boolean Xmlns) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Xmlns", Xmlns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}