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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.io.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.packaging.EncryptedPackageEnvelope;
import system.security.rightsmanagement.PublishLicense;
import system.security.rightsmanagement.CryptoProvider;
import system.io.Stream;
import system.io.FileAccess;
import system.io.FileShare;
import system.io.packaging.Package;
import system.io.packaging.RightsManagementInformation;
import system.io.packaging.PackageProperties;
import system.io.packaging.StorageInfo;


/**
 * The base .NET class managing System.IO.Packaging.EncryptedPackageEnvelope, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class EncryptedPackageEnvelope extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.IO.Packaging.EncryptedPackageEnvelope";
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

    public EncryptedPackageEnvelope(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static EncryptedPackageEnvelope castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EncryptedPackageEnvelope(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static EncryptedPackageEnvelope Create(java.lang.String envelopeFileName, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException, system.globalization.CultureNotFoundException, system.io.FileFormatException, system.io.EndOfStreamException, system.RankException, system.InvalidCastException, system.FormatException, system.xml.XmlException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)envelopeFileName, (Object)publishLicense.getJCOInstance(), (Object)cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Create(Stream envelopeStream, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.io.FileFormatException, system.io.EndOfStreamException, system.ArgumentOutOfRangeException, system.RankException, system.InvalidCastException, system.xml.XmlException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)envelopeStream.getJCOInstance(), (Object)publishLicense.getJCOInstance(), (Object)cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope CreateFromPackage(java.lang.String envelopeFileName, Stream packageStream, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException, system.globalization.CultureNotFoundException, system.io.FileFormatException, system.io.EndOfStreamException, system.RankException, system.InvalidCastException, system.FormatException, system.xml.XmlException {
        try {
            JCObject objCreateFromPackage = (JCObject)classType.Invoke("CreateFromPackage", (Object)envelopeFileName, (Object)packageStream.getJCOInstance(), (Object)publishLicense.getJCOInstance(), (Object)cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreateFromPackage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope CreateFromPackage(Stream envelopeStream, Stream packageStream, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.io.FileFormatException, system.io.EndOfStreamException, system.ArgumentOutOfRangeException, system.RankException, system.InvalidCastException, system.xml.XmlException {
        try {
            JCObject objCreateFromPackage = (JCObject)classType.Invoke("CreateFromPackage", (Object)envelopeStream.getJCOInstance(), (Object)packageStream.getJCOInstance(), (Object)publishLicense.getJCOInstance(), (Object)cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreateFromPackage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(java.lang.String envelopeFileName) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileNotFoundException, system.ObjectDisposedException, system.io.DirectoryNotFoundException, system.io.FileFormatException {
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", (Object)envelopeFileName);
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(java.lang.String envelopeFileName, FileAccess access) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileNotFoundException, system.ObjectDisposedException, system.io.DirectoryNotFoundException, system.io.FileFormatException {
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", (Object)envelopeFileName, (Object)access.getJCOInstance());
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(java.lang.String envelopeFileName, FileAccess access, FileShare sharing) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException, system.io.FileFormatException, system.io.DirectoryNotFoundException {
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", (Object)envelopeFileName, (Object)access.getJCOInstance(), (Object)sharing.getJCOInstance());
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(Stream envelopeStream) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.io.FileFormatException, system.ArgumentOutOfRangeException, system.io.DirectoryNotFoundException {
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", (Object)envelopeStream.getJCOInstance());
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsEncryptedPackageEnvelope(java.lang.String fileName) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.io.PathTooLongException, system.NotSupportedException, system.io.IOException, system.security.SecurityException, system.UnauthorizedAccessException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.FileFormatException, system.SystemException {
        try {
            return (boolean)classType.Invoke("IsEncryptedPackageEnvelope", (Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsEncryptedPackageEnvelope(Stream stream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.io.FileFormatException, system.SystemException {
        try {
            return (boolean)classType.Invoke("IsEncryptedPackageEnvelope", (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentException, system.io.FileFormatException, system.InvalidOperationException, system.io.DirectoryNotFoundException, system.io.IOException, system.NotSupportedException, system.SystemException, system.UnauthorizedAccessException, system.ArgumentOutOfRangeException, system.RankException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.io.FileFormatException, system.io.DirectoryNotFoundException, system.io.IOException, system.NotSupportedException, system.SystemException, system.ArgumentOutOfRangeException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.FileFormatException, system.collections.generic.KeyNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.OverflowException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Package GetPackage() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.io.FileFormatException, system.InvalidCastException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        try {
            JCObject objGetPackage = (JCObject)classInstance.Invoke("GetPackage");
            return new Package(objGetPackage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public RightsManagementInformation getRightsManagementInformation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RightsManagementInformation");
            return new RightsManagementInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackageProperties getPackageProperties() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PackageProperties");
            return new PackageProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileAccess getFileOpenAccess() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FileOpenAccess");
            return new FileAccess(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StorageInfo getStorageInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StorageInfo");
            return new StorageInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}