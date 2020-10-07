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

package system.web.ui.webcontrols.webparts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.DateTime;
import system.web.ui.webcontrols.webparts.PersonalizationScope;
import system.web.ui.webcontrols.webparts.PersonalizationStateInfoCollection;
import system.web.ui.webcontrols.webparts.PersonalizationProvider;
import system.web.ui.webcontrols.webparts.PersonalizationProviderCollection;


/**
 * The base .NET class managing System.Web.UI.WebControls.WebParts.PersonalizationAdministration, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.WebControls.WebParts.PersonalizationAdministration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.WebControls.WebParts.PersonalizationAdministration</a>
 */
public class PersonalizationAdministration extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.UI.WebControls.WebParts.PersonalizationAdministration
     */
    public static final String className = "System.Web.UI.WebControls.WebParts.PersonalizationAdministration";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public PersonalizationAdministration(Object instance) throws Throwable {
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PersonalizationAdministration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PersonalizationAdministration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PersonalizationAdministration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PersonalizationAdministration(from.getJCOInstance());
    }

    // Constructors section
    
    public PersonalizationAdministration() throws Throwable {
    }

    
    // Methods section
    
    public static boolean ResetSharedState(java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ResetSharedState", path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ResetUserState(java.lang.String path, java.lang.String username) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ResetUserState", path, username);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetCountOfInactiveUserState(DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetCountOfInactiveUserState", userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetCountOfInactiveUserState(java.lang.String pathToMatch, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetCountOfInactiveUserState", pathToMatch, userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetCountOfState(PersonalizationScope scope) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetCountOfState", scope == null ? null : scope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetCountOfState(PersonalizationScope scope, java.lang.String pathToMatch) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetCountOfState", scope == null ? null : scope.getJCOInstance(), pathToMatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetCountOfUserState(java.lang.String usernameToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetCountOfUserState", usernameToMatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetAllState(PersonalizationScope scope) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.FormatException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetAllState", scope == null ? null : scope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetInactiveUserState(DateTime userInactiveSinceDate) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.FormatException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetInactiveUserState", userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetInactiveUserState(java.lang.String path, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetInactiveUserState", path, userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetSharedState(java.lang.String[] paths) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetSharedState", (Object)paths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetSharedState(JCRefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetSharedState", (Object)dupParam0);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetState(PersonalizationStateInfoCollection data) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetState", data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetUserState(java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetUserState", path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetUserState(java.lang.String path, java.lang.String[] usernames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetUserState", path, usernames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetUserState(java.lang.String dupParam0, JCRefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetUserState", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetUserState(java.lang.String[] usernames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetUserState", (Object)usernames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ResetUserState(JCRefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ResetUserState", (Object)dupParam0);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationStateInfoCollection FindInactiveUserState(java.lang.String pathToMatch, java.lang.String usernameToMatch, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindInactiveUserState = (JCObject)classType.Invoke("FindInactiveUserState", pathToMatch, usernameToMatch, userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
            return new PersonalizationStateInfoCollection(objFindInactiveUserState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationStateInfoCollection FindSharedState(java.lang.String pathToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindSharedState = (JCObject)classType.Invoke("FindSharedState", pathToMatch);
            return new PersonalizationStateInfoCollection(objFindSharedState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationStateInfoCollection FindUserState(java.lang.String pathToMatch, java.lang.String usernameToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindUserState = (JCObject)classType.Invoke("FindUserState", pathToMatch, usernameToMatch);
            return new PersonalizationStateInfoCollection(objFindUserState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationStateInfoCollection GetAllInactiveUserState(DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAllInactiveUserState = (JCObject)classType.Invoke("GetAllInactiveUserState", userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
            return new PersonalizationStateInfoCollection(objGetAllInactiveUserState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationStateInfoCollection GetAllState(PersonalizationScope scope) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAllState = (JCObject)classType.Invoke("GetAllState", scope == null ? null : scope.getJCOInstance());
            return new PersonalizationStateInfoCollection(objGetAllState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static java.lang.String getApplicationName() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.FormatException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("ApplicationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setApplicationName(java.lang.String ApplicationName) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.FormatException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("ApplicationName", ApplicationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationProvider getProvider() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Provider");
            return new PersonalizationProvider(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PersonalizationProviderCollection getProviders() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Providers");
            return new PersonalizationProviderCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}