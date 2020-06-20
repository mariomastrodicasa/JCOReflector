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

package microsoft.build.tasks.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.xaml.CommandLineToolSwitch;
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
import microsoft.build.utilities.TaskLoggingHelper;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Xaml.XamlDataDrivenToolTask, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class XamlDataDrivenToolTask extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.Xaml.XamlDataDrivenToolTask";
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

    public XamlDataDrivenToolTask(Object instance) throws Throwable {
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

    public static XamlDataDrivenToolTask cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlDataDrivenToolTask(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public boolean IsPropertySet(java.lang.String propertyName) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsPropertySet", propertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReplaceToolSwitch(CommandLineToolSwitch switchToAdd) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReplaceToolSwitch", switchToAdd == null ? null : switchToAdd.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddActiveSwitchToolValue(CommandLineToolSwitch switchToAdd) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddActiveSwitchToolValue", switchToAdd == null ? null : switchToAdd.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Execute() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.InvalidCastException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.RankException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.threading.SemaphoreFullException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ValidateInteger(java.lang.String switchName, int min, int max, int value) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ValidateInteger", switchName, min, max, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getCommandLineTemplate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CommandLineTemplate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandLineTemplate(java.lang.String CommandLineTemplate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommandLineTemplate", CommandLineTemplate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAdditionalOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AdditionalOptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdditionalOptions(java.lang.String AdditionalOptions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AdditionalOptions", AdditionalOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getAcceptableNonZeroExitCodes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("AcceptableNonZeroExitCodes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexAcceptableNonZeroExitCodes = 0; indexAcceptableNonZeroExitCodes < resultingArrayList.size(); indexAcceptableNonZeroExitCodes++ ) {
				resultingArray[indexAcceptableNonZeroExitCodes] = (java.lang.String)resultingArrayList.get(indexAcceptableNonZeroExitCodes);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAcceptableNonZeroExitCodes(java.lang.String[] AcceptableNonZeroExitCodes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AcceptableNonZeroExitCodes", AcceptableNonZeroExitCodes);
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



    // Instance Events section
    

}