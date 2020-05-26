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

package system.web.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.security.MembershipUser;
import system.web.security.MembershipUserCollection;
import system.web.security.MembershipProviderCollection;
import system.web.security.MembershipProvider;


/**
 * The base .NET class managing System.Web.Security.Membership, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Membership extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Security.Membership";
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

    public Membership(Object instance) throws Throwable {
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

    public static Membership castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Membership(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static MembershipUser CreateUser(java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.web.security.MembershipCreateUserException {
        try {
            JCObject objCreateUser = (JCObject)classType.Invoke("CreateUser", (Object)username, (Object)password);
            return new MembershipUser(objCreateUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser GetUser() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        try {
            JCObject objGetUser = (JCObject)classType.Invoke("GetUser");
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser GetUser(boolean userIsOnline) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        try {
            JCObject objGetUser = (JCObject)classType.Invoke("GetUser", userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser GetUser(java.lang.String username) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        try {
            JCObject objGetUser = (JCObject)classType.Invoke("GetUser", (Object)username);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser GetUser(NetObject providerUserKey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        try {
            JCObject objGetUser = (JCObject)classType.Invoke("GetUser", (Object)providerUserKey.getJCOInstance());
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUserCollection GetAllUsers() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        try {
            JCObject objGetAllUsers = (JCObject)classType.Invoke("GetAllUsers");
            return new MembershipUserCollection(objGetAllUsers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser CreateUser(java.lang.String username, java.lang.String password, java.lang.String email) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.TypeLoadException, system.configuration.provider.ProviderException, system.web.security.MembershipCreateUserException {
        try {
            JCObject objCreateUser = (JCObject)classType.Invoke("CreateUser", (Object)username, (Object)password, (Object)email);
            return new MembershipUser(objCreateUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ValidateUser(java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.TypeLoadException {
        try {
            return (boolean)classType.Invoke("ValidateUser", (Object)username, (Object)password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser GetUser(java.lang.String username, boolean userIsOnline) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        try {
            JCObject objGetUser = (JCObject)classType.Invoke("GetUser", (Object)username, userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUser GetUser(NetObject providerUserKey, boolean userIsOnline) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.TypeLoadException {
        try {
            JCObject objGetUser = (JCObject)classType.Invoke("GetUser", (Object)providerUserKey.getJCOInstance(), userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetUserNameByEmail(java.lang.String emailToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        try {
            return (java.lang.String)classType.Invoke("GetUserNameByEmail", (Object)emailToMatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean DeleteUser(java.lang.String username) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        try {
            return (boolean)classType.Invoke("DeleteUser", (Object)username);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean DeleteUser(java.lang.String username, boolean deleteAllRelatedData) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        try {
            return (boolean)classType.Invoke("DeleteUser", (Object)username, deleteAllRelatedData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void UpdateUser(MembershipUser user) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentOutOfRangeException, system.OverflowException, system.ArgumentException {
        try {
            classType.Invoke("UpdateUser", (Object)user.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetNumberOfUsersOnline() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.TypeLoadException {
        try {
            return (int)classType.Invoke("GetNumberOfUsersOnline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GeneratePassword(int length, int numberOfNonAlphanumericCharacters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException {
        try {
            return (java.lang.String)classType.Invoke("GeneratePassword", length, numberOfNonAlphanumericCharacters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUserCollection FindUsersByName(java.lang.String usernameToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        try {
            JCObject objFindUsersByName = (JCObject)classType.Invoke("FindUsersByName", (Object)usernameToMatch);
            return new MembershipUserCollection(objFindUsersByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipUserCollection FindUsersByEmail(java.lang.String emailToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException {
        try {
            JCObject objFindUsersByEmail = (JCObject)classType.Invoke("FindUsersByEmail", (Object)emailToMatch);
            return new MembershipUserCollection(objFindUsersByEmail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static boolean getEnablePasswordRetrieval() throws Throwable {
        try {
            return (boolean)classType.Get("EnablePasswordRetrieval");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getEnablePasswordReset() throws Throwable {
        try {
            return (boolean)classType.Get("EnablePasswordReset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getRequiresQuestionAndAnswer() throws Throwable {
        try {
            return (boolean)classType.Get("RequiresQuestionAndAnswer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getUserIsOnlineTimeWindow() throws Throwable {
        try {
            return (int)classType.Get("UserIsOnlineTimeWindow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipProviderCollection getProviders() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Providers");
            return new MembershipProviderCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MembershipProvider getProvider() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Provider");
            return new MembershipProvider(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getHashAlgorithmType() throws Throwable {
        try {
            return (java.lang.String)classType.Get("HashAlgorithmType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getMaxInvalidPasswordAttempts() throws Throwable {
        try {
            return (int)classType.Get("MaxInvalidPasswordAttempts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getPasswordAttemptWindow() throws Throwable {
        try {
            return (int)classType.Get("PasswordAttemptWindow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getMinRequiredPasswordLength() throws Throwable {
        try {
            return (int)classType.Get("MinRequiredPasswordLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getMinRequiredNonAlphanumericCharacters() throws Throwable {
        try {
            return (int)classType.Get("MinRequiredNonAlphanumericCharacters");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPasswordStrengthRegularExpression() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PasswordStrengthRegularExpression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getApplicationName() throws Throwable {
        try {
            return (java.lang.String)classType.Get("ApplicationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setApplicationName(java.lang.String ApplicationName) throws Throwable {
        try {
            classType.Set("ApplicationName", (Object)ApplicationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}