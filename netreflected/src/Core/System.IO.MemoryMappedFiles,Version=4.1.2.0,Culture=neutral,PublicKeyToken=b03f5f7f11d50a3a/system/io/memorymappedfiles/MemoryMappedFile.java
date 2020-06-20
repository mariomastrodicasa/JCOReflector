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
import system.io.memorymappedfiles.MemoryMappedFile;
import system.io.memorymappedfiles.MemoryMappedFileRights;
import system.io.HandleInheritability;
import system.io.FileMode;
import system.io.memorymappedfiles.MemoryMappedFileAccess;
import system.io.FileStream;
import system.io.memorymappedfiles.MemoryMappedFileOptions;
import system.io.memorymappedfiles.MemoryMappedViewStream;
import system.io.memorymappedfiles.MemoryMappedViewAccessor;
import microsoft.win32.safehandles.SafeMemoryMappedFileHandle;


/**
 * The base .NET class managing System.IO.MemoryMappedFiles.MemoryMappedFile, System.IO.MemoryMappedFiles, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MemoryMappedFile extends NetObject  {
    public static final String assemblyFullName = "System.IO.MemoryMappedFiles, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.IO.MemoryMappedFiles";
    public static final String className = "System.IO.MemoryMappedFiles.MemoryMappedFile";
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

    public MemoryMappedFile(Object instance) throws Throwable {
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

    public static MemoryMappedFile cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MemoryMappedFile(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static MemoryMappedFile OpenExisting(java.lang.String mapName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenExisting = (JCObject)classType.Invoke("OpenExisting", mapName);
            return new MemoryMappedFile(objOpenExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile OpenExisting(java.lang.String mapName, MemoryMappedFileRights desiredAccessRights) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenExisting = (JCObject)classType.Invoke("OpenExisting", mapName, desiredAccessRights == null ? null : desiredAccessRights.getJCOInstance());
            return new MemoryMappedFile(objOpenExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile OpenExisting(java.lang.String mapName, MemoryMappedFileRights desiredAccessRights, HandleInheritability inheritability) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenExisting = (JCObject)classType.Invoke("OpenExisting", mapName, desiredAccessRights == null ? null : desiredAccessRights.getJCOInstance(), inheritability == null ? null : inheritability.getJCOInstance());
            return new MemoryMappedFile(objOpenExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateFromFile(java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromFile = (JCObject)classType.Invoke("CreateFromFile", path);
            return new MemoryMappedFile(objCreateFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateFromFile(java.lang.String path, FileMode mode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromFile = (JCObject)classType.Invoke("CreateFromFile", path, mode == null ? null : mode.getJCOInstance());
            return new MemoryMappedFile(objCreateFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateFromFile(java.lang.String path, FileMode mode, java.lang.String mapName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromFile = (JCObject)classType.Invoke("CreateFromFile", path, mode == null ? null : mode.getJCOInstance(), mapName);
            return new MemoryMappedFile(objCreateFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateFromFile(java.lang.String path, FileMode mode, java.lang.String mapName, long capacity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromFile = (JCObject)classType.Invoke("CreateFromFile", path, mode == null ? null : mode.getJCOInstance(), mapName, capacity);
            return new MemoryMappedFile(objCreateFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateFromFile(java.lang.String path, FileMode mode, java.lang.String mapName, long capacity, MemoryMappedFileAccess access) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromFile = (JCObject)classType.Invoke("CreateFromFile", path, mode == null ? null : mode.getJCOInstance(), mapName, capacity, access == null ? null : access.getJCOInstance());
            return new MemoryMappedFile(objCreateFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateFromFile(FileStream fileStream, java.lang.String mapName, long capacity, MemoryMappedFileAccess access, HandleInheritability inheritability, boolean leaveOpen) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromFile = (JCObject)classType.Invoke("CreateFromFile", fileStream == null ? null : fileStream.getJCOInstance(), mapName, capacity, access == null ? null : access.getJCOInstance(), inheritability == null ? null : inheritability.getJCOInstance(), leaveOpen);
            return new MemoryMappedFile(objCreateFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateNew(java.lang.String mapName, long capacity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateNew = (JCObject)classType.Invoke("CreateNew", mapName, capacity);
            return new MemoryMappedFile(objCreateNew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateNew(java.lang.String mapName, long capacity, MemoryMappedFileAccess access) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateNew = (JCObject)classType.Invoke("CreateNew", mapName, capacity, access == null ? null : access.getJCOInstance());
            return new MemoryMappedFile(objCreateNew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateNew(java.lang.String mapName, long capacity, MemoryMappedFileAccess access, MemoryMappedFileOptions options, HandleInheritability inheritability) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateNew = (JCObject)classType.Invoke("CreateNew", mapName, capacity, access == null ? null : access.getJCOInstance(), options == null ? null : options.getJCOInstance(), inheritability == null ? null : inheritability.getJCOInstance());
            return new MemoryMappedFile(objCreateNew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateOrOpen(java.lang.String mapName, long capacity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateOrOpen = (JCObject)classType.Invoke("CreateOrOpen", mapName, capacity);
            return new MemoryMappedFile(objCreateOrOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateOrOpen(java.lang.String mapName, long capacity, MemoryMappedFileAccess access) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateOrOpen = (JCObject)classType.Invoke("CreateOrOpen", mapName, capacity, access == null ? null : access.getJCOInstance());
            return new MemoryMappedFile(objCreateOrOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MemoryMappedFile CreateOrOpen(java.lang.String mapName, long capacity, MemoryMappedFileAccess access, MemoryMappedFileOptions options, HandleInheritability inheritability) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateOrOpen = (JCObject)classType.Invoke("CreateOrOpen", mapName, capacity, access == null ? null : access.getJCOInstance(), options == null ? null : options.getJCOInstance(), inheritability == null ? null : inheritability.getJCOInstance());
            return new MemoryMappedFile(objCreateOrOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryMappedViewStream CreateViewStream() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateViewStream = (JCObject)classInstance.Invoke("CreateViewStream");
            return new MemoryMappedViewStream(objCreateViewStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryMappedViewStream CreateViewStream(long offset, long size) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateViewStream = (JCObject)classInstance.Invoke("CreateViewStream", offset, size);
            return new MemoryMappedViewStream(objCreateViewStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryMappedViewStream CreateViewStream(long offset, long size, MemoryMappedFileAccess access) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.io.IOException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateViewStream = (JCObject)classInstance.Invoke("CreateViewStream", offset, size, access == null ? null : access.getJCOInstance());
            return new MemoryMappedViewStream(objCreateViewStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryMappedViewAccessor CreateViewAccessor() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateViewAccessor = (JCObject)classInstance.Invoke("CreateViewAccessor");
            return new MemoryMappedViewAccessor(objCreateViewAccessor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryMappedViewAccessor CreateViewAccessor(long offset, long size) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.IOException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateViewAccessor = (JCObject)classInstance.Invoke("CreateViewAccessor", offset, size);
            return new MemoryMappedViewAccessor(objCreateViewAccessor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryMappedViewAccessor CreateViewAccessor(long offset, long size, MemoryMappedFileAccess access) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.io.IOException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateViewAccessor = (JCObject)classInstance.Invoke("CreateViewAccessor", offset, size, access == null ? null : access.getJCOInstance());
            return new MemoryMappedViewAccessor(objCreateViewAccessor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public SafeMemoryMappedFileHandle getSafeMemoryMappedFileHandle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SafeMemoryMappedFileHandle");
            return new SafeMemoryMappedFileHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}