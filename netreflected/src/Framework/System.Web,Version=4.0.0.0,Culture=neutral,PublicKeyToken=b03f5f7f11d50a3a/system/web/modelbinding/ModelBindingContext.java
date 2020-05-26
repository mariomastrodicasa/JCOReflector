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

package system.web.modelbinding;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.modelbinding.ModelBindingContext;
import system.web.modelbinding.ModelBinderProviderCollection;
import system.web.modelbinding.ModelMetadata;
import system.web.modelbinding.ModelStateDictionary;
import system.web.modelbinding.ModelValidationNode;


/**
 * The base .NET class managing System.Web.ModelBinding.ModelBindingContext, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ModelBindingContext extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.ModelBinding.ModelBindingContext";
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

    public ModelBindingContext(Object instance) throws Throwable {
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

    public static ModelBindingContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ModelBindingContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ModelBindingContext() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelBindingContext(ModelBindingContext bindingContext) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)bindingContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public NetObject getModel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Model");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModel(NetObject Model) throws Throwable {
        try {
            classInstance.Set("Model", (Object)Model.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelBinderProviderCollection getModelBinderProviders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ModelBinderProviders");
            return new ModelBinderProviderCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelBinderProviders(ModelBinderProviderCollection ModelBinderProviders) throws Throwable {
        try {
            classInstance.Set("ModelBinderProviders", (Object)ModelBinderProviders.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelMetadata getModelMetadata() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ModelMetadata");
            return new ModelMetadata(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelMetadata(ModelMetadata ModelMetadata) throws Throwable {
        try {
            classInstance.Set("ModelMetadata", (Object)ModelMetadata.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getModelName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ModelName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelName(java.lang.String ModelName) throws Throwable {
        try {
            classInstance.Set("ModelName", (Object)ModelName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getValidateRequest() throws Throwable {
        try {
            return (boolean)classInstance.Get("ValidateRequest");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidateRequest(boolean ValidateRequest) throws Throwable {
        try {
            classInstance.Set("ValidateRequest", ValidateRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelStateDictionary getModelState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ModelState");
            return new ModelStateDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModelState(ModelStateDictionary ModelState) throws Throwable {
        try {
            classInstance.Set("ModelState", (Object)ModelState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getModelType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ModelType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelValidationNode getValidationNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidationNode");
            return new ModelValidationNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidationNode(ModelValidationNode ValidationNode) throws Throwable {
        try {
            classInstance.Set("ValidationNode", (Object)ValidationNode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}