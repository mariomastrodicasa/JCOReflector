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

package system.runtime.serialization.json;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.serialization.json.DataContractJsonSerializerSettings;
import system.xml.XmlDictionaryString;
import system.xml.XmlDictionaryReader;
import system.xml.XmlReader;
import system.io.Stream;
import system.xml.XmlDictionaryWriter;
import system.xml.XmlWriter;
import system.runtime.serialization.DateTimeFormat;
import system.runtime.serialization.EmitTypeInformation;
import system.runtime.serialization.IDataContractSurrogate;
import system.runtime.serialization.IDataContractSurrogateImplementation;


/**
 * The base .NET class managing System.Runtime.Serialization.Json.DataContractJsonSerializer, System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataContractJsonSerializer extends NetObject  {
    public static final String assemblyFullName = "System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Runtime.Serialization";
    public static final String className = "System.Runtime.Serialization.Json.DataContractJsonSerializer";
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

    public DataContractJsonSerializer(Object instance) throws Throwable {
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

    public static DataContractJsonSerializer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataContractJsonSerializer(from.getJCOInstance());
    }

    // Constructors section
    

    public DataContractJsonSerializer(NetType type) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidOperationException, system.runtime.serialization.InvalidDataContractException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataContractJsonSerializer(NetType type, DataContractJsonSerializerSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.runtime.serialization.InvalidDataContractException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), settings == null ? null : settings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataContractJsonSerializer(NetType type, java.lang.String rootName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), rootName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataContractJsonSerializer(NetType type, XmlDictionaryString rootName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), rootName == null ? null : rootName.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean IsStartObject(XmlDictionaryReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsStartObject", reader == null ? null : reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsStartObject(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsStartObject", reader == null ? null : reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadObject(Stream stream) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadObject = (JCObject)classInstance.Invoke("ReadObject", stream == null ? null : stream.getJCOInstance());
            return new NetObject(objReadObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadObject(XmlDictionaryReader reader) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadObject = (JCObject)classInstance.Invoke("ReadObject", reader == null ? null : reader.getJCOInstance());
            return new NetObject(objReadObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadObject(XmlDictionaryReader reader, boolean verifyObjectName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadObject = (JCObject)classInstance.Invoke("ReadObject", reader == null ? null : reader.getJCOInstance(), verifyObjectName);
            return new NetObject(objReadObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadObject(XmlReader reader) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadObject = (JCObject)classInstance.Invoke("ReadObject", reader == null ? null : reader.getJCOInstance());
            return new NetObject(objReadObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadObject(XmlReader reader, boolean verifyObjectName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadObject = (JCObject)classInstance.Invoke("ReadObject", reader == null ? null : reader.getJCOInstance(), verifyObjectName);
            return new NetObject(objReadObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteEndObject(XmlDictionaryWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteEndObject", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteEndObject(XmlWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteEndObject", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteObject(Stream stream, NetObject graph) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteObject", stream == null ? null : stream.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteObject(XmlDictionaryWriter writer, NetObject graph) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteObject", writer == null ? null : writer.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteObject(XmlWriter writer, NetObject graph) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteObject", writer == null ? null : writer.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteObjectContent(XmlDictionaryWriter writer, NetObject graph) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteObjectContent", writer == null ? null : writer.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteObjectContent(XmlWriter writer, NetObject graph) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteObjectContent", writer == null ? null : writer.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartObject(XmlDictionaryWriter writer, NetObject graph) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteStartObject", writer == null ? null : writer.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartObject(XmlWriter writer, NetObject graph) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteStartObject", writer == null ? null : writer.getJCOInstance(), graph == null ? null : graph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIgnoreExtensionDataObject() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreExtensionDataObject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSerializeReadOnlyTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SerializeReadOnlyTypes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseSimpleDictionaryFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseSimpleDictionaryFormat");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxItemsInObjectGraph() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxItemsInObjectGraph");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeFormat getDateTimeFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DateTimeFormat");
            return new DateTimeFormat(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EmitTypeInformation getEmitTypeInformation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EmitTypeInformation");
            return new EmitTypeInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDataContractSurrogate getDataContractSurrogate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataContractSurrogate");
            return new IDataContractSurrogateImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}