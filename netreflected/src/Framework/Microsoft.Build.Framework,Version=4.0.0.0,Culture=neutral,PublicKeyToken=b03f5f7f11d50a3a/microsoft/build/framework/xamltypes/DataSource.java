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

package microsoft.build.framework.xamltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.framework.xamltypes.DefaultValueSourceLocation;


/**
 * The base .NET class managing Microsoft.Build.Framework.XamlTypes.DataSource, Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DataSource extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Framework";
    public static final String className = "Microsoft.Build.Framework.XamlTypes.DataSource";
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

    public DataSource(Object instance) throws Throwable {
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

    public static DataSource castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataSource(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataSource() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void BeginInit() throws Throwable {
        try {
            classInstance.Invoke("BeginInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndInit() throws Throwable {
        try {
            classInstance.Invoke("EndInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getPersistence() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Persistence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPersistence(java.lang.String Persistence) throws Throwable {
        try {
            classInstance.Set("Persistence", (Object)Persistence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPersistedName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PersistedName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPersistedName(java.lang.String PersistedName) throws Throwable {
        try {
            classInstance.Set("PersistedName", (Object)PersistedName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLabel() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Label");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLabel(java.lang.String Label) throws Throwable {
        try {
            classInstance.Set("Label", (Object)Label);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getItemType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ItemType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setItemType(java.lang.String ItemType) throws Throwable {
        try {
            classInstance.Set("ItemType", (Object)ItemType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasConfigurationCondition() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasConfigurationCondition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHasConfigurationCondition(boolean HasConfigurationCondition) throws Throwable {
        try {
            classInstance.Set("HasConfigurationCondition", HasConfigurationCondition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSourceType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SourceType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceType(java.lang.String SourceType) throws Throwable {
        try {
            classInstance.Set("SourceType", (Object)SourceType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMSBuildTarget() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MSBuildTarget");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMSBuildTarget(java.lang.String MSBuildTarget) throws Throwable {
        try {
            classInstance.Set("MSBuildTarget", (Object)MSBuildTarget);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DefaultValueSourceLocation getSourceOfDefaultValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SourceOfDefaultValue");
            return new DefaultValueSourceLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceOfDefaultValue(DefaultValueSourceLocation SourceOfDefaultValue) throws Throwable {
        try {
            classInstance.Set("SourceOfDefaultValue", (Object)SourceOfDefaultValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}