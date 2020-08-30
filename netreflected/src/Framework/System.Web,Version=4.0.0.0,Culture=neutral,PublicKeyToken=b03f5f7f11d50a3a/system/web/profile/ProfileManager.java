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

package system.web.profile;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.profile.ProfileAuthenticationOption;
import system.DateTime;
import system.web.profile.ProfileInfoCollection;
import system.web.configuration.ProfilePropertySettings;
import system.web.profile.ProfileProvider;
import system.web.profile.ProfileProviderCollection;


/**
 * The base .NET class managing System.Web.Profile.ProfileManager, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Profile.ProfileManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Profile.ProfileManager</a>
 */
public class ProfileManager extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Profile.ProfileManager
     */
    public static final String className = "System.Web.Profile.ProfileManager";
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

    public ProfileManager(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProfileManager}, a cast assert is made to check if types are compatible.
     */
    public static ProfileManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProfileManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ProfileManager() throws Throwable {
    }

    
    // Methods section
    
    public static boolean DeleteProfile(java.lang.String username) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("DeleteProfile", username);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int DeleteInactiveProfiles(ProfileAuthenticationOption authenticationOption, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("DeleteInactiveProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int DeleteProfiles(java.lang.String[] usernames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("DeleteProfiles", (Object)usernames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int DeleteProfiles(JCRefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("DeleteProfiles", (Object)dupParam0);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int DeleteProfiles(ProfileInfoCollection profiles) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("DeleteProfiles", profiles == null ? null : profiles.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetNumberOfInactiveProfiles(ProfileAuthenticationOption authenticationOption, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetNumberOfInactiveProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetNumberOfProfiles(ProfileAuthenticationOption authenticationOption) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.InvalidTimeZoneException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetNumberOfProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ProfileInfoCollection FindInactiveProfilesByUserName(ProfileAuthenticationOption authenticationOption, java.lang.String usernameToMatch, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindInactiveProfilesByUserName = (JCObject)classType.Invoke("FindInactiveProfilesByUserName", authenticationOption == null ? null : authenticationOption.getJCOInstance(), usernameToMatch, userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
            return new ProfileInfoCollection(objFindInactiveProfilesByUserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ProfileInfoCollection FindProfilesByUserName(ProfileAuthenticationOption authenticationOption, java.lang.String usernameToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindProfilesByUserName = (JCObject)classType.Invoke("FindProfilesByUserName", authenticationOption == null ? null : authenticationOption.getJCOInstance(), usernameToMatch);
            return new ProfileInfoCollection(objFindProfilesByUserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ProfileInfoCollection GetAllInactiveProfiles(ProfileAuthenticationOption authenticationOption, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAllInactiveProfiles = (JCObject)classType.Invoke("GetAllInactiveProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
            return new ProfileInfoCollection(objGetAllInactiveProfiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ProfileInfoCollection GetAllProfiles(ProfileAuthenticationOption authenticationOption) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAllProfiles = (JCObject)classType.Invoke("GetAllProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance());
            return new ProfileInfoCollection(objGetAllProfiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddDynamicProfileProperty(ProfilePropertySettings property) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddDynamicProfileProperty", property == null ? null : property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getAutomaticSaveEnabled() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("AutomaticSaveEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getEnabled() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("Enabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getApplicationName() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("ApplicationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setApplicationName(java.lang.String ApplicationName) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("ApplicationName", ApplicationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ProfileProvider getProvider() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Provider");
            return new ProfileProvider(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ProfileProviderCollection getProviders() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Providers");
            return new ProfileProviderCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}