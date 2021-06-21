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

package microsoft.build.tasks.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.hosting.ICscHostObject2;
import microsoft.build.tasks.hosting.ICscHostObject2Implementation;
import microsoft.build.tasks.hosting.ICscHostObject;
import microsoft.build.tasks.hosting.ICscHostObjectImplementation;
import microsoft.build.framework.ITaskHost;
import microsoft.build.framework.ITaskHostImplementation;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Hosting.ICscHostObject3, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Hosting.ICscHostObject3" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Hosting.ICscHostObject3</a>
 */
public class ICscHostObject3Implementation extends NetObject implements ICscHostObject3 {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Hosting.ICscHostObject3
     */
    public static final String className = "Microsoft.Build.Tasks.Hosting.ICscHostObject3";
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

    public ICscHostObject3Implementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ICscHostObject3}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ICscHostObject3} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ICscHostObject3 ToICscHostObject3(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ICscHostObject3Implementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean Compile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Compile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDesignTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDesignTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsUpToDate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsUpToDate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAdditionalLibPaths(java.lang.String[] additionalLibPaths) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAdditionalLibPaths", (Object)additionalLibPaths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAdditionalLibPaths(JCORefOut dupParam0) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAdditionalLibPaths", (Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAddModules(java.lang.String[] addModules) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAddModules", (Object)addModules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAddModules(JCORefOut dupParam0) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAddModules", (Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAllowUnsafeBlocks(boolean allowUnsafeBlocks) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAllowUnsafeBlocks", allowUnsafeBlocks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetApplicationConfiguration(java.lang.String applicationConfiguration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetApplicationConfiguration", applicationConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetBaseAddress(java.lang.String baseAddress) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetBaseAddress", baseAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetCheckForOverflowUnderflow(boolean checkForOverflowUnderflow) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetCheckForOverflowUnderflow", checkForOverflowUnderflow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetCodePage(int codePage) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetCodePage", codePage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDebugType(java.lang.String debugType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDebugType", debugType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDefineConstants(java.lang.String defineConstants) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDefineConstants", defineConstants);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDelaySign(boolean delaySignExplicitlySet, boolean delaySign) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDelaySign", delaySignExplicitlySet, delaySign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDisabledWarnings(java.lang.String disabledWarnings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDisabledWarnings", disabledWarnings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDocumentationFile(java.lang.String documentationFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDocumentationFile", documentationFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetEmitDebugInformation(boolean emitDebugInformation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetEmitDebugInformation", emitDebugInformation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetErrorReport(java.lang.String errorReport) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetErrorReport", errorReport);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetFileAlignment(int fileAlignment) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetFileAlignment", fileAlignment);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetGenerateFullPaths(boolean generateFullPaths) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetGenerateFullPaths", generateFullPaths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetKeyContainer(java.lang.String keyContainer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetKeyContainer", keyContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetKeyFile(java.lang.String keyFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetKeyFile", keyFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetLangVersion(java.lang.String langVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetLangVersion", langVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetLinkResources(ITaskItem[] linkResources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetLinkResources", (Object)toObjectFromArray(linkResources));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetMainEntryPoint(java.lang.String targetType, java.lang.String mainEntryPoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetMainEntryPoint", targetType, mainEntryPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetModuleAssemblyName(java.lang.String moduleAssemblyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetModuleAssemblyName", moduleAssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetNoConfig(boolean noConfig) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetNoConfig", noConfig);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetNoStandardLib(boolean noStandardLib) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetNoStandardLib", noStandardLib);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptimize(boolean optimize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptimize", optimize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOutputAssembly(java.lang.String outputAssembly) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOutputAssembly", outputAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetPdbFile(java.lang.String pdbFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetPdbFile", pdbFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetPlatform(java.lang.String platform) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetPlatform", platform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetReferences(ITaskItem[] references) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetReferences", (Object)toObjectFromArray(references));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetResources(ITaskItem[] resources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetResources", (Object)toObjectFromArray(resources));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetResponseFiles(ITaskItem[] responseFiles) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetResponseFiles", (Object)toObjectFromArray(responseFiles));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetSources(ITaskItem[] sources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetSources", (Object)toObjectFromArray(sources));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetTargetType(java.lang.String targetType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetTargetType", targetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetTreatWarningsAsErrors(boolean treatWarningsAsErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetTreatWarningsAsErrors", treatWarningsAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWarningLevel(int warningLevel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWarningLevel", warningLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWarningsAsErrors(java.lang.String warningsAsErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWarningsAsErrors", warningsAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWarningsNotAsErrors(java.lang.String warningsNotAsErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWarningsNotAsErrors", warningsNotAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWin32Icon(java.lang.String win32Icon) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWin32Icon", win32Icon);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWin32Manifest(java.lang.String win32Manifest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWin32Manifest", win32Manifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWin32Resource(java.lang.String win32Resource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWin32Resource", win32Resource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginInitialization() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginInitialization");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}