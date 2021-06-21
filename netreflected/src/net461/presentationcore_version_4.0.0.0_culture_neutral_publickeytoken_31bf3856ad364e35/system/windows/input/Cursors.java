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

package system.windows.input;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.input.Cursor;


/**
 * The base .NET class managing System.Windows.Input.Cursors, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.Cursors" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.Cursors</a>
 */
public class Cursors extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Input.Cursors
     */
    public static final String className = "System.Windows.Input.Cursors";
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

    public Cursors(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Cursors}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Cursors} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Cursors cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Cursors(from.getJCOInstance());
    }

    // Constructors section
    
    public Cursors() throws Throwable {
    }

    
    // Methods section
    

    
    // Properties section
    
    public static Cursor getAppStarting() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AppStarting");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getArrow() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Arrow");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getArrowCD() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ArrowCD");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getCross() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Cross");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getHand() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Hand");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getHelp() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Help");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getIBeam() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("IBeam");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getNo() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("No");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getNone() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("None");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getPen() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Pen");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollAll() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollAll");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollE() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollE");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollN() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollN");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollNE() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollNE");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollNS() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollNS");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollNW() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollNW");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollS() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollS");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollSE() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollSE");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollSW() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollSW");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollW() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollW");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getScrollWE() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollWE");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getSizeAll() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SizeAll");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getSizeNESW() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SizeNESW");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getSizeNS() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SizeNS");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getSizeNWSE() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SizeNWSE");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getSizeWE() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SizeWE");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getUpArrow() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("UpArrow");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Cursor getWait() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Wait");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}