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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.MessageBoxResult;
import system.windows.MessageBoxButton;
import system.windows.MessageBoxImage;
import system.windows.MessageBoxOptions;
import system.windows.Window;


/**
 * The base .NET class managing System.Windows.MessageBox, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class MessageBox extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.MessageBox";
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
    
    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult, MessageBoxOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", messageBoxText, caption, button == null ? null : button.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultResult == null ? null : defaultResult.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", messageBoxText, caption, button == null ? null : button.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultResult == null ? null : defaultResult.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", messageBoxText, caption, button == null ? null : button.getJCOInstance(), icon == null ? null : icon.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", messageBoxText, caption, button == null ? null : button.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", messageBoxText, caption);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", messageBoxText);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult, MessageBoxOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), messageBoxText, caption, button == null ? null : button.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultResult == null ? null : defaultResult.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), messageBoxText, caption, button == null ? null : button.getJCOInstance(), icon == null ? null : icon.getJCOInstance(), defaultResult == null ? null : defaultResult.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), messageBoxText, caption, button == null ? null : button.getJCOInstance(), icon == null ? null : icon.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), messageBoxText, caption, button == null ? null : button.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), messageBoxText, caption);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", owner == null ? null : owner.getJCOInstance(), messageBoxText);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}