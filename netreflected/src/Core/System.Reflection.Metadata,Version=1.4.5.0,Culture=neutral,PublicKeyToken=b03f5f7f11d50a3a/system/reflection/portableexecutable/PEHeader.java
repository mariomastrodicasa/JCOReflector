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

package system.reflection.portableexecutable;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.portableexecutable.PEMagic;
import system.UInt64;
import system.UInt16;
import system.UInt32;
import system.reflection.portableexecutable.Subsystem;
import system.reflection.portableexecutable.DllCharacteristics;
import system.reflection.portableexecutable.DirectoryEntry;


/**
 * The base .NET class managing System.Reflection.PortableExecutable.PEHeader, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PEHeader extends NetObject  {
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Reflection.Metadata";
    public static final String className = "System.Reflection.PortableExecutable.PEHeader";
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

    public PEHeader(Object instance) throws Throwable {
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

    public static PEHeader cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PEHeader(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    

    
    // Properties section
    
    public PEMagic getMagic() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Magic");
            return new PEMagic(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getMajorLinkerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("MajorLinkerVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getMinorLinkerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("MinorLinkerVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSizeOfCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SizeOfCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSizeOfInitializedData() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SizeOfInitializedData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSizeOfUninitializedData() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SizeOfUninitializedData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getAddressOfEntryPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("AddressOfEntryPoint");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBaseOfCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BaseOfCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBaseOfData() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BaseOfData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getImageBase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImageBase");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSectionAlignment() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SectionAlignment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getFileAlignment() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("FileAlignment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorOperatingSystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MajorOperatingSystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorOperatingSystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinorOperatingSystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorImageVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MajorImageVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorImageVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinorImageVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorSubsystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MajorSubsystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorSubsystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinorSubsystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSizeOfImage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SizeOfImage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSizeOfHeaders() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SizeOfHeaders");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 getCheckSum() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CheckSum");
            return new UInt32(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Subsystem getSubsystem() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Subsystem");
            return new Subsystem(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DllCharacteristics getDllCharacteristics() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DllCharacteristics");
            return new DllCharacteristics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfStackReserve() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfStackReserve");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfStackCommit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfStackCommit");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfHeapReserve() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfHeapReserve");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfHeapCommit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfHeapCommit");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNumberOfRvaAndSizes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NumberOfRvaAndSizes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getExportTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExportTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getImportTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImportTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getResourceTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ResourceTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getExceptionTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExceptionTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getCertificateTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CertificateTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getBaseRelocationTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseRelocationTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getDebugTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DebugTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getCopyrightTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CopyrightTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getGlobalPointerTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("GlobalPointerTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getThreadLocalStorageTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ThreadLocalStorageTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getLoadConfigTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LoadConfigTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getBoundImportTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BoundImportTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getImportAddressTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImportAddressTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getDelayImportTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DelayImportTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getCorHeaderTableDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CorHeaderTableDirectory");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}