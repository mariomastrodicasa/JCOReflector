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

package microsoft.win32;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.win32.FileDialogCustomPlace;


/**
 * The base .NET class managing Microsoft.Win32.FileDialogCustomPlaces, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Win32.FileDialogCustomPlaces" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Win32.FileDialogCustomPlaces</a>
 */
public class FileDialogCustomPlaces extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: Microsoft.Win32.FileDialogCustomPlaces
     */
    public static final String className = "Microsoft.Win32.FileDialogCustomPlaces";
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

    public FileDialogCustomPlaces(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FileDialogCustomPlaces}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FileDialogCustomPlaces} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FileDialogCustomPlaces cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FileDialogCustomPlaces(from.getJCOInstance());
    }

    // Constructors section
    
    public FileDialogCustomPlaces() throws Throwable {
    }

    
    // Methods section
    

    
    // Properties section
    
    public static FileDialogCustomPlace getContacts() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Contacts");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getCookies() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Cookies");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getDesktop() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Desktop");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getDocuments() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Documents");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getFavorites() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Favorites");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getLocalApplicationData() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("LocalApplicationData");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getMusic() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Music");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getPictures() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Pictures");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getProgramFiles() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ProgramFiles");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getProgramFilesCommon() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ProgramFilesCommon");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getPrograms() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Programs");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getRoamingApplicationData() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("RoamingApplicationData");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getSendTo() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SendTo");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getStartMenu() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("StartMenu");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getStartup() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Startup");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getSystem() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("System");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileDialogCustomPlace getTemplates() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Templates");
            return new FileDialogCustomPlace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}