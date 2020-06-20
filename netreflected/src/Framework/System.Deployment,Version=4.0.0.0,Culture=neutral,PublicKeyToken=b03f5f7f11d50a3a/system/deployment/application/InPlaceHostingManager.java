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
import system.Uri;
import system.runtime.remoting.ObjectHandle;


/**
 * The base .NET class managing System.Deployment.Application.InPlaceHostingManager, System.Deployment, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class InPlaceHostingManager extends NetObject  {
    public static final String assemblyFullName = "System.Deployment, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Deployment";
    public static final String className = "System.Deployment.Application.InPlaceHostingManager";
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

    public InPlaceHostingManager(Object instance) throws Throwable {
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

    public static InPlaceHostingManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InPlaceHostingManager(from.getJCOInstance());
    }

    // Constructors section
    

    public InPlaceHostingManager(Uri deploymentManifest, boolean launchInHostProcess) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.OverflowException, system.deployment.application.InvalidDeploymentException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.deployment.application.DeploymentDownloadException, system.componentmodel.Win32Exception, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(deploymentManifest == null ? null : deploymentManifest.getJCOInstance(), launchInHostProcess));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InPlaceHostingManager(Uri deploymentManifest) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.OverflowException, system.deployment.application.InvalidDeploymentException, system.OutOfMemoryException, system.security.SecurityException, system.deployment.application.DeploymentDownloadException, system.threading.AbandonedMutexException, system.componentmodel.Win32Exception, system.NullReferenceException, system.reflection.TargetInvocationException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(deploymentManifest == null ? null : deploymentManifest.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static void UninstallCustomUXApplication(java.lang.String subscriptionId) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.deployment.application.InvalidDeploymentException, system.security.SecurityException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("UninstallCustomUXApplication", subscriptionId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void UninstallCustomAddIn(java.lang.String subscriptionId) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.deployment.application.InvalidDeploymentException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("UninstallCustomAddIn", subscriptionId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetManifestAsync() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidTimeZoneException, system.security.SecurityException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetManifestAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AssertApplicationRequirements() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidTimeZoneException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.deployment.application.DeploymentException, system.io.IOException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.FormatException, system.deployment.application.DependentPlatformMissingException, system.security.SecurityException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.security.XmlSyntaxException, system.RankException, system.reflection.TargetParameterCountException, system.NullReferenceException, system.OverflowException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AssertApplicationRequirements");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AssertApplicationRequirements(boolean grantApplicationTrust) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidTimeZoneException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.deployment.application.DeploymentException, system.io.IOException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.FormatException, system.deployment.application.DependentPlatformMissingException, system.security.SecurityException, system.deployment.application.CompatibleFrameworkMissingException, system.deployment.application.SupportedRuntimeMissingException, system.security.XmlSyntaxException, system.RankException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NullReferenceException, system.security.policy.PolicyException, system.deployment.application.TrustNotGrantedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AssertApplicationRequirements", grantApplicationTrust);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadApplicationAsync() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidTimeZoneException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.security.SecurityException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadApplicationAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle Execute() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidTimeZoneException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.MemberAccessException, system.security.policy.PolicyException, system.runtime.remoting.RemotingException, system.security.SecurityException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExecute = (JCObject)classInstance.Invoke("Execute");
            return new ObjectHandle(objExecute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelAsync() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidTimeZoneException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidTimeZoneException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.FormatException, system.OverflowException, system.deployment.application.InvalidDeploymentException, system.OutOfMemoryException, system.deployment.application.DeploymentException, system.UriFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    


}