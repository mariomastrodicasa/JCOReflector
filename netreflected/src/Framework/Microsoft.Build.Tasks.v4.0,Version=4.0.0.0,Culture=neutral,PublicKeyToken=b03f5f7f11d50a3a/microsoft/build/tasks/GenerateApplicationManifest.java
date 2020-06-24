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
 * The base .NET class managing Microsoft.Build.Tasks.GenerateApplicationManifest, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class GenerateApplicationManifest extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.GenerateApplicationManifest";
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

    public GenerateApplicationManifest(Object instance) throws Throwable {
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

    public static GenerateApplicationManifest cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new GenerateApplicationManifest(from.getJCOInstance());
    }

    // Constructors section
    

    public GenerateApplicationManifest() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Execute() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.OutOfMemoryException, system.FormatException, system.xml.XmlException, system.xml.xpath.XPathException, system.collections.generic.KeyNotFoundException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHostInBrowser() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HostInBrowser");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHostInBrowser(boolean HostInBrowser) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HostInBrowser", HostInBrowser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresMinimumFramework35SP1() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RequiresMinimumFramework35SP1");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequiresMinimumFramework35SP1(boolean RequiresMinimumFramework35SP1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RequiresMinimumFramework35SP1", RequiresMinimumFramework35SP1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseApplicationTrust() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseApplicationTrust");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseApplicationTrust(boolean UseApplicationTrust) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseApplicationTrust", UseApplicationTrust);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxTargetPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxTargetPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxTargetPath(int MaxTargetPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxTargetPath", MaxTargetPath);
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

    public ITaskItem getConfigFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConfigFile");
            return new ITaskItemImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfigFile(ITaskItem ConfigFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConfigFile", ConfigFile == null ? null : ConfigFile.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem getEntryPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EntryPoint");
            return new ITaskItemImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEntryPoint(ITaskItem EntryPoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EntryPoint", EntryPoint == null ? null : EntryPoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem getIconFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IconFile");
            return new ITaskItemImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIconFile(ITaskItem IconFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IconFile", IconFile == null ? null : IconFile.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem getInputManifest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InputManifest");
            return new ITaskItemImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInputManifest(ITaskItem InputManifest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InputManifest", InputManifest == null ? null : InputManifest.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem getOutputManifest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OutputManifest");
            return new ITaskItemImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOutputManifest(ITaskItem OutputManifest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OutputManifest", OutputManifest == null ? null : OutputManifest.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem getTrustInfoFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TrustInfoFile");
            return new ITaskItemImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustInfoFile(ITaskItem TrustInfoFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TrustInfoFile", TrustInfoFile == null ? null : TrustInfoFile.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem[] getDependencies() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Dependencies");
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

    public void setDependencies(ITaskItem[] Dependencies) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Dependencies", toObjectFromArray(Dependencies));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem[] getFileAssociations() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("FileAssociations");
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

    public void setFileAssociations(ITaskItem[] FileAssociations) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FileAssociations", toObjectFromArray(FileAssociations));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem[] getFiles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Files");
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

    public void setFiles(ITaskItem[] Files) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Files", toObjectFromArray(Files));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem[] getIsolatedComReferences() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("IsolatedComReferences");
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

    public void setIsolatedComReferences(ITaskItem[] IsolatedComReferences) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsolatedComReferences", toObjectFromArray(IsolatedComReferences));
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

    public java.lang.String getAssemblyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AssemblyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyName(java.lang.String AssemblyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AssemblyName", AssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAssemblyVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AssemblyVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyVersion(java.lang.String AssemblyVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AssemblyVersion", AssemblyVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getClrVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ClrVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClrVersion(java.lang.String ClrVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClrVersion", ClrVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescription(java.lang.String Description) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Description", Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorReportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ErrorReportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorReportUrl(java.lang.String ErrorReportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ErrorReportUrl", ErrorReportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getManifestType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ManifestType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManifestType(java.lang.String ManifestType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ManifestType", ManifestType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("OSVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOSVersion(java.lang.String OSVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OSVersion", OSVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPlatform() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Platform");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPlatform(java.lang.String Platform) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Platform", Platform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProduct() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Product");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProduct(java.lang.String Product) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Product", Product);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPublisher() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Publisher");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPublisher(java.lang.String Publisher) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Publisher", Publisher);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSuiteName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SuiteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSuiteName(java.lang.String SuiteName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SuiteName", SuiteName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSupportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SupportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSupportUrl(java.lang.String SupportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SupportUrl", SupportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetCulture() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetCulture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetCulture(java.lang.String TargetCulture) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetCulture", TargetCulture);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkMoniker() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkMoniker");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkMoniker(java.lang.String TargetFrameworkMoniker) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetFrameworkMoniker", TargetFrameworkMoniker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkProfile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkProfile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkProfile(java.lang.String TargetFrameworkProfile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetFrameworkProfile", TargetFrameworkProfile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkSubset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkSubset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkSubset(java.lang.String TargetFrameworkSubset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetFrameworkSubset", TargetFrameworkSubset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkVersion(java.lang.String TargetFrameworkVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetFrameworkVersion", TargetFrameworkVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}