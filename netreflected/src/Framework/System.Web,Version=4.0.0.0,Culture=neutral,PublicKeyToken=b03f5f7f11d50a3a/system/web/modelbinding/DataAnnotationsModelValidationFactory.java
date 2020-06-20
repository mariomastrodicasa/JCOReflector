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

package system.web.modelbinding;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.modelbinding.ModelValidator;
import system.web.modelbinding.ModelMetadata;
import system.web.modelbinding.ModelBindingExecutionContext;
import system.componentmodel.dataannotations.ValidationAttribute;
import system.web.modelbinding.IDataAnnotationsModelValidationFactory;
/**
 * The base .NET class managing System.Web.ModelBinding.DataAnnotationsModelValidationFactory, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link JCDelegate}. Implements {@link IJCEventEmit}, {@link IJCOBridgeReflected}
 */
public class DataAnnotationsModelValidationFactory extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.ModelBinding.DataAnnotationsModelValidationFactory";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    JCObject classInstance = null;
    IDataAnnotationsModelValidationFactory callerInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final Object EventRaised(Object... argsFromJCOBridge) {
        try
        {
            ModelMetadata metadata = argsFromJCOBridge[0] == null ? null : new ModelMetadata(argsFromJCOBridge[0]);
            ModelBindingExecutionContext context = argsFromJCOBridge[1] == null ? null : new ModelBindingExecutionContext(argsFromJCOBridge[1]);
            ValidationAttribute attribute = argsFromJCOBridge[2] == null ? null : new ValidationAttribute(argsFromJCOBridge[2]);


            ModelValidator retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(metadata, context, attribute);
            } else {
                retVal = Invoke(metadata, context, attribute);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            if (JCOBridgeInstance.getDebug())
                throwableFromJCEvent.printStackTrace();
			return null;
        }
    }

    public final Object DelegateInvoked(Object... argsFromJCOBridge) {
        try
        {
            ModelMetadata metadata = argsFromJCOBridge[0] == null ? null : new ModelMetadata(argsFromJCOBridge[0]);
            ModelBindingExecutionContext context = argsFromJCOBridge[1] == null ? null : new ModelBindingExecutionContext(argsFromJCOBridge[1]);
            ValidationAttribute attribute = argsFromJCOBridge[2] == null ? null : new ValidationAttribute(argsFromJCOBridge[2]);


            ModelValidator retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(metadata, context, attribute);
            } else {
                retVal = Invoke(metadata, context, attribute);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            if (JCOBridgeInstance.getDebug())
                throwableFromJCEvent.printStackTrace();
			return null;
        }
    }

    public DataAnnotationsModelValidationFactory() {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public DataAnnotationsModelValidationFactory(IDataAnnotationsModelValidationFactory instance) {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }

    public DataAnnotationsModelValidationFactory(Object instance) throws Throwable {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IDataAnnotationsModelValidationFactory) {
            callerInstance = (IDataAnnotationsModelValidationFactory) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public final ModelValidator DynamicInvoke(ModelMetadata metadata, ModelBindingExecutionContext context, ValidationAttribute attribute) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDynamicInvoke = (JCObject)classInstance.Invoke("DynamicInvoke", metadata == null ? null : metadata.getJCOInstance(), context == null ? null : context.getJCOInstance(), attribute == null ? null : attribute.getJCOInstance());
            return new ModelValidator(objDynamicInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    public ModelValidator Invoke(ModelMetadata metadata, ModelBindingExecutionContext context, ValidationAttribute attribute) {
        return null;
    }
}