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

package system.windows.media.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.imaging.BitmapSource;
import system.windows.media.imaging.BitmapFrame;
import system.io.Stream;
import system.windows.media.imaging.BitmapCreateOptions;
import system.windows.media.imaging.BitmapCacheOption;
import system.Uri;
import system.net.cache.RequestCachePolicy;
import system.windows.media.imaging.BitmapMetadata;
import system.windows.media.imaging.InPlaceBitmapMetadataWriter;
import system.windows.media.imaging.BitmapDecoder;


/**
 * The base .NET class managing System.Windows.Media.Imaging.BitmapFrame, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.BitmapFrame" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.BitmapFrame</a>
 */
public class BitmapFrame extends BitmapSource  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Imaging.BitmapFrame
     */
    public static final String className = "System.Windows.Media.Imaging.BitmapFrame";
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

    public BitmapFrame(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BitmapFrame}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BitmapFrame} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BitmapFrame cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BitmapFrame(from.getJCOInstance());
    }

    // Constructors section
    
    public BitmapFrame() throws Throwable {
    }

    
    // Methods section
    
    public static BitmapFrame Create(Stream bitmapStream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.UriFormatException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.NotSupportedException, system.net.WebException, system.NotImplementedException, system.net.CookieException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapStream == null ? null : bitmapStream.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(Stream bitmapStream, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.UriFormatException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.NotSupportedException, system.net.WebException, system.NotImplementedException, system.net.CookieException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapStream == null ? null : bitmapStream.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(Uri bitmapUri) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.net.WebException, system.NotImplementedException, system.net.CookieException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapUri == null ? null : bitmapUri.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(Uri bitmapUri, RequestCachePolicy uriCachePolicy) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.UriFormatException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.NotSupportedException, system.net.WebException, system.NotImplementedException, system.net.CookieException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapUri == null ? null : bitmapUri.getJCOInstance(), uriCachePolicy == null ? null : uriCachePolicy.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(Uri bitmapUri, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.net.WebException, system.NotImplementedException, system.net.CookieException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapUri == null ? null : bitmapUri.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(Uri bitmapUri, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption, RequestCachePolicy uriCachePolicy) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.UriFormatException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.NotSupportedException, system.net.WebException, system.NotImplementedException, system.net.CookieException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapUri == null ? null : bitmapUri.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance(), uriCachePolicy == null ? null : uriCachePolicy.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(BitmapSource source) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", source == null ? null : source.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapFrame Create(BitmapSource source, BitmapSource thumbnail) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", source == null ? null : source.getJCOInstance(), thumbnail == null ? null : thumbnail.getJCOInstance());
            return new BitmapFrame(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InPlaceBitmapMetadataWriter CreateInPlaceBitmapMetadataWriter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInPlaceBitmapMetadataWriter = (JCObject)classInstance.Invoke("CreateInPlaceBitmapMetadataWriter");
            return new InPlaceBitmapMetadataWriter(objCreateInPlaceBitmapMetadataWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Uri getBaseUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseUri(Uri BaseUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BaseUri", BaseUri == null ? null : BaseUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapDecoder getDecoder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Decoder");
            return new BitmapDecoder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getThumbnail() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Thumbnail");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}