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

package microsoft.build.tasks;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.framework.IBuildEngine;
import microsoft.build.framework.IBuildEngineImplementation;
import microsoft.build.framework.IBuildEngine2;
import microsoft.build.framework.IBuildEngine2Implementation;
import microsoft.build.framework.IBuildEngine3;
import microsoft.build.framework.IBuildEngine3Implementation;
import microsoft.build.framework.IBuildEngine4;
import microsoft.build.framework.IBuildEngine4Implementation;
import microsoft.build.framework.ITaskHost;
import microsoft.build.framework.ITaskHostImplementation;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;
import microsoft.build.utilities.TaskLoggingHelper;


/**
 * The base .NET class managing Microsoft.Build.Tasks.SGen, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SGen extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.SGen";
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

    public SGen(Object instance) throws Throwable {
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

    public static SGen cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SGen(from.getJCOInstance());
    }

    // Constructors section
    

    public SGen() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Execute() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.NotSupportedException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.threading.WaitHandleCannotBeOpenedException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.RankException, system.security.cryptography.CryptographicException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getDelaySign() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DelaySign");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDelaySign(boolean DelaySign) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DelaySign", DelaySign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEchoOff() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EchoOff");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEchoOff(boolean EchoOff) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EchoOff", EchoOff);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogStandardErrorAsError() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("LogStandardErrorAsError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogStandardErrorAsError(boolean LogStandardErrorAsError) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LogStandardErrorAsError", LogStandardErrorAsError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShouldGenerateSerializer() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShouldGenerateSerializer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShouldGenerateSerializer(boolean ShouldGenerateSerializer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShouldGenerateSerializer", ShouldGenerateSerializer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseCommandProcessor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseCommandProcessor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseCommandProcessor(boolean UseCommandProcessor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseCommandProcessor", UseCommandProcessor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseProxyTypes() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseProxyTypes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseProxyTypes(boolean UseProxyTypes) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseProxyTypes", UseProxyTypes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getYieldDuringToolExecution() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("YieldDuringToolExecution");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setYieldDuringToolExecution(boolean YieldDuringToolExecution) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("YieldDuringToolExecution", YieldDuringToolExecution);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getExitCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ExitCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Timeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeout(int Timeout) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Timeout", Timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBuildEngine getBuildEngine() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BuildEngine");
            return new IBuildEngineImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBuildEngine(IBuildEngine BuildEngine) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BuildEngine", BuildEngine == null ? null : BuildEngine.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBuildEngine2 getBuildEngine2() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BuildEngine2");
            return new IBuildEngine2Implementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBuildEngine3 getBuildEngine3() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BuildEngine3");
            return new IBuildEngine3Implementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBuildEngine4 getBuildEngine4() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BuildEngine4");
            return new IBuildEngine4Implementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskHost getHostObject() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HostObject");
            return new ITaskHostImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHostObject(ITaskHost HostObject) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HostObject", HostObject == null ? null : HostObject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem[] getSerializationAssembly() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SerializationAssembly");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ITaskItemImplementation(resultingObject));
            }
            ITaskItem[] resultingArray = new ITaskItem[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSerializationAssembly(ITaskItem[] SerializationAssembly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SerializationAssembly", toObjectFromArray(SerializationAssembly));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskLoggingHelper getLog() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Log");
            return new TaskLoggingHelper(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBuildAssemblyName() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("BuildAssemblyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBuildAssemblyName(java.lang.String BuildAssemblyName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BuildAssemblyName", BuildAssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBuildAssemblyPath() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidOperationException, system.NotSupportedException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("BuildAssemblyPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBuildAssemblyPath(java.lang.String BuildAssemblyPath) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BuildAssemblyPath", BuildAssemblyPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getKeyContainer() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("KeyContainer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyContainer(java.lang.String KeyContainer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("KeyContainer", KeyContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getKeyFile() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("KeyFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyFile(java.lang.String KeyFile) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("KeyFile", KeyFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPlatform() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Platform");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPlatform(java.lang.String Platform) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Platform", Platform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSdkToolsPath() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SdkToolsPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSdkToolsPath(java.lang.String SdkToolsPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SdkToolsPath", SdkToolsPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSerializationAssemblyName() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SerializationAssemblyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStandardErrorImportance() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("StandardErrorImportance");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStandardErrorImportance(java.lang.String StandardErrorImportance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StandardErrorImportance", StandardErrorImportance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStandardOutputImportance() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("StandardOutputImportance");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStandardOutputImportance(java.lang.String StandardOutputImportance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StandardOutputImportance", StandardOutputImportance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolExe() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ToolExe");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolExe(java.lang.String ToolExe) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ToolExe", ToolExe);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ToolPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolPath(java.lang.String ToolPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ToolPath", ToolPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getEnvironmentVariables() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("EnvironmentVariables");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexEnvironmentVariables = 0; indexEnvironmentVariables < resultingArrayList.size(); indexEnvironmentVariables++ ) {
				resultingArray[indexEnvironmentVariables] = (java.lang.String)resultingArrayList.get(indexEnvironmentVariables);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnvironmentVariables(java.lang.String[] EnvironmentVariables) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnvironmentVariables", EnvironmentVariables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getReferences() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("References");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexReferences = 0; indexReferences < resultingArrayList.size(); indexReferences++ ) {
				resultingArray[indexReferences] = (java.lang.String)resultingArrayList.get(indexReferences);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReferences(java.lang.String[] References) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("References", References);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getTypes() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Types");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexTypes = 0; indexTypes < resultingArrayList.size(); indexTypes++ ) {
				resultingArray[indexTypes] = (java.lang.String)resultingArrayList.get(indexTypes);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypes(java.lang.String[] Types) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Types", Types);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}