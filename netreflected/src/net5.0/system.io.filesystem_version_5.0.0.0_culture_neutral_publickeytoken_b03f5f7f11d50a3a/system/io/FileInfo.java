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

package system.io;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.FileSystemInfo;
import system.io.FileInfo;
import system.io.FileStream;
import system.io.FileMode;
import system.io.FileAccess;
import system.io.FileShare;
import system.io.StreamReader;
import system.io.StreamWriter;
import system.io.DirectoryInfo;


/**
 * The base .NET class managing System.IO.FileInfo, System.IO.FileSystem, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.FileInfo" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.FileInfo</a>
 */
public class FileInfo extends FileSystemInfo  {
    /**
     * Fully assembly qualified name: System.IO.FileSystem, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.IO.FileSystem, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.IO.FileSystem
     */
    public static final String assemblyShortName = "System.IO.FileSystem";
    /**
     * Qualified class name: System.IO.FileInfo
     */
    public static final String className = "System.IO.FileInfo";
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

    public FileInfo(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FileInfo}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FileInfo} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FileInfo cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FileInfo(from.getJCOInstance());
    }

    // Constructors section
    
    public FileInfo() throws Throwable {
    }

    public FileInfo(java.lang.String fileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(fileName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public FileInfo CopyTo(java.lang.String destFileName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCopyTo = (JCObject)classInstance.Invoke("CopyTo", destFileName);
            return new FileInfo(objCopyTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileInfo CopyTo(java.lang.String destFileName, boolean overwrite) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArrayTypeMismatchException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCopyTo = (JCObject)classInstance.Invoke("CopyTo", destFileName, overwrite);
            return new FileInfo(objCopyTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileInfo Replace(java.lang.String destinationFileName, java.lang.String destinationBackupFileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReplace = (JCObject)classInstance.Invoke("Replace", destinationFileName, destinationBackupFileName);
            return new FileInfo(objReplace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileInfo Replace(java.lang.String destinationFileName, java.lang.String destinationBackupFileName, boolean ignoreMetadataErrors) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReplace = (JCObject)classInstance.Invoke("Replace", destinationFileName, destinationBackupFileName, ignoreMetadataErrors);
            return new FileInfo(objReplace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream Create() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreate = (JCObject)classInstance.Invoke("Create");
            return new FileStream(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream Open(FileMode mode) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", mode == null ? null : mode.getJCOInstance());
            return new FileStream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream Open(FileMode mode, FileAccess access) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance());
            return new FileStream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream Open(FileMode mode, FileAccess access, FileShare share) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpen = (JCObject)classInstance.Invoke("Open", mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance(), share == null ? null : share.getJCOInstance());
            return new FileStream(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream OpenRead() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenRead = (JCObject)classInstance.Invoke("OpenRead");
            return new FileStream(objOpenRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream OpenWrite() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenWrite = (JCObject)classInstance.Invoke("OpenWrite");
            return new FileStream(objOpenWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StreamReader OpenText() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOpenText = (JCObject)classInstance.Invoke("OpenText");
            return new StreamReader(objOpenText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StreamWriter AppendText() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAppendText = (JCObject)classInstance.Invoke("AppendText");
            return new StreamWriter(objAppendText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StreamWriter CreateText() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateText = (JCObject)classInstance.Invoke("CreateText");
            return new StreamWriter(objCreateText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Decrypt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Encrypt() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Encrypt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(java.lang.String destFileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.io.DirectoryNotFoundException, system.io.FileNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", destFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(java.lang.String destFileName, boolean overwrite) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.io.DirectoryNotFoundException, system.io.FileNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", destFileName, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsReadOnly() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsReadOnly(boolean IsReadOnly) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsReadOnly", IsReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getLength() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.FormatException, system.io.FileNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryInfo getDirectory() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Directory");
            return new DirectoryInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDirectoryName() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DirectoryName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}