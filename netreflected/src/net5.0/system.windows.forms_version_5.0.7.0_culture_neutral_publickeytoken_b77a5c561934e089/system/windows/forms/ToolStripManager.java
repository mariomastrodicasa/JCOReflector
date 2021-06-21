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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.Keys;
import system.windows.forms.ToolStrip;
import system.windows.forms.Form;
import system.windows.forms.ToolStripManagerRenderMode;
import system.windows.forms.ToolStripRenderer;


/**
 * The base .NET class managing System.Windows.Forms.ToolStripManager, System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripManager</a>
 */
public class ToolStripManager extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ToolStripManager
     */
    public static final String className = "System.Windows.Forms.ToolStripManager";
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

    public ToolStripManager(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ToolStripManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ToolStripManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ToolStripManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolStripManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ToolStripManager() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsShortcutDefined(Keys shortcut) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsShortcutDefined", shortcut == null ? null : shortcut.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsValidShortcut(Keys shortcut) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsValidShortcut", shortcut == null ? null : shortcut.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Merge(ToolStrip sourceToolStrip, java.lang.String targetName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Merge", sourceToolStrip == null ? null : sourceToolStrip.getJCOInstance(), targetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Merge(ToolStrip sourceToolStrip, ToolStrip targetToolStrip) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.threading.ThreadStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Merge", sourceToolStrip == null ? null : sourceToolStrip.getJCOInstance(), targetToolStrip == null ? null : targetToolStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean RevertMerge(java.lang.String targetName) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.RankException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("RevertMerge", targetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean RevertMerge(ToolStrip targetToolStrip) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("RevertMerge", targetToolStrip == null ? null : targetToolStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean RevertMerge(ToolStrip targetToolStrip, ToolStrip sourceToolStrip) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("RevertMerge", targetToolStrip == null ? null : targetToolStrip.getJCOInstance(), sourceToolStrip == null ? null : sourceToolStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ToolStrip FindToolStrip(java.lang.String toolStripName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindToolStrip = (JCObject)classType.Invoke("FindToolStrip", toolStripName);
            return new ToolStrip(objFindToolStrip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LoadSettings(Form targetForm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.configuration.SettingsPropertyNotFoundException, system.runtime.serialization.SerializationException, system.componentmodel.Win32Exception, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException, system.collections.generic.KeyNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LoadSettings", targetForm == null ? null : targetForm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LoadSettings(Form targetForm, java.lang.String key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.configuration.SettingsPropertyNotFoundException, system.runtime.serialization.SerializationException, system.componentmodel.Win32Exception, system.text.regularexpressions.RegexParseException, system.text.regularexpressions.RegexMatchTimeoutException, system.collections.generic.KeyNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("LoadSettings", targetForm == null ? null : targetForm.getJCOInstance(), key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SaveSettings(Form sourceForm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.OutOfMemoryException, system.configuration.SettingsPropertyNotFoundException, system.configuration.SettingsPropertyIsReadOnlyException, system.configuration.SettingsPropertyWrongTypeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SaveSettings", sourceForm == null ? null : sourceForm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SaveSettings(Form sourceForm, java.lang.String key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.OutOfMemoryException, system.configuration.SettingsPropertyNotFoundException, system.configuration.SettingsPropertyIsReadOnlyException, system.configuration.SettingsPropertyWrongTypeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SaveSettings", sourceForm == null ? null : sourceForm.getJCOInstance(), key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getVisualStylesEnabled() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("VisualStylesEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setVisualStylesEnabled(boolean VisualStylesEnabled) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("VisualStylesEnabled", VisualStylesEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ToolStripManagerRenderMode getRenderMode() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("RenderMode");
            return new ToolStripManagerRenderMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setRenderMode(ToolStripManagerRenderMode RenderMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("RenderMode", RenderMode == null ? null : RenderMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ToolStripRenderer getRenderer() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Renderer");
            return new ToolStripRenderer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setRenderer(ToolStripRenderer Renderer) throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("Renderer", Renderer == null ? null : Renderer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}