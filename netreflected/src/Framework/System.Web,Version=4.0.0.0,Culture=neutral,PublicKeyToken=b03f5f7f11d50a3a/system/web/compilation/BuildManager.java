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

package system.web.compilation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.io.Stream;
import system.reflection.Assembly;
import system.web.compilation.BuildDependencySet;
import system.web.HttpContext;
import system.web.util.IWebObjectFactory;
import system.web.util.IWebObjectFactoryImplementation;
import system.collections.IList;
import system.collections.IListImplementation;
import system.runtime.versioning.FrameworkName;


/**
 * The base .NET class managing System.Web.Compilation.BuildManager, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class BuildManager extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Compilation.BuildManager";
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

    public BuildManager(Object instance) throws Throwable {
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

    public static BuildManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BuildManager(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static ICollection GetReferencedAssemblies() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.InvalidOperationException, system.web.HttpException, system.security.SecurityException, system.web.HttpCompileException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.configuration.provider.ProviderException, system.NotImplementedException, system.web.HttpParseException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetReferencedAssemblies = (JCObject)classType.Invoke("GetReferencedAssemblies");
            return new ICollectionImplementation(objGetReferencedAssemblies);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICollection GetVirtualPathDependencies(java.lang.String virtualPath) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.web.HttpException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.NotSupportedException, system.NullReferenceException, system.NotImplementedException, system.configuration.ConfigurationErrorsException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetVirtualPathDependencies = (JCObject)classType.Invoke("GetVirtualPathDependencies", virtualPath);
            return new ICollectionImplementation(objGetVirtualPathDependencies);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Stream CreateCachedFile(java.lang.String fileName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateCachedFile = (JCObject)classType.Invoke("CreateCachedFile", fileName);
            return new Stream(objCreateCachedFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Stream ReadCachedFile(java.lang.String fileName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReadCachedFile = (JCObject)classType.Invoke("ReadCachedFile", fileName);
            return new Stream(objReadCachedFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateInstanceFromVirtualPath(java.lang.String virtualPath, NetType requiredBaseType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.web.HttpCompileException, system.NullReferenceException, system.web.HttpParseException, system.configuration.ConfigurationErrorsException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFromVirtualPath = (JCObject)classType.Invoke("CreateInstanceFromVirtualPath", virtualPath, requiredBaseType == null ? null : requiredBaseType.getJCOInstance());
            return new NetObject(objCreateInstanceFromVirtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Assembly GetCompiledAssembly(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpParseException, system.web.HttpCompileException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompiledAssembly = (JCObject)classType.Invoke("GetCompiledAssembly", virtualPath);
            return new Assembly(objGetCompiledAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetCompiledCustomString(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpParseException, system.web.HttpCompileException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetCompiledCustomString", virtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetCompiledType(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.web.HttpCompileException, system.NullReferenceException, system.web.HttpParseException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompiledType = (JCObject)classType.Invoke("GetCompiledType", virtualPath);
            return new NetType(objGetCompiledType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetGlobalAsaxType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.web.HttpCompileException, system.configuration.provider.ProviderException, system.web.HttpParseException, system.OperationCanceledException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetGlobalAsaxType = (JCObject)classType.Invoke("GetGlobalAsaxType");
            return new NetType(objGetGlobalAsaxType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetType(java.lang.String typeName, boolean throwOnError) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.NotSupportedException, system.xml.XmlException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.web.HttpCompileException, system.configuration.provider.ProviderException, system.web.HttpParseException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetType = (JCObject)classType.Invoke("GetType", typeName, throwOnError);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetType(java.lang.String typeName, boolean throwOnError, boolean ignoreCase) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException, system.web.HttpCompileException, system.configuration.provider.ProviderException, system.web.HttpParseException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetType = (JCObject)classType.Invoke("GetType", typeName, throwOnError, ignoreCase);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BuildDependencySet GetCachedBuildDependencySet(HttpContext context, java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpParseException, system.web.HttpCompileException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCachedBuildDependencySet = (JCObject)classType.Invoke("GetCachedBuildDependencySet", context == null ? null : context.getJCOInstance(), virtualPath);
            return new BuildDependencySet(objGetCachedBuildDependencySet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BuildDependencySet GetCachedBuildDependencySet(HttpContext context, java.lang.String virtualPath, boolean ensureIsUpToDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpParseException, system.web.HttpCompileException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCachedBuildDependencySet = (JCObject)classType.Invoke("GetCachedBuildDependencySet", context == null ? null : context.getJCOInstance(), virtualPath, ensureIsUpToDate);
            return new BuildDependencySet(objGetCachedBuildDependencySet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IWebObjectFactory GetObjectFactory(java.lang.String virtualPath, boolean throwIfNotFound) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.web.HttpCompileException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpParseException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetObjectFactory = (JCObject)classType.Invoke("GetObjectFactory", virtualPath, throwIfNotFound);
            return new IWebObjectFactoryImplementation(objGetObjectFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddCompilationDependency(java.lang.String dependency) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddCompilationDependency", dependency);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddReferencedAssembly(Assembly assembly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddReferencedAssembly", assembly == null ? null : assembly.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getIsPrecompiledApp() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("IsPrecompiledApp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getIsUpdatablePrecompiledApp() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("IsUpdatablePrecompiledApp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IList getCodeAssemblies() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.web.HttpCompileException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.NotSupportedException, system.web.HttpParseException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CodeAssemblies");
            return new IListImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FrameworkName getTargetFramework() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.io.IOException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TargetFramework");
            return new FrameworkName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}