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

package system.drawing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Font;
import system.drawing.FontStyle;
import system.drawing.FontFamily;
import system.Single;
import system.drawing.GraphicsUnit;
import system.drawing.Graphics;


/**
 * The base .NET class managing System.Drawing.Font, System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class Font extends NetObject  {
    public static final String assemblyFullName = "System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    public static final String assemblyShortName = "System.Drawing.Common";
    public static final String className = "System.Drawing.Font";
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

    public Font(Object instance) throws Throwable {
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

    public static Font cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Font(from.getJCOInstance());
    }

    // Constructors section
    

    public Font(Font prototype, FontStyle newStyle) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(prototype == null ? null : prototype.getJCOInstance(), newStyle == null ? null : newStyle.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(FontFamily family, Single emSize) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(family == null ? null : family.getJCOInstance(), emSize == null ? null : emSize.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(FontFamily family, Single emSize, FontStyle style) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(family == null ? null : family.getJCOInstance(), emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(FontFamily family, Single emSize, FontStyle style, GraphicsUnit unit) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(family == null ? null : family.getJCOInstance(), emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance(), unit == null ? null : unit.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(FontFamily family, Single emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(family == null ? null : family.getJCOInstance(), emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance(), unit == null ? null : unit.getJCOInstance(), gdiCharSet));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(FontFamily family, Single emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet, boolean gdiVerticalFont) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(family == null ? null : family.getJCOInstance(), emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance(), unit == null ? null : unit.getJCOInstance(), gdiCharSet, gdiVerticalFont));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(FontFamily family, Single emSize, GraphicsUnit unit) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(family == null ? null : family.getJCOInstance(), emSize == null ? null : emSize.getJCOInstance(), unit == null ? null : unit.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(java.lang.String familyName, Single emSize) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(familyName, emSize == null ? null : emSize.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(java.lang.String familyName, Single emSize, FontStyle style) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(familyName, emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(java.lang.String familyName, Single emSize, FontStyle style, GraphicsUnit unit) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(familyName, emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance(), unit == null ? null : unit.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(java.lang.String familyName, Single emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(familyName, emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance(), unit == null ? null : unit.getJCOInstance(), gdiCharSet));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(java.lang.String familyName, Single emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet, boolean gdiVerticalFont) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(familyName, emSize == null ? null : emSize.getJCOInstance(), style == null ? null : style.getJCOInstance(), unit == null ? null : unit.getJCOInstance(), gdiCharSet, gdiVerticalFont));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font(java.lang.String familyName, Single emSize, GraphicsUnit unit) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(familyName, emSize == null ? null : emSize.getJCOInstance(), unit == null ? null : unit.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public Single GetHeight() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetHeight = (JCObject)classInstance.Invoke("GetHeight");
            return new Single(objGetHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetHeight(Single dpi) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetHeight = (JCObject)classInstance.Invoke("GetHeight", dpi == null ? null : dpi.getJCOInstance());
            return new Single(objGetHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetHeight(Graphics graphics) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetHeight = (JCObject)classInstance.Invoke("GetHeight", graphics == null ? null : graphics.getJCOInstance());
            return new Single(objGetHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Font FromLogFont(NetObject lf) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromLogFont = (JCObject)classType.Invoke("FromLogFont", lf == null ? null : lf.getJCOInstance());
            return new Font(objFromLogFont);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ToLogFont(NetObject logFont) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ToLogFont", logFont == null ? null : logFont.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ToLogFont(NetObject logFont, Graphics graphics) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ToLogFont", logFont == null ? null : logFont.getJCOInstance(), graphics == null ? null : graphics.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getBold() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Bold");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGdiVerticalFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GdiVerticalFont");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSystemFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSystemFont");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getItalic() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Italic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getStrikeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Strikeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUnderline() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Underline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getGdiCharSet() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("GdiCharSet");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHeight() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Height");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Size");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getSizeInPoints() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeInPoints");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FontFamily getFontFamily() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FontFamily");
            return new FontFamily(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FontStyle getStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Style");
            return new FontStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GraphicsUnit getUnit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Unit");
            return new GraphicsUnit(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOriginalFontName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("OriginalFontName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSystemFontName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SystemFontName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}