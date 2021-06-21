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

package microsoft.visualbasic;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Microsoft.VisualBasic.MsgBoxStyle, Microsoft.VisualBasic.Core, Version=10.0.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.MsgBoxStyle" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.MsgBoxStyle</a>
 */
public class MsgBoxStyle extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic.Core, Version=10.0.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic.Core
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    /**
     * Qualified class name: Microsoft.VisualBasic.MsgBoxStyle
     */
    public static final String className = "Microsoft.VisualBasic.MsgBoxStyle";
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

    public MsgBoxStyle(Object instance) {
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

    public MsgBoxStyle() {
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

    final static MsgBoxStyle getFrom(JCEnum object, String value) {
        try {
            return new MsgBoxStyle(object.fromValue(value));
        } catch (JCException e) {
            return new MsgBoxStyle(object);
        }
    }

    // Enum fields section
    
    public static MsgBoxStyle ApplicationModal = getFrom(enumReflected, "ApplicationModal");
    public static MsgBoxStyle DefaultButton1 = getFrom(enumReflected, "DefaultButton1");
    public static MsgBoxStyle OkOnly = getFrom(enumReflected, "OkOnly");
    public static MsgBoxStyle OkCancel = getFrom(enumReflected, "OkCancel");
    public static MsgBoxStyle AbortRetryIgnore = getFrom(enumReflected, "AbortRetryIgnore");
    public static MsgBoxStyle YesNoCancel = getFrom(enumReflected, "YesNoCancel");
    public static MsgBoxStyle YesNo = getFrom(enumReflected, "YesNo");
    public static MsgBoxStyle RetryCancel = getFrom(enumReflected, "RetryCancel");
    public static MsgBoxStyle Critical = getFrom(enumReflected, "Critical");
    public static MsgBoxStyle Question = getFrom(enumReflected, "Question");
    public static MsgBoxStyle Exclamation = getFrom(enumReflected, "Exclamation");
    public static MsgBoxStyle Information = getFrom(enumReflected, "Information");
    public static MsgBoxStyle DefaultButton2 = getFrom(enumReflected, "DefaultButton2");
    public static MsgBoxStyle DefaultButton3 = getFrom(enumReflected, "DefaultButton3");
    public static MsgBoxStyle SystemModal = getFrom(enumReflected, "SystemModal");
    public static MsgBoxStyle MsgBoxHelp = getFrom(enumReflected, "MsgBoxHelp");
    public static MsgBoxStyle MsgBoxSetForeground = getFrom(enumReflected, "MsgBoxSetForeground");
    public static MsgBoxStyle MsgBoxRight = getFrom(enumReflected, "MsgBoxRight");
    public static MsgBoxStyle MsgBoxRtlReading = getFrom(enumReflected, "MsgBoxRtlReading");


    // Flags management section

    public final MsgBoxStyle add(MsgBoxStyle val) throws Throwable {
        return new MsgBoxStyle(NetEnum.add(classInstance, val.classInstance));
    }

    public final MsgBoxStyle remove(MsgBoxStyle val) throws Throwable {
        return new MsgBoxStyle(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(MsgBoxStyle val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(MsgBoxStyle val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}