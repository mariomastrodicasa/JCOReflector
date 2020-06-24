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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DialogResult;
import system.windows.forms.MessageBoxButtons;
import system.windows.forms.MessageBoxIcon;
import system.windows.forms.MessageBoxDefaultButton;
import system.windows.forms.MessageBoxOptions;
import system.windows.forms.HelpNavigator;
import system.windows.forms.IWin32Window;
import system.windows.forms.IWin32WindowImplementation;


/**
 * The base .NET class managing System.Windows.Forms.MessageBox, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MessageBox extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.MessageBox";
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

    public MessageBox(Object instance) throws Throwable {
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

    public static MessageBox cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MessageBox(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static DialogResult Show(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, boolean displayHelpButton) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), displayHelpButton);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath, java.lang.String keyword) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath, keyword);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath, HelpNavigator navigator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath, navigator == null ? null : navigator.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath, HelpNavigator navigator, NetObject param) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath, navigator == null ? null : navigator.getJCOInstance(), param == null ? null : param.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath, java.lang.String keyword) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath, keyword);
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath, HelpNavigator navigator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath, navigator == null ? null : navigator.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DialogResult Show(IWin32Window owner, java.lang.String text, java.lang.String caption, MessageBoxButtons buttons, MessageBoxIcon icon, MessageBoxDefaultButton defaultButton, MessageBoxOptions options, java.lang.String helpFilePath, HelpNavigator navigator, NetObject param) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), text, caption, buttons == null ? null : buttons.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultButton == null ? null : defaultButton.getJCOInstance(), options == null ? null : options.getJCOInstance(), helpFilePath, navigator == null ? null : navigator.getJCOInstance(), param == null ? null : param.getJCOInstance());
            return new DialogResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}