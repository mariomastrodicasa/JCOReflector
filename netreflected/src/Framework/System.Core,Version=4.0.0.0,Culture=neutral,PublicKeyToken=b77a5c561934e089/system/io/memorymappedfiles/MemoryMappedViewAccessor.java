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

package system.io.memorymappedfiles;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Decimal;
import system.Single;
import system.SByte;
import system.UInt16;
import system.UInt32;
import system.UInt64;
import microsoft.win32.safehandles.SafeMemoryMappedViewHandle;


/**
 * The base .NET class managing System.IO.MemoryMappedFiles.MemoryMappedViewAccessor, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MemoryMappedViewAccessor extends NetObject  {
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Core";
    public static final String className = "System.IO.MemoryMappedFiles.MemoryMappedViewAccessor";
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

    public MemoryMappedViewAccessor(Object instance) throws Throwable {
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

    public static MemoryMappedViewAccessor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MemoryMappedViewAccessor(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public void Flush() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.FileNotFoundException, system.FormatException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ReadBoolean(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ReadBoolean", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte ReadByte(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Invoke("ReadByte", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal ReadDecimal(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadDecimal = (JCObject)classInstance.Invoke("ReadDecimal", position);
            return new Decimal(objReadDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, boolean value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, byte value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, Decimal value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char ReadChar(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Invoke("ReadChar", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short ReadInt16(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Invoke("ReadInt16", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadInt32(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadInt32", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ReadInt64(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("ReadInt64", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single ReadSingle(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSingle = (JCObject)classInstance.Invoke("ReadSingle", position);
            return new Single(objReadSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double ReadDouble(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("ReadDouble", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SByte ReadSByte(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadSByte = (JCObject)classInstance.Invoke("ReadSByte", position);
            return new SByte(objReadSByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 ReadUInt16(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt16 = (JCObject)classInstance.Invoke("ReadUInt16", position);
            return new UInt16(objReadUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 ReadUInt32(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt32 = (JCObject)classInstance.Invoke("ReadUInt32", position);
            return new UInt32(objReadUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 ReadUInt64(long position) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadUInt64 = (JCObject)classInstance.Invoke("ReadUInt64", position);
            return new UInt64(objReadUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, char value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, short value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, int value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, long value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, Single value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, double value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, SByte value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, UInt16 value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, UInt32 value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long position, UInt64 value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", position, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public SafeMemoryMappedViewHandle getSafeMemoryMappedViewHandle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SafeMemoryMappedViewHandle");
            return new SafeMemoryMappedViewHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getPointerOffset() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("PointerOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getCapacity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Capacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRead() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanWrite() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}