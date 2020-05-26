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

package system.windows.media.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.Single;
import system.windows.media.imaging.Rotation;
import system.windows.media.imaging.BitmapSource;
import system.windows.media.imaging.BitmapMetadata;
import system.windows.media.imaging.BitmapCodecInfo;
import system.windows.media.imaging.BitmapPalette;
import system.windows.threading.Dispatcher;


/**
 * The base .NET class managing System.Windows.Media.Imaging.WmpBitmapEncoder, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WmpBitmapEncoder extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Imaging.WmpBitmapEncoder";
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

    public WmpBitmapEncoder(Object instance) throws Throwable {
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

    public static WmpBitmapEncoder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WmpBitmapEncoder(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WmpBitmapEncoder() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Save(Stream stream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException, system.AccessViolationException, system.ArrayTypeMismatchException, system.UriFormatException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckAccess() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CheckAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("VerifyAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Single getImageQualityLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ImageQualityLevel");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageQualityLevel(Single ImageQualityLevel) throws Throwable {
        try {
            classInstance.Set("ImageQualityLevel", (Object)ImageQualityLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLossless() throws Throwable {
        try {
            return (boolean)classInstance.Get("Lossless");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLossless(boolean Lossless) throws Throwable {
        try {
            classInstance.Set("Lossless", Lossless);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rotation getRotation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Rotation");
            return new Rotation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRotation(Rotation Rotation) throws Throwable {
        try {
            classInstance.Set("Rotation", (Object)Rotation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFlipHorizontal() throws Throwable {
        try {
            return (boolean)classInstance.Get("FlipHorizontal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlipHorizontal(boolean FlipHorizontal) throws Throwable {
        try {
            classInstance.Set("FlipHorizontal", FlipHorizontal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFlipVertical() throws Throwable {
        try {
            return (boolean)classInstance.Get("FlipVertical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlipVertical(boolean FlipVertical) throws Throwable {
        try {
            classInstance.Set("FlipVertical", FlipVertical);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseCodecOptions() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseCodecOptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseCodecOptions(boolean UseCodecOptions) throws Throwable {
        try {
            classInstance.Set("UseCodecOptions", UseCodecOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getQualityLevel() throws Throwable {
        try {
            return (byte)classInstance.Get("QualityLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQualityLevel(byte QualityLevel) throws Throwable {
        try {
            classInstance.Set("QualityLevel", QualityLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getSubsamplingLevel() throws Throwable {
        try {
            return (byte)classInstance.Get("SubsamplingLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSubsamplingLevel(byte SubsamplingLevel) throws Throwable {
        try {
            classInstance.Set("SubsamplingLevel", SubsamplingLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getOverlapLevel() throws Throwable {
        try {
            return (byte)classInstance.Get("OverlapLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOverlapLevel(byte OverlapLevel) throws Throwable {
        try {
            classInstance.Set("OverlapLevel", OverlapLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short getHorizontalTileSlices() throws Throwable {
        try {
            return (short)classInstance.Get("HorizontalTileSlices");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHorizontalTileSlices(short HorizontalTileSlices) throws Throwable {
        try {
            classInstance.Set("HorizontalTileSlices", HorizontalTileSlices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short getVerticalTileSlices() throws Throwable {
        try {
            return (short)classInstance.Get("VerticalTileSlices");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVerticalTileSlices(short VerticalTileSlices) throws Throwable {
        try {
            classInstance.Set("VerticalTileSlices", VerticalTileSlices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFrequencyOrder() throws Throwable {
        try {
            return (boolean)classInstance.Get("FrequencyOrder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFrequencyOrder(boolean FrequencyOrder) throws Throwable {
        try {
            classInstance.Set("FrequencyOrder", FrequencyOrder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInterleavedAlpha() throws Throwable {
        try {
            return (boolean)classInstance.Get("InterleavedAlpha");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInterleavedAlpha(boolean InterleavedAlpha) throws Throwable {
        try {
            classInstance.Set("InterleavedAlpha", InterleavedAlpha);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getAlphaQualityLevel() throws Throwable {
        try {
            return (byte)classInstance.Get("AlphaQualityLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlphaQualityLevel(byte AlphaQualityLevel) throws Throwable {
        try {
            classInstance.Set("AlphaQualityLevel", AlphaQualityLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCompressedDomainTranscode() throws Throwable {
        try {
            return (boolean)classInstance.Get("CompressedDomainTranscode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompressedDomainTranscode(boolean CompressedDomainTranscode) throws Throwable {
        try {
            classInstance.Set("CompressedDomainTranscode", CompressedDomainTranscode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getImageDataDiscardLevel() throws Throwable {
        try {
            return (byte)classInstance.Get("ImageDataDiscardLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageDataDiscardLevel(byte ImageDataDiscardLevel) throws Throwable {
        try {
            classInstance.Set("ImageDataDiscardLevel", ImageDataDiscardLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getAlphaDataDiscardLevel() throws Throwable {
        try {
            return (byte)classInstance.Get("AlphaDataDiscardLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlphaDataDiscardLevel(byte AlphaDataDiscardLevel) throws Throwable {
        try {
            classInstance.Set("AlphaDataDiscardLevel", AlphaDataDiscardLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreOverlap() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnoreOverlap");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreOverlap(boolean IgnoreOverlap) throws Throwable {
        try {
            classInstance.Set("IgnoreOverlap", IgnoreOverlap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getThumbnail() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Thumbnail");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setThumbnail(BitmapSource Thumbnail) throws Throwable {
        try {
            classInstance.Set("Thumbnail", (Object)Thumbnail.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapMetadata getMetadata() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Metadata");
            return new BitmapMetadata(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMetadata(BitmapMetadata Metadata) throws Throwable {
        try {
            classInstance.Set("Metadata", (Object)Metadata.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getPreview() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Preview");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreview(BitmapSource Preview) throws Throwable {
        try {
            classInstance.Set("Preview", (Object)Preview.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapCodecInfo getCodecInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CodecInfo");
            return new BitmapCodecInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapPalette getPalette() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Palette");
            return new BitmapPalette(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPalette(BitmapPalette Palette) throws Throwable {
        try {
            classInstance.Set("Palette", (Object)Palette.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}