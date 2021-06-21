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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Runtime.InteropServices.TypeLibVarFlags, System.Runtime.InteropServices, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.TypeLibVarFlags" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.TypeLibVarFlags</a>
 */
public class TypeLibVarFlags extends NetObject  {
    /**
     * Fully assembly qualified name: System.Runtime.InteropServices, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Runtime.InteropServices, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Runtime.InteropServices
     */
    public static final String assemblyShortName = "System.Runtime.InteropServices";
    /**
     * Qualified class name: System.Runtime.InteropServices.TypeLibVarFlags
     */
    public static final String className = "System.Runtime.InteropServices.TypeLibVarFlags";
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

    public TypeLibVarFlags(Object instance) {
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

    public TypeLibVarFlags() {
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

    final static TypeLibVarFlags getFrom(JCEnum object, String value) {
        try {
            return new TypeLibVarFlags(object.fromValue(value));
        } catch (JCException e) {
            return new TypeLibVarFlags(object);
        }
    }

    // Enum fields section
    
    public static TypeLibVarFlags FReadOnly = getFrom(enumReflected, "FReadOnly");
    public static TypeLibVarFlags FSource = getFrom(enumReflected, "FSource");
    public static TypeLibVarFlags FBindable = getFrom(enumReflected, "FBindable");
    public static TypeLibVarFlags FRequestEdit = getFrom(enumReflected, "FRequestEdit");
    public static TypeLibVarFlags FDisplayBind = getFrom(enumReflected, "FDisplayBind");
    public static TypeLibVarFlags FDefaultBind = getFrom(enumReflected, "FDefaultBind");
    public static TypeLibVarFlags FHidden = getFrom(enumReflected, "FHidden");
    public static TypeLibVarFlags FRestricted = getFrom(enumReflected, "FRestricted");
    public static TypeLibVarFlags FDefaultCollelem = getFrom(enumReflected, "FDefaultCollelem");
    public static TypeLibVarFlags FUiDefault = getFrom(enumReflected, "FUiDefault");
    public static TypeLibVarFlags FNonBrowsable = getFrom(enumReflected, "FNonBrowsable");
    public static TypeLibVarFlags FReplaceable = getFrom(enumReflected, "FReplaceable");
    public static TypeLibVarFlags FImmediateBind = getFrom(enumReflected, "FImmediateBind");


    // Flags management section

    public final TypeLibVarFlags add(TypeLibVarFlags val) throws Throwable {
        return new TypeLibVarFlags(NetEnum.add(classInstance, val.classInstance));
    }

    public final TypeLibVarFlags remove(TypeLibVarFlags val) throws Throwable {
        return new TypeLibVarFlags(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(TypeLibVarFlags val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(TypeLibVarFlags val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}