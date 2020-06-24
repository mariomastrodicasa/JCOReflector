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

package system.windows.xps;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Visual;
import system.printing.PrintTicket;


/**
 * The base .NET class managing System.Windows.Xps.VisualsToXpsDocument, System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class VisualsToXpsDocument extends NetObject  {
    public static final String assemblyFullName = "System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "System.Printing";
    public static final String className = "System.Windows.Xps.VisualsToXpsDocument";
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

    public VisualsToXpsDocument(Object instance) throws Throwable {
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

    public static VisualsToXpsDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VisualsToXpsDocument(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public void BeginBatchWrite() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginBatchWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.reflection.AmbiguousMatchException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelAsync() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.reflection.AmbiguousMatchException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndBatchWrite() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.windows.xps.XpsSerializationException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndBatchWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Visual visual) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.IndexOutOfRangeException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.xml.XmlException, system.io.FileFormatException, system.OverflowException, system.FormatException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", visual == null ? null : visual.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Visual visual, PrintTicket printTicket) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.IndexOutOfRangeException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.xml.XmlException, system.io.FileFormatException, system.OverflowException, system.FormatException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", visual == null ? null : visual.getJCOInstance(), printTicket == null ? null : printTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.IndexOutOfRangeException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.xml.XmlException, system.io.FileFormatException, system.OverflowException, system.FormatException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual, NetObject userSuppliedState) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.printing.PrintQueueException, system.ObjectDisposedException, system.io.InvalidDataException, system.io.FileFormatException, system.xml.XmlException, system.io.IOException, system.UriFormatException, system.OverflowException, system.FormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance(), userSuppliedState == null ? null : userSuppliedState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual, PrintTicket printTicket) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.IndexOutOfRangeException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.xml.XmlException, system.io.FileFormatException, system.OverflowException, system.FormatException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance(), printTicket == null ? null : printTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual, PrintTicket printTicket, NetObject userSuppliedState) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.printing.PrintQueueException, system.ObjectDisposedException, system.io.InvalidDataException, system.io.FileFormatException, system.xml.XmlException, system.io.IOException, system.UriFormatException, system.OverflowException, system.FormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance(), printTicket == null ? null : printTicket.getJCOInstance(), userSuppliedState == null ? null : userSuppliedState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}