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

package system.messaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Messaging.MessageQueueErrorCode, System.Messaging, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MessageQueueErrorCode extends NetObject  {
    public static final String assemblyFullName = "System.Messaging, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Messaging";
    public static final String className = "System.Messaging.MessageQueueErrorCode";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public MessageQueueErrorCode(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public MessageQueueErrorCode() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static MessageQueueErrorCode getFrom(JCEnum object, String value) {
        try {
            return new MessageQueueErrorCode(object.fromValue(value));
        } catch (JCException e) {
            return new MessageQueueErrorCode(object);
        }
    }

    // Enum fields section
    
    public static MessageQueueErrorCode Base = getFrom(enumReflected, "Base");
    public static MessageQueueErrorCode Generic = getFrom(enumReflected, "Generic");
    public static MessageQueueErrorCode Property = getFrom(enumReflected, "Property");
    public static MessageQueueErrorCode QueueNotFound = getFrom(enumReflected, "QueueNotFound");
    public static MessageQueueErrorCode QueueExists = getFrom(enumReflected, "QueueExists");
    public static MessageQueueErrorCode InvalidParameter = getFrom(enumReflected, "InvalidParameter");
    public static MessageQueueErrorCode InvalidHandle = getFrom(enumReflected, "InvalidHandle");
    public static MessageQueueErrorCode OperationCanceled = getFrom(enumReflected, "OperationCanceled");
    public static MessageQueueErrorCode SharingViolation = getFrom(enumReflected, "SharingViolation");
    public static MessageQueueErrorCode ServiceNotAvailable = getFrom(enumReflected, "ServiceNotAvailable");
    public static MessageQueueErrorCode MachineNotFound = getFrom(enumReflected, "MachineNotFound");
    public static MessageQueueErrorCode IllegalSort = getFrom(enumReflected, "IllegalSort");
    public static MessageQueueErrorCode IllegalUser = getFrom(enumReflected, "IllegalUser");
    public static MessageQueueErrorCode NoDs = getFrom(enumReflected, "NoDs");
    public static MessageQueueErrorCode IllegalQueuePathName = getFrom(enumReflected, "IllegalQueuePathName");
    public static MessageQueueErrorCode IllegalPropertyValue = getFrom(enumReflected, "IllegalPropertyValue");
    public static MessageQueueErrorCode IllegalPropertyVt = getFrom(enumReflected, "IllegalPropertyVt");
    public static MessageQueueErrorCode BufferOverflow = getFrom(enumReflected, "BufferOverflow");
    public static MessageQueueErrorCode IOTimeout = getFrom(enumReflected, "IOTimeout");
    public static MessageQueueErrorCode IllegalCursorAction = getFrom(enumReflected, "IllegalCursorAction");
    public static MessageQueueErrorCode MessageAlreadyReceived = getFrom(enumReflected, "MessageAlreadyReceived");
    public static MessageQueueErrorCode IllegalFormatName = getFrom(enumReflected, "IllegalFormatName");
    public static MessageQueueErrorCode FormatNameBufferTooSmall = getFrom(enumReflected, "FormatNameBufferTooSmall");
    public static MessageQueueErrorCode UnsupportedFormatNameOperation = getFrom(enumReflected, "UnsupportedFormatNameOperation");
    public static MessageQueueErrorCode IllegalSecurityDescriptor = getFrom(enumReflected, "IllegalSecurityDescriptor");
    public static MessageQueueErrorCode SenderIdBufferTooSmall = getFrom(enumReflected, "SenderIdBufferTooSmall");
    public static MessageQueueErrorCode SecurityDescriptorBufferTooSmall = getFrom(enumReflected, "SecurityDescriptorBufferTooSmall");
    public static MessageQueueErrorCode CannotImpersonateClient = getFrom(enumReflected, "CannotImpersonateClient");
    public static MessageQueueErrorCode AccessDenied = getFrom(enumReflected, "AccessDenied");
    public static MessageQueueErrorCode PrivilegeNotHeld = getFrom(enumReflected, "PrivilegeNotHeld");
    public static MessageQueueErrorCode InsufficientResources = getFrom(enumReflected, "InsufficientResources");
    public static MessageQueueErrorCode UserBufferTooSmall = getFrom(enumReflected, "UserBufferTooSmall");
    public static MessageQueueErrorCode MessageStorageFailed = getFrom(enumReflected, "MessageStorageFailed");
    public static MessageQueueErrorCode SenderCertificateBufferTooSmall = getFrom(enumReflected, "SenderCertificateBufferTooSmall");
    public static MessageQueueErrorCode InvalidCertificate = getFrom(enumReflected, "InvalidCertificate");
    public static MessageQueueErrorCode CorruptedInternalCertificate = getFrom(enumReflected, "CorruptedInternalCertificate");
    public static MessageQueueErrorCode NoInternalUserCertificate = getFrom(enumReflected, "NoInternalUserCertificate");
    public static MessageQueueErrorCode CorruptedSecurityData = getFrom(enumReflected, "CorruptedSecurityData");
    public static MessageQueueErrorCode CorruptedPersonalCertStore = getFrom(enumReflected, "CorruptedPersonalCertStore");
    public static MessageQueueErrorCode ComputerDoesNotSupportEncryption = getFrom(enumReflected, "ComputerDoesNotSupportEncryption");
    public static MessageQueueErrorCode BadSecurityContext = getFrom(enumReflected, "BadSecurityContext");
    public static MessageQueueErrorCode CouldNotGetUserSid = getFrom(enumReflected, "CouldNotGetUserSid");
    public static MessageQueueErrorCode CouldNotGetAccountInfo = getFrom(enumReflected, "CouldNotGetAccountInfo");
    public static MessageQueueErrorCode IllegalCriteriaColumns = getFrom(enumReflected, "IllegalCriteriaColumns");
    public static MessageQueueErrorCode IllegalPropertyId = getFrom(enumReflected, "IllegalPropertyId");
    public static MessageQueueErrorCode IllegalRelation = getFrom(enumReflected, "IllegalRelation");
    public static MessageQueueErrorCode IllegalPropertySize = getFrom(enumReflected, "IllegalPropertySize");
    public static MessageQueueErrorCode IllegalRestrictionPropertyId = getFrom(enumReflected, "IllegalRestrictionPropertyId");
    public static MessageQueueErrorCode IllegalQueueProperties = getFrom(enumReflected, "IllegalQueueProperties");
    public static MessageQueueErrorCode PropertyNotAllowed = getFrom(enumReflected, "PropertyNotAllowed");
    public static MessageQueueErrorCode InsufficientProperties = getFrom(enumReflected, "InsufficientProperties");
    public static MessageQueueErrorCode MachineExists = getFrom(enumReflected, "MachineExists");
    public static MessageQueueErrorCode IllegalMessageProperties = getFrom(enumReflected, "IllegalMessageProperties");
    public static MessageQueueErrorCode DsIsFull = getFrom(enumReflected, "DsIsFull");
    public static MessageQueueErrorCode DsError = getFrom(enumReflected, "DsError");
    public static MessageQueueErrorCode InvalidOwner = getFrom(enumReflected, "InvalidOwner");
    public static MessageQueueErrorCode UnsupportedAccessMode = getFrom(enumReflected, "UnsupportedAccessMode");
    public static MessageQueueErrorCode ResultBufferTooSmall = getFrom(enumReflected, "ResultBufferTooSmall");
    public static MessageQueueErrorCode DeleteConnectedNetworkInUse = getFrom(enumReflected, "DeleteConnectedNetworkInUse");
    public static MessageQueueErrorCode NoResponseFromObjectServer = getFrom(enumReflected, "NoResponseFromObjectServer");
    public static MessageQueueErrorCode ObjectServerNotAvailable = getFrom(enumReflected, "ObjectServerNotAvailable");
    public static MessageQueueErrorCode QueueNotAvailable = getFrom(enumReflected, "QueueNotAvailable");
    public static MessageQueueErrorCode DtcConnect = getFrom(enumReflected, "DtcConnect");
    public static MessageQueueErrorCode TransactionImport = getFrom(enumReflected, "TransactionImport");
    public static MessageQueueErrorCode TransactionUsage = getFrom(enumReflected, "TransactionUsage");
    public static MessageQueueErrorCode TransactionSequence = getFrom(enumReflected, "TransactionSequence");
    public static MessageQueueErrorCode MissingConnectorType = getFrom(enumReflected, "MissingConnectorType");
    public static MessageQueueErrorCode StaleHandle = getFrom(enumReflected, "StaleHandle");
    public static MessageQueueErrorCode TransactionEnlist = getFrom(enumReflected, "TransactionEnlist");
    public static MessageQueueErrorCode QueueDeleted = getFrom(enumReflected, "QueueDeleted");
    public static MessageQueueErrorCode IllegalContext = getFrom(enumReflected, "IllegalContext");
    public static MessageQueueErrorCode IllegalSortPropertyId = getFrom(enumReflected, "IllegalSortPropertyId");
    public static MessageQueueErrorCode LabelBufferTooSmall = getFrom(enumReflected, "LabelBufferTooSmall");
    public static MessageQueueErrorCode MqisServerEmpty = getFrom(enumReflected, "MqisServerEmpty");
    public static MessageQueueErrorCode MqisReadOnlyMode = getFrom(enumReflected, "MqisReadOnlyMode");
    public static MessageQueueErrorCode SymmetricKeyBufferTooSmall = getFrom(enumReflected, "SymmetricKeyBufferTooSmall");
    public static MessageQueueErrorCode SignatureBufferTooSmall = getFrom(enumReflected, "SignatureBufferTooSmall");
    public static MessageQueueErrorCode ProviderNameBufferTooSmall = getFrom(enumReflected, "ProviderNameBufferTooSmall");
    public static MessageQueueErrorCode IllegalOperation = getFrom(enumReflected, "IllegalOperation");
    public static MessageQueueErrorCode WriteNotAllowed = getFrom(enumReflected, "WriteNotAllowed");
    public static MessageQueueErrorCode WksCantServeClient = getFrom(enumReflected, "WksCantServeClient");
    public static MessageQueueErrorCode DependentClientLicenseOverflow = getFrom(enumReflected, "DependentClientLicenseOverflow");
    public static MessageQueueErrorCode CorruptedQueueWasDeleted = getFrom(enumReflected, "CorruptedQueueWasDeleted");
    public static MessageQueueErrorCode RemoteMachineNotAvailable = getFrom(enumReflected, "RemoteMachineNotAvailable");
    public static MessageQueueErrorCode UnsupportedOperation = getFrom(enumReflected, "UnsupportedOperation");
    public static MessageQueueErrorCode EncryptionProviderNotSupported = getFrom(enumReflected, "EncryptionProviderNotSupported");
    public static MessageQueueErrorCode CannotSetCryptographicSecurityDescriptor = getFrom(enumReflected, "CannotSetCryptographicSecurityDescriptor");
    public static MessageQueueErrorCode CertificateNotProvided = getFrom(enumReflected, "CertificateNotProvided");
    public static MessageQueueErrorCode QDnsPropertyNotSupported = getFrom(enumReflected, "QDnsPropertyNotSupported");
    public static MessageQueueErrorCode CannotCreateCertificateStore = getFrom(enumReflected, "CannotCreateCertificateStore");
    public static MessageQueueErrorCode CannotOpenCertificateStore = getFrom(enumReflected, "CannotOpenCertificateStore");
    public static MessageQueueErrorCode IllegalEnterpriseOperation = getFrom(enumReflected, "IllegalEnterpriseOperation");
    public static MessageQueueErrorCode CannotGrantAddGuid = getFrom(enumReflected, "CannotGrantAddGuid");
    public static MessageQueueErrorCode CannotLoadMsmqOcm = getFrom(enumReflected, "CannotLoadMsmqOcm");
    public static MessageQueueErrorCode NoEntryPointMsmqOcm = getFrom(enumReflected, "NoEntryPointMsmqOcm");
    public static MessageQueueErrorCode NoMsmqServersOnDc = getFrom(enumReflected, "NoMsmqServersOnDc");
    public static MessageQueueErrorCode CannotJoinDomain = getFrom(enumReflected, "CannotJoinDomain");
    public static MessageQueueErrorCode CannotCreateOnGlobalCatalog = getFrom(enumReflected, "CannotCreateOnGlobalCatalog");
    public static MessageQueueErrorCode GuidNotMatching = getFrom(enumReflected, "GuidNotMatching");
    public static MessageQueueErrorCode PublicKeyNotFound = getFrom(enumReflected, "PublicKeyNotFound");
    public static MessageQueueErrorCode PublicKeyDoesNotExist = getFrom(enumReflected, "PublicKeyDoesNotExist");
    public static MessageQueueErrorCode IllegalPrivateProperties = getFrom(enumReflected, "IllegalPrivateProperties");
    public static MessageQueueErrorCode NoGlobalCatalogInDomain = getFrom(enumReflected, "NoGlobalCatalogInDomain");
    public static MessageQueueErrorCode NoMsmqServersOnGlobalCatalog = getFrom(enumReflected, "NoMsmqServersOnGlobalCatalog");
    public static MessageQueueErrorCode CannotGetDistinguishedName = getFrom(enumReflected, "CannotGetDistinguishedName");
    public static MessageQueueErrorCode CannotHashDataEx = getFrom(enumReflected, "CannotHashDataEx");
    public static MessageQueueErrorCode CannotSignDataEx = getFrom(enumReflected, "CannotSignDataEx");
    public static MessageQueueErrorCode CannotCreateHashEx = getFrom(enumReflected, "CannotCreateHashEx");
    public static MessageQueueErrorCode FailVerifySignatureEx = getFrom(enumReflected, "FailVerifySignatureEx");
    public static MessageQueueErrorCode MessageNotFound = getFrom(enumReflected, "MessageNotFound");


    // Flags management section


}