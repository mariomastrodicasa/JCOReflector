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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Security.AccessControl.RegistryRights, Microsoft.Win32.Registry, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RegistryRights extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Win32.Registry, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "Microsoft.Win32.Registry";
    public static final String className = "System.Security.AccessControl.RegistryRights";
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

    public RegistryRights(Object instance) {
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

    public RegistryRights() {
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

    final static RegistryRights getFrom(JCEnum object, String value) {
        try {
            return new RegistryRights(object.fromValue(value));
        } catch (JCException e) {
            return new RegistryRights(object);
        }
    }

    // Enum fields section
    
    public static RegistryRights QueryValues = getFrom(enumReflected, "QueryValues");
    public static RegistryRights SetValue = getFrom(enumReflected, "SetValue");
    public static RegistryRights CreateSubKey = getFrom(enumReflected, "CreateSubKey");
    public static RegistryRights EnumerateSubKeys = getFrom(enumReflected, "EnumerateSubKeys");
    public static RegistryRights Notify = getFrom(enumReflected, "Notify");
    public static RegistryRights CreateLink = getFrom(enumReflected, "CreateLink");
    public static RegistryRights Delete = getFrom(enumReflected, "Delete");
    public static RegistryRights ReadPermissions = getFrom(enumReflected, "ReadPermissions");
    public static RegistryRights WriteKey = getFrom(enumReflected, "WriteKey");
    public static RegistryRights ExecuteKey = getFrom(enumReflected, "ExecuteKey");
    public static RegistryRights ReadKey = getFrom(enumReflected, "ReadKey");
    public static RegistryRights ChangePermissions = getFrom(enumReflected, "ChangePermissions");
    public static RegistryRights TakeOwnership = getFrom(enumReflected, "TakeOwnership");
    public static RegistryRights FullControl = getFrom(enumReflected, "FullControl");


    // Flags management section

    public RegistryRights add(RegistryRights val) throws Throwable {
        return new RegistryRights(NetEnum.add(classInstance, val.classInstance));
    }

    public RegistryRights remove(RegistryRights val) throws Throwable {
        return new RegistryRights(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(RegistryRights val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(RegistryRights val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}