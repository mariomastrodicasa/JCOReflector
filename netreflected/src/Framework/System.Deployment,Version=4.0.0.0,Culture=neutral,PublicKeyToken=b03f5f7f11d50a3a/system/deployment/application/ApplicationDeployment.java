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

package system.deployment.application;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.deployment.application.UpdateCheckInfo;
import system.Version;
import system.DateTime;
import system.Uri;
import system.deployment.application.ApplicationDeployment;
import system.deployment.application.DeploymentProgressChangedEventHandler;
import system.deployment.application.CheckForUpdateCompletedEventHandler;
import system.componentmodel.AsyncCompletedEventHandler;
import system.deployment.application.DownloadFileGroupCompletedEventHandler;


/**
 * The base .NET class managing System.Deployment.Application.ApplicationDeployment, System.Deployment, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ApplicationDeployment extends NetObject  {
    public static final String assemblyFullName = "System.Deployment, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Deployment";
    public static final String className = "System.Deployment.Application.ApplicationDeployment";
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

    public ApplicationDeployment(Object instance) throws Throwable {
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

    public static ApplicationDeployment cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ApplicationDeployment(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public UpdateCheckInfo CheckForDetailedUpdate() throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.deployment.application.InvalidDeploymentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.deployment.application.DeploymentDownloadException, system.MulticastNotSupportedException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.FormatException, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.OverflowException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCheckForDetailedUpdate = (JCObject)classInstance.Invoke("CheckForDetailedUpdate");
            return new UpdateCheckInfo(objCheckForDetailedUpdate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckForUpdate() throws Throwable, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.deployment.application.InvalidDeploymentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.deployment.application.DeploymentDownloadException, system.FormatException, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.security.XmlSyntaxException, system.OverflowException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CheckForUpdate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckForUpdate(boolean persistUpdateCheckResult) throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.deployment.application.InvalidDeploymentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.deployment.application.DeploymentDownloadException, system.MulticastNotSupportedException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.FormatException, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.OverflowException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CheckForUpdate", persistUpdateCheckResult);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CheckForUpdateAsyncCancel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CheckForUpdateAsyncCancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateAsyncCancel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateAsyncCancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFileGroup(java.lang.String groupName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.threading.WaitHandleCannotBeOpenedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.deployment.application.DeploymentDownloadException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFileGroup", groupName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFileGroupAsync(java.lang.String groupName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.deployment.application.DeploymentException, system.FormatException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.OverflowException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.deployment.application.DeploymentDownloadException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFileGroupAsync", groupName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFileGroupAsync(java.lang.String groupName, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.threading.WaitHandleCannotBeOpenedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.deployment.application.DeploymentDownloadException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFileGroupAsync", groupName, userState == null ? null : userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsFileGroupDownloaded(java.lang.String groupName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.io.IOException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.NotImplementedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.deployment.application.DeploymentException, system.OverflowException, system.deployment.application.InvalidDeploymentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsFileGroupDownloaded", groupName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFileGroupAsyncCancel(java.lang.String groupName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotImplementedException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.OverflowException, system.deployment.application.InvalidDeploymentException, system.OutOfMemoryException, system.NotSupportedException, system.deployment.application.DeploymentDownloadException, system.MulticastNotSupportedException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.FormatException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFileGroupAsyncCancel", groupName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UpdateCheckInfo CheckForDetailedUpdate(boolean persistUpdateCheckResult) throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.security.SecurityException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.FormatException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.deployment.application.DeploymentDownloadException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.RankException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCheckForDetailedUpdate = (JCObject)classInstance.Invoke("CheckForDetailedUpdate", persistUpdateCheckResult);
            return new UpdateCheckInfo(objCheckForDetailedUpdate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CheckForUpdateAsync() throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.security.SecurityException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.FormatException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.deployment.application.DeploymentDownloadException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.RankException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CheckForUpdateAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Update() throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.security.SecurityException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.FormatException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.deployment.application.DeploymentDownloadException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.RankException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Update");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateAsync() throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.security.SecurityException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.DeploymentException, system.FormatException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.PlatformNotSupportedException, system.reflection.AmbiguousMatchException, system.deployment.application.DeploymentDownloadException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.deployment.application.DependentPlatformMissingException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.RankException, system.reflection.TargetParameterCountException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Version getCurrentVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getUpdatedVersion() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UpdatedVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUpdatedApplicationFullName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("UpdatedApplicationFullName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getTimeOfLastUpdateCheck() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TimeOfLastUpdateCheck");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getUpdateLocation() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UpdateLocation");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getActivationUri() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.IOException, system.io.PathTooLongException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.deployment.application.DeploymentException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.deployment.application.InvalidDeploymentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ActivationUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataDirectory() throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DataDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFirstRun() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsFirstRun");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ApplicationDeployment getCurrentDeployment() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.deployment.application.InvalidDeploymentException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CurrentDeployment");
            return new ApplicationDeployment(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getIsNetworkDeployed() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.deployment.application.InvalidDeploymentException, system.FormatException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.UriFormatException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("IsNetworkDeployed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addCheckForUpdateProgressChanged(DeploymentProgressChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CheckForUpdateProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCheckForUpdateProgressChanged(DeploymentProgressChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CheckForUpdateProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCheckForUpdateCompleted(CheckForUpdateCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CheckForUpdateCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCheckForUpdateCompleted(CheckForUpdateCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CheckForUpdateCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUpdateProgressChanged(DeploymentProgressChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UpdateProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUpdateProgressChanged(DeploymentProgressChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UpdateProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUpdateCompleted(AsyncCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UpdateCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUpdateCompleted(AsyncCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UpdateCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDownloadFileGroupProgressChanged(DeploymentProgressChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("DownloadFileGroupProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDownloadFileGroupProgressChanged(DeploymentProgressChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("DownloadFileGroupProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDownloadFileGroupCompleted(DownloadFileGroupCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("DownloadFileGroupCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDownloadFileGroupCompleted(DownloadFileGroupCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("DownloadFileGroupCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}