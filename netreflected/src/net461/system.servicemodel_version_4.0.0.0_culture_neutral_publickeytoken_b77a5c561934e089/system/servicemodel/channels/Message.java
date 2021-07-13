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

package system.servicemodel.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.xml.XmlDictionaryWriter;
import system.AsyncCallback;
import system.servicemodel.channels.Message;
import system.servicemodel.channels.MessageVersion;
import system.servicemodel.channels.MessageFault;
import system.servicemodel.FaultCode;
import system.runtime.serialization.XmlObjectSerializer;
import system.servicemodel.channels.BodyWriter;
import system.xml.XmlDictionaryReader;
import system.xml.XmlReader;
import system.servicemodel.channels.MessageBuffer;
import system.xml.XmlWriter;
import system.servicemodel.channels.MessageHeaders;
import system.servicemodel.channels.MessageProperties;
import system.servicemodel.channels.MessageState;
import system.IDisposable;
import system.IDisposableImplementation;


/**
 * The base .NET class managing System.ServiceModel.Channels.Message, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Channels.Message" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Channels.Message</a>
 */
public class Message extends NetObject implements system.IDisposable, AutoCloseable {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Channels.Message
     */
    public static final String className = "System.ServiceModel.Channels.Message";
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

    public Message(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Message}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Message} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Message cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Message(from.getJCOInstance());
    }

    // Constructors section
    
    public Message() throws Throwable {
    }

    
    // Methods section
    
    public IAsyncResult BeginWriteBodyContents(XmlDictionaryWriter writer, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginWriteBodyContents = (JCObject)classInstance.Invoke("BeginWriteBodyContents", writer == null ? null : writer.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginWriteBodyContents);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginWriteMessage(XmlDictionaryWriter writer, AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginWriteMessage = (JCObject)classInstance.Invoke("BeginWriteMessage", writer == null ? null : writer.getJCOInstance(), callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginWriteMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, MessageFault fault, java.lang.String action) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), fault == null ? null : fault.getJCOInstance(), action);
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, FaultCode faultCode, java.lang.String reason, NetObject detail, java.lang.String action) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), faultCode == null ? null : faultCode.getJCOInstance(), reason, detail == null ? null : detail.getJCOInstance(), action);
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, FaultCode faultCode, java.lang.String reason, java.lang.String action) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), faultCode == null ? null : faultCode.getJCOInstance(), reason, action);
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, java.lang.String action) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), action);
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, java.lang.String action, NetObject body) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentOutOfRangeException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), action, body == null ? null : body.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, java.lang.String action, NetObject body, XmlObjectSerializer serializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), action, body == null ? null : body.getJCOInstance(), serializer == null ? null : serializer.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, java.lang.String action, BodyWriter body) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), action, body == null ? null : body.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, java.lang.String action, XmlDictionaryReader body) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), action, body == null ? null : body.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(MessageVersion version, java.lang.String action, XmlReader body) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", version == null ? null : version.getJCOInstance(), action, body == null ? null : body.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(XmlDictionaryReader envelopeReader, int maxSizeOfHeaders, MessageVersion version) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", envelopeReader == null ? null : envelopeReader.getJCOInstance(), maxSizeOfHeaders, version == null ? null : version.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Message CreateMessage(XmlReader envelopeReader, int maxSizeOfHeaders, MessageVersion version) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMessage = (JCObject)classType.Invoke("CreateMessage", envelopeReader == null ? null : envelopeReader.getJCOInstance(), maxSizeOfHeaders, version == null ? null : version.getJCOInstance());
            return new Message(objCreateMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageBuffer CreateBufferedCopy(int maxBufferSize) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateBufferedCopy = (JCObject)classInstance.Invoke("CreateBufferedCopy", maxBufferSize);
            return new MessageBuffer(objCreateBufferedCopy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetBodyAttribute(java.lang.String localName, java.lang.String ns) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetBodyAttribute", localName, ns);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlDictionaryReader GetReaderAtBodyContents() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetReaderAtBodyContents = (JCObject)classInstance.Invoke("GetReaderAtBodyContents");
            return new XmlDictionaryReader(objGetReaderAtBodyContents);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.FormatException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndWriteBodyContents(IAsyncResult result) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndWriteBodyContents", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndWriteMessage(IAsyncResult result) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndWriteMessage", result == null ? null : result.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteBody(XmlDictionaryWriter writer) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteBody", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteBody(XmlWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteBody", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteBodyContents(XmlDictionaryWriter writer) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteBodyContents", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteMessage(XmlDictionaryWriter writer) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteMessage", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteMessage(XmlWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteMessage", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartBody(XmlDictionaryWriter writer) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteStartBody", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartBody(XmlWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteStartBody", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartEnvelope(XmlDictionaryWriter writer) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteStartEnvelope", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIDisposable method available in IDisposable to obtain an object with an invocable method
     */
    @Deprecated 
    public void Dispose() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIDisposable to obtain the full interface.");
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public boolean getIsEmpty() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFault() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsFault");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageHeaders getHeaders() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Headers");
            return new MessageHeaders(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageProperties getProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new MessageProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageState getState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new MessageState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageVersion getVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Version");
            return new MessageVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}