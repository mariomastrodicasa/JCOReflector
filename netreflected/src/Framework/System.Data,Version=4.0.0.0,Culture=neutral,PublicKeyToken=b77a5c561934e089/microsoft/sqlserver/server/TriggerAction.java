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

package microsoft.sqlserver.server;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Microsoft.SqlServer.Server.TriggerAction, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TriggerAction extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data";
    public static final String className = "Microsoft.SqlServer.Server.TriggerAction";
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

    public TriggerAction(Object instance) {
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

    public TriggerAction() {
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

    final static TriggerAction getFrom(JCEnum object, String value) {
        try {
            return new TriggerAction(object.fromValue(value));
        } catch (JCException e) {
            return new TriggerAction(object);
        }
    }

    // Enum fields section
    
    public static TriggerAction Invalid = getFrom(enumReflected, "Invalid");
    public static TriggerAction Insert = getFrom(enumReflected, "Insert");
    public static TriggerAction Update = getFrom(enumReflected, "Update");
    public static TriggerAction Delete = getFrom(enumReflected, "Delete");
    public static TriggerAction CreateTable = getFrom(enumReflected, "CreateTable");
    public static TriggerAction AlterTable = getFrom(enumReflected, "AlterTable");
    public static TriggerAction DropTable = getFrom(enumReflected, "DropTable");
    public static TriggerAction CreateIndex = getFrom(enumReflected, "CreateIndex");
    public static TriggerAction AlterIndex = getFrom(enumReflected, "AlterIndex");
    public static TriggerAction DropIndex = getFrom(enumReflected, "DropIndex");
    public static TriggerAction CreateSecurityExpression = getFrom(enumReflected, "CreateSecurityExpression");
    public static TriggerAction DropSecurityExpression = getFrom(enumReflected, "DropSecurityExpression");
    public static TriggerAction CreateSynonym = getFrom(enumReflected, "CreateSynonym");
    public static TriggerAction DropSynonym = getFrom(enumReflected, "DropSynonym");
    public static TriggerAction CreateView = getFrom(enumReflected, "CreateView");
    public static TriggerAction AlterView = getFrom(enumReflected, "AlterView");
    public static TriggerAction DropView = getFrom(enumReflected, "DropView");
    public static TriggerAction CreateProcedure = getFrom(enumReflected, "CreateProcedure");
    public static TriggerAction AlterProcedure = getFrom(enumReflected, "AlterProcedure");
    public static TriggerAction DropProcedure = getFrom(enumReflected, "DropProcedure");
    public static TriggerAction CreateFunction = getFrom(enumReflected, "CreateFunction");
    public static TriggerAction AlterFunction = getFrom(enumReflected, "AlterFunction");
    public static TriggerAction DropFunction = getFrom(enumReflected, "DropFunction");
    public static TriggerAction CreateTrigger = getFrom(enumReflected, "CreateTrigger");
    public static TriggerAction AlterTrigger = getFrom(enumReflected, "AlterTrigger");
    public static TriggerAction DropTrigger = getFrom(enumReflected, "DropTrigger");
    public static TriggerAction CreateEventNotification = getFrom(enumReflected, "CreateEventNotification");
    public static TriggerAction DropEventNotification = getFrom(enumReflected, "DropEventNotification");
    public static TriggerAction CreateType = getFrom(enumReflected, "CreateType");
    public static TriggerAction DropType = getFrom(enumReflected, "DropType");
    public static TriggerAction CreateAssembly = getFrom(enumReflected, "CreateAssembly");
    public static TriggerAction AlterAssembly = getFrom(enumReflected, "AlterAssembly");
    public static TriggerAction DropAssembly = getFrom(enumReflected, "DropAssembly");
    public static TriggerAction CreateUser = getFrom(enumReflected, "CreateUser");
    public static TriggerAction AlterUser = getFrom(enumReflected, "AlterUser");
    public static TriggerAction DropUser = getFrom(enumReflected, "DropUser");
    public static TriggerAction CreateRole = getFrom(enumReflected, "CreateRole");
    public static TriggerAction AlterRole = getFrom(enumReflected, "AlterRole");
    public static TriggerAction DropRole = getFrom(enumReflected, "DropRole");
    public static TriggerAction CreateAppRole = getFrom(enumReflected, "CreateAppRole");
    public static TriggerAction AlterAppRole = getFrom(enumReflected, "AlterAppRole");
    public static TriggerAction DropAppRole = getFrom(enumReflected, "DropAppRole");
    public static TriggerAction CreateSchema = getFrom(enumReflected, "CreateSchema");
    public static TriggerAction AlterSchema = getFrom(enumReflected, "AlterSchema");
    public static TriggerAction DropSchema = getFrom(enumReflected, "DropSchema");
    public static TriggerAction CreateLogin = getFrom(enumReflected, "CreateLogin");
    public static TriggerAction AlterLogin = getFrom(enumReflected, "AlterLogin");
    public static TriggerAction DropLogin = getFrom(enumReflected, "DropLogin");
    public static TriggerAction CreateMsgType = getFrom(enumReflected, "CreateMsgType");
    public static TriggerAction DropMsgType = getFrom(enumReflected, "DropMsgType");
    public static TriggerAction CreateContract = getFrom(enumReflected, "CreateContract");
    public static TriggerAction DropContract = getFrom(enumReflected, "DropContract");
    public static TriggerAction CreateQueue = getFrom(enumReflected, "CreateQueue");
    public static TriggerAction AlterQueue = getFrom(enumReflected, "AlterQueue");
    public static TriggerAction DropQueue = getFrom(enumReflected, "DropQueue");
    public static TriggerAction CreateService = getFrom(enumReflected, "CreateService");
    public static TriggerAction AlterService = getFrom(enumReflected, "AlterService");
    public static TriggerAction DropService = getFrom(enumReflected, "DropService");
    public static TriggerAction CreateRoute = getFrom(enumReflected, "CreateRoute");
    public static TriggerAction AlterRoute = getFrom(enumReflected, "AlterRoute");
    public static TriggerAction DropRoute = getFrom(enumReflected, "DropRoute");
    public static TriggerAction GrantStatement = getFrom(enumReflected, "GrantStatement");
    public static TriggerAction DenyStatement = getFrom(enumReflected, "DenyStatement");
    public static TriggerAction RevokeStatement = getFrom(enumReflected, "RevokeStatement");
    public static TriggerAction GrantObject = getFrom(enumReflected, "GrantObject");
    public static TriggerAction DenyObject = getFrom(enumReflected, "DenyObject");
    public static TriggerAction RevokeObject = getFrom(enumReflected, "RevokeObject");
    public static TriggerAction CreateBinding = getFrom(enumReflected, "CreateBinding");
    public static TriggerAction AlterBinding = getFrom(enumReflected, "AlterBinding");
    public static TriggerAction DropBinding = getFrom(enumReflected, "DropBinding");
    public static TriggerAction CreatePartitionFunction = getFrom(enumReflected, "CreatePartitionFunction");
    public static TriggerAction AlterPartitionFunction = getFrom(enumReflected, "AlterPartitionFunction");
    public static TriggerAction DropPartitionFunction = getFrom(enumReflected, "DropPartitionFunction");
    public static TriggerAction CreatePartitionScheme = getFrom(enumReflected, "CreatePartitionScheme");
    public static TriggerAction AlterPartitionScheme = getFrom(enumReflected, "AlterPartitionScheme");
    public static TriggerAction DropPartitionScheme = getFrom(enumReflected, "DropPartitionScheme");


    // Flags management section


}