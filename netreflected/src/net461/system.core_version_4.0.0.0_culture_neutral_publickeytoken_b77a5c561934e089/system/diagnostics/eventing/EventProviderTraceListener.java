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

package system.diagnostics.eventing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.TraceListener;
import system.diagnostics.TraceEventCache;
import system.diagnostics.TraceEventType;
import system.Guid;


/**
 * The base .NET class managing System.Diagnostics.Eventing.EventProviderTraceListener, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.EventProviderTraceListener" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.EventProviderTraceListener</a>
 */
public class EventProviderTraceListener extends TraceListener  {
    /**
     * Fully assembly qualified name: System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Core
     */
    public static final String assemblyShortName = "System.Core";
    /**
     * Qualified class name: System.Diagnostics.Eventing.EventProviderTraceListener
     */
    public static final String className = "System.Diagnostics.Eventing.EventProviderTraceListener";
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

    public EventProviderTraceListener(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EventProviderTraceListener}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EventProviderTraceListener} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EventProviderTraceListener cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EventProviderTraceListener(from.getJCOInstance());
    }

    // Constructors section
    
    public EventProviderTraceListener() throws Throwable {
    }

    public EventProviderTraceListener(java.lang.String providerId) throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(providerId));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventProviderTraceListener(java.lang.String providerId, java.lang.String name) throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(providerId, name));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventProviderTraceListener(java.lang.String providerId, java.lang.String name, java.lang.String delimiter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(providerId, name, delimiter));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Close() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Fail(java.lang.String message, java.lang.String detailMessage) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Fail", message, detailMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject data) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.NotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceData", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject... data) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.security.SecurityException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceData", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, toObjectFromArray(data));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceEvent", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String message) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.NotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceEvent", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceEvent", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, format, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceTransfer(TraceEventCache eventCache, java.lang.String source, int id, java.lang.String message, Guid relatedActivityId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.NotImplementedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.security.SecurityException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceTransfer", eventCache == null ? null : eventCache.getJCOInstance(), source, id, message, relatedActivityId == null ? null : relatedActivityId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String message) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(java.lang.String message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteLine", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getDelimiter() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException, system.InvalidOperationException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Delimiter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDelimiter(java.lang.String Delimiter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Delimiter", Delimiter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}