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

package microsoft.build.utilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.framework.ITask;
import microsoft.build.framework.ITaskImplementation;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;
import microsoft.build.utilities.DependencyFilter;


/**
 * The base .NET class managing Microsoft.Build.Utilities.CanonicalTrackedOutputFiles, Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class CanonicalTrackedOutputFiles extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.Build.Utilities.v4.0";
    public static final String className = "Microsoft.Build.Utilities.CanonicalTrackedOutputFiles";
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

    public CanonicalTrackedOutputFiles(Object instance) throws Throwable {
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

    public static CanonicalTrackedOutputFiles cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CanonicalTrackedOutputFiles(from.getJCOInstance());
    }

    // Constructors section
    

    public CanonicalTrackedOutputFiles(ITask ownerTask, ITaskItem[] tlogFiles) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.OutOfMemoryException, system.RankException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(ownerTask == null ? null : ownerTask.getJCOInstance(), toObjectFromArray(tlogFiles)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CanonicalTrackedOutputFiles(ITask ownerTask, ITaskItem[] tlogFiles, boolean constructOutputsFromTLogs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.OutOfMemoryException, system.RankException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(ownerTask == null ? null : ownerTask.getJCOInstance(), toObjectFromArray(tlogFiles), constructOutputsFromTLogs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CanonicalTrackedOutputFiles(ITaskItem[] tlogFiles) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.OutOfMemoryException, system.RankException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((Object)toObjectFromArray(tlogFiles)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean RemoveOutputForSourceRoot(java.lang.String sourceRoot, java.lang.String outputPathToRemove) throws Throwable, system.ArgumentNullException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("RemoveOutputForSourceRoot", sourceRoot, outputPathToRemove);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITaskItem[] OutputsForNonCompositeSource(ITaskItem... sources) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("OutputsForNonCompositeSource", (Object)toObjectFromArray(sources));
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

    public ITaskItem[] OutputsForSource(ITaskItem... sources) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.RankException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("OutputsForSource", (Object)toObjectFromArray(sources));
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

    public ITaskItem[] OutputsForSource(ITaskItem[] sources, boolean searchForSubRootsInCompositeRootingMarkers) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("OutputsForSource", toObjectFromArray(sources), searchForSubRootsInCompositeRootingMarkers);
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

    public java.lang.String[] RemoveRootsWithSharedOutputs(ITaskItem[] sources) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("RemoveRootsWithSharedOutputs", (Object)toObjectFromArray(sources));
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexRemoveRootsWithSharedOutputs = 0; indexRemoveRootsWithSharedOutputs < resultingArrayList.size(); indexRemoveRootsWithSharedOutputs++ ) {
				resultingArray[indexRemoveRootsWithSharedOutputs] = (java.lang.String)resultingArrayList.get(indexRemoveRootsWithSharedOutputs);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddComputedOutputForSourceRoot(java.lang.String sourceKey, java.lang.String computedOutput) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddComputedOutputForSourceRoot", sourceKey, computedOutput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddComputedOutputsForSourceRoot(java.lang.String sourceKey, ITaskItem[] computedOutputs) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.io.PathTooLongException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddComputedOutputsForSourceRoot", sourceKey, toObjectFromArray(computedOutputs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddComputedOutputsForSourceRoot(java.lang.String sourceKey, java.lang.String[] computedOutputs) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddComputedOutputsForSourceRoot", sourceKey, computedOutputs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDependenciesFromEntryIfMissing(ITaskItem source) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.InvalidTimeZoneException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDependenciesFromEntryIfMissing", source == null ? null : source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDependenciesFromEntryIfMissing(ITaskItem source, ITaskItem correspondingOutput) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.InvalidTimeZoneException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDependenciesFromEntryIfMissing", source == null ? null : source.getJCOInstance(), correspondingOutput == null ? null : correspondingOutput.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDependenciesFromEntryIfMissing(ITaskItem[] source) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.InvalidTimeZoneException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDependenciesFromEntryIfMissing", (Object)toObjectFromArray(source));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDependenciesFromEntryIfMissing(ITaskItem[] source, ITaskItem[] correspondingOutputs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.RankException, system.collections.generic.KeyNotFoundException, system.InvalidTimeZoneException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDependenciesFromEntryIfMissing", toObjectFromArray(source), toObjectFromArray(correspondingOutputs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDependencyFromEntry(ITaskItem source, ITaskItem dependencyToRemove) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDependencyFromEntry", source == null ? null : source.getJCOInstance(), dependencyToRemove == null ? null : dependencyToRemove.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDependencyFromEntry(ITaskItem[] sources, ITaskItem dependencyToRemove) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDependencyFromEntry", toObjectFromArray(sources), dependencyToRemove == null ? null : dependencyToRemove.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveEntriesForSource(ITaskItem source) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveEntriesForSource", source == null ? null : source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveEntriesForSource(ITaskItem source, ITaskItem correspondingOutput) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveEntriesForSource", source == null ? null : source.getJCOInstance(), correspondingOutput == null ? null : correspondingOutput.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveEntriesForSource(ITaskItem[] source) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveEntriesForSource", (Object)toObjectFromArray(source));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveEntriesForSource(ITaskItem[] source, ITaskItem[] correspondingOutputs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.PathTooLongException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveEntriesForSource", toObjectFromArray(source), toObjectFromArray(correspondingOutputs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveTlog() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.RankException, system.InvalidOperationException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.FormatException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveTlog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveTlog(DependencyFilter includeInTLog) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.RankException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveTlog", includeInTLog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}