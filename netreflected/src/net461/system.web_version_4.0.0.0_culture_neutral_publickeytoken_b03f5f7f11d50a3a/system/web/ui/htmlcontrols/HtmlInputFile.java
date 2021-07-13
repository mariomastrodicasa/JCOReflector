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

package system.web.ui.htmlcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.htmlcontrols.HtmlInputControl;
import system.collections.specialized.NameValueCollection;
import system.web.HttpPostedFile;
import system.web.ui.IPostBackDataHandler;
import system.web.ui.IPostBackDataHandlerImplementation;


/**
 * The base .NET class managing System.Web.UI.HtmlControls.HtmlInputFile, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.HtmlControls.HtmlInputFile" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.HtmlControls.HtmlInputFile</a>
 */
public class HtmlInputFile extends HtmlInputControl implements system.web.ui.IPostBackDataHandler {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.UI.HtmlControls.HtmlInputFile
     */
    public static final String className = "System.Web.UI.HtmlControls.HtmlInputFile";
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

    public HtmlInputFile(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HtmlInputFile}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link HtmlInputFile} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static HtmlInputFile cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HtmlInputFile(from.getJCOInstance());
    }

    // Constructors section
    
    public HtmlInputFile() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIPostBackDataHandler method available in IPostBackDataHandler to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean LoadPostData(java.lang.String postDataKey, NameValueCollection postCollection) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIPostBackDataHandler to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIPostBackDataHandler method available in IPostBackDataHandler to obtain an object with an invocable method
     */
    @Deprecated 
    public void RaisePostDataChangedEvent() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIPostBackDataHandler to obtain the full interface.");
    }


    
    // Properties section
    
    public int getMaxLength() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxLength(int MaxLength) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxLength", MaxLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSize() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Size");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSize(int Size) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Size", Size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAccept() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Accept");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAccept(java.lang.String Accept) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Accept", Accept);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpPostedFile getPostedFile() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PostedFile");
            return new HttpPostedFile(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}