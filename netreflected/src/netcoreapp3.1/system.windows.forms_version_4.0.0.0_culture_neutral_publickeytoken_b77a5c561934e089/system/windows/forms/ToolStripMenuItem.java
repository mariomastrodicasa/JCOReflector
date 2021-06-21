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
import system.windows.forms.ToolStripDropDownItem;
import system.drawing.Image;
import system.EventHandler;
import system.windows.forms.Keys;
import system.windows.forms.ToolStripItem;
import system.windows.forms.CheckState;
import system.windows.forms.ToolStripItemOverflow;


/**
 * The base .NET class managing System.Windows.Forms.ToolStripMenuItem, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripMenuItem" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripMenuItem</a>
 */
public class ToolStripMenuItem extends ToolStripDropDownItem  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ToolStripMenuItem
     */
    public static final String className = "System.Windows.Forms.ToolStripMenuItem";
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

    public ToolStripMenuItem(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ToolStripMenuItem}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ToolStripMenuItem} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ToolStripMenuItem cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolStripMenuItem(from.getJCOInstance());
    }

    // Constructors section
    
    public ToolStripMenuItem() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(Image image) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ApplicationException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(image == null ? null : image.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(java.lang.String text) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ApplicationException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(java.lang.String text, Image image) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ApplicationException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(java.lang.String text, Image image, EventHandler onClick) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ApplicationException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), onClick));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(java.lang.String text, Image image, EventHandler onClick, java.lang.String name) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.ApplicationException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), onClick, name));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(java.lang.String text, Image image, EventHandler onClick, Keys shortcutKeys) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ApplicationException, system.OverflowException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), onClick, shortcutKeys == null ? null : shortcutKeys.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripMenuItem(java.lang.String text, Image image, ToolStripItem... dropDownItems) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MulticastNotSupportedException, system.NotSupportedException, system.RankException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), toObjectFromArray(dropDownItems)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getChecked() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Checked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChecked(boolean Checked) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.RankException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Checked", Checked);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCheckOnClick() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CheckOnClick");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCheckOnClick(boolean CheckOnClick) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CheckOnClick", CheckOnClick);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMdiWindowListEntry() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsMdiWindowListEntry");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowShortcutKeys() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShowShortcutKeys");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowShortcutKeys(boolean ShowShortcutKeys) throws Throwable, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShowShortcutKeys", ShowShortcutKeys);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getShortcutKeyDisplayString() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ShortcutKeyDisplayString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShortcutKeyDisplayString(java.lang.String ShortcutKeyDisplayString) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentNullException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShortcutKeyDisplayString", ShortcutKeyDisplayString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CheckState getCheckState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CheckState");
            return new CheckState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCheckState(CheckState CheckState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.RankException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CheckState", CheckState == null ? null : CheckState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Keys getShortcutKeys() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ShortcutKeys");
            return new Keys(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShortcutKeys(Keys ShortcutKeys) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.NotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShortcutKeys", ShortcutKeys == null ? null : ShortcutKeys.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripItemOverflow getOverflow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Overflow");
            return new ToolStripItemOverflow(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOverflow(ToolStripItemOverflow Overflow) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Overflow", Overflow == null ? null : Overflow.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addCheckedChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CheckedChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCheckedChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CheckedChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCheckStateChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CheckStateChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCheckStateChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CheckStateChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}