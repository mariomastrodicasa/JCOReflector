/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
import system.ValueType;
import system.xml.serialization.UnreferencedObjectEventHandler;
import system.xml.serialization.XmlAttributeEventHandler;
import system.xml.serialization.XmlElementEventHandler;
import system.xml.serialization.XmlNodeEventHandler;


/**
 * The base .NET class managing System.Xml.Serialization.XmlDeserializationEvents, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlDeserializationEvents" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlDeserializationEvents</a>
 */
public class XmlDeserializationEvents extends ValueType  {
    /**
     * Fully assembly qualified name: System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xml
     */
    public static final String assemblyShortName = "System.Xml";
    /**
     * Qualified class name: System.Xml.Serialization.XmlDeserializationEvents
     */
    public static final String className = "System.Xml.Serialization.XmlDeserializationEvents";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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

    public XmlDeserializationEvents(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlDeserializationEvents}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlDeserializationEvents} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlDeserializationEvents cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlDeserializationEvents(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlDeserializationEvents() throws Throwable {
    }



    
    // Methods section
    

    
    // Properties section
    
    public UnreferencedObjectEventHandler getOnUnreferencedObject() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (UnreferencedObjectEventHandler)classInstance.Get("OnUnreferencedObject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOnUnreferencedObject(UnreferencedObjectEventHandler OnUnreferencedObject) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OnUnreferencedObject", OnUnreferencedObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttributeEventHandler getOnUnknownAttribute() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (XmlAttributeEventHandler)classInstance.Get("OnUnknownAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOnUnknownAttribute(XmlAttributeEventHandler OnUnknownAttribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OnUnknownAttribute", OnUnknownAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElementEventHandler getOnUnknownElement() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (XmlElementEventHandler)classInstance.Get("OnUnknownElement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOnUnknownElement(XmlElementEventHandler OnUnknownElement) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OnUnknownElement", OnUnknownElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeEventHandler getOnUnknownNode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (XmlNodeEventHandler)classInstance.Get("OnUnknownNode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOnUnknownNode(XmlNodeEventHandler OnUnknownNode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OnUnknownNode", OnUnknownNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}