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

package microsoft.visualbasic.myservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing Microsoft.VisualBasic.MyServices.SpecialDirectoriesProxy, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SpecialDirectoriesProxy extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.MyServices.SpecialDirectoriesProxy";
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

    public SpecialDirectoriesProxy(Object instance) throws Throwable {
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

    public static SpecialDirectoriesProxy cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SpecialDirectoriesProxy(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    

    
    // Properties section
    
    public java.lang.String getMyDocuments() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.io.DirectoryNotFoundException, system.io.PathTooLongException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MyDocuments");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMyMusic() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.io.DirectoryNotFoundException, system.io.PathTooLongException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MyMusic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMyPictures() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.io.DirectoryNotFoundException, system.io.PathTooLongException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MyPictures");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDesktop() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.io.DirectoryNotFoundException, system.io.PathTooLongException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Desktop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPrograms() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.io.DirectoryNotFoundException, system.io.PathTooLongException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Programs");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProgramFiles() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.io.DirectoryNotFoundException, system.io.PathTooLongException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ProgramFiles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTemp() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Temp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCurrentUserApplicationData() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.deployment.application.InvalidDeploymentException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.MemberAccessException, system.security.SecurityException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CurrentUserApplicationData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAllUsersApplicationData() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.deployment.application.InvalidDeploymentException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.MemberAccessException, system.security.SecurityException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AllUsersApplicationData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}