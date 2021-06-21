/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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

package system.security.rightsmanagement;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Security.RightsManagement.RightsManagementFailureCode, WindowsBase, Version=5.0.6.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.RightsManagement.RightsManagementFailureCode" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.RightsManagement.RightsManagementFailureCode</a>
 */
public class RightsManagementFailureCode extends NetObject  {
    /**
     * Fully assembly qualified name: WindowsBase, Version=5.0.6.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=5.0.6.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.Security.RightsManagement.RightsManagementFailureCode
     */
    public static final String className = "System.Security.RightsManagement.RightsManagementFailureCode";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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

    public RightsManagementFailureCode(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public RightsManagementFailureCode() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static RightsManagementFailureCode getFrom(JCEnum object, String value) {
        try {
            return new RightsManagementFailureCode(object.fromValue(value));
        } catch (JCException e) {
            return new RightsManagementFailureCode(object);
        }
    }

    // Enum fields section
    
    public static RightsManagementFailureCode Success = getFrom(enumReflected, "Success");
    public static RightsManagementFailureCode ManifestPolicyViolation = getFrom(enumReflected, "ManifestPolicyViolation");
    public static RightsManagementFailureCode InvalidLicense = getFrom(enumReflected, "InvalidLicense");
    public static RightsManagementFailureCode InfoNotInLicense = getFrom(enumReflected, "InfoNotInLicense");
    public static RightsManagementFailureCode InvalidLicenseSignature = getFrom(enumReflected, "InvalidLicenseSignature");
    public static RightsManagementFailureCode EncryptionNotPermitted = getFrom(enumReflected, "EncryptionNotPermitted");
    public static RightsManagementFailureCode RightNotGranted = getFrom(enumReflected, "RightNotGranted");
    public static RightsManagementFailureCode InvalidVersion = getFrom(enumReflected, "InvalidVersion");
    public static RightsManagementFailureCode InvalidEncodingType = getFrom(enumReflected, "InvalidEncodingType");
    public static RightsManagementFailureCode InvalidNumericalValue = getFrom(enumReflected, "InvalidNumericalValue");
    public static RightsManagementFailureCode InvalidAlgorithmType = getFrom(enumReflected, "InvalidAlgorithmType");
    public static RightsManagementFailureCode EnvironmentNotLoaded = getFrom(enumReflected, "EnvironmentNotLoaded");
    public static RightsManagementFailureCode EnvironmentCannotLoad = getFrom(enumReflected, "EnvironmentCannotLoad");
    public static RightsManagementFailureCode TooManyLoadedEnvironments = getFrom(enumReflected, "TooManyLoadedEnvironments");
    public static RightsManagementFailureCode IncompatibleObjects = getFrom(enumReflected, "IncompatibleObjects");
    public static RightsManagementFailureCode LibraryFail = getFrom(enumReflected, "LibraryFail");
    public static RightsManagementFailureCode EnablingPrincipalFailure = getFrom(enumReflected, "EnablingPrincipalFailure");
    public static RightsManagementFailureCode InfoNotPresent = getFrom(enumReflected, "InfoNotPresent");
    public static RightsManagementFailureCode BadGetInfoQuery = getFrom(enumReflected, "BadGetInfoQuery");
    public static RightsManagementFailureCode KeyTypeUnsupported = getFrom(enumReflected, "KeyTypeUnsupported");
    public static RightsManagementFailureCode CryptoOperationUnsupported = getFrom(enumReflected, "CryptoOperationUnsupported");
    public static RightsManagementFailureCode ClockRollbackDetected = getFrom(enumReflected, "ClockRollbackDetected");
    public static RightsManagementFailureCode QueryReportsNoResults = getFrom(enumReflected, "QueryReportsNoResults");
    public static RightsManagementFailureCode UnexpectedException = getFrom(enumReflected, "UnexpectedException");
    public static RightsManagementFailureCode BindValidityTimeViolated = getFrom(enumReflected, "BindValidityTimeViolated");
    public static RightsManagementFailureCode BrokenCertChain = getFrom(enumReflected, "BrokenCertChain");
    public static RightsManagementFailureCode BindPolicyViolation = getFrom(enumReflected, "BindPolicyViolation");
    public static RightsManagementFailureCode BindRevokedLicense = getFrom(enumReflected, "BindRevokedLicense");
    public static RightsManagementFailureCode BindRevokedIssuer = getFrom(enumReflected, "BindRevokedIssuer");
    public static RightsManagementFailureCode BindRevokedPrincipal = getFrom(enumReflected, "BindRevokedPrincipal");
    public static RightsManagementFailureCode BindRevokedResource = getFrom(enumReflected, "BindRevokedResource");
    public static RightsManagementFailureCode BindRevokedModule = getFrom(enumReflected, "BindRevokedModule");
    public static RightsManagementFailureCode BindContentNotInEndUseLicense = getFrom(enumReflected, "BindContentNotInEndUseLicense");
    public static RightsManagementFailureCode BindAccessPrincipalNotEnabling = getFrom(enumReflected, "BindAccessPrincipalNotEnabling");
    public static RightsManagementFailureCode BindAccessUnsatisfied = getFrom(enumReflected, "BindAccessUnsatisfied");
    public static RightsManagementFailureCode BindIndicatedPrincipalMissing = getFrom(enumReflected, "BindIndicatedPrincipalMissing");
    public static RightsManagementFailureCode BindMachineNotFoundInGroupIdentity = getFrom(enumReflected, "BindMachineNotFoundInGroupIdentity");
    public static RightsManagementFailureCode LibraryUnsupportedPlugIn = getFrom(enumReflected, "LibraryUnsupportedPlugIn");
    public static RightsManagementFailureCode BindRevocationListStale = getFrom(enumReflected, "BindRevocationListStale");
    public static RightsManagementFailureCode BindNoApplicableRevocationList = getFrom(enumReflected, "BindNoApplicableRevocationList");
    public static RightsManagementFailureCode InvalidHandle = getFrom(enumReflected, "InvalidHandle");
    public static RightsManagementFailureCode BindIntervalTimeViolated = getFrom(enumReflected, "BindIntervalTimeViolated");
    public static RightsManagementFailureCode BindNoSatisfiedRightsGroup = getFrom(enumReflected, "BindNoSatisfiedRightsGroup");
    public static RightsManagementFailureCode BindSpecifiedWorkMissing = getFrom(enumReflected, "BindSpecifiedWorkMissing");
    public static RightsManagementFailureCode NoMoreData = getFrom(enumReflected, "NoMoreData");
    public static RightsManagementFailureCode LicenseAcquisitionFailed = getFrom(enumReflected, "LicenseAcquisitionFailed");
    public static RightsManagementFailureCode IdMismatch = getFrom(enumReflected, "IdMismatch");
    public static RightsManagementFailureCode TooManyCertificates = getFrom(enumReflected, "TooManyCertificates");
    public static RightsManagementFailureCode NoDistributionPointUrlFound = getFrom(enumReflected, "NoDistributionPointUrlFound");
    public static RightsManagementFailureCode AlreadyInProgress = getFrom(enumReflected, "AlreadyInProgress");
    public static RightsManagementFailureCode GroupIdentityNotSet = getFrom(enumReflected, "GroupIdentityNotSet");
    public static RightsManagementFailureCode RecordNotFound = getFrom(enumReflected, "RecordNotFound");
    public static RightsManagementFailureCode NoConnect = getFrom(enumReflected, "NoConnect");
    public static RightsManagementFailureCode NoLicense = getFrom(enumReflected, "NoLicense");
    public static RightsManagementFailureCode NeedsMachineActivation = getFrom(enumReflected, "NeedsMachineActivation");
    public static RightsManagementFailureCode NeedsGroupIdentityActivation = getFrom(enumReflected, "NeedsGroupIdentityActivation");
    public static RightsManagementFailureCode ActivationFailed = getFrom(enumReflected, "ActivationFailed");
    public static RightsManagementFailureCode Aborted = getFrom(enumReflected, "Aborted");
    public static RightsManagementFailureCode OutOfQuota = getFrom(enumReflected, "OutOfQuota");
    public static RightsManagementFailureCode AuthenticationFailed = getFrom(enumReflected, "AuthenticationFailed");
    public static RightsManagementFailureCode ServerError = getFrom(enumReflected, "ServerError");
    public static RightsManagementFailureCode InstallationFailed = getFrom(enumReflected, "InstallationFailed");
    public static RightsManagementFailureCode HidCorrupted = getFrom(enumReflected, "HidCorrupted");
    public static RightsManagementFailureCode InvalidServerResponse = getFrom(enumReflected, "InvalidServerResponse");
    public static RightsManagementFailureCode ServiceNotFound = getFrom(enumReflected, "ServiceNotFound");
    public static RightsManagementFailureCode UseDefault = getFrom(enumReflected, "UseDefault");
    public static RightsManagementFailureCode ServerNotFound = getFrom(enumReflected, "ServerNotFound");
    public static RightsManagementFailureCode InvalidEmail = getFrom(enumReflected, "InvalidEmail");
    public static RightsManagementFailureCode ValidityTimeViolation = getFrom(enumReflected, "ValidityTimeViolation");
    public static RightsManagementFailureCode OutdatedModule = getFrom(enumReflected, "OutdatedModule");
    public static RightsManagementFailureCode NotSet = getFrom(enumReflected, "NotSet");
    public static RightsManagementFailureCode MetadataNotSet = getFrom(enumReflected, "MetadataNotSet");
    public static RightsManagementFailureCode RevocationInfoNotSet = getFrom(enumReflected, "RevocationInfoNotSet");
    public static RightsManagementFailureCode InvalidTimeInfo = getFrom(enumReflected, "InvalidTimeInfo");
    public static RightsManagementFailureCode RightNotSet = getFrom(enumReflected, "RightNotSet");
    public static RightsManagementFailureCode LicenseBindingToWindowsIdentityFailed = getFrom(enumReflected, "LicenseBindingToWindowsIdentityFailed");
    public static RightsManagementFailureCode InvalidIssuanceLicenseTemplate = getFrom(enumReflected, "InvalidIssuanceLicenseTemplate");
    public static RightsManagementFailureCode InvalidKeyLength = getFrom(enumReflected, "InvalidKeyLength");
    public static RightsManagementFailureCode ExpiredOfficialIssuanceLicenseTemplate = getFrom(enumReflected, "ExpiredOfficialIssuanceLicenseTemplate");
    public static RightsManagementFailureCode InvalidClientLicensorCertificate = getFrom(enumReflected, "InvalidClientLicensorCertificate");
    public static RightsManagementFailureCode HidInvalid = getFrom(enumReflected, "HidInvalid");
    public static RightsManagementFailureCode EmailNotVerified = getFrom(enumReflected, "EmailNotVerified");
    public static RightsManagementFailureCode ServiceMoved = getFrom(enumReflected, "ServiceMoved");
    public static RightsManagementFailureCode ServiceGone = getFrom(enumReflected, "ServiceGone");
    public static RightsManagementFailureCode AdEntryNotFound = getFrom(enumReflected, "AdEntryNotFound");
    public static RightsManagementFailureCode NotAChain = getFrom(enumReflected, "NotAChain");
    public static RightsManagementFailureCode RequestDenied = getFrom(enumReflected, "RequestDenied");
    public static RightsManagementFailureCode DebuggerDetected = getFrom(enumReflected, "DebuggerDetected");
    public static RightsManagementFailureCode InvalidLockboxType = getFrom(enumReflected, "InvalidLockboxType");
    public static RightsManagementFailureCode InvalidLockboxPath = getFrom(enumReflected, "InvalidLockboxPath");
    public static RightsManagementFailureCode InvalidRegistryPath = getFrom(enumReflected, "InvalidRegistryPath");
    public static RightsManagementFailureCode NoAesCryptoProvider = getFrom(enumReflected, "NoAesCryptoProvider");
    public static RightsManagementFailureCode GlobalOptionAlreadySet = getFrom(enumReflected, "GlobalOptionAlreadySet");
    public static RightsManagementFailureCode OwnerLicenseNotFound = getFrom(enumReflected, "OwnerLicenseNotFound");


    // Flags management section


}