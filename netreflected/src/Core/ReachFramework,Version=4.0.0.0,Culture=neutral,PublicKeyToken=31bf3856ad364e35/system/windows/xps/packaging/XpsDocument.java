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

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.packaging.Package;
import system.io.packaging.CompressionOption;
import system.io.FileAccess;
import system.windows.documents.FixedDocumentSequence;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceWriter;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceWriterImplementation;
import system.windows.xps.packaging.XpsDigitalSignature;
import system.security.cryptography.x509certificates.X509Certificate;
import system.windows.xps.packaging.XpsDigSigPartAlteringRestrictions;
import system.Guid;
import system.windows.xps.packaging.XpsThumbnail;
import system.windows.xps.packaging.XpsImageType;
import system.windows.xps.XpsDocumentWriter;
import system.windows.xps.packaging.XpsDocument;
import system.io.packaging.PackageProperties;
import system.Uri;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceReader;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceReaderImplementation;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.XpsDocument, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class XpsDocument extends NetObject  {
    public static final String assemblyFullName = "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "ReachFramework";
    public static final String className = "System.Windows.Xps.Packaging.XpsDocument";
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

    public XpsDocument(Object instance) throws Throwable {
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

    public static XpsDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XpsDocument(from.getJCOInstance());
    }

    // Constructors section
    

    public XpsDocument(Package _package) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.UriFormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(Package _package, CompressionOption compressionOption) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.UriFormatException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance(), compressionOption == null ? null : compressionOption.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(Package _package, CompressionOption compressionOption, java.lang.String path) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.UriFormatException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance(), compressionOption == null ? null : compressionOption.getJCOInstance(), path));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(java.lang.String path, FileAccess packageAccess) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.UriFormatException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.io.IOException, system.ObjectDisposedException, system.io.InvalidDataException, system.xml.XmlException, system.io.FileFormatException, system.UnauthorizedAccessException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, packageAccess == null ? null : packageAccess.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(java.lang.String path, FileAccess packageAccess, CompressionOption compressionOption) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.UriFormatException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.io.IOException, system.ObjectDisposedException, system.io.InvalidDataException, system.xml.XmlException, system.io.FileFormatException, system.UnauthorizedAccessException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, packageAccess == null ? null : packageAccess.getJCOInstance(), compressionOption == null ? null : compressionOption.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public FixedDocumentSequence GetFixedDocumentSequence() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.windows.xps.XpsPackagingException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.UriFormatException, system.xaml.XamlSchemaException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.componentmodel.InvalidEnumArgumentException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFixedDocumentSequence = (JCObject)classInstance.Invoke("GetFixedDocumentSequence");
            return new FixedDocumentSequence(objGetFixedDocumentSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXpsFixedDocumentSequenceWriter AddFixedDocumentSequence() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.windows.xps.XpsPackagingException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.UriFormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddFixedDocumentSequence = (JCObject)classInstance.Invoke("AddFixedDocumentSequence");
            return new IXpsFixedDocumentSequenceWriterImplementation(objAddFixedDocumentSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDigitalSignature SignDigitally(X509Certificate certificate, boolean embedCertificate, XpsDigSigPartAlteringRestrictions restrictions) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.io.IOException, system.io.InvalidDataException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.io.FileFormatException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignDigitally = (JCObject)classInstance.Invoke("SignDigitally", certificate == null ? null : certificate.getJCOInstance(), embedCertificate, restrictions == null ? null : restrictions.getJCOInstance());
            return new XpsDigitalSignature(objSignDigitally);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDigitalSignature SignDigitally(X509Certificate certificate, boolean embedCertificate, XpsDigSigPartAlteringRestrictions restrictions, Guid id) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.io.IOException, system.io.InvalidDataException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.io.FileFormatException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignDigitally = (JCObject)classInstance.Invoke("SignDigitally", certificate == null ? null : certificate.getJCOInstance(), embedCertificate, restrictions == null ? null : restrictions.getJCOInstance(), id == null ? null : id.getJCOInstance());
            return new XpsDigitalSignature(objSignDigitally);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDigitalSignature SignDigitally(X509Certificate certificate, boolean embedCertificate, XpsDigSigPartAlteringRestrictions restrictions, Guid id, boolean testIsSignable) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.io.IOException, system.io.InvalidDataException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.io.FileFormatException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignDigitally = (JCObject)classInstance.Invoke("SignDigitally", certificate == null ? null : certificate.getJCOInstance(), embedCertificate, restrictions == null ? null : restrictions.getJCOInstance(), id == null ? null : id.getJCOInstance(), testIsSignable);
            return new XpsDigitalSignature(objSignDigitally);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsThumbnail AddThumbnail(XpsImageType imageType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.io.IOException, system.io.InvalidDataException, system.windows.xps.XpsPackagingException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddThumbnail = (JCObject)classInstance.Invoke("AddThumbnail", imageType == null ? null : imageType.getJCOInstance());
            return new XpsThumbnail(objAddThumbnail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XpsDocumentWriter CreateXpsDocumentWriter(XpsDocument xpsDocument) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXpsDocumentWriter = (JCObject)classType.Invoke("CreateXpsDocumentWriter", xpsDocument == null ? null : xpsDocument.getJCOInstance());
            return new XpsDocumentWriter(objCreateXpsDocumentWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.io.IOException, system.io.FileFormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.xml.XmlException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveSignature(XpsDigitalSignature signature) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NullReferenceException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.collections.generic.KeyNotFoundException, system.io.InvalidDataException, system.windows.xps.XpsPackagingException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveSignature", signature == null ? null : signature.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsReader() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReader");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSignable() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.FormatException, system.io.InvalidDataException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSignable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsWriter() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsWriter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackageProperties getCoreDocumentProperties() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.IOException, system.io.FileFormatException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CoreDocumentProperties");
            return new PackageProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Uri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUri(Uri Uri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Uri", Uri == null ? null : Uri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXpsFixedDocumentSequenceReader getFixedDocumentSequenceReader() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.FormatException, system.io.InvalidDataException, system.UriFormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FixedDocumentSequenceReader");
            return new IXpsFixedDocumentSequenceReaderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsThumbnail getThumbnail() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.FormatException, system.io.InvalidDataException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Thumbnail");
            return new XpsThumbnail(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setThumbnail(XpsThumbnail Thumbnail) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Thumbnail", Thumbnail == null ? null : Thumbnail.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}