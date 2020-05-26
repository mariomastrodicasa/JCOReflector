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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.CancelEventArgs;
import system.threading.ApartmentState;
import system.EventArgs;
import system.windows.forms.Form;
import system.windows.forms.ApplicationContext;
import system.windows.forms.PowerState;
import system.windows.forms.UnhandledExceptionMode;
import microsoft.win32.RegistryKey;
import system.globalization.CultureInfo;
import system.windows.forms.InputLanguage;
import system.windows.forms.FormCollection;
import system.windows.forms.visualstyles.VisualStyleState;


/**
 * The base .NET class managing System.Windows.Forms.Application, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class Application extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.Application";
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

    public Application(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static Application castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Application(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static void Exit(CancelEventArgs e) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.io.PathTooLongException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.RankException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        try {
            classType.Invoke("Exit", (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExitThread() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.NullReferenceException, system.OutOfMemoryException {
        try {
            classType.Invoke("ExitThread");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ApartmentState OleRequired() throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            JCObject objOleRequired = (JCObject)classType.Invoke("OleRequired");
            return new ApartmentState(objOleRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void OnThreadException(NetException t) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.UriFormatException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.collections.generic.KeyNotFoundException, system.OverflowException {
        try {
            classType.Invoke("OnThreadException", (Object)t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RaiseIdle(EventArgs e) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            classType.Invoke("RaiseIdle", (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run(Form mainForm) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.MulticastNotSupportedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.InvalidAsynchronousStateException, system.security.SecurityException {
        try {
            classType.Invoke("Run", (Object)mainForm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run(ApplicationContext context) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.InvalidAsynchronousStateException, system.security.SecurityException {
        try {
            classType.Invoke("Run", (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCompatibleTextRenderingDefault(boolean defaultValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classType.Invoke("SetCompatibleTextRenderingDefault", defaultValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetSuspendState(PowerState state, boolean force, boolean disableWakeEvent) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            return (boolean)classType.Invoke("SetSuspendState", (Object)state.getJCOInstance(), force, disableWakeEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetUnhandledExceptionMode(UnhandledExceptionMode mode) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classType.Invoke("SetUnhandledExceptionMode", (Object)mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetUnhandledExceptionMode(UnhandledExceptionMode mode, boolean threadScope) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classType.Invoke("SetUnhandledExceptionMode", (Object)mode.getJCOInstance(), threadScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Restart() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.io.PathTooLongException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.PlatformNotSupportedException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.componentmodel.Win32Exception, system.AccessViolationException, system.RankException, system.MemberAccessException, system.security.cryptography.CryptographicException, system.io.IOException, system.deployment.application.InvalidDeploymentException, system.deployment.application.DeploymentException, system.reflection.AmbiguousMatchException, system.UriFormatException {
        try {
            classType.Invoke("Restart");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static boolean getAllowQuit() throws Throwable {
        try {
            return (boolean)classType.Get("AllowQuit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey getCommonAppDataRegistry() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("CommonAppDataRegistry");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getCommonAppDataPath() throws Throwable {
        try {
            return (java.lang.String)classType.Get("CommonAppDataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getCompanyName() throws Throwable {
        try {
            return (java.lang.String)classType.Get("CompanyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CultureInfo getCurrentCulture() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("CurrentCulture");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCurrentCulture(CultureInfo CurrentCulture) throws Throwable {
        try {
            classType.Set("CurrentCulture", (Object)CurrentCulture.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InputLanguage getCurrentInputLanguage() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("CurrentInputLanguage");
            return new InputLanguage(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCurrentInputLanguage(InputLanguage CurrentInputLanguage) throws Throwable {
        try {
            classType.Set("CurrentInputLanguage", (Object)CurrentInputLanguage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getExecutablePath() throws Throwable {
        try {
            return (java.lang.String)classType.Get("ExecutablePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getLocalUserAppDataPath() throws Throwable {
        try {
            return (java.lang.String)classType.Get("LocalUserAppDataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getMessageLoop() throws Throwable {
        try {
            return (boolean)classType.Get("MessageLoop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FormCollection getOpenForms() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OpenForms");
            return new FormCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getProductName() throws Throwable {
        try {
            return (java.lang.String)classType.Get("ProductName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getProductVersion() throws Throwable {
        try {
            return (java.lang.String)classType.Get("ProductVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getRenderWithVisualStyles() throws Throwable {
        try {
            return (boolean)classType.Get("RenderWithVisualStyles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getSafeTopLevelCaptionFormat() throws Throwable {
        try {
            return (java.lang.String)classType.Get("SafeTopLevelCaptionFormat");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSafeTopLevelCaptionFormat(java.lang.String SafeTopLevelCaptionFormat) throws Throwable {
        try {
            classType.Set("SafeTopLevelCaptionFormat", (Object)SafeTopLevelCaptionFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getStartupPath() throws Throwable {
        try {
            return (java.lang.String)classType.Get("StartupPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getUseWaitCursor() throws Throwable {
        try {
            return (boolean)classType.Get("UseWaitCursor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setUseWaitCursor(boolean UseWaitCursor) throws Throwable {
        try {
            classType.Set("UseWaitCursor", UseWaitCursor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getUserAppDataPath() throws Throwable {
        try {
            return (java.lang.String)classType.Get("UserAppDataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey getUserAppDataRegistry() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("UserAppDataRegistry");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VisualStyleState getVisualStyleState() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("VisualStyleState");
            return new VisualStyleState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setVisualStyleState(VisualStyleState VisualStyleState) throws Throwable {
        try {
            classType.Set("VisualStyleState", (Object)VisualStyleState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}