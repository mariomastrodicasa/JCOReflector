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

package system.web.compilation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.MarshalByRefObject;
import system.web.compilation.ClientBuildManagerParameter;
import system.componentmodel.TypeDescriptionProvider;
import system.codedom.CodeCompileUnit;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.web.hosting.IRegisteredObject;
import system.web.hosting.IRegisteredObjectImplementation;
import system.web.compilation.ClientBuildManagerCallback;
import system.EventHandler;
import system.web.compilation.BuildManagerHostUnloadEventHandler;


/**
 * The base .NET class managing System.Web.Compilation.ClientBuildManager, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Compilation.ClientBuildManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Compilation.ClientBuildManager</a>
 */
public class ClientBuildManager extends MarshalByRefObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Compilation.ClientBuildManager
     */
    public static final String className = "System.Web.Compilation.ClientBuildManager";
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

    public ClientBuildManager(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ClientBuildManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ClientBuildManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ClientBuildManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ClientBuildManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ClientBuildManager() throws Throwable {
    }

    public ClientBuildManager(java.lang.String appVirtualDir, java.lang.String appPhysicalSourceDir) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.web.HttpException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(appVirtualDir, appPhysicalSourceDir));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClientBuildManager(java.lang.String appVirtualDir, java.lang.String appPhysicalSourceDir, java.lang.String appPhysicalTargetDir) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.web.HttpException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(appVirtualDir, appPhysicalSourceDir, appPhysicalTargetDir));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClientBuildManager(java.lang.String appVirtualDir, java.lang.String appPhysicalSourceDir, java.lang.String appPhysicalTargetDir, ClientBuildManagerParameter parameter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.web.HttpException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(appVirtualDir, appPhysicalSourceDir, appPhysicalTargetDir, parameter == null ? null : parameter.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClientBuildManager(java.lang.String appVirtualDir, java.lang.String appPhysicalSourceDir, java.lang.String appPhysicalTargetDir, ClientBuildManagerParameter parameter, TypeDescriptionProvider typeDescriptionProvider) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.OutOfMemoryException, system.web.HttpException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(appVirtualDir, appPhysicalSourceDir, appPhysicalTargetDir, parameter == null ? null : parameter.getJCOInstance(), typeDescriptionProvider == null ? null : typeDescriptionProvider.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsCodeAssembly(java.lang.String assemblyName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsCodeAssembly", assemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Unload() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Unload");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDictionary GetBrowserDefinitions() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.ArgumentNullException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetBrowserDefinitions = (JCObject)classInstance.Invoke("GetBrowserDefinitions");
            return new IDictionaryImplementation(objGetBrowserDefinitions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetGeneratedFileVirtualPath(java.lang.String filePath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetGeneratedFileVirtualPath", filePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetGeneratedSourceFile(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpCompileException, system.web.HttpParseException, system.OperationCanceledException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetGeneratedSourceFile", virtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetAppDomainShutdownDirectories() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetAppDomainShutdownDirectories");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetAppDomainShutdownDirectories = 0; indexGetAppDomainShutdownDirectories < resultingArrayList.size(); indexGetAppDomainShutdownDirectories++ ) {
				resultingArray[indexGetAppDomainShutdownDirectories] = (java.lang.String)resultingArrayList.get(indexGetAppDomainShutdownDirectories);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetTopLevelAssemblyReferences(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.threading.ThreadAbortException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetTopLevelAssemblyReferences", virtualPath);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetTopLevelAssemblyReferences = 0; indexGetTopLevelAssemblyReferences < resultingArrayList.size(); indexGetTopLevelAssemblyReferences++ ) {
				resultingArray[indexGetTopLevelAssemblyReferences] = (java.lang.String)resultingArrayList.get(indexGetTopLevelAssemblyReferences);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetVirtualCodeDirectories() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.ArgumentNullException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetVirtualCodeDirectories");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetVirtualCodeDirectories = 0; indexGetVirtualCodeDirectories < resultingArrayList.size(); indexGetVirtualCodeDirectories++ ) {
				resultingArray[indexGetVirtualCodeDirectories] = (java.lang.String)resultingArrayList.get(indexGetVirtualCodeDirectories);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetCompiledType(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpCompileException, system.UriFormatException, system.threading.ThreadAbortException, system.InvalidCastException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCompiledType = (JCObject)classInstance.Invoke("GetCompiledType", virtualPath);
            return new NetType(objGetCompiledType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRegisteredObject CreateObject(NetType type, boolean failIfExists) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObject = (JCObject)classInstance.Invoke("CreateObject", type == null ? null : type.getJCOInstance(), failIfExists);
            return new IRegisteredObjectImplementation(objCreateObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompileApplicationDependencies() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.ArgumentNullException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpCompileException, system.web.HttpParseException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompileApplicationDependencies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompileFile(java.lang.String virtualPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.web.HttpException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.CannotUnloadAppDomainException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpCompileException, system.UriFormatException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompileFile", virtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompileFile(java.lang.String virtualPath, ClientBuildManagerCallback callback) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpCompileException, system.UriFormatException, system.threading.ThreadAbortException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompileFile", virtualPath, callback == null ? null : callback.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrecompileApplication() throws Throwable, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.MulticastNotSupportedException, system.web.HttpException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.configuration.provider.ProviderException, system.SystemException, system.io.IOException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PrecompileApplication");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrecompileApplication(ClientBuildManagerCallback callback) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.MulticastNotSupportedException, system.web.HttpException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.CannotUnloadAppDomainException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpParseException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PrecompileApplication", callback == null ? null : callback.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrecompileApplication(ClientBuildManagerCallback callback, boolean forceCleanBuild) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentNullException, system.NullReferenceException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.web.HttpException, system.OutOfMemoryException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.web.HttpParseException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.runtime.remoting.RemotingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PrecompileApplication", callback == null ? null : callback.getJCOInstance(), forceCleanBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsHostCreated() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsHostCreated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCodeGenDir() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.ArgumentNullException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.NotImplementedException, system.SystemException, system.ObjectDisposedException, system.CannotUnloadAppDomainException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CodeGenDir");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addAppDomainStarted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("AppDomainStarted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAppDomainStarted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("AppDomainStarted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAppDomainShutdown(BuildManagerHostUnloadEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("AppDomainShutdown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAppDomainShutdown(BuildManagerHostUnloadEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("AppDomainShutdown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAppDomainUnloaded(BuildManagerHostUnloadEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("AppDomainUnloaded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAppDomainUnloaded(BuildManagerHostUnloadEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("AppDomainUnloaded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}