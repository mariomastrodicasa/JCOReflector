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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.workflow.componentmodel.compiler.AttributeInfo;
import system.codedom.MemberAttributes;
import system.codedom.CodeSnippetExpression;
import system.workflow.componentmodel.Activity;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.IMemberCreationService, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Implements {@link IJCOBridgeReflected}.
 */
public interface IMemberCreationService extends IJCOBridgeReflected {

    public static IMemberCreationService ToIMemberCreationService(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType("System.Workflow.ComponentModel.Design.IMemberCreationService, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35" : "System.Workflow.ComponentModel"));
        NetType.AssertCast(classType, from);
        return new IMemberCreationServiceImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public void CreateEvent(java.lang.String className, java.lang.String eventName, NetType eventType, AttributeInfo[] attributes, boolean emitDependencyProperty) throws Throwable;

    public void CreateField(java.lang.String className, java.lang.String fieldName, NetType fieldType, NetType[] genericParameterTypes, MemberAttributes attributes, CodeSnippetExpression initializationExpression, boolean overwriteExisting) throws Throwable;

    public void CreateProperty(java.lang.String className, java.lang.String propertyName, NetType propertyType, AttributeInfo[] attributes, boolean emitDependencyProperty, boolean isMetaProperty, boolean isAttached, NetType ownerType, boolean isReadOnly) throws Throwable;

    public void RemoveEvent(java.lang.String className, java.lang.String eventName, NetType eventType) throws Throwable;

    public void RemoveProperty(java.lang.String className, java.lang.String propertyName, NetType propertyType) throws Throwable;

    public void ShowCode() throws Throwable;

    public void ShowCode(Activity activity, java.lang.String methodName, NetType delegateType) throws Throwable;

    public void UpdateBaseType(java.lang.String className, NetType baseType) throws Throwable;

    public void UpdateEvent(java.lang.String className, java.lang.String oldEventName, NetType oldEventType, java.lang.String newEventName, NetType newEventType, AttributeInfo[] attributes, boolean emitDependencyProperty, boolean isMetaProperty) throws Throwable;

    public void UpdateProperty(java.lang.String className, java.lang.String oldPropertyName, NetType oldPropertyType, java.lang.String newPropertyName, NetType newPropertyType, AttributeInfo[] attributes, boolean emitDependencyProperty, boolean isMetaProperty) throws Throwable;

    public void UpdateTypeName(java.lang.String oldClassName, java.lang.String newClassName) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}